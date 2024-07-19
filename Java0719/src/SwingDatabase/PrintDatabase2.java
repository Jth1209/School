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

public class PrintDatabase2 extends JFrame{
	
	JLabel jl1 = new JLabel("Enter your SQL SELECT statement:");
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
		
		jp1.add(jl1); jp1.add(jt1); 
		
		jp2.add(ta1);
		
		jp3.add(jb1); 
		
		this.setSize(900, 500);//윈도우 창 크기 설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//윈도우 창의 x버튼을 누르면 프로세스 자체가 종료되게 설정
		this.setTitle("데이타 베이스");//윈도우의 타이틀 설정
		this.setLocation(700,300);//윈도우가 화면에 위치하는 좌표 설정
		this.setVisible(true);//윈도우를 화면에 띄우는 설정
		
		jb1.addActionListener(new SelectQuery());
		
	}
	
	
	
	class SelectQuery implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
	        String select=jt1.getText();

	        String url = "jdbc:mysql://localhost:3306/spring5fs";
	        String user = "root";
	        String password = "1234";

	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            msg("MySQL JDBC driver loaded successfully.");

	            Connection conn = DriverManager.getConnection(url, user, password);
	            apd2("Connected to the MySQL server successfully.");

	            Statement stmt = conn.createStatement();
	            ResultSet rs = stmt.executeQuery(select);

	            ResultSetMetaData rsmd = rs.getMetaData();
	            int columnsNumber = rsmd.getColumnCount();
	            while (rs.next()) {
	                for (int i = 1; i <= columnsNumber; i++) {
	                    if (i > 1) System.out.print(",  ");
	                    String columnValue = rs.getString(i);
	                    apd(rsmd.getColumnName(i) + ": " + columnValue+" ");
	                }
	                apd2("");
	            }

	            rs.close();
	            stmt.close();
	            conn.close();
	        } catch (ClassNotFoundException e2) {
	            apd2("MySQL JDBC Driver not found.");
	            e2.printStackTrace();
	        } catch (SQLException e3) {
	            apd2("Database connection or query execution failed.");
	            e3.printStackTrace();
	        }
		}
	}
	
	public static void main(String[] args) {
		new PrintDatabase2();
	}

}
