package com.lanqiao.date170414.bank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class UserRecordUtils {
	
	public static final String USER_ACCOUNT_FILE_PATH = "userAccount.txt";
	public static final String USER_LOG_FILE_PATH = "logs.txt";
	public static final int SHOW_LOG_SIZE = 5; //��ʾ������־����
	
	public static final String SPLIT_CHAR = "\\|";
	
	/*
	 * ��ȡ�˻���Ϣ
	 */
	public Map<String,UserAccount> readAccountInfos() throws UserException{
		
		Map<String,UserAccount> map = new LinkedHashMap<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(USER_ACCOUNT_FILE_PATH))){
			
			String tmp = null;
			while((tmp=br.readLine())!=null){
				if(!"".equals(tmp.trim())){
					UserAccount ua = structUserObj(tmp);
					map.put(ua.getId(), ua);
				}
			}
			
		}catch (IOException e){
			e.printStackTrace();
		}
		
		return map;
	}
	
	/*
	 * �����ʺ������ѯ�û���Ϣ
	 */
	public UserAccount getAccount(String id, String password) throws UserException{
		
		//�������˻���Ϣ
		Map<String,UserAccount> mus = readAccountInfos();
		
		//�ҳ���¼����Ϣ
		Iterator it = mus.keySet().iterator();
		while(it.hasNext()){
			UserAccount tmp = mus.get(it.next());
			if(tmp.getId().equals(id) && tmp.getPassword().equals(password)){
				return tmp;
			}
		}
		
		return null;
	}
	
	
	/*
	 * �����û�����
	 */
	private UserAccount structUserObj(String info) throws UserException{
		
		if(info==null || "".equals(info)){
			return null;
		}
		
		String[] userStr = info.split(SPLIT_CHAR);
		if(userStr.length != 3){
			throw new UserException("�˻����쳣������ϵ��̨������Ա����");
		}
		
		
		String id = userStr[0];
		String pwd = userStr[1];
		double balance = Double.valueOf(userStr[2]);
		
		return new UserAccount(id,pwd,balance);
		
	}
	
	public boolean writerLog(String path, String info, boolean isAppend){
		
		if("".equals(info) || info==null){
			return false;
		}
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path,isAppend))) {
			bw.write(info);
			bw.newLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return true;
		
	}
	
	//��ȡָ���û�����־��Ϣ
	public List<String> userLogs(String accountID, int size){
		
		List<String> logs = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(USER_LOG_FILE_PATH))){
			
			String tmp = null;
			
			while((tmp=br.readLine())!=null){
				//������־
				String[] logstr = tmp.split(SPLIT_CHAR);
				
				if(accountID.equals(logstr[0])){
					logs.add(logstr[1]);
				}				
			}
			
		}catch(IOException e){
			e.printStackTrace();
		}
		
		//�����ȡ��ʱ������
		Collections.reverse(logs);
		
		return logs;
	}
	
	/*
	 * 1. ��ȡ�����ʺ���Ϣ
	 * 2. �ҵ���Ӧ�˻������滻
	 * 3. ��д�����˻���Ϣ
	 * TODO��ʹ�����������һ���Ż�
	 */
	public void updateAccount(UserAccount currAccount){
		
		StringBuffer sbf = new StringBuffer();
		try {
			//��ȡ�����˻���Ϣ
			Map<String,UserAccount> map = readAccountInfos();
			
			Iterator<String> it = map.keySet().iterator();
			
			while(it.hasNext()){
				
				UserAccount tmpUA = map.get(it.next());
				
				if(tmpUA.getId().equals(currAccount.getId())){
					//��������˻���д���˻��ļ��У�id��pwd����
					sbf.append(currAccount.getFormatedInfo());
				}else{
					//û�б���Ļ���ά�ֲ��䣬д���˻���
					sbf.append(tmpUA.getFormatedInfo());
				}
				
				sbf.append("\r\n");

			}
			
			//ʵ��д���ļ�
			writerLog(USER_ACCOUNT_FILE_PATH,sbf.toString().trim(),false);
			
		} catch (UserException e) {
			e.printStackTrace();
		}
		
	}
	
}
