package com.lanqiao.date170410.atm5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class UserAccountDao implements Dao {
	private static UserAccountDao userDao = null;
	public static Map<String, User> map = null;

	public static final String[] AC = new String[4];;

	public static final String PATH_USER_INFO = "D:\\WorkSpace\\Task\\src\\com\\lanqiao\\date170409\\atm5\\account.txt";

	{
		map = new HashMap<String, User>();
	}

	private UserAccountDao() {
		readUserInfo();
	}

	/**
	 * @Description:提供共有静态方法获取单例对象
	 * @return UserDao @
	 */
	public static UserAccountDao getUserAccountDao() {
		if (userDao == null) {
			userDao = new UserAccountDao();
		}
		return userDao;
	}

	@Override
	public User getUser(String inputId) {
		String id = this.getId(inputId);
		return map.get(id);
	}

	@Override
	public String getId(String inputId) {
		Iterator<Entry<String, User>> it = map.entrySet().iterator();
		String id = "";
		while (it.hasNext()) {
			Entry<String, User> entry = it.next();
			id = entry.getKey();
			if (id.equals(inputId)) {
				break;
			}
			// entry.getKey();
		}
		return id;
	}

	@Override
	public String getName(String inputId) {
		String id = this.getId(inputId);
		return map.get(id).getName();
	}

	@Override
	public String getPwd(String inputId) {
		String id = this.getId(inputId);
		return String.valueOf(map.get(id).getPwd());
	}

	@Override
	public double getBalance(String inputId) {
		String id = this.getId(inputId);
		System.out.println("hello" + id);
		return map.get(id).getAccount().getBalance();
	}

	@Override
	public void readUserInfo() {
		try (BufferedReader br = new BufferedReader(new FileReader(
				PATH_USER_INFO));) {
			String s = "";
			int count = 0;
			while ((s = br.readLine()) != null) {
				s = s.replace("|", ",");
				String[] v = s.split(",");
				String id = v[0];
				String name = v[1];
				count++;
				// 跳过表头，不存入map集合
				if (count == 1) {
					String pwd = v[2];
					String balance = v[3];
					String a = id.concat(name).concat(pwd).concat(balance);
					a.replace(" ", "");
					System.out.println(a);
					continue;
				}

				int pwd = Integer.parseInt(v[2]);
				double balance = Double.parseDouble(v[3]);
				User user = new User(name, new Account(id, balance), pwd);
				System.out.println(id + "\t\t" + name + "\t" + pwd + "\t"
						+ balance);
				map.put(id, user);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean writeUserInfo(String inputId, double balance) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(
				PATH_USER_INFO));) {

			Iterator<Entry<String, User>> it = map.entrySet().iterator();
			String head = "账号\t\t\t\t|用户|\t密码|\t余额\n";
			bw.write(head);
			while (it.hasNext()) {
				Entry<String, User> entry = it.next();
				User u = entry.getValue();
				String id = entry.getKey();
				String name = u.getName();
				int pwd = u.getPwd();
				double ban2 = u.getAccount().getBalance();
				if (inputId.equals(id)) {
					double ban1 = balance;// 就改变这个数据，其他都不变
					String str = id + "|" + name + "|" + pwd + "|" + ban1
							+ "\n";
					bw.write(str);
					continue;
				}
				String str = id + "|" + name + "|" + pwd + "|" + ban2 + "\n";
				bw.write(str);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		return true;
	}

}
