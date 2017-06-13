package com.lanqiao.date170427;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GridLayoutTest extends JFrame {
	JButton btns[];
	JPanel panel;

	public GridLayoutTest() {
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
		//设置3行2列的网格布局
		panel.setLayout(new GridLayout(3, 2));

	}

	public JButton[] getBtns() {
		if (btns == null) {
			btns = new JButton[5];// 创建5个按钮
			for (int i = 0; i < btns.length; i++) {
				btns[i] = new JButton("Button" + i);
				btns[i].setSize(100, 100);
				btns[i].setText("网格布局");
			}
		}
		return btns;
	}

	public static void main(String[] args) {
		new GridLayoutTest();
	}
}
