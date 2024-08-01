package Login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.JDBCUtil;

public class DAO {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public boolean check;
	
	private String FIND_USER = "select name , ssn from account";
	private String INSERT_USER = "insert into account (name,ssn,tel,balance) values (?,?,?,1000)";
	
	public boolean fineUser(String username, String password) {
		conn = JDBCUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(FIND_USER);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				if((username.equals(rs.getString("name"))) && (password.equals(rs.getString("ssn")))){
					check = true;
					break;
				}else {
					check = false;//break쓰면 그냥 반복문을 빠져나간다 이거 잘 보시고 ***********************
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return check;
	}
	
	public void insertUser(String username, String password , String email) {
		conn = JDBCUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(INSERT_USER);
			pstmt.setString(1,username);
			pstmt.setString(2,password);
			pstmt.setString(3,email);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
