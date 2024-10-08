package swing;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ExBorderLayout2 extends JFrame{
	
	JButton jb1 = new JButton("버튼 1");
	JButton jb2 = new JButton("버튼 2");
	JButton jb3 = new JButton("버튼 3");
	JButton jb4 = new JButton("버튼 4");
	JButton jb5 = new JButton("버튼 5");
	
	ExBorderLayout2() {
		
		Container con = this.getContentPane();
		con.setLayout(new FlowLayout());
		con.add(jb1); con.add(jb2); con.add(jb3); con.add(jb4); con.add(jb5);
		this.setLocation(1000,200);
		this.setSize(700,500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String... args) {
		new ExBorderLayout2();
	}
}
