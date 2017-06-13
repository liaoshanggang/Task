package com.lanqiao.date170427.gui2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
//里程牌 沟通打电话 每日站会 干系人
public class LayoutTest extends JFrame{
	JButton btn[] = new JButton[3];
	JPanel panel[] = new JPanel[3];
	public LayoutTest() {
		init();
		this.setVisible(true);
	}

	private void init() {
		this.setTitle("布局");
		for (int i = 0; i < 3; i++) {
			btn[i] = new JButton("Button"+i);
			panel[i] = new JPanel();
			panel[i].setSize(200, 200);
			this.add(btn[i]);
		}
		panel[0].setBackground(Color.gray);
		panel[1].setBackground(Color.blue);
		panel[2].setBackground(Color.GREEN);
		this.getContentPane().add(panel[0],BorderLayout.NORTH);
		this.getContentPane().add(panel[1],BorderLayout.SOUTH);
		this.getContentPane().add(panel[2],BorderLayout.EAST);
		this.setLayout(new FlowLayout());
		
		this.setBounds(100, 100, 500, 500);
	}
	
	public static void main(String[] args) {
		new LayoutTest();
	}
}
