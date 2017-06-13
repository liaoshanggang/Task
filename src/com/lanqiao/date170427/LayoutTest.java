package com.lanqiao.date170427;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 1. ��Ϥ���ַ�ʽ��д��ʽ���֣����񲼾֣��߿�ʽ����
 * 2. ʹ��2������������ķֲ����
 * ���������Ϊ���񲼾֣�����4����壬��ÿ�����������Ӧ����
 */
public class LayoutTest extends JFrame {
	JButton btns[];
	JPanel panel[] = new JPanel[4];

	public LayoutTest() {
		init();
		this.setVisible(true);
	}

	private void init() {
		btns = getBtns();
		this.setTitle("����");
		for (int i = 0; i < 4; i++) {
			panel[i] = new JPanel();
			panel[i].setSize(300, 300);
		}

		//���������б߿򲼾�û����ʾ����Щ����
		btns[9].setText("�߿򲼾֣�û���óɹ�");
		//btns[9].setSize(200, 200);
		panel[3].add(btns[9], BorderLayout.NORTH);
		panel[3].add(btns[10],BorderLayout.SOUTH );
		panel[3].add(btns[11], BorderLayout.EAST);
		panel[3].add(btns[12], BorderLayout.WEST);
		panel[3].add(btns[13], BorderLayout.CENTER);

		for (int j = 0; j < 4; j++) {
			btns[j].setText("��ʽ����");
			panel[1].add(btns[j]);
		}

		for (int j = 4; j < 9; j++) {
			btns[j].setText("���񲼾�");
			panel[2].add(btns[j]);
		}
		// ����ÿ�������ɫ����������
		panel[0].setBackground(Color.gray);
		panel[1].setBackground(Color.blue);
		panel[2].setBackground(Color.GREEN);
		panel[3].setBackground(Color.RED);

		// ������ʽ����
		panel[1].setLayout(new FlowLayout());
		// �������񲼾�
		panel[2].setLayout(new GridLayout(2, 2));
		// ���ñ߿�ʽ����
		panel[3].setLayout(new BorderLayout());

		// ��������������λ��
		for (int i = 0; i < panel.length; i++) {
			this.getContentPane().add(panel[i]);
		}
		
		//Button btn = new Button("helo");
		
		//this.add(btn);
		this.setLayout(new GridLayout(2,2) );
		//this.add(btn,BorderLayout.NORTH);
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
		new LayoutTest();
	}
}
