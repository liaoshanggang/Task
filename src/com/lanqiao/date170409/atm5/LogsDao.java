package com.lanqiao.date170409.atm5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description: �˺�|����|�����|ȡ����|���
 * @author ���и�
 * @date 2017��4��10�� ����12:28:19
 * @version V1.0
 */
// 1111222233335555|2017��04��10��09:46:49|100000.0|100000.0|99000.0
// 1111222233335555|2017��04��10��09:51:49|100000.0|100000.0|98900.0
// 1111222233335555|2017��04��10��11:20:42|100000.0|100000.0|88900.0
public class LogsDao {
	// ��ȡ���ռ��ļ�·��
	public static final String PATH_TRADE_LOGS = "D:\\WorkSpace\\Task\\src\\com\\lanqiao\\date170409\\atm5\\tradelogs.txt";

	// ��Ŵ��ļ���ȥ�����ļ�¼
	List<String> list = null;

	private static LogsDao logsDao = null;

	{
		list = new ArrayList<String>();
	}

	private LogsDao() {
		readLogs();
	}

	/*public LogsDao(){
		list = new ArrayList<String>();
		readLogs();
	}*/
	/**
	 * @Description:��ȡ��������
	 * @param ��
	 * @return LogsDao����
	 */
	public static LogsDao getLogsDao() {
		if (logsDao == null) {
			logsDao = new LogsDao();
		}
		return logsDao;
	}

	/**
	 * @Description:��ʾָ���û����׵���Ϣ
	 * @param inputId
	 * @return ����鵽��¼������ָ���û����е���Ϣ
	 * 
	 */
	public StringBuffer getTradeLogById(String inputId) {
		System.out.println("��ʾ��ǰ�˺�"+inputId+"���׵����н�����Ϣ");
		StringBuffer str = new StringBuffer();
		for (String string : list) {
			if (string.contains(inputId)) {
				str.append(string + "\n");
			}
		}
		return str;
	}

	/**
	 * @Description:��ʾ�����û���ȡ����Ϣ
	 */
	public void showTradeLogs() {
		System.out.println("�������еļ�¼");
		for (String string : list) {
			System.out.println(string);
		}
	}

	/**
	 * @Description:���ļ��л�ȡ�û����˺���Ϣ���浽list������ȥ��
	 * @param ��
	 * @return
	 */
	public void readLogs() {
		try (BufferedReader br = new BufferedReader(new FileReader(
				PATH_TRADE_LOGS));) {
			String s = "";
			int count = 0;
			while ((s = br.readLine()) != null) {
				s = s.replace("|", ",");
				String[] v = s.split(",");
				count++;
				// ������ͷ��������list����
				if (count == 1) {
					continue;
				}

				s = "�˺ţ�" + v[0] + " " + v[1] + " ���" + v[2] + "Ԫ��ȡ��" + v[3]
						+ "Ԫ�����" + v[4] + "Ԫ";
				// System.out.println(s);
				list.add(s);
			}
			System.out.println("hello");
			//System.out.println("�ļ���ȡ�ɹ����浽list�ļ�¼");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @Description: ����ָ�������ı��Ӧ�˺ŵ����,
	 *               ����û�����ݿ⣬��ֻ�������°���ȡ���û���Ϣд��ȥֻ�ı��Ӧ�û����˺����,û���ݿ����ϵͳ���ò�����
	 * @param inputId
	 *            ,double balance
	 * @return ���д���¼��ȷ������true������ҵ�
	 */
	public boolean writeLogs(String inputId, String date, double inMoney,
			double outMoney, double balance) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(
				PATH_TRADE_LOGS, true));) {
			String str = inputId + "|" + date + "|\t   " + inMoney + "| "
					+ outMoney + "|" + balance + "\n";
			bw.write(str);

		} catch (IOException e) {
			e.printStackTrace();
		}
		return true;
	}
}
