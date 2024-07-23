import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcEx6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("위치를 입렵해주세요: ");
		String loc = sc.nextLine();
		String select = String.format("select * from dept where loc = '%s'\n", loc);//String.format을 쓰면 printf처럼 사용할 수 있다. good
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
				if(rs.next()== false) {
					System.out.println("해당 지역을 찾을 수 없습니다.");
				}
				System.out.print("[ ");
//				for(int i = 1; i< 3; i++) {
//					System.out.print(rs.getString(i)+" , ");
//				}
//				System.out.println(rs.getString(3)+" ]");
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc2 = rs.getString("loc");
				System.out.print(deptno+" , "+dname + " , "+ loc);
				System.out.println(" ]");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
