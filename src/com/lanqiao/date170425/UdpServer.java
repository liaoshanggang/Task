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
 * 2、UDP的服务器回应
 * 实际就是在服务器发送数据报包到指定源，这个从这个源发来的数据包中获取ip地址。
 * </p>
 * 
 * @author forward
 * @date 2017年4月25日 上午11:20:46
 */
public class UdpServer {

	public static void main(String[] args) {
		DatagramPacket indp = null;
		DatagramPacket outdp = null;

		try {
			// 1、创建数据报报的套接字，端口号1766
			DatagramSocket ds = new DatagramSocket(1766);
			byte[] buf = null;
			for (int i = 0; /*i < 10*/; i++) {
				buf = new byte[512];
				// 2、创建接收数据的数据报包对象
				indp = new DatagramPacket(buf, buf.length);

				// 3、从此套接字接收数据报包并显示到控制台
				ds.receive(indp);
				show(indp);

				// 4、源SocketAddress作为目标创建数据报包
				String str = "hello,client,i had receive "+i+" time";
				buf = str.getBytes();
				outdp = new DatagramPacket(buf, buf.length,
						indp.getSocketAddress());
				ds.send(outdp);
			}

			// 5、关闭
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
		System.out.println("服务器端接到客户端"+name[0]+"发来的消息："
				+ name[1]);
	}

}
