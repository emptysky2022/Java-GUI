package exam.prac;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorTest extends JFrame{
	CalculatorTest() {
		setTitle("계산기");
		setLayout(new BorderLayout(10,10));
		
		JPanel northPanel = new JPanel();
		JTextField tf = new JTextField(10);
		tf.setEnabled(false);
		
		JPanel centerPanel = new JPanel();
		JPanel onOffPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
		//1번
//		JPanel panel1 = new JPanel();
//		JPanel panel2 = new JPanel();
//		JPanel panel3 = new JPanel();
//		JPanel panel4 = new JPanel();
//		panel1.add(b7);
//		panel1.add(b8);
//		panel1.add(b9);
//		panel1.add(plus);
//		panel2.add(b4);
//		panel2.add(b5);
//		panel2.add(b6);
//		panel2.add(minus);
//		panel3.add(b1);
//		panel3.add(b2);
//		panel3.add(b3);
//		panel3.add(mul);
//		panel4.add(b0);
//		panel4.add(decimal);
//		panel4.add(equal);
//		panel4.add(div);
//		centerPanel.add(panel1);
//		centerPanel.add(panel2);
//		centerPanel.add(panel3);
//		centerPanel.add(panel4);
		
		//2번
		JPanel panel = new JPanel(new GridLayout(4,4,10,10));
		
		JButton on = new JButton("on");
		JButton off = new JButton("off");
		JButton b0 = new JButton("0");
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JButton b4 = new JButton("4");
		JButton b5 = new JButton("5");
		JButton b6 = new JButton("6");
		JButton b7 = new JButton("7");
		JButton b8 = new JButton("8");
		JButton b9 = new JButton("9");
		JButton decimal = new JButton(".");
		JButton equal = new JButton("=");
		JButton mul = new JButton("*");
		JButton minus = new JButton("-");
		JButton plus = new JButton("+");
		JButton div = new JButton("÷");

		panel.add(b7);
		panel.add(b8);
		panel.add(b9);
		panel.add(plus);
		panel.add(b4);
		panel.add(b5);
		panel.add(b6);
		panel.add(minus);
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(mul);
		panel.add(b0);
		panel.add(decimal);
		panel.add(equal);
		panel.add(div);
		
		onOffPanel.add(on);
		onOffPanel.add(off);
		centerPanel.add(onOffPanel);
		centerPanel.add(panel);
		
		northPanel.add(tf);
		
		add(northPanel, BorderLayout.NORTH);
		add(centerPanel, BorderLayout.CENTER);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(250,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new CalculatorTest();
	}
	
}
