package exam.ex01;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ToggleDemo extends JFrame{
	public ToggleDemo() {
		setTitle("배경색 바꾸기");
		JPanel panel = new JPanel();
		panel.setBackground(null);
		JButton btn = new JButton("클릭");
		
		btn.addActionListener(e -> {
			if(panel.getBackground() == Color.yellow) 
				panel.setBackground(null);
			else
				panel.setBackground(Color.yellow);
		});
		
		panel.add(btn);
		add(panel);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,100);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new ToggleDemo();
	}
}
