package com.lanqiao.date170427;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutTest extends JFrame {
	JButton btns[];

	public BorderLayoutTest() {
		init();
		this.setVisible(true);
	}

	private void init() {
		btns = getBtns();
		
		//JFrameĬ�ϱ߿򲼾�
		// �Ѱ�ť��ӵ�����壬���ö����ϣ����������У�5��λ��
		this.add(btns[0], BorderLayout.NORTH);
		this.add(btns[1], BorderLayout.SOUTH);
		this.add(btns[2], BorderLayout.EAST);
		this.add(btns[3], BorderLayout.WEST);
		this.add(btns[4], BorderLayout.CENTER);

		this.setBounds(100, 100, 300, 300);
	}

	public JButton[] getBtns() {
		if (btns == null) {
			btns = new JButton[5];// ����5����ť
			for (int i = 0; i < btns.length; i++) {
				btns[i] = new JButton("Button" + i);
				btns[i].setSize(100, 100);
			}
			btns[0].setText("��ť��");
			btns[1].setText("��ť��");
			btns[2].setText("��ť��");
			btns[3].setText("��ť��");
			btns[4].setText("��ť��");
		}
		return btns;
	}

	public static void main(String[] args) {
		new BorderLayoutTest();
	}
}
