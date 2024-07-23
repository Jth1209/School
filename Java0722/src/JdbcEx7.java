import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcEx7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String URL = "jdbc:mysql://localhost:3307/spring5fs";
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;


		System.out.print("부서명: ");
		String strName = sc.nextLine();
		System.out.print("부서지역: ");
		String strLoc = sc.nextLine();
		
		String sql = null;
		String inNum = "select max(deptno) as max from dept";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL,"root","mysql");
			System.out.println("접속 성공!");
			stmt = con.createStatement();
			rs = stmt.executeQuery(inNum);
			rs.next();
			int max = rs.getInt("max");
			sql = String.format("insert into dept(deptno,dname,loc) values (%d ,'%s' , '%s');",max+1,strName,strLoc);//String.format을 쓰면 printf처럼 사용할 수 있다. good
			int res = stmt.executeUpdate(sql);//하나의 레코드를 반환 (반환값 int 형)
			System.out.println(res +" 건을 입력");
//			rs = stmt.executeQuery(sql);
			
//			while(rs.next()) {//rs.next() 의 return type은 boolean 형이다.(true or false)
//				System.out.print("[ ");
//				for(int i = 1; i< 3; i++) {
//					System.out.print(rs.getString(i)+" , ");
//				}
//				System.out.println(rs.getString(3)+" ]");
//			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
