package SwingDatabase;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PrintDatabase extends JFrame{
	
	JLabel jl1 = new JLabel("테이블 이름 입력>>");
	JTextField jt1 = new JTextField(20);
	JButton jb1 = new JButton("Result BUTTON");

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
	PrintDatabase(){
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
		
		jp1.add(jl1); jp1.add(jt1); 
		
		jp2.add(ta1);
		
		jp3.add(jb1); 
		
		this.setSize(900, 500);//윈도우 창 크기 설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//윈도우 창의 x버튼을 누르면 프로세스 자체가 종료되게 설정
		this.setTitle("데이타 베이스");//윈도우의 타이틀 설정
		this.setLocation(700,300);//윈도우가 화면에 위치하는 좌표 설정
		this.setVisible(true);//윈도우를 화면에 띄우는 설정
		
		jb1.addActionListener(new Selecttable());
		
	}
	
	
	
	class Selecttable implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			Connection con = null;
			Statement stmt = null;
			ResultSet result = null;
			String url = "jdbc:mysql://192.168.56.1:3306/spring5fs";
			String user = "spring5";
			String passwd = "spring5";	
		
			String str = jt1.getText();
//			if (args.length < 1) {
//				System.out.println("실행>>java ResultSetMetaDataExample tableName");
//				System.exit(0);
//			}
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch(java.lang.ClassNotFoundException e2) {
				msg("ClassNotFoundException: "); 
				apd(e2.getMessage());
				return;
			}	
			
			try {
				con = DriverManager.getConnection(url, user, passwd);
				stmt = con.createStatement();
				result = stmt.executeQuery("SELECT * FROM " + str); 

				ResultSetMetaData rsmd = result.getMetaData();
				
				msg(str + " 테이블 정보");
				apd2("==================================================================");
				apd2("컬럼명	  데이터타입	                            크기	 NULL 허용 여부");
				apd2("==================================================================");

				int numOfCol = rsmd.getColumnCount();
				for (int i=1; i<=numOfCol; i++) {
					String resultStr = rsmd.getColumnName(i) + "\t";
					resultStr += rsmd.getColumnTypeName(i) + "\t\t";
					resultStr += rsmd.getColumnDisplaySize(i) + "\t";
					if (rsmd.isNullable(i) == ResultSetMetaData.columnNoNulls)
						resultStr+= "NOT NULLABLE";
					else if (rsmd.isNullable(i) == ResultSetMetaData.columnNullable)
						resultStr += "NULLABLE";
					else 
						resultStr += "UNKNOW";
					apd2(resultStr);
				}
				apd2("==================================================================");	
			} catch(SQLException e3) {
				msg("테이블 SELECT 오류: " + e3.getMessage());
			} finally {
	        		try {
					if (result != null) result.close();
					if (stmt != null) stmt.close();
					if (con != null) con.close();
	               		} catch (Exception e4) {}
	       		}
		}
	}
	
	public static void main(String[] args) {
		new PrintDatabase();
	}

}
