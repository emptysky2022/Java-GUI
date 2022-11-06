package exam.ex04;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CountDemo extends JFrame implements ActionListener{
	int count;
	JLabel label;
	Thread thread;
	JButton start;
	public CountDemo() {
		setTitle("카운터");
		
		JPanel countPanel = new JPanel();
		JPanel btnPanel = new JPanel();
		
		count = 0;
		label = new JLabel("개수=" + count);
		
		start = new JButton("시작");
		JButton reset = new JButton("리셋");
		
		start.addActionListener(this);
		reset.addActionListener(this);
		
		countPanel.add(label);
		
		btnPanel.add(start);
		btnPanel.add(reset);
		
		add(countPanel, BorderLayout.NORTH);
		add(btnPanel, BorderLayout.CENTER);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,120);
		setVisible(true);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton)(e.getSource());
		if(thread == null || thread.isAlive() == false) {
			thread = new Thread(new Counter());
			System.out.println("스레드 생성");
		}
		switch(btn.getText()) {
		case "시작" -> {
			btn.setText("정지");
			thread.start();
		}
		case "정지" -> {
			btn.setText("시작");
			thread.stop();
		}
		case "리셋" -> {
			count = 0;
			label.setText("개수=" + count);
			start.setText("시작");
			if(!(thread == null || thread.isAlive() == false)) 
				thread.stop();
		}
		}
		
	}
	
	class Counter implements Runnable{
		private boolean stopped = false;
		public void run() {
			while(!stopped) {
				System.out.println("스레드 구동중");
				count++;
				label.setText("개수=" + count);
				try {
					Thread.sleep(500);
				}catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}
		public void stop() {
			stopped = true;
		}
	}
	
	public static void main(String[] args) {
		new CountDemo();
	}
	
}

