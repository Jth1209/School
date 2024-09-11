package list;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.CommandHandler;
import mvjsp.chap17.board.model.Article;
import mvjsp.chap17.board.model.ArticleListModel;
import mvjsp.chap17.board.service.ListArticleService;
import mvjsp.chap17.board.service.UpdateArticleService;
import mvjsp.chap17.board.service.UpdateRequest;

// CommandHandler 인터페이스 구현하는 핸들러 "hello" 커맨드에 대한 처리 담당
public class UpdateHandler implements CommandHandler {

	@Override
	// CommandHandler 인터페이스의 process 메서드를 구현
	public String process(HttpServletRequest request, HttpServletResponse res) throws UnsupportedEncodingException {
		request.setCharacterEncoding("euc-kr");
		int articleId = Integer.parseInt(request.getParameter("articleId"));
		String title = request.getParameter("title");
		String password = request.getParameter("password");
		String content = request.getParameter("content");
		UpdateRequest updateRequest = new UpdateRequest();
		updateRequest.setArticleId(articleId);
		updateRequest.setContent(content);;
		updateRequest.setPassword(password);;
		updateRequest.setTitle(title);;
		try {
			Article article = UpdateArticleService.getInstance().
					update(updateRequest);
			request.setAttribute("updatedArticle", article);
			return  "/WEB-INF/view/update_success.jsp";
		} catch (Exception ex) {
			request.setAttribute("updateException", ex);
			return "/WEB-INF/view/update_error.jsp";
		}
	}
	/*
	   http://localhost:8080/chap18/controllerUsingFile?cmd=hello --> 결과값: 안녕하세요!
	   cmd는 ControllerUsingFile.java에서 String command = request.getParameter("cmd"); 해당 부분
	   HaspMap에서 hello 핸들러 찾기 --> CommandHandler handler = commandHandlerMap.get(command);
	   
	*/
}
