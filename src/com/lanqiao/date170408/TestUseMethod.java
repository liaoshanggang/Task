package com.lanqiao.date170408;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//3���ַ����������

public class TestUseMethod {
	private static final String PATH = "D:\\WorkSpace\\Task\\src\\com\\lanqiao\\date170408\\������.mp3";
	private static final String COPY_PATH = "D:\\WorkSpace\\Task\\src\\com\\lanqiao\\date170408\\copyliuhai.mp3";

	public static void main(String[] args) {
		method1();
	}
	
	//�ļ��ַ���
	private static void m1() {

		try (FileReader fr = new FileReader(PATH);
				FileWriter fw  = new FileWriter(COPY_PATH);) {
			int c = 0;
			while ((c = fr.read()) != -1) {
				fw.write(c);
			}

		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}

	}
	
	private static void m2() {

		try (FileReader fr = new FileReader(PATH);
				FileWriter fw  = new FileWriter(COPY_PATH);) {
			char[] c = new char[1024];
			int a = 0;
		
			while ((a = fr.read(c)) != -1) {
				fw.write(a);
			}

		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}

	}
	
	
	private static void m3() {

		try (FileReader fr = new FileReader(PATH);
				FileWriter fw  = new FileWriter(COPY_PATH);) {
			char[] c = new char[512];
			int len = 0;
			while ((len = fr.read(c, 0, 256)) != -1) {
				fw.write(c,0,len);
			}

		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}

	}

	// 1.���壬һ��һ���ַ�����д
	private static void method1() {
		// TODO �Զ����ɵķ������
		try (BufferedReader br = new BufferedReader(new FileReader(PATH));
				BufferedWriter bw = new BufferedWriter(
						new FileWriter(COPY_PATH));) {

			int c = 0;

			while ((c = br.read()) != -1) {
				bw.write(c);
			}

		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}

	// 2.����,һ��һ���ַ�������д
	private static void method2() {
		// TODO �Զ����ɵķ������
		try (BufferedReader br = new BufferedReader(new FileReader(PATH));
				BufferedWriter bw = new BufferedWriter(
						new FileWriter(COPY_PATH));) {

			String len = "";
			while ((len = br.readLine()) != null) {
				bw.write(len);
				;
			}

		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}

	// 3�����壬���ַ����������ĳһ���֡�
	private static void method3() {
		// TODO �Զ����ɵķ������
		try (BufferedReader br = new BufferedReader(new FileReader(PATH));
				BufferedWriter bw = new BufferedWriter(
						new FileWriter(COPY_PATH));) {

			char[] c = new char[1024];
			int len = 0;
			while ((len = br.read(c)) != -1) {
				bw.write(c, 0, len);
			}

		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}

}
