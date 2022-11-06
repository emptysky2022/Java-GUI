package exam.prac;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class pracDemo extends JFrame{
	JLabel label = new JLabel("",JLabel.CENTER);
	int count = 0;
	public pracDemo() {
		setTitle("카운터");
		setLayout(new BorderLayout());
		JPanel panel = new JPanel();
		JPanel panel2 = new JPanel();
		label.setText("개수 = " + count);
		JButton btn = new JButton("증가");
		
		ActionListener event = e -> {
			if(btn.getText() == "중지") {
				count = 0;
				btn.setText("증가");
			}
			else {
				count++;
				if(count < 25)
					btn.setText("계속");
				else
					btn.setText("중지");				
			}
			label.setText("개수 = " + (count));
		};
		btn.addActionListener(event);
		
		panel.add(label);
		panel2.add(btn);
		add(panel, BorderLayout.NORTH);
		add(panel2, BorderLayout.SOUTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,110);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new pracDemo();
	}
}
