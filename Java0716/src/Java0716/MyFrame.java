package Java0716;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame{//윈도우 창 만들어주는 클래스 JFrame, 아래는 해당 클래스가 포함하고 있는 메소드들
	JButton jb = new JButton("test");
	MyFrame(){
		
		Container con = this.getContentPane();//패널 만들어주는 Container class
		con.setLayout(null);//패널의 레이아웃 설정
		con.add(jb);//패널에 버튼 삽입
		jb.setLocation(200,300);//버튼의 위치 설정
		this.setSize(500, 300);//윈도우 창 크기 설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//윈도우 창의 x버튼을 누르면 프로세스 자체가 종료되게 설정
		this.setTitle("hi,swing");//윈도우의 타이틀 설정
		this.setLocation(700,300);//윈도우가 화면에 위치하는 좌표 설정
		this.setVisible(true);//윈도우를 화면에 띄우는 설정
	}
	public static void main(String[] args) {
		new MyFrame();
	}

}
