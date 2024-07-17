package swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ExGridLayout extends JFrame{
	
	JButton jb1 = new JButton("+");
	JButton jb2 = new JButton("-");
	JButton jb3 = new JButton("/");
	JButton jb4 = new JButton("*");
	
	ExGridLayout() {
		
		Container con = this.getContentPane();
		Container con2 = this.getContentPane();
		con.setLayout(new GridLayout(5,1,10,10));
		con.add(jb1);
		con.add(jb2);
		con.add(jb3);
		con.add(jb4);
		this.setLocation(1000,200);
		this.setSize(700,500);
		this.setVisible(true);
		this.setTitle("계산기 화면");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String... args) {
		new ExGridLayout();
	}
}
