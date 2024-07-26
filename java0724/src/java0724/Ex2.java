package java0724;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Ex2 {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = "insert into dept(deptno,dname,loc) values (?,?,?)";//preparedStatement 는 값을 ? 로 지정한다.
		
		
		String URL = "jdbc:mysql://localhost:3307/spring5fs";
		String id = "root";
		String pw = "mysql";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버  로딩");
			con = DriverManager.getConnection(URL,id,pw);
			System.out.println("Mysql 접속 성공!");
			pstmt = con.prepareStatement(sql);
			pstmt.setString(2, "노래부");//?에 대입할 값을 인덱스를 정한 후 작성
			pstmt.setString(3, "서울");
			pstmt.setInt(1, 1008);
			pstmt.executeUpdate();
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
