import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcEx3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("deptno : ");
		int sql = Integer.parseInt(sc.nextLine());
		System.out.print("dname : ");
		String sql1 = sc.nextLine();
		System.out.print("loc : ");
		String sql2 = sc.nextLine();
		
		String query = "insert into dept(deptno,dname,loc) values"+
				"("+sql+",'"+sql1+"','"+sql2+"');";
		
		
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
