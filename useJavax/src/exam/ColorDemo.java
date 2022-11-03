package exam;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorDemo extends JFrame{
	ColorDemo() {
		setTitle("색상 선택기");
		String[] color = {"빨간색", "초록색", "파란색"};
		JPanel panel = new JPanel(new BorderLayout());
		JPanel combo = new JPanel();
		JPanel check = new JPanel();
		JPanel button = new JPanel();
		
		JComboBox<String> comboBox = new JComboBox<>(color);
		
		JCheckBox check1 = new JCheckBox("배경색");
		JCheckBox check2 = new JCheckBox("전경색");
		
		JButton yes = new JButton("예");
		JButton no = new JButton("아니오");
		
		combo.add(comboBox);
		check.add(check1);
		check.add(check2);
		button.add(yes);
		button.add(no);
		
		panel.add(combo, BorderLayout.NORTH);
		panel.add(check, BorderLayout.CENTER);
		panel.add(button, BorderLayout.SOUTH);
		
		add(panel);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,150);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new ColorDemo();
	}
}
