package exam.ex08;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class KeypadDemo extends JFrame implements ActionListener{
	JTextField input = new JTextField(10);
	public KeypadDemo() {
		JPanel[] pads = new JPanel[4];
		JButton[] btns = new JButton[12];
		setTitle("키패드");
		setLayout(new GridLayout(5,0,10,10));
		
		JPanel textPanel = new JPanel();
		input.setEditable(false);
		
		for(int i = 0; i < 3; i++) {
			pads[i] = new JPanel();
			for(int j = 0; j < 3; j++) {
				btns[i*3+j] = new JButton("" + (7-i*3+j));
				btns[i*3+j].addActionListener(this);
				pads[i].add(btns[i*3+j]);
			}
		}
		
		pads[3] = new JPanel();
		btns[9] = new JButton("0");
		btns[10] = new JButton(".");
		btns[11] = new JButton("CE");
		btns[9].addActionListener(this);
		btns[10].addActionListener(this);
		btns[11].addActionListener(this);
		pads[3].add(btns[9]);
		pads[3].add(btns[10]);
		pads[3].add(btns[11]);
		
		textPanel.add(input);
		add(textPanel);
		for(JPanel panel : pads)
			add(panel);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,250);
		setVisible(true);
	}
	public static void main(String[] args) {
		new KeypadDemo();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		switch(str) {
		case "0" -> input.setText(input.getText() + '0');
		case "1" -> input.setText(input.getText() + '1');
		case "2" -> input.setText(input.getText() + '2');
		case "3" -> input.setText(input.getText() + '3');
		case "4" -> input.setText(input.getText() + '4');
		case "5" -> input.setText(input.getText() + '5');
		case "6" -> input.setText(input.getText() + '6');
		case "7" -> input.setText(input.getText() + '7');
		case "8" -> input.setText(input.getText() + '8');
		case "9" -> input.setText(input.getText() + '9');
		case "." -> input.setText(input.getText() + '.');
		case "CE" -> input.setText("");
		}
	}
}
