package java0724;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Ex1 {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = "Update dept set dname = ? , loc =? where deptno = ?";//preparedStatement 는 값을 ? 로 지정한다.
		
		
		String URL = "jdbc:mysql://localhost:3307/spring5fs";
		String id = "root";
		String pw = "mysql";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버  로딩");
			con = DriverManager.getConnection(URL,id,pw);
			System.out.println("Mysql 접속 성공!");
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "테스트부");//?에 대입할 값을 인덱스를 정한 후 작성
			pstmt.setString(2, "영남");
			pstmt.setInt(3, 1006);
			int ret = pstmt.executeUpdate();
			
			System.out.println(ret);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
