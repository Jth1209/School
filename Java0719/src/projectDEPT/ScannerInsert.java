package projectDEPT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScannerInsert {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st1 = sc.nextLine();
		String st2 = sc.nextLine();
		String st3 = sc.nextLine();
		String st4 = sc.nextLine();
		String st5 = sc.nextLine();
		String st6 = sc.nextLine();
		String st7 = sc.nextLine();
		String st8 = sc.nextLine();
		String ins = "("+st1+",'"+st2+"','"+st3+"',"+st4+",'"+st5+"',"+st6+","+st7+","+st8;//mysql에서 문자열을 입력받을 때는 ' ' 사이에 받아야 한다 십
		String insert = "INSERT INTO `emp` (`EMPNO`, `ENAME`, `JOB`, `MGR`, `HIREDATE`, `SAL`, `COMM`, `DEPTNO`) VALUES"+ins;
				
		
		String URL = "jdbc:mysql://192.168.56.1:3306/spring5fs";//
		Statement stmt = null;
		Connection con = null;
		ResultSet result = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//
			con = DriverManager.getConnection(URL,"spring5","spring5");//
			stmt = con.createStatement();//
			stmt.executeUpdate(insert);//
//			result = stmt.executeQuery(insert);
			System.out.println("emp insert data");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
