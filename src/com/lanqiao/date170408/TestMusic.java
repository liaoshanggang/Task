package com.lanqiao.date170408;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestMusic {

	public static final String PATH_YANYUAN = "D:\\WorkSpace\\Task\\src\\com\\lanqiao\\date170408\\薛之谦 - 演员.mp3";
	public static final String PATH_CUT_YANYUAN = "D:\\WorkSpace\\Task\\src\\com\\lanqiao\\date170408\\yanyuan.mp3";
	public static final String PATH_GUANGHUI = "D:\\WorkSpace\\Task\\src\\com\\lanqiao\\date170408\\Beyond - 光辉岁月.mp3";
	public static final String PATH_CUT_GUANGHUI = "D:\\WorkSpace\\Task\\src\\com\\lanqiao\\date170408\\光辉.mp3";
	public static final String PATH_CONNECTMUSIC = "D:\\WorkSpace\\Task\\src\\com\\lanqiao\\date170408\\connectMusic.mp3";

	public static void main(String[] args) {
		// 薛之谦 - 演员.mp3
		// 128kpbs 4,179,360字节 总4:21分 
		// 128bit/8 byte *1024
		// 60s 多少字节 60* 128*1024/8 byte = 983040
		// 100s 多少字节 1s 100* 128*1024/8 byte= 1638400

		// Beyond - 光辉岁月.mp3
		// 4,833,195 字节 5：01
		// 80秒 多少字节
		// 120秒结尾的字节
		// 1s 128bit/8 byte * 1024
		// 80s 80*128*1024/8 = 1310720
		// 120s 120*128*1024/8 = 1966080
		cutMusic(983040, 1638400, PATH_YANYUAN, PATH_CUT_YANYUAN);// 剪切一段演员歌曲60~100s的片段
		connectMusic(PATH_CUT_YANYUAN, PATH_CONNECTMUSIC);// 把演员片段复制到串烧文件
		cutMusic(1310720, 1966080, PATH_GUANGHUI, PATH_CUT_GUANGHUI);// 再剪切一段光辉岁月80~120s的片段
		connectMusic(PATH_CUT_GUANGHUI, PATH_CONNECTMUSIC);// 把演员片段复制到串烧文件
	}

	// 把切好的音乐连接再一起到串烧文件，一种方法用复制
	private static void connectMusic(String source, String target) {
		// TODO 自动生成的方法存根
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			bis = new BufferedInputStream(new FileInputStream(source));
			bos = new BufferedOutputStream(new FileOutputStream(target, true));

			byte[] b = new byte[512];

			int len = 0;

			while ((len = bis.read(b)) != -1) {
				bos.write(b, 0, len);
			}

		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} finally {
			try {
				if (bis != null) {
					bis.close();
				}
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			try {
				if (bos != null) {
					bos.close();
				}
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}

	// 把音乐截取
	private static void cutMusic(int start, int end, String source,
			String target) {

		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;

		try {
			bos = new BufferedOutputStream(new FileOutputStream(target));
			bis = new BufferedInputStream(new FileInputStream(source));

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
				if (bos != null)
					bos.close();
				if (bis != null)
					bis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
