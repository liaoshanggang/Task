package com.lanqiao.date170408;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//3种字符流输入输出

public class TestUseMethod {
	private static final String PATH = "D:\\WorkSpace\\Task\\src\\com\\lanqiao\\date170408\\刘海哥.mp3";
	private static final String COPY_PATH = "D:\\WorkSpace\\Task\\src\\com\\lanqiao\\date170408\\copyliuhai.mp3";

	public static void main(String[] args) {
		method1();
	}
	
	//文件字符，
	private static void m1() {

		try (FileReader fr = new FileReader(PATH);
				FileWriter fw  = new FileWriter(COPY_PATH);) {
			int c = 0;
			while ((c = fr.read()) != -1) {
				fw.write(c);
			}

		} catch (IOException e) {
			// TODO 自动生成的 catch 块
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
			// TODO 自动生成的 catch 块
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
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}

	}

	// 1.缓冲，一个一个字符读和写
	private static void method1() {
		// TODO 自动生成的方法存根
		try (BufferedReader br = new BufferedReader(new FileReader(PATH));
				BufferedWriter bw = new BufferedWriter(
						new FileWriter(COPY_PATH));) {

			int c = 0;

			while ((c = br.read()) != -1) {
				bw.write(c);
			}

		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}

	// 2.缓冲,一行一行字符串读和写
	private static void method2() {
		// TODO 自动生成的方法存根
		try (BufferedReader br = new BufferedReader(new FileReader(PATH));
				BufferedWriter bw = new BufferedWriter(
						new FileWriter(COPY_PATH));) {

			String len = "";
			while ((len = br.readLine()) != null) {
				bw.write(len);
				;
			}

		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}

	// 3，缓冲，将字符读入数组的某一部分。
	private static void method3() {
		// TODO 自动生成的方法存根
		try (BufferedReader br = new BufferedReader(new FileReader(PATH));
				BufferedWriter bw = new BufferedWriter(
						new FileWriter(COPY_PATH));) {

			char[] c = new char[1024];
			int len = 0;
			while ((len = br.read(c)) != -1) {
				bw.write(c, 0, len);
			}

		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}

}
