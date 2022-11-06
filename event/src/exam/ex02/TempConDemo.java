package exam.ex02;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TempConDemo extends JFrame{
	public TempConDemo() {
		setTitle("섭씨->화씨 변환");
		JPanel cPanel = new JPanel();
		JPanel fPanel = new JPanel();
		JPanel btnPanel = new JPanel();
		
		JLabel cLabel = new JLabel("섭씨");
		JLabel fLabel = new JLabel("화씨");
		
		JTextField cTxt = new JTextField(10);
		JTextField fTxt = new JTextField(10);
		fTxt.setEditable(false);
		
		JButton convert = new JButton("변환");
		convert.addActionListener(e -> {
			double temp = Double.parseDouble(cTxt.getText());
			fTxt.setText("" + (temp*9/5 + 32));
		});
		
		cPanel.add(cLabel);
		cPanel.add(cTxt);
		
		fPanel.add(fLabel);
		fPanel.add(fTxt);
		
		btnPanel.add(convert);
		
		add(cPanel, BorderLayout.NORTH);
		add(fPanel, BorderLayout.CENTER);
		add(btnPanel, BorderLayout.SOUTH);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,150);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new TempConDemo();
	}
}
