package projectDEPT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Create {

	public static void main(String[] args) {
		String create ="create table if not exists emp"+
				"( empno int(11) not null,"+
				"ename varchar(10) default null,"+
				"job varchar(9) default null,"+
				"MFR int(11) default null,"+
				"HIREDATE date default null,"+
				"SAL int(11) default null,"+
				"COMM int(11) default null,"+
				"DEPTNO int(11) default null"+
				") ENGINE=InnoDB DEFAULT CHARSET=utf8;";
		
		String URL = "jdbc:mysql://192.168.56.1:3306/spring5fs";
		Statement stmt = null;
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL,"spring5","spring5");
			stmt = con.createStatement();
			stmt.executeUpdate(create);
			System.out.println("emp create");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
