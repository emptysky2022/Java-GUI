package exam.ex05;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class RandomBackground extends JFrame {
	public RandomBackground() {
		setTitle("임의의 배경색");
		
		JPanel panel = new JPanel();
		MouseAdapter ma = new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JPanel panel = (JPanel)(e.getSource());
				Random random = new Random();
				panel.setBackground(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
			}
		};
		panel.addMouseListener(ma);
		
		add(panel);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,120);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new RandomBackground();
	}
}
