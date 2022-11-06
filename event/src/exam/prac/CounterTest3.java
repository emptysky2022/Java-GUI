package exam.prac;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CounterTest3 extends JFrame implements ActionListener{
	JLabel label;
	JButton btn;
	int count = 0;
	
	Thread thread;
	public CounterTest3() {
		setTitle("카운터");
		setLayout(new BorderLayout());
		JPanel lPanel = new JPanel();
		JPanel bPanel = new JPanel();
		
		label = new JLabel();
		label.setText("개수 = " + count);
		
		btn = new JButton("시작");
		btn.addActionListener(this);
		
		lPanel.add(label);
		bPanel.add(btn);
		add(lPanel, BorderLayout.NORTH);
		add(bPanel, BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,110);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if(thread == null || thread.isAlive() == false) {
			btn.setText("중지");
			thread = new Thread(new Counter());
			thread.start();
		}else {
			if(btn.getText() == "중지") {		
				btn.setText("계속");
				thread.stop();
			}else {
				btn.setText("중지");
				thread.start();
			}
		}
	}
	
	class Counter implements Runnable{
		private boolean stopped = false;
		public void run() {
			while(!stopped) {
				count++;
				label.setText("개수 = " + count);
				try {
				Thread.sleep(500);
				}catch (Exception e) {
				}
			}
		}
		public void stop() {
			stopped = true;
		}
	}
	
	public static void main(String[] args) {
		new CounterTest3();
	}
}
