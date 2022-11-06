package exam.ex07;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioDemo extends JFrame implements ActionListener{
	JLabel picture = new JLabel();
	ImageIcon dogImage = new ImageIcon("src/exam/ex07/map1.jpg");
	ImageIcon catImage = new ImageIcon("src/exam/ex07/map2.jpg");
	ImageIcon goldfishImage = new ImageIcon("src/exam/ex07/map3.jpg");
	public RadioDemo() {
		setTitle("애완 동물");
		
		
		JPanel btnPanel = new JPanel();
		JPanel lPanel = new JPanel();
		
		JRadioButton dog = new JRadioButton("강아지");
		JRadioButton cat = new JRadioButton("고양이");
		JRadioButton goldfish = new JRadioButton("금붕어");
		
		dog.addActionListener(this);
		cat.addActionListener(this);
		goldfish.addActionListener(this);
		
		ButtonGroup group = new ButtonGroup();
		group.add(dog);
		group.add(cat);
		group.add(goldfish);
		btnPanel.add(dog);
		btnPanel.add(cat);
		btnPanel.add(goldfish);
		
		
		
		lPanel.add(picture);
		add(btnPanel, BorderLayout.NORTH);
		add(lPanel, BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1500,1000);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new RadioDemo();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String btn = e.getActionCommand();
		switch(btn) {
		case "강아지" -> picture.setIcon(dogImage);
		case "고양이" -> picture.setIcon(catImage);
		case "금붕어" -> picture.setIcon(goldfishImage);
		
		}
	}
}
