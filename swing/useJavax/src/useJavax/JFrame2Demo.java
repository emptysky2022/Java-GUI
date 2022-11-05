package useJavax;

import javax.swing.JFrame;

public class JFrame2Demo extends JFrame{
	JFrame2Demo() {
		setTitle("안녕!");
		setSize(300,100);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new JFrame2Demo();
	}
}
