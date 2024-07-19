package projectEMP;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

public class InsertDept {

	public static void main(String[] args) {
		String insert = "INSERT INTO `dept` (`DEPTNO`, `DNAME`, `LOC`) VALUES"+
				"(10, 'ACCOUNTING', 'NEW YORK'),"+
				"(20, 'RESEARCH', 'DALLAS'),"+
				"(30, 'SALES', 'CHICAGO'),"+
				"(40, 'OPERATIONS', 'BOSTON');";
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
