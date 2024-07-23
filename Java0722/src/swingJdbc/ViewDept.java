package swingJdbc;

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

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ViewDept extends JFrame{
	
	JButton jb1 = new JButton("result");
	JTextField jt1 = new JTextField(20);
	JTextArea ta1 = new JTextArea(20,50);
	Connection conn;
	Statement stmt;
	ResultSet rs;
	JFrame jf;
	ViewDept(){
		jf = this;
		String URL = "jdbc:mysql://localhost:3307/spring5fs";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(URL,"root","mysql");
			ta1.setText("접속 성공!"+"\n");
			stmt = conn.createStatement();
		} catch (ClassNotFoundException | SQLException e1) {
			e1.printStackTrace();
		}
		
		Container con = this.getContentPane();
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		con.setLayout(new BorderLayout());
		con.add(jp1, BorderLayout.NORTH);
		con.add(jp2,BorderLayout.CENTER);
		
		jp1.setLayout(new FlowLayout());
		jp2.setLayout(new FlowLayout());
		jp1.add(jt1); jp1.add(jb1);
		jp2.add(ta1);
		
//		jb1.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				String select = "select * from dept;";
//				try {
//					rs = stmt.executeQuery(select);
//					ta1.setText("");
//					while(rs.next()) {//rs.next() 의 return type은 boolean 형이다.(true or false)
//						ta1.append("[ ");
////						for(int i = 1; i< 3; i++) {
////							System.out.print(rs.getString(i)+" , ");
////						}
////						System.out.println(rs.getString(3)+" ]");
//						int deptno = rs.getInt("deptno");
//						String dname = rs.getString("dname");
//						String loc = rs.getString("loc");
//						ta1.append(deptno+" , "+dname + " , "+ loc);
//						ta1.append(" ]"+"\n");
//					}
//				} catch (SQLException e1) {
//					e1.printStackTrace();
//				}
//				
//			}
//		});
		
		jb1.addActionListener((e)->{
			String input = jt1.getText();
			ResultSet rs;
			try {
				rs = stmt.executeQuery(input);
				 ResultSetMetaData rsmd = rs.getMetaData();
		            int columnsNumber = rsmd.getColumnCount();
		            ta1.setText("");
		            while (rs.next()) {
		                for (int i = 1; i <= columnsNumber; i++) {
		                    if (i > 1) ta1.append(",  ");
		                    String columnValue = rs.getString(i);
		                    ta1.append(rsmd.getColumnName(i) + ": " + columnValue);
		                }
		                ta1.append("");
		            }
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		});

//			@Override
//			public void actionPerformed(ActionEvent e) {
//				String loc = jt1.getText();
//				String select = String.format("select * from dept where loc like '%%%s%%'", loc);//String.format을 쓰면 printf처럼 사용할 수 있다. good
//				
//				try {
//					rs = stmt.executeQuery(select);
//					ta1.setText("");
//					
//					boolean flag = true;
//					while(rs.next()) {//rs.next() 의 return type은 boolean 형이다.(true or false)
//						flag = false;
//						int deptno = rs.getInt("deptno");
//						String dname = rs.getString("dname");
//						String loc2 = rs.getString("loc");
//						ta1.append(String.format("%d , %s , %s \n",deptno,dname,loc2));
//					}
//					if(flag) {
//						JOptionPane.showMessageDialog(jf, "존재하지 않는 정보입니다.", "※경고※", JOptionPane.ERROR_MESSAGE);
//					}
//					
//				} catch (SQLException e1) {
//					e1.printStackTrace();
//				}
//				try {
//					rs = stmt.executeQuery(select);
//					ta1.setText("");
//					if(!rs.next()) {
//						JOptionPane.showMessageDialog(jf, "존재하지 않는 정보입니다.", "※경고※", JOptionPane.WARNING_MESSAGE);
//					}
//					while(rs.next()) {//rs.next() 의 return type은 boolean 형이다.(true or false)
//
//						int deptno = rs.getInt("deptno");
//						String dname = rs.getString("dname");
//						String loc2 = rs.getString("loc");
//						ta1.append(String.format("%d , %s , %s \n",deptno,dname,loc2));
//					}
//					
//				} catch (SQLException e1) {
//					e1.printStackTrace();
//				}
//			}
//			
//		});
		
		this.setTitle("View dept 테이블");
		this.setBounds(700,300,700,500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new ViewDept();
	}

}
