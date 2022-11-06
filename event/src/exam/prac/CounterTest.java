package exam.prac;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CounterTest extends JFrame implements ActionListener{
	int count = 0;
	JLabel label;
	JButton btn;
	
	public CounterTest() {
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
	
	public static void main(String[] args) {
		new CounterTest();
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		new Thread(() -> {
			while(true) {
				count++;
				label.setText("개수 = " + count);
				try {
				Thread.sleep(500);
				}catch (Exception e) {
				}
			}
		}).start();
	}
}
