package java019;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Ex5 {

	public static void main(String[] args) {
		String createString = "select * from customer";
		String URL="jdbc:mysql://192.168.56.1:3306/spring5fs";
		Connection con = null;
		Statement stmt = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//1 프로세스 진행 순서
			con = DriverManager.getConnection(URL,"spring5","spring5");//2
			System.out.println("MySql 접속 성공.");
			stmt = con.createStatement();//3
			stmt.executeQuery(createString);//4 update delete create는 executeUpdate, select는 executeQuery씀
			ResultSet rs = stmt.executeQuery(createString);//ResultSet + executeQuery(createString) select문만 이걸 씀 나머지 애들은 executeUpdate(createString)을 씀
			while(rs.next()) {
//				System.out.println(rs.getString("customer_name"));
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
