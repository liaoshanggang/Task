package com.lanqiao.date170424.client;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
//1. ����TCP ���ļ��ϴ�
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
			//1�������׽���
			socket = new Socket("127.0.0.1",1766);
			System.out.println("��ѡ��Ҫ�ϴ����ļ���");
			path = in.next();
			
			//2��������ʼ
			//���ļ����뵽��������
			bis = new BufferedInputStream(new FileInputStream(path));
			byte[] buffer = new byte[512];
			int index = bis.read(buffer);
			String msg = new String(buffer,0,index);

			//��ȡ�ͻ��˵������������ �ļ���Ϣд����������������С�
			os = socket.getOutputStream();
			os.write(msg.getBytes());
			
			//�������Կͻ��˵���Ӧ
			is = socket.getInputStream();
			byte[] b = new byte[512];
			index = is.read(b);
			System.out.println("�յ��������˵���Ϣ��"+new String(b,0,index));
			
			//3���ر�����
			System.out.println("�ͻ��˹ر�����");
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
