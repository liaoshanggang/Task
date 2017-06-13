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
	public static final int SHOW_LOG_SIZE = 5; //显示操作日志条数
	
	public static final String SPLIT_CHAR = "\\|";
	
	/*
	 * 读取账户信息
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
	 * 根据帐号密码查询用户信息
	 */
	public UserAccount getAccount(String id, String password) throws UserException{
		
		//读所有账户信息
		Map<String,UserAccount> mus = readAccountInfos();
		
		//找出记录中信息
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
	 * 创建用户对象
	 */
	private UserAccount structUserObj(String info) throws UserException{
		
		if(info==null || "".equals(info)){
			return null;
		}
		
		String[] userStr = info.split(SPLIT_CHAR);
		if(userStr.length != 3){
			throw new UserException("账户表异常，请联系柜台工作人员处理");
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
	
	//获取指定用户的日志信息
	public List<String> userLogs(String accountID, int size){
		
		List<String> logs = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(USER_LOG_FILE_PATH))){
			
			String tmp = null;
			
			while((tmp=br.readLine())!=null){
				//解析日志
				String[] logstr = tmp.split(SPLIT_CHAR);
				
				if(accountID.equals(logstr[0])){
					logs.add(logstr[1]);
				}				
			}
			
		}catch(IOException e){
			e.printStackTrace();
		}
		
		//按最后取款时间排序
		Collections.reverse(logs);
		
		return logs;
	}
	
	/*
	 * 1. 读取所有帐号信息
	 * 2. 找到对应账户，并替换
	 * 3. 重写所有账户信息
	 * TODO：使用随机流可有一定优化
	 */
	public void updateAccount(UserAccount currAccount){
		
		StringBuffer sbf = new StringBuffer();
		try {
			//读取所有账户信息
			Map<String,UserAccount> map = readAccountInfos();
			
			Iterator<String> it = map.keySet().iterator();
			
			while(it.hasNext()){
				
				UserAccount tmpUA = map.get(it.next());
				
				if(tmpUA.getId().equals(currAccount.getId())){
					//变更过的账户就写入账户文件中（id，pwd，余额）
					sbf.append(currAccount.getFormatedInfo());
				}else{
					//没有变更的还是维持不变，写入账户中
					sbf.append(tmpUA.getFormatedInfo());
				}
				
				sbf.append("\r\n");

			}
			
			//实际写入文件
			writerLog(USER_ACCOUNT_FILE_PATH,sbf.toString().trim(),false);
			
		} catch (UserException e) {
			e.printStackTrace();
		}
		
	}
	
}
