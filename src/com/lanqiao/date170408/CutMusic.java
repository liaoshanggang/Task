package com.lanqiao.date170408;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 需求：做一个音乐串烧  
 * 分析：
 *    1. 有n个音乐，找到高潮部分，
 *    2. 获取高潮部分的流对象
 *    3. 把这部分对象保存成一个mp3
 *    4. 把它们拼接起来
 */
public class CutMusic {

	public static void main(String[] args) {

		// 50000332 200000 400000 如何计算？

		// 4,723,084 字节 115秒
		// 40秒 多少字节
		// 82秒结尾的字节
		// 1s 320bit/8 byte * 1024
		// 40*320*1024/8 = 1,638,400
		// 82*320*1024/8 = 3,358,720

		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;

		int start = 1638400;
		int end = 3358720;

		try {
			bos = new BufferedOutputStream(new FileOutputStream("D:\\WorkSpace\\Test\\src\\com\\lanqiao\\data20170407\\liuhai.mp3"));
			bis = new BufferedInputStream(new FileInputStream("D:\\WorkSpace\\Test\\src\\com\\lanqiao\\data20170407\\刘海哥.mp3"));

			byte[] b = new byte[512];
			int len = 0;

			int total = 0;
			while ((len = bis.read(b)) != -1) {

				total += len;

				// 如果小于开始字节的就抛弃掉
				if (total < start) {
					continue;
				}

				bos.write(b);

				// 如果大于 结尾字节数 就终止读取
				if (total >= end) {
					bos.flush();
					break;
				}

			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bos != null) bos.close();
				if (bis != null) bis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
