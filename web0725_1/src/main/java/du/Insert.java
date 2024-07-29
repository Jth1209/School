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
@WebServlet("/Insert.do")
public class Insert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Insert() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");//요청에 한국어 안깨지게 하는 법
		String name = request.getParameter("name");
		String ssn = request.getParameter("ssn");
		String tel = request.getParameter("tel");
		int balance = Integer.parseInt(request.getParameter("balance"));
		
		response.setContentType("text/html;charset=UTF8");//한글 호환. 맨위에 적어줄 것(getWriter()전에만 적어주면 되는 듯) 한글 안깨지는 방법 1
		PrintWriter out = response.getWriter();//웹페이지에 글자 주는거
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
		
		String URL = "jdbc:mysql://localhost:3307/spring5fs";
		String sql = "insert into account (name,ssn,tel,balance) values ( ? , ? , ? , ?)";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(URL,"root","mysql");
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,name);
			pstmt.setString(2,ssn);
			pstmt.setString(3,tel);
			pstmt.setInt(4,balance);
			pstmt.executeUpdate();
			String confirm = String.format("...회원가입 성공<br><br>");
			out.println(confirm);
			String result = String.format("<h1>회원 가입된 정보[ %s | %s | %s | %d]</h1>",name,ssn,tel,balance);
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