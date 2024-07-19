package projectEMP;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ScannerDept {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("table data insert :");
		String sc1 = sc.nextLine();
		String sc2 = sc.nextLine();
		String sc3 = sc.nextLine();
		String insert = "INSERT INTO `dept` (`DEPTNO`, `DNAME`, `LOC`) VALUES"+
				"("+sc1+",'"+sc2+"','"+sc3+"');";//mysql에서 문자열을 입력받을 때는 ' ' 사이에 받아야 한다 십
		String URL="jdbc:mysql://192.168.56.1:3306/spring5fs";
		
		Connection con = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL,"spring5","spring5");
			stmt = con.createStatement();
			stmt.executeUpdate(insert);
			System.out.println("dept insert data");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
