package com.lanqiao.date170409.atm5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 账号|日期|存款金额|取款金额|余额
 * @author 廖尚岗
 * @date 2017年4月10日 下午12:28:19
 * @version V1.0
 */
// 1111222233335555|2017年04月10日09:46:49|100000.0|100000.0|99000.0
// 1111222233335555|2017年04月10日09:51:49|100000.0|100000.0|98900.0
// 1111222233335555|2017年04月10日11:20:42|100000.0|100000.0|88900.0
public class LogsDao {
	// 存取款日记文件路径
	public static final String PATH_TRADE_LOGS = "D:\\WorkSpace\\Task\\src\\com\\lanqiao\\date170409\\atm5\\tradelogs.txt";

	// 存放从文件中去出来的记录
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
	 * @Description:获取单例对象
	 * @param 无
	 * @return LogsDao对象
	 */
	public static LogsDao getLogsDao() {
		if (logsDao == null) {
			logsDao = new LogsDao();
		}
		return logsDao;
	}

	/**
	 * @Description:显示指定用户交易的信息
	 * @param inputId
	 * @return 如果查到记录，返回指定用户所有的信息
	 * 
	 */
	public StringBuffer getTradeLogById(String inputId) {
		System.out.println("显示当前账号"+inputId+"交易的所有交易信息");
		StringBuffer str = new StringBuffer();
		for (String string : list) {
			if (string.contains(inputId)) {
				str.append(string + "\n");
			}
		}
		return str;
	}

	/**
	 * @Description:显示所有用户的取款信息
	 */
	public void showTradeLogs() {
		System.out.println("这是所有的记录");
		for (String string : list) {
			System.out.println(string);
		}
	}

	/**
	 * @Description:从文件中获取用户的账号信息并存到list集合中去。
	 * @param 无
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
				// 跳过表头，不存入list集合
				if (count == 1) {
					continue;
				}

				s = "账号：" + v[0] + " " + v[1] + " 存款" + v[2] + "元，取款" + v[3]
						+ "元，余额" + v[4] + "元";
				// System.out.println(s);
				list.add(s);
			}
			System.out.println("hello");
			//System.out.println("文件读取成功并存到list的记录");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @Description: 根据指定参数改变对应账号的余额,
	 *               由于没有数据库，现只能再重新把已取的用户信息写进去只改变对应用户的账号余额,没数据库管理系统不好操作。
	 * @param inputId
	 *            ,double balance
	 * @return 如果写入记录正确，返回true，否则挂掉
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
