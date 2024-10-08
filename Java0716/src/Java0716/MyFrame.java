package Java0716;

import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyFrame extends JFrame{//윈도우 창 만들어주는 클래스 JFrame, 아래는 해당 클래스가 포함하고 있는 메소드들
	JLabel jL = new JLabel("아이디");//
	JTextField jt1 = new JTextField();
	JLabel jL2 = new JLabel("SSN");//
	JTextField jt2 = new JTextField();
	JLabel jL3 = new JLabel("전화번호");//
	JTextField jt3 = new JTextField();
	JButton jb = new JButton("로그인");
	JButton jb2 = new JButton("회원가입");
	JButton jb3 = new JButton("예금");
	JButton jb4 = new JButton("출금");
	JButton jb5 = new JButton("잔고");
	JTextArea ta = new JTextArea();
	MyFrame(){
		Container con = this.getContentPane();//패널 만들어주는 Container class
		con.setLayout(null);//패널의 레이아웃 설정
		
		con.add(jL);//container
		jL.setLocation(20,50);
		jL.setSize(100,30);
		
		con.add(jt1);
		jt1.setLocation(60,50);
		jt1.setSize(100,30);
		
		con.add(jL2);//container
		jL2.setLocation(180,50);
		jL2.setSize(100,30);
		
		con.add(jt2);
		jt2.setLocation(210,50);
		jt2.setSize(100,30);

		con.add(jL3);//container
		jL3.setLocation(320,50);
		jL3.setSize(100,30);
		
		con.add(jt3);
		jt3.setLocation(380,50);
		jt3.setSize(100,30);
		
		con.add(ta);
		ta.setLocation(20,120);
		ta.setSize(830,200);
		
		con.add(jb);//패널에 버튼 삽입
		jb.setLocation(20,350);//버튼의 위치 설정
		jb.setSize(100,30);
		jb.addActionListener(new MyListener());
	
		con.add(jb2);//패널에 버튼 삽입
		jb2.setLocation(120,350);//버튼의 위치 설정
		jb2.setSize(100,30);
		
		con.add(jb3);//패널에 버튼 삽입
		jb3.setLocation(550,350);//버튼의 위치 설정
		jb3.setSize(100,30);
		
		con.add(jb4);//패널에 버튼 삽입
		jb4.setLocation(650,350);//버튼의 위치 설정
		jb4.setSize(100,30);

		con.add(jb5);//패널에 버튼 삽입
		jb5.setLocation(750,350);//버튼의 위치 설정
		jb5.setSize(100,30);
		
		this.setSize(900, 500);//윈도우 창 크기 설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//윈도우 창의 x버튼을 누르면 프로세스 자체가 종료되게 설정
		this.setTitle("계좌 입출력 프로그램(SWING)");//윈도우의 타이틀 설정
		this.setLocation(700,300);//윈도우가 화면에 위치하는 좌표 설정
		this.setVisible(true);//윈도우를 화면에 띄우는 설정
		}
	public static void main(String[] args) {
		MyFrame mf = new MyFrame();
		
		
	}
	
}
