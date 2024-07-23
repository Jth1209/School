import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Problem {
	public static void main(String[] args) {
		
		String select = "select count(*) from dept where loc = '서울'";
		String URL = "jdbc:mysql://localhost:3307/spring5fs";
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL,"root","mysql");
			System.out.println("접속 성공!");
			stmt = con.createStatement();
			rs = stmt.executeQuery(select);
			rs.next();
			System.out.println("총 " + rs.getInt(1) +"건의 자료가 있습니다.");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
