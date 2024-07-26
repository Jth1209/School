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
 * Servlet implementation class First
 */
@WebServlet("/Login.do")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		boolean flag = false;
		request.setCharacterEncoding("UTF-8");//요청에 한국어 안깨지게 하는 법
		String name = request.getParameter("name");
		String ssn = request.getParameter("ssn");

//		out.println("<html>");
//		out.println("<h1>목을 막아라</h1>");
//		if(name.equals(LoginSession.ssn)) {
//			out.println("<h1>"+LoginSession.name+"님, 환영합니다.</h1>");
//		}else {
//			out.println("<h1>로그인을 다시 해주세요</h1>");
//		}
//		out.println("</html>");
//		response.getWriter().append("Served at: ").append(request.getContextPath());//프로젝트 이름을 출력해주는 것:getContextPath
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String URL = "jdbc:mysql://localhost:3307/spring5fs";
		String sql = "select * from account where name = ? and ssn = ?;";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String dri = String.format("드라이버 연결 완료<br><br>");
			conn = DriverManager.getConnection(URL,"root","mysql");
			String consuc = String.format("데이터베이스 연결 성공<br><br>");
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,name);
			pstmt.setString(2,ssn);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				LoginSession.id = rs.getInt("id");
				LoginSession.name = rs.getString("name");
				LoginSession.ssn = rs.getString("ssn");
				LoginSession.tel = rs.getString("balance");
				LoginSession.balance = rs.getInt("balance");
				flag = true;
			}
		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		response.setContentType("text/html;charset=UTF8");//한글 호환. 맨위에 적어줄 것(getWriter()전에만 적어주면 되는 듯) 한글 안깨지는 방법 1
		PrintWriter out = response.getWriter();
		if(flag) {
			out.println("<h1>" + LoginSession.name+" 님, 환영합니다.");
		}else {
			out.println("<h1> 다시 로그인 해주세요 </h1>");
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
