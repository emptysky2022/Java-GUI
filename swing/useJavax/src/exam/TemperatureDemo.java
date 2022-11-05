package exam;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TemperatureDemo extends JFrame{
	TemperatureDemo() {
		setTitle("섭씨 -> 화씨 변환");
		JPanel panel = new JPanel(new BorderLayout());
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel btn = new JPanel();
		
		
		JLabel c = new JLabel("섭씨");
		JLabel f = new JLabel("화씨");
		
		JTextField input = new JTextField(10);
		JTextField output = new JTextField(10);
		output.setEnabled(false);
		
		JButton as = new JButton("변환");
		
		panel1.add(c);
		panel1.add(input);
		panel2.add(f);
		panel2.add(output);
		btn.add(as);
		panel.add(panel1, BorderLayout.NORTH);
		panel.add(panel2, BorderLayout.CENTER);
		panel.add(btn, BorderLayout.SOUTH);
		
		add(panel);
		
		setSize(300,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
		new TemperatureDemo();
	}
}
