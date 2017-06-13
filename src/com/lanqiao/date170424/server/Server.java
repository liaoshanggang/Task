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
		//�ļ���ŵ��������˵�λ��
		String path = "D:\\WorkSpace\\Task\\src\\com\\lanqiao\\date170424\\server\\uploadfile.txt";
		
		try {
			//1�������׽���
			serverSocket = new ServerSocket(1766);
			System.out.println("�������ȴ�������...");
			socket = serverSocket.accept();
			//2. ��ÿͻ��˵�IP��ַ��������
			String name = socket.getLocalAddress().getHostAddress();
			int port = serverSocket.getLocalPort();
			System.out.println("�������Ѿ�������������������"+name+"�˿ڣ�"+port+"�Ŀͻ���");
			
			//2��������ʼ
			//��ȡ��������������
			is = socket.getInputStream();
			byte[] buffer = new byte[512];
			int index = is.read(buffer);
			String recei = new String(buffer,0,index);
			
			//�Ѵӷ��������������е���Ϣд�뵽�������˵Ĵ���ϴ��ļ���ȥ��
			bos = new BufferedOutputStream(new FileOutputStream(path));
			bos.write(recei.getBytes());
			
			//��Ӧ�ͻ���
			os = socket.getOutputStream();
			os.write("�ļ����ճɹ���".getBytes());
			
			//3���ر�����
			System.out.println("�������˹ر�����");
			is.close();
			os.close();
			bos.close();
			socket.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
