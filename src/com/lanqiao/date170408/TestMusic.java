package com.lanqiao.date170408;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestMusic {

	public static final String PATH_YANYUAN = "D:\\WorkSpace\\Task\\src\\com\\lanqiao\\date170408\\Ѧ֮ǫ - ��Ա.mp3";
	public static final String PATH_CUT_YANYUAN = "D:\\WorkSpace\\Task\\src\\com\\lanqiao\\date170408\\yanyuan.mp3";
	public static final String PATH_GUANGHUI = "D:\\WorkSpace\\Task\\src\\com\\lanqiao\\date170408\\Beyond - �������.mp3";
	public static final String PATH_CUT_GUANGHUI = "D:\\WorkSpace\\Task\\src\\com\\lanqiao\\date170408\\���.mp3";
	public static final String PATH_CONNECTMUSIC = "D:\\WorkSpace\\Task\\src\\com\\lanqiao\\date170408\\connectMusic.mp3";

	public static void main(String[] args) {
		// Ѧ֮ǫ - ��Ա.mp3
		// 128kpbs 4,179,360�ֽ� ��4:21�� 
		// 128bit/8 byte *1024
		// 60s �����ֽ� 60* 128*1024/8 byte = 983040
		// 100s �����ֽ� 1s 100* 128*1024/8 byte= 1638400

		// Beyond - �������.mp3
		// 4,833,195 �ֽ� 5��01
		// 80�� �����ֽ�
		// 120���β���ֽ�
		// 1s 128bit/8 byte * 1024
		// 80s 80*128*1024/8 = 1310720
		// 120s 120*128*1024/8 = 1966080
		cutMusic(983040, 1638400, PATH_YANYUAN, PATH_CUT_YANYUAN);// ����һ����Ա����60~100s��Ƭ��
		connectMusic(PATH_CUT_YANYUAN, PATH_CONNECTMUSIC);// ����ԱƬ�θ��Ƶ������ļ�
		cutMusic(1310720, 1966080, PATH_GUANGHUI, PATH_CUT_GUANGHUI);// �ټ���һ�ι������80~120s��Ƭ��
		connectMusic(PATH_CUT_GUANGHUI, PATH_CONNECTMUSIC);// ����ԱƬ�θ��Ƶ������ļ�
	}

	// ���кõ�����������һ�𵽴����ļ���һ�ַ����ø���
	private static void connectMusic(String source, String target) {
		// TODO �Զ����ɵķ������
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
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} finally {
			try {
				if (bis != null) {
					bis.close();
				}
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			try {
				if (bos != null) {
					bos.close();
				}
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
	}

	// �����ֽ�ȡ
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

				// ���С�ڿ�ʼ�ֽڵľ�������
				if (total < start) {
					continue;
				}

				bos.write(b);

				// ������� ��β�ֽ��� ����ֹ��ȡ
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
