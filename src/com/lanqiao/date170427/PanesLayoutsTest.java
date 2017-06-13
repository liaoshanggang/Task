package com.lanqiao.date170427;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 * 2. ʹ��2������������ķֲ����
 * ˼·��
 * 	������һ��һ��һ�е����񲼾֣���2�������ӵ��������棬Ȼ���ÿ��������ö�Ӧ����
 * */
public class PanesLayoutsTest extends JFrame{
	JButton btns[];
	JPanel panel[] = new JPanel[2];

	public PanesLayoutsTest() {
		init();
		this.setVisible(true);
	}

	private void init() {
		btns = getBtns();
		this.setTitle("����");
		for (int i = 0; i < 2; i++) {
			panel[i] = new JPanel();
			panel[i].setSize(300, 300);
		}

		for (int j = 0; j < 4; j++) {
			btns[j].setText("��ʽ����");
			panel[0].add(btns[j]);
		}

		for (int j = 4; j < 9; j++) {
			btns[j].setText("���񲼾�");
			panel[1].add(btns[j]);
		}
		// ����ÿ�������ɫ����������
		panel[0].setBackground(Color.gray);
		panel[1].setBackground(Color.blue);

		// ������ʽ����
		panel[0].setLayout(new FlowLayout());
		// �������񲼾�
		panel[1].setLayout(new GridLayout(2, 2));

		// ��������������λ��
		this.add(panel[0]);
		this.add(panel[1]);
		
		this.setLayout(new GridLayout());
		this.setBounds(100, 100, 500, 500);
	}

	public JButton[] getBtns() {
		if (btns == null) {
			btns = new JButton[14];//����14����ť�����ÿ�����
			for (int i = 0; i < btns.length; i++) {
				btns[i] = new JButton("Button" + i);
				btns[i].setSize(100, 100);
			}
		}
		return btns;
	}

	public static void main(String[] args) {
		new PanesLayoutsTest();
	}
}
