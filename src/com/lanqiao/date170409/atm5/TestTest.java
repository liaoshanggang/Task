package com.lanqiao.date170409.atm5;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description: 
�˺�				|�û�|	����|	���
1111222233334444|����|123456|10000.0
1111222233335555|����|123456|10000.0
1111222233336666|����|123456|10000.0
 * @author ���и�
 * @date 2017��4��9�� ����11:57:01
 * @version V1.0
 */
public class TestTest {
	public static void main(String[] args) {
		/*long ct = System.currentTimeMillis();
		Date d = new Date(ct);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH:ss:mm");
		System.out.println(sdf.format(d));*/
		
		Date nowTime = new Date();
		System.out.println(nowTime);
		
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat SDF = new SimpleDateFormat(pattern);
		String timePattern = SDF.format(nowTime);
		System.out.println(timePattern);
		
		pattern = "G yyyy��MMMd��E HHʱmm��ss��z";
		SDF = new SimpleDateFormat(pattern);
		timePattern = SDF.format(nowTime);
		System.out.println(timePattern);
		
		long time = System.currentTimeMillis();
		System.out.println("�����ǹ�Ԫ��"+time+"����");
		/*LogsDao ld = new LogsDao();
		ld.readLogs();
		ld.writeLogs("1111222233336666", "2017��04��10�� 09:51:49", 100000.0, 100000.0, 100000.0);*/
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
