import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx4 {
	public static void main(String[] args) {
		
		String query ="insert into dept(deptno,dname,loc) values (1001,'총무부','인천'), (1002,'인사부','일산'), (1003,'회계부','서울'),(1004,'영업부','서울');";
		String select = "select * from dept;";
		String URL = "jdbc:mysql://localhost:3307/spring5fs";
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL,"root","mysql");
			System.out.println("접속 성공!");
			stmt = con.createStatement();
			stmt.executeUpdate(query);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
