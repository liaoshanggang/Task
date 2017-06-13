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
 * 1. 熟悉布局方式编写流式布局；网格布局；边框式布局
 * 2. 使用2个面板完成组件的分布设计
 * 设置主面板为网格布局，设置4个面板，在每个面板设置相应布局
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
		this.setTitle("布局");
		for (int i = 0; i < 4; i++) {
			panel[i] = new JPanel();
			panel[i].setSize(300, 300);
		}

		//东南西北中边框布局没有显示，有些问题
		btns[9].setText("边框布局，没设置成功");
		//btns[9].setSize(200, 200);
		panel[3].add(btns[9], BorderLayout.NORTH);
		panel[3].add(btns[10],BorderLayout.SOUTH );
		panel[3].add(btns[11], BorderLayout.EAST);
		panel[3].add(btns[12], BorderLayout.WEST);
		panel[3].add(btns[13], BorderLayout.CENTER);

		for (int j = 0; j < 4; j++) {
			btns[j].setText("流式布局");
			panel[1].add(btns[j]);
		}

		for (int j = 4; j < 9; j++) {
			btns[j].setText("网格布局");
			panel[2].add(btns[j]);
		}
		// 设置每个面板颜色，方便区分
		panel[0].setBackground(Color.gray);
		panel[1].setBackground(Color.blue);
		panel[2].setBackground(Color.GREEN);
		panel[3].setBackground(Color.RED);

		// 设置流式布局
		panel[1].setLayout(new FlowLayout());
		// 设置网格布局
		panel[2].setLayout(new GridLayout(2, 2));
		// 设置边框式布局
		panel[3].setLayout(new BorderLayout());

		// 设置面板在主面板位置
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
			btns = new JButton[14];//创建14个按钮按需分每个面板
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
