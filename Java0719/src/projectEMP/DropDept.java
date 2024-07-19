package projectEMP;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DropDept {

	public static void main(String[] args) {
		String drop = "Drop table dept";
		String URL="jdbc:mysql://192.168.56.1:3306/spring5fs";
		
		Connection con = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL,"spring5","spring5");
			stmt = con.createStatement();
			stmt.executeUpdate(drop);
			System.out.println("drop dept");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
