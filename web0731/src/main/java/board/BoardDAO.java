package board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import util.JDBCUtil;

public class BoardDAO {
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	private String BOARD_LIST = "select * from board";
	private String BOARD_INSERT = "insert into board(writer,title,content,regtime,hits) values (?,?,?,now(),0)";
	private String BOARD_VIEW = "select * from board where num = ?";
	private String BOARD_HITS = "update board set hits = hits + 1 where num = ?";	
	private String BOARD_DELETE = "delete from board where num = ?";
	private String BOARD_UPDATE = "update board set writer = ?, title = ?, content = ?, regtime = now(), hits = 0 where num = ?";
	
	public void insertBoard(BoardDTO dto) {//게시판 등록
		conn = JDBCUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(BOARD_INSERT);
			pstmt.setString(1, dto.getWriter());
			pstmt.setString(2, dto.getTitle());
			pstmt.setString(3, dto.getContent());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCUtil.close(pstmt, conn);
		}
	}
	
	public List<BoardDTO> getBoardList(){//모든 테이블 정보 띄우기
		List<BoardDTO> list = new ArrayList<>();
		conn = JDBCUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(BOARD_LIST);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				BoardDTO dto = new BoardDTO(rs.getInt("num"),rs.getString("writer"),rs.getString("title"),rs.getString("content"),rs.getString("regtime"),rs.getInt("hits"));
				list.add(dto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs,pstmt,conn);
		}
		return list;
	}
	
	public BoardDTO getOne(String num) {//선택한 글 띄우기
		BoardDTO dto = null;
		conn = JDBCUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(BOARD_VIEW);
			pstmt.setString(1,num);
			rs = pstmt.executeQuery();
			rs.next();
			dto = new BoardDTO(rs.getInt("num"),rs.getString("writer"),rs.getString("title"),rs.getString("content"),rs.getString("regtime"),rs.getInt("hits"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dto;
	}
	
	public void getHits(String num) {//조회수 증가
		conn = JDBCUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(BOARD_HITS);
			pstmt.setString(1, num);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void getDelete(String num) {//테이브 삭제
		conn = JDBCUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(BOARD_DELETE);
			pstmt.setString(1, num);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void getUpdate(BoardDTO dto) {
		conn = JDBCUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(BOARD_UPDATE);
			pstmt.setString(1,dto.getWriter());
			pstmt.setString(2,dto.getTitle());
			pstmt.setString(3,dto.getContent());
			pstmt.setInt(4,dto.getNum());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
