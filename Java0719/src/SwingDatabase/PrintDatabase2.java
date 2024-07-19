package SwingDatabase;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PrintDatabase2 extends JFrame{
	
	JLabel jl1 = new JLabel("emp:");
	JTextField jt1 = new JTextField(20);
	JLabel jl2 = new JLabel("dept:");
	JTextField jt2 = new JTextField(20);
	JButton jb1 = new JButton("emp select 출력");
	JButton jb2 = new JButton("dept select 출력");
	JTextArea ta1 = new JTextArea(30,70);
	
	void msg(String msg) {
		ta1.setText(msg+"\n");
	}
	void apd(String msg) {
		ta1.append(msg);
	}
	void apd2(String msg) {
		ta1.append(msg+"\n");
	}
	PrintDatabase2(){
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		Container con = this.getContentPane();
		
		con.setLayout(new BorderLayout());
		con.add(jp1,BorderLayout.NORTH);
		con.add(jp2,BorderLayout.CENTER);
		con.add(jp3,BorderLayout.SOUTH);
		
		jp1.setLayout(new FlowLayout());
		jp2.setLayout(new FlowLayout());
		jp3.setLayout(new FlowLayout());
		
		jp1.add(jl1); jp1.add(jt1); jp1.add(jl2); jp1.add(jt2);
		
		jp2.add(ta1);
		
		jp3.add(jb1); jp3.add(jb2);
		
		this.setSize(900, 500);//윈도우 창 크기 설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//윈도우 창의 x버튼을 누르면 프로세스 자체가 종료되게 설정
		this.setTitle("계좌 입출력 프로그램(SWING)");//윈도우의 타이틀 설정
		this.setLocation(700,300);//윈도우가 화면에 위치하는 좌표 설정
		this.setVisible(true);//윈도우를 화면에 띄우는 설정
		
		jb1.addActionListener(new Callemp());
		jb2.addActionListener(new Calldept());
	}
	
	
	
	class Callemp implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String select = "select * from emp;";
			
			String URL = "jdbc:mysql://192.168.56.1:3306/spring5fs";//
			Statement stmt = null;
			Connection con = null;
			ResultSet result = null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");//
				con = DriverManager.getConnection(URL,"spring5","spring5");//
				stmt = con.createStatement();//
//				stmt.executeUpdate(drop);//
				result = stmt.executeQuery(select);
				
				msg("emp의 정보:");
				while(result.next()) {
					for(int i = 1; i< 8; i++) {
						apd(result.getString(i)+", ");
					}
					apd2(result.getString(8));

				}
			} catch (ClassNotFoundException | SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		}
		
	}
	class Calldept implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String select = "select * from dept;";
			String URL="jdbc:mysql://192.168.56.1:3306/spring5fs";
			
			Connection con = null;
			Statement stmt = null;
			ResultSet rs = null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection(URL,"spring5","spring5");
				stmt = con.createStatement();
				rs = stmt.executeQuery(select);
				msg("dept의 정보 : ");
				while(rs.next()) {
					for(int i = 1; i<3; i++) {
						apd(rs.getString(i)+", ");
					}
					apd2(rs.getString(3));
				}
				System.out.println("dept insert data");
			} catch (ClassNotFoundException | SQLException e2) {
				e2.printStackTrace();
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		new PrintDatabase2();
	}

}
