package com.lanqiao.date170424.client;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
//1. 基于TCP 的文件上传
public class Client {
	public static void main(String[] args) {
		//D:\\WorkSpace\\Task\\src\\com\\lanqiao\\date170424\\client\\uploadfile.txt
		String path;
		
		Scanner in = new Scanner(System.in);
		Socket socket = null;
		BufferedInputStream bis = null;
		OutputStream os = null;
		InputStream is = null;
		
		try {
			//1、创建套接字
			socket = new Socket("127.0.0.1",1766);
			System.out.println("请选择要上传的文件：");
			path = in.next();
			
			//2、交互开始
			//把文件读入到输入流中
			bis = new BufferedInputStream(new FileInputStream(path));
			byte[] buffer = new byte[512];
			int index = bis.read(buffer);
			String msg = new String(buffer,0,index);

			//获取客户端的输出流，并把 文件信息写入服务器的输入流中。
			os = socket.getOutputStream();
			os.write(msg.getBytes());
			
			//接收来自客户端的响应
			is = socket.getInputStream();
			byte[] b = new byte[512];
			index = is.read(b);
			System.out.println("收到服务器端的消息："+new String(b,0,index));
			
			//3、关闭连接
			System.out.println("客户端关闭连接");
			bis.close();
			os.close();
			is.close();
			socket.close();
	
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
