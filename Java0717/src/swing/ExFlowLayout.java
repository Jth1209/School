package swing;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ExFlowLayout extends JFrame{
	
	JButton jb1 = new JButton("버튼 1");
	JButton jb2 = new JButton("버튼 2");
	JButton jb3 = new JButton("버튼 3");
	JButton jb4 = new JButton("버튼 4");
	JButton jb5 = new JButton("버튼 5");
	
	ExFlowLayout() {
		
		Container con = this.getContentPane();
		con.setLayout(new BorderLayout());
		con.add(jb1, BorderLayout.NORTH);
		con.add(jb2, BorderLayout.WEST);
		con.add(jb3, BorderLayout.CENTER);
		con.add(jb4, BorderLayout.EAST);
		con.add(jb5, BorderLayout.SOUTH);
		this.setLocation(1000,200);
		this.setSize(700,500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String... args) {
		new ExFlowLayout();
	}
}
