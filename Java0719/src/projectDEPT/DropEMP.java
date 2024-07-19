package projectDEPT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DropEMP {

	public static void main(String[] args) {
		String drop = "Drop table emp";
		
		String URL = "jdbc:mysql://192.168.56.1:3306/spring5fs";//
		Statement stmt = null;
		Connection con = null;
		ResultSet result = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//
			con = DriverManager.getConnection(URL,"spring5","spring5");//
			stmt = con.createStatement();//
			stmt.executeUpdate(drop);//
//			result = stmt.executeQuery(insert);
			System.out.println("drop emp");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
