package com.lanqiao.date170425;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.util.UUID;

/**
 * <p>
 * Title:UdpClient.java
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author forward
 * @date 2017��4��25�� ����11:24:32
 */
public class UdpClient {

	public static void main(String[] args) {
		String PID = UUID.randomUUID().toString();
		System.out.println(PID);
		DatagramPacket indp = null;
		DatagramPacket outdp = null;
		try {
			// 1���������ݱ������׽��֣�ip:127.0.0.1,�˿ں�1766
			DatagramSocket ds = new DatagramSocket();

			InetAddress ia = InetAddress.getByName("127.0.0.1");
			Scanner in = new Scanner(System.in);
			byte[] buf = null;
			for (int i = 0; /* i < 10 */; i++) {// Ϊ����ʾ���ͺͽ���Ч��ѭ��10��
				System.out.println("������Ҫ���͵���Ϣ��");
				String str = in.next();
				// 2���Ӵ��׽��ַ������ݱ���
				String msg = PID +":"+ str + (i + 1) + " ��";
				buf = msg.getBytes();
				outdp = new DatagramPacket(buf, buf.length, ia, 1766);
				ds.send(outdp);

				// 3���Ӵ��׽��ֽ������ݱ���
				buf = new byte[512];
				indp = new DatagramPacket(buf, buf.length);
				ds.receive(indp);
				show(indp);
			}

			// 3���ر�
			// ds.close();

		} catch (SocketException e) {
			e.printStackTrace();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void show(DatagramPacket dp) {
		System.out.println("�ͻ��˽ӵ��������˷�������Ϣ��"
				+ new String(dp.getData(), 0, dp.getLength()));
	}
}
