import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx5 {
	public static void main(String[] args) {
		
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
		    rs = stmt.executeQuery(select);
			while(rs.next()) {//rs.next() 의 return type은 boolean 형이다.(true or false)
				System.out.print("[ ");
//				for(int i = 1; i< 3; i++) {
//					System.out.print(rs.getString(i)+" , ");
//				}
//				System.out.println(rs.getString(3)+" ]");
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				System.out.print(deptno+" , "+dname + " , "+ loc);
				System.out.println(" ]");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
