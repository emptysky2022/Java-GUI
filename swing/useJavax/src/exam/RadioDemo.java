package exam;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioDemo extends JFrame{
	RadioDemo() {
		setTitle("애완 동물");
		JPanel panel = new JPanel();
		ButtonGroup bg = new ButtonGroup();
		JRadioButton rb1 = new JRadioButton("강아지");
		JRadioButton rb2 = new JRadioButton("고양이");
		JRadioButton rb3 = new JRadioButton("금붕어");
		
		bg.add(rb1);
		bg.add(rb2);
		bg.add(rb3);
		
		panel.add(rb1);
		panel.add(rb2);
		panel.add(rb3);
		
		add(panel);
		setSize(300,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new RadioDemo();
	}
}
