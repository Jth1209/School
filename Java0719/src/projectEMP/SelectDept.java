package projectEMP;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectDept {

	public static void main(String[] args) {
		String select = "select * from dept;";
		String URL="jdbc:mysql://192.168.56.1:3306/spring5fs";
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL,"spring5","spring5");
			stmt = con.createStatement();
			rs = stmt.executeQuery(select);
			while(rs.next()) {
				for(int i = 1; i<3; i++) {
					System.out.print(rs.getString(i)+", ");
				}
				System.out.println(rs.getString(3));
			}
			System.out.println("dept insert data");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
