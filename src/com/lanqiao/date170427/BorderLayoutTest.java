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
		
		//JFrame默认边框布局
		// 把按钮添加到主面板，设置东，南，西，北，中，5个位置
		this.add(btns[0], BorderLayout.NORTH);
		this.add(btns[1], BorderLayout.SOUTH);
		this.add(btns[2], BorderLayout.EAST);
		this.add(btns[3], BorderLayout.WEST);
		this.add(btns[4], BorderLayout.CENTER);

		this.setBounds(100, 100, 300, 300);
	}

	public JButton[] getBtns() {
		if (btns == null) {
			btns = new JButton[5];// 创建5个按钮
			for (int i = 0; i < btns.length; i++) {
				btns[i] = new JButton("Button" + i);
				btns[i].setSize(100, 100);
			}
			btns[0].setText("按钮北");
			btns[1].setText("按钮南");
			btns[2].setText("按钮东");
			btns[3].setText("按钮西");
			btns[4].setText("按钮中");
		}
		return btns;
	}

	public static void main(String[] args) {
		new BorderLayoutTest();
	}
}
