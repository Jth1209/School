import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcEx8 {
	public static void main(String[] args) {
		String URL = "jdbc:mysql://localhost:3307/spring5fs";
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		Scanner sc = new Scanner(System.in);
		System.out.println("테이블 정보 입력>> ");
		String str = sc.nextLine();
		
		String sql = null;
		String inNum = "select max(deptno) as max from dept";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL,"root","mysql");
			System.out.println("접속 성공!");
			stmt = con.createStatement();
			rs = stmt.executeQuery(inNum);
			ResultSet result = stmt.executeQuery("select * from " + str);
			ResultSetMetaData rsmd = result.getMetaData();
			
			int numOfCol = rsmd.getColumnCount();
			System.out.println(numOfCol);
			
			for(int i = 1; i<numOfCol+1; i++) {
				System.out.print(rsmd.getColumnName(i) + " ");
				System.out.print(rsmd.getColumnType(i)+ " ");
				if(rsmd.isNullable(i) == 0) {
					System.out.println("Nullable");
				}else if(rsmd.isNullable(i) == 1) {
					System.out.println("Not Nullable");
				}
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
