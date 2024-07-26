package java0724;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ex3 {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from dept where dname like ?";//preparedStatement 는 값을 ? 로 지정한다.
		
		
		String URL = "jdbc:mysql://localhost:3307/spring5fs";
		String id = "root";
		String pw = "mysql";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버  로딩");
			con = DriverManager.getConnection(URL,id,pw);
			System.out.println("Mysql 접속 성공!\n");
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,"%래%");
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				System.out.printf("%d, %s, %s \n",deptno,dname,loc);
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
