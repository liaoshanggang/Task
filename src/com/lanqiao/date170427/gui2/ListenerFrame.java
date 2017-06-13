package com.lanqiao.date170427.gui2;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ListenerFrame extends JFrame{
	private JButton btn ;
	
	public ListenerFrame() {
		init();
		this.setVisible(true);
	}

	private void init() {
		this.setTitle("必须抓到我！");
		this.setBounds(100, 100, 500, 500);
		this.setLayout(new FlowLayout());
		this.add(getBtnClose());
	}
	
	public JButton getBtnClose(){
		//if(btn==null){
			btn = new JButton("来打我啊！");
		
		
		btn.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				System.exit(0);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				int x = (int) (Math.random() * 200);
				int y = (int) (Math.random() * 200);
				btn.setLocation(x, y);
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		//}
		return btn;
	}
	
	public static void main(String[] args) {
		new ListenerFrame();
	}
}
