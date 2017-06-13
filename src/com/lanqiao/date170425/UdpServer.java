package com.lanqiao.date170425;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * <p>
 * Title:UdpServer.java
 * </p>
 * <p>
 * Description: 
 * 2��UDP�ķ�������Ӧ
 * ʵ�ʾ����ڷ������������ݱ�����ָ��Դ����������Դ���������ݰ��л�ȡip��ַ��
 * </p>
 * 
 * @author forward
 * @date 2017��4��25�� ����11:20:46
 */
public class UdpServer {

	public static void main(String[] args) {
		DatagramPacket indp = null;
		DatagramPacket outdp = null;

		try {
			// 1���������ݱ������׽��֣��˿ں�1766
			DatagramSocket ds = new DatagramSocket(1766);
			byte[] buf = null;
			for (int i = 0; /*i < 10*/; i++) {
				buf = new byte[512];
				// 2�������������ݵ����ݱ�������
				indp = new DatagramPacket(buf, buf.length);

				// 3���Ӵ��׽��ֽ������ݱ�������ʾ������̨
				ds.receive(indp);
				show(indp);

				// 4��ԴSocketAddress��ΪĿ�괴�����ݱ���
				String str = "hello,client,i had receive "+i+" time";
				buf = str.getBytes();
				outdp = new DatagramPacket(buf, buf.length,
						indp.getSocketAddress());
				ds.send(outdp);
			}

			// 5���ر�
			//ds.close();

		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void show(DatagramPacket dp) {
		String str = new String(dp.getData(), 0, dp.getLength());
		String[] name = str.split(":"); 
		System.out.println("�������˽ӵ��ͻ���"+name[0]+"��������Ϣ��"
				+ name[1]);
	}

}
