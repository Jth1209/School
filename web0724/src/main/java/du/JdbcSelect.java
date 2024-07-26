package du;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JdbcSelect
 */
@WebServlet("/dept.do")//꼭 적어야 한다
public class JdbcSelect extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JdbcSelect() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String loc = request.getParameter("loc");//한글이 문제가 있을 때, request.setCharacterIncoding("UTF-8"); 을 위에 적어주면 안깨짐
		System.out.println(request.getParameter("loc"));
		response.setContentType("text/html;charset=utf8");//주로 사용하는 것들 //이 라인에 있는 코드는 한글을 깨지지 않게 하기 위한 것
		PrintWriter out = response.getWriter();
		out.println("<h1>Servlet Page</h1>");
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from dept where loc like ?";//preparedStatement 는 값을 ? 로 지정한다.
		
		
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
			pstmt.setString(1,loc);//서블렛에서 받아오는 텍스트
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc1 = rs.getString("loc");
				String str = String.format("%d, %s, %s <br>",deptno,dname,loc1);//servlet에서는 \n 이 <br>이다.
				out.println(str);
			}
			
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
