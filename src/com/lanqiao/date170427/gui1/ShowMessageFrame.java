package com.lanqiao.date170427.gui1;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ShowMessageFrame extends JFrame {
	JLabel label = null;
	JTextField jtf = null;
	JButton jbtn = null;
	ButtonGroup bg = null;
	JRadioButton jbtn_boy = null;
	JRadioButton jbtn_gril = null;
	JTextArea ja = null;

	public ShowMessageFrame() {
		init();
		this.setVisible(true);
	}

	private void init() {
		label = new JLabel("��Ϣ��");
		jtf = new JTextField(30);
		jbtn = new JButton("����");
		jbtn_boy = new JRadioButton("��");
		jbtn_gril = new JRadioButton("Ů");
		ja = new JTextArea(10,50);
		bg = new ButtonGroup();
		this.setTitle("��Һ�");

		this.setBounds(500, 500, 600, 300);
		
		bg.add(jbtn_boy);
		bg.add(jbtn_gril);
		this.add(label);
		this.add(jtf);
		this.add(jbtn);
		this.add(jbtn_boy);
		this.add(jbtn_gril);
		this.add(ja);

		this.setLayout(new FlowLayout());

	}

	public static void main(String[] args) {
		new ShowMessageFrame();
	}
}
