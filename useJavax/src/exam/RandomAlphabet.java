package exam;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class RandomAlphabet extends JFrame{
	RandomAlphabet() {
		Random random = new Random();
		setTitle("난수 알파벳");
		JPanel panel = new JPanel();
		panel.setLayout(null);
		JLabel labela = new JLabel("a");
		labela.setBounds(random.nextInt(300),random.nextInt(300),random.nextInt(300),random.nextInt(300));
		JLabel labelb = new JLabel("b");
		labelb.setBounds(random.nextInt(300),random.nextInt(300),random.nextInt(300),random.nextInt(300));
		JLabel labelc = new JLabel("c");
		labelc.setBounds(random.nextInt(300),random.nextInt(300),random.nextInt(300),random.nextInt(300));
		JLabel labeld = new JLabel("d");
		labeld.setBounds(random.nextInt(300),random.nextInt(300),random.nextInt(300),random.nextInt(300));
		JLabel labele = new JLabel("e");
		labele.setBounds(random.nextInt(300),random.nextInt(300),random.nextInt(300),random.nextInt(300));
		JLabel labelf = new JLabel("f");
		labelf.setBounds(random.nextInt(300),random.nextInt(300),random.nextInt(300),random.nextInt(300));
		panel.add(labela);
		panel.add(labelb);
		panel.add(labelc);
		panel.add(labeld);
		panel.add(labele);
		panel.add(labelf);
		
		add(panel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new RandomAlphabet();
	}
}
