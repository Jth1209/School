package du;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JdbcUpdate
 */
@WebServlet("/Update.do")
public class JdbcUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JdbcUpdate() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int deptno = Integer.parseInt(request.getParameter("deptno"));
		String dname = request.getParameter("dname");
		String loc = request.getParameter("loc");
		
		response.setContentType("text/html;charset=utf8");
		PrintWriter out = response.getWriter();
		
		
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = "Update dept set dname = ? , loc =? where deptno = ?";//preparedStatement 는 값을 ? 로 지정한다.
		
		
		String URL = "jdbc:mysql://localhost:3307/spring5fs";
		String id = "root";
		String pw = "mysql";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String load = String.format("드라이버  로딩<br>");
			out.println(load);
			con = DriverManager.getConnection(URL,id,pw);
			String suc = String.format("Mysql 접속 성공!<br><br>");
			out.println(suc);
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dname);//?에 대입할 값을 인덱스를 정한 후 작성
			pstmt.setString(2, loc);
			pstmt.setInt(3, deptno);
			int ret = pstmt.executeUpdate();
			out.println(ret);
			String result = String.format("변경된 부서 번호 : %d [ %s , %s ]",deptno,dname,loc);
			out.println(result);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
