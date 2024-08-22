package du.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import du.db.memberDAO;
import du.db.memberDTO;

/**
 * Servlet implementation class DuController
 */
@WebServlet("/")
public class DuController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DuController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		
		String view = " ";

		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String com = uri.substring(conPath.length());

		if (com.equals("/")) {
			view = "main.jsp";
		}
		
		else if(com.equals("/loginForm")) {
			view = "/sign-in/loginForm.jsp";
		}
		
		else if(com.equals("/login")) {
			request.setCharacterEncoding("UTF-8");
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			
			memberDTO dto = new memberDTO("","",email,password,"");
			memberDAO dao = new memberDAO();
			int check = dao.checkUser(dto);
			if(check == 1) {
				session.setAttribute("userLoggedIn", true);
				session.setAttribute("customInfo", new memberDAO().selectOne(dto));
				view = "main.jsp";
			}else {
				out.println("<script>alert('아이디 또는 비밀번호가 틀렸습니다.'); location.href='loginForm';</script>"); 
				out.close();
				view = " ";
			}
			
		}
		
		else if(com.equals("/logout")) {
			session.invalidate();
			view = "main.jsp";
		}

		
		if (view.startsWith("redirect:")) {
			response.sendRedirect(view.substring(9));
		} else {
			request.getRequestDispatcher(view).forward(request, response);
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
