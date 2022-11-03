package exam;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MessageDemo extends JOptionPane{
	MessageDemo() {
		String s1 = this.showInputDialog(null, "첫번째 숫자는?", "입력", QUESTION_MESSAGE);
		String s2 = this.showInputDialog(null, "두번째 숫자는?", "입력", QUESTION_MESSAGE);
		int sum = Integer.sum(Integer.parseInt(s1), Integer.parseInt(s2));
		
		this.showMessageDialog(null, ("합=" + sum), "메세지", JOptionPane.INFORMATION_MESSAGE);
		setVisible(true);
	
	}
	
	public static void main(String[] args) {
		new MessageDemo();
	}
}
