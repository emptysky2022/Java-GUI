package exam.ex03;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChangeCardDemo extends JFrame implements ActionListener{
	JPanel cardPanel = new JPanel(new CardLayout());	
	public ChangeCardDemo() {
		setTitle("카드 레이아웃");
		
		JPanel menuPanel = new JPanel(new GridLayout(0,4,10,0));
		JButton card1 = new JButton("카드번호 1!");
		JButton card2 = new JButton("카드번호 2!");
		JButton card3 = new JButton("카드번호 3!");
		JButton card4 = new JButton("카드번호 4!");
		JButton card5 = new JButton("카드번호 5!");
		
		JButton first = new JButton("<<");
		JButton before = new JButton("<");
		JButton after = new JButton(">");
		JButton end = new JButton(">>");
		
		first.addActionListener(this);
		before.addActionListener(this);
		after.addActionListener(this);
		end.addActionListener(this);
		
		menuPanel.add(first);
		menuPanel.add(before);
		menuPanel.add(after);
		menuPanel.add(end);

		cardPanel.add(card1);
		cardPanel.add(card2);
		cardPanel.add(card3);
		cardPanel.add(card4);
		cardPanel.add(card5);
		
		add(menuPanel, BorderLayout.NORTH);
		add(cardPanel, BorderLayout.CENTER);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ChangeCardDemo();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		CardLayout cl = (CardLayout) (cardPanel.getLayout());
		JButton clickedBtn = (JButton)(e.getSource());
		switch(clickedBtn.getText()) {
		case "<<" -> cl.first(cardPanel);
		case "<" -> cl.previous(cardPanel);
		case ">" -> cl.next(cardPanel);
		case ">>" -> cl.last(cardPanel);
		}
	}
}
