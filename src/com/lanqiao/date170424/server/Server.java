package com.lanqiao.date170424.server;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		InputStream is = null;
		OutputStream os = null;
		BufferedOutputStream bos = null;
		//文件存放到服务器端的位置
		String path = "D:\\WorkSpace\\Task\\src\\com\\lanqiao\\date170424\\server\\uploadfile.txt";
		
		try {
			//1、创建套接字
			serverSocket = new ServerSocket(1766);
			System.out.println("服务器等待连接中...");
			socket = serverSocket.accept();
			//2. 获得客户端的IP地址与主机名
			String name = socket.getLocalAddress().getHostAddress();
			int port = serverSocket.getLocalPort();
			System.out.println("服务器已经开启，连接了主机："+name+"端口："+port+"的客户端");
			
			//2、交互开始
			//获取服务器的输入流
			is = socket.getInputStream();
			byte[] buffer = new byte[512];
			int index = is.read(buffer);
			String recei = new String(buffer,0,index);
			
			//把从服务器的输入流中的信息写入到服务器端的存放上传文件中去。
			bos = new BufferedOutputStream(new FileOutputStream(path));
			bos.write(recei.getBytes());
			
			//响应客户端
			os = socket.getOutputStream();
			os.write("文件接收成功！".getBytes());
			
			//3、关闭连接
			System.out.println("服务器端关闭连接");
			is.close();
			os.close();
			bos.close();
			socket.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
