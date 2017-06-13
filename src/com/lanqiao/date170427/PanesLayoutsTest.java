package com.lanqiao.date170427;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 * 2. 使用2个面板完成组件的分布设计
 * 思路：
 * 	先设置一个一行一列的网格布局，把2个面板添加到网格里面，然后对每个面板设置对应布局
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
		this.setTitle("布局");
		for (int i = 0; i < 2; i++) {
			panel[i] = new JPanel();
			panel[i].setSize(300, 300);
		}

		for (int j = 0; j < 4; j++) {
			btns[j].setText("流式布局");
			panel[0].add(btns[j]);
		}

		for (int j = 4; j < 9; j++) {
			btns[j].setText("网格布局");
			panel[1].add(btns[j]);
		}
		// 设置每个面板颜色，方便区分
		panel[0].setBackground(Color.gray);
		panel[1].setBackground(Color.blue);

		// 设置流式布局
		panel[0].setLayout(new FlowLayout());
		// 设置网格布局
		panel[1].setLayout(new GridLayout(2, 2));

		// 设置面板在主面板位置
		this.add(panel[0]);
		this.add(panel[1]);
		
		this.setLayout(new GridLayout());
		this.setBounds(100, 100, 500, 500);
	}

	public JButton[] getBtns() {
		if (btns == null) {
			btns = new JButton[14];//创建14个按钮按需分每个面板
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
