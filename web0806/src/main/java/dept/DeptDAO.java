package dept;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dept.DeptDTO;
import util.JDBCUtil;

public class DeptDAO {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private String DEPT_LIST ="select * from dept";
	private String DEPT_INSERT = "insert into dept(deptno,dname,loc) values (?,?,?)";
	
	public List<DeptDTO> getDeptList(){//모든 테이블 정보 띄우기
		List<DeptDTO> list = new ArrayList<>();
		conn = JDBCUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(DEPT_LIST);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				DeptDTO dto = new DeptDTO(rs.getInt("deptno"),rs.getString("dname"),rs.getString("loc"));
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
	public void insertDept(DeptDTO dto) {//게시판 등록
		conn = JDBCUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(DEPT_INSERT);
			pstmt.setInt(1, dto.getDeptno());
			pstmt.setString(2, dto.getDname());
			pstmt.setString(3, dto.getLoc());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCUtil.close(pstmt, conn);
		}
	}
}
