package list;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import util.JDBCUtil;

public class DAO {
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	DTO dto;
	
	private String SELECT_ALL = "select * from board";
	private String SELECTED_TALBE = "select * from board where num = ?";
	private String INSERT = "insert into board (writer,title,content,regtime,hits) values (?,?,?,now(),0)";
	private String UPDATE_HITS = "update board set hits = hits + 1 where num = ?";
	private String UPDATE_ALL = "update board set writer = ?, title=?,content=?, regtime=now(), hits = 0 where num = ?";
	private String DELETE = "delete from board where num = ?";
	
	public List<DTO> selectAll(){
		conn = JDBCUtil.getConnection();
		List<DTO> list = new ArrayList<>();
		try {
			pstmt = conn.prepareStatement(SELECT_ALL);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				list.add(new DTO(rs.getInt("num"),rs.getString("writer"),rs.getString("title"),rs.getString("content"),rs.getString("regtime"),rs.getInt("hits")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCUtil.close(rs, pstmt, conn);
		}
		return list;
	}
	
	public void insert(String writer, String title, String content) {
		conn = JDBCUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(INSERT);
			pstmt.setString(1, writer);
			pstmt.setString(2, title);
			pstmt.setString(3, content);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public DTO selectNum(String num){
		DTO dto = null;
		conn = JDBCUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(SELECTED_TALBE);
			pstmt.setString(1,num);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				dto = new DTO(rs.getInt("num"),rs.getString("writer"),rs.getString("title"),rs.getString("regtime"),rs.getString("content"),rs.getInt("hits"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dto;
	}
	
	public void delete(String num) {
		conn = JDBCUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(DELETE);
			pstmt.setString(1, num);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public void hits(String num) {
		conn = JDBCUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(UPDATE_HITS);
			pstmt.setString(1, num);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void updateAll(String num, String writer, String title, String content) {
		conn = JDBCUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(UPDATE_ALL);
			pstmt.setString(1, writer);
			pstmt.setString(2, title);
			pstmt.setString(3, content);
			pstmt.setString(4, num);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}