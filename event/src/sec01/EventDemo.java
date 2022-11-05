package sec01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class EventDemo extends JFrame{
	JTextField t1, t2;
	JTextArea area;
	JButton cal, reset;
	JComboBox cb;	
	EventDemo() {
		setTitle("원 넓이 구하기");
		
		setLayout(new BorderLayout(10, 10));
		showNorth(); showCenter(); showSouth();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,250);
		setVisible(true);
		
		addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("마우스 버튼 놓기");
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("마우스 버튼 누르기");
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("마우스 퇴장");
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("마우스 입장");
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("마우스 클릭");
			}
		});
		
		addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent e) {
				System.out.println("마우스 드래그 (" + e.getX() + ", " + e.getY() + ").");
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				System.out.println("마우스 이동 (" + e.getX() + ", " + e.getY() + ").");
				
			}
		});
		
 	}
	void showNorth(){
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel panel = new JPanel(new GridLayout(2,0));
		
		JLabel l1 = new JLabel("원의 반지름");
		JLabel l2 = new JLabel("원의 넓이");
		
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		t2.setEditable(false);
		
		p1.add(l1); p1.add(t1); p2.add(l2); p2.add(t2);
		
		panel.add(p1);
		panel.add(p2);
		
		KeyListener listener2 = new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				System.out.println(e.getKeyChar() + "를 입력했습니다.");
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
			}
		};
		t1.addKeyListener(listener2);
		
		add(panel, BorderLayout.NORTH);
	}
	
	void showCenter() {
		JPanel panel = new JPanel();
		
		area = new JTextArea(30, 20);
		area.setText("이 영역에 원의 넓이를\n계산하는 과정이 나타납니다.");
		area.setEditable(false);
		area.setForeground(Color.red);
		
		panel.add(area);
		
		add(panel, BorderLayout.CENTER);
	}
	
	void showSouth() {
		String[] color = {"red", "blue"};
		
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
		
		cal = new JButton("계산");
		cb = new JComboBox<>(color);
		reset = new JButton("리셋");
		
		panel.add(cal); panel.add(cb); panel.add(reset);
		
		ActionListener listener1 = e -> {
			if(e.getSource() == cal) {
				if(t1.getText().isEmpty())
					area.setText("반지름을 입력하세요!!");
				else {
					String s = t1.getText();
					double radius = Double.parseDouble(s);
					double result = radius * radius * 3.14;
					t2.setText("" + result);
					area.setText(radius + " * " + radius + " * 3.14 = " + result);
				}
			}else {
				t1.setText("");
				t2.setText("");
				area.setText("");
			}
		};
		cal.addActionListener(listener1);
		reset.addActionListener(listener1);
		cb.addItemListener(e -> {
			int index = ((JComboBox) cb).getSelectedIndex();
			if(index == 0)
				area.setForeground(Color.RED);
			else
				area.setForeground(Color.BLUE);
		});
		
		add(panel, BorderLayout.SOUTH);
	}
	
	
	public static void main(String[] args) {
		new EventDemo();
	}
}