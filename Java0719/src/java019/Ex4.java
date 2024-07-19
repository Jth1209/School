package java019;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class Ex4 {

	public static void main(String[] args) {
		String createString = "insert into customer values ('c-1002','앙기모찌','010-1111-1234','대구')";
		String URL="jdbc:mysql://192.168.56.1:3306/spring5fs";
		Connection con = null;
		Statement stmt = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//1 프로세스 진행 순서
			con = DriverManager.getConnection(URL,"spring5","spring5");//2
			System.out.println("MySql 접속 성공.");
			stmt = con.createStatement();//3
			int num =stmt.executeUpdate(createString);//4 update delete create는 executeUpdate, select는 executeQuery씀
			System.out.println("table insert"+num);//CRUD: CREATE(insert 문) READ(select 문) UPDATE(update 문) DELETE(drp 문)
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
