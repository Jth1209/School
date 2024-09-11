package list;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.CommandHandler;
import mvjsp.chap17.board.model.Article;
import mvjsp.chap17.board.model.ArticleListModel;
import mvjsp.chap17.board.service.IdGenerationFailedException;
import mvjsp.chap17.board.service.ListArticleService;
import mvjsp.chap17.board.service.WriteArticleService;
import mvjsp.chap17.board.service.WritingRequest;

// CommandHandler 인터페이스 구현하는 핸들러 "hello" 커맨드에 대한 처리 담당
public class WriteHandler implements CommandHandler {

	@Override
	// CommandHandler 인터페이스의 process 메서드를 구현
	public String process(HttpServletRequest request, HttpServletResponse res) throws UnsupportedEncodingException {
		request.setCharacterEncoding("euc-kr");
		
		String writername = request.getParameter("writerName");
		String title = request.getParameter("title");
		String password = request.getParameter("password");
		String content = request.getParameter("content");
		
		WritingRequest writingRequest = new WritingRequest(writername,title,password,content);

		Article postedArticle = null;
		try {
			postedArticle = WriteArticleService.getInstance().write(writingRequest);
			request.setAttribute("postedArticle", postedArticle);
			return "/WEB-INF/view/write.jsp";
		} catch (IdGenerationFailedException e) {
			// TODO Auto-generated catch block
			return "/WEB-INF/view/error_view.jsp";
		}
		// 뷰 페이지로 "/WEB-INF/view/hello.jsp"를 반환
	}
	/*
	 * http://localhost:8080/chap18/controllerUsingFile?cmd=hello --> 결과값: 안녕하세요!
	 * cmd는 ControllerUsingFile.java에서 String command = request.getParameter("cmd");
	 * 해당 부분 HaspMap에서 hello 핸들러 찾기 --> CommandHandler handler =
	 * commandHandlerMap.get(command);
	 * 
	 */
}
