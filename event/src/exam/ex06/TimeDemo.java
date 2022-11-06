package exam.ex06;

import java.awt.BorderLayout;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TimeDemo extends JFrame{
	public TimeDemo() {
		setTitle("디지털 시계");
		
		JPanel panel = new JPanel();
		
		JLabel label = new JLabel();
		Thread thread = new Thread(() -> {
			while(true) {
				System.out.println("스레드 구동중");
				Calendar calender = Calendar.getInstance();
				label.setText(calender.get(Calendar.HOUR_OF_DAY) + ":" + calender.get(Calendar.MINUTE) + ":" + calender.get(Calendar.SECOND));
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}
			}
		});
		thread.start();
		
		panel.add(label);
		add(panel, BorderLayout.CENTER);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,100);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new TimeDemo();
	}
}
