package exam;

import java.awt.CardLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CardShuffle extends JFrame{
	CardLayout layout;
	
	public void rotate() {
		while(true) {
			try {
				Thread.sleep(500);
			}catch (Exception e) {
			}
			layout.next(this.getContentPane());
		}
	}
	
	CardShuffle() {
		layout = new CardLayout();
		setTitle("카드 레이아웃");
		JPanel panel = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel menu = new JPanel(new GridLayout(0,4, 5, 5));
		JPanel menu2 = new JPanel(new GridLayout(0,4,5,5));
		JPanel card = new JPanel();
		JPanel cardd = new JPanel();
		setLayout(layout);
		
		JButton btn1 = new JButton("<<"); 
		JButton btn2 = new JButton("<"); 
		JButton btn3 = new JButton(">"); 
		JButton btn4 = new JButton(">>"); 
		JButton btn5 = new JButton("<<"); 
		JButton btn6 = new JButton("<"); 
		JButton btn7 = new JButton(">"); 
		JButton btn8 = new JButton(">>"); 
		
		menu.add(btn1);
		menu.add(btn2);
		menu.add(btn3);
		menu.add(btn4);
		menu2.add(btn5);
		menu2.add(btn6);
		menu2.add(btn7);
		menu2.add(btn8);
		
		JButton card1 = new JButton("카드 번호 1!");
		JButton card2 = new JButton("카드 번호 2!");
		card.add(card1);
		cardd.add(card2);
		
		panel.add(menu);
		panel.add(card);
		
		add(panel);
		
		panel2.add(menu2);
		panel2.add(cardd);
		
		add(panel2);
		
		setSize(300,110);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new CardShuffle().rotate();
	}
}
