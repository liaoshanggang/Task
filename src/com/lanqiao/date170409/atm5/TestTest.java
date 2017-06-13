package com.lanqiao.date170409.atm5;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description: 
账号				|用户|	密码|	余额
1111222233334444|张三|123456|10000.0
1111222233335555|李四|123456|10000.0
1111222233336666|王五|123456|10000.0
 * @author 廖尚岗
 * @date 2017年4月9日 下午11:57:01
 * @version V1.0
 */
public class TestTest {
	public static void main(String[] args) {
		/*long ct = System.currentTimeMillis();
		Date d = new Date(ct);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:ss:mm");
		System.out.println(sdf.format(d));*/
		
		Date nowTime = new Date();
		System.out.println(nowTime);
		
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat SDF = new SimpleDateFormat(pattern);
		String timePattern = SDF.format(nowTime);
		System.out.println(timePattern);
		
		pattern = "G yyyy年MMMd日E HH时mm分ss秒z";
		SDF = new SimpleDateFormat(pattern);
		timePattern = SDF.format(nowTime);
		System.out.println(timePattern);
		
		long time = System.currentTimeMillis();
		System.out.println("现在是公元后："+time+"毫秒");
		/*LogsDao ld = new LogsDao();
		ld.readLogs();
		ld.writeLogs("1111222233336666", "2017年04月10日 09:51:49", 100000.0, 100000.0, 100000.0);*/
		/*UserDao u = UserDao.getUserDao();
		String inputId = "1111222233336666";
		double ban = u.getBalance(inputId);
		String id = u.getId(inputId);
		String pwd = u.getPwd(inputId);
		String name = u.getName(inputId);
		System.out.println(id+" "+name+" "+pwd+" "+ban+" ");
		u.writeUserInfo(inputId, 100.0);*/
	}
}
