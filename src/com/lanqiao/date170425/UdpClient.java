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
 * @date 2017年4月25日 上午11:24:32
 */
public class UdpClient {

	public static void main(String[] args) {
		String PID = UUID.randomUUID().toString();
		System.out.println(PID);
		DatagramPacket indp = null;
		DatagramPacket outdp = null;
		try {
			// 1、创建数据报报的套接字，ip:127.0.0.1,端口号1766
			DatagramSocket ds = new DatagramSocket();

			InetAddress ia = InetAddress.getByName("127.0.0.1");
			Scanner in = new Scanner(System.in);
			byte[] buf = null;
			for (int i = 0; /* i < 10 */; i++) {// 为了显示发送和接收效果循环10次
				System.out.println("请输入要发送的消息：");
				String str = in.next();
				// 2、从此套接字发送数据报包
				String msg = PID +":"+ str + (i + 1) + " 次";
				buf = msg.getBytes();
				outdp = new DatagramPacket(buf, buf.length, ia, 1766);
				ds.send(outdp);

				// 3、从此套接字接收数据报包
				buf = new byte[512];
				indp = new DatagramPacket(buf, buf.length);
				ds.receive(indp);
				show(indp);
			}

			// 3、关闭
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
		System.out.println("客户端接到服务器端发来的消息："
				+ new String(dp.getData(), 0, dp.getLength()));
	}
}
