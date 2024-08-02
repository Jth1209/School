package management;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.JDBCUtil;

public class DAO {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	DTO dto;
	
	private String FIND_USER = "select * from member where id = ? pw = ?";
	private String INSERT_USER = "insert into account (name,ssn,tel,balance) values (?,?,?,1000)";
	
	public DTO findUser(String id, String pw) {
		conn = JDBCUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(FIND_USER);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				dto = new DTO(rs.getString("id"),rs.getString("pw"),rs.getString("name"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dto;
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
