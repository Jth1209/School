package du;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Start1
 */
@WebServlet("/main.do")
public class Start1 extends HttpServlet {//아래 오버라이드 된 애들은 모두 HttpServlet이 가지고 있는 메소드다.
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Start1() {
        System.out.println("Start 서블릿 생성");
    }
    
    
//	@Override
//	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		System.out.println("Service() 호출");//service 메소드에서 doGet,doPost등 어디로 보낼지 정하는 메소드
//	}


	@Override
	public void destroy() {
		System.out.println("destroy() 호출");
	}


	@Override
	public void init() throws ServletException {
		System.out.println("init() 호출");
	}


	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html;charset=utf8");//주로 사용하는 것들 //이 라인에 있는 코드는 한글을 깨지지 않게 하기 위한 것
		PrintWriter out = response.getWriter();
		out.println("<h1>Servlet Page</h1>");
		System.out.println("doGet() 호출");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub//주로 사용하는 것들
		doGet(request, response);
		System.out.println("doPost() 호출");
	}

}
