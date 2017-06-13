package com.lanqiao.date170427;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayoutTest extends JFrame{
	JButton btns[];
	JPanel panel;

	public FlowLayoutTest() {
		init();
		this.setVisible(true);
	}

	private void init() {
		btns = getBtns();
		panel = new JPanel();
		for (int i = 0; i < btns.length; i++) {
			panel.add(btns[i]);
		}

		this.getContentPane().add(panel);
		this.setBounds(100, 100, 300, 300);
		//������ʽ����
		panel.setLayout(new FlowLayout());

	}

	public JButton[] getBtns() {
		if (btns == null) {
			btns = new JButton[5];// ����5����ť
			for (int i = 0; i < btns.length; i++) {
				btns[i] = new JButton("Button" + i);
				btns[i].setSize(100, 100);
				btns[i].setText("��ʽ����");
			}
		}
		return btns;
	}

	public static void main(String[] args) {
		new FlowLayoutTest();
	}
}
