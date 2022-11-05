package useJavax;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JFrame3Demo extends JFrame {
	public JFrame3Demo() {
		setTitle("안녕! 스윙");
		
		JButton b = new JButton("버튼");
		b.setText("버튼1");
		add(b);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 100);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JFrame3Demo();
	}
}
