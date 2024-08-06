package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCUtil {//DAO
	
	public static Connection getConnection() {
		Connection conn = null;

		String URL = "jdbc:oracle:thin:@localhost:1521:xe";
		String id= "scott";
		String pw = "tiger";
		try {
			Class.forName("oracle.jdbc.OracleDriver");	
			conn = DriverManager.getConnection(URL,id,pw);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
		
	}
	public static void close(PreparedStatement stmt, Connection conn) {//자원을 반납할 때 써주는 코드 insert update delete 사용 후
		try {
			stmt.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		try {
			conn.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(ResultSet rs,PreparedStatement stmt, Connection conn) {//자원을 반납할 때 써주는 코드 select 사용 후
		
		try {
			rs.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		try {
			stmt.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		try {
			conn.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
}
