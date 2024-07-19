package projectEMP;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Create {

	public static void main(String[] args) {
		String create = "create table if not exists dept"+
				"(DEPTNO int(11) default null,"+
				"DNAME varchar(14) default null,"+
				"LOC varchar(13) default null"+
				") ENGINE=InnoDB default charset=utf8;";
		String URL="jdbc:mysql://192.168.56.1:3306/spring5fs";
		
		Connection con = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL,"spring5","spring5");
			stmt = con.createStatement();
			stmt.executeUpdate(create);
			System.out.println("dept create");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
