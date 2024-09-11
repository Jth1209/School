package list;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.CommandHandler;
import mvjsp.chap17.board.model.Article;
import mvjsp.chap17.board.model.ArticleListModel;
import mvjsp.chap17.board.service.ListArticleService;
import mvjsp.chap17.board.service.ReplyArticleService;
import mvjsp.chap17.board.service.ReplyingRequest;

// CommandHandler 인터페이스 구현하는 핸들러 "hello" 커맨드에 대한 처리 담당
public class ReplyHandler implements CommandHandler {

	@Override
	// CommandHandler 인터페이스의 process 메서드를 구현
	public String process(HttpServletRequest request, HttpServletResponse res) throws UnsupportedEncodingException {
		request.setCharacterEncoding("euc-kr");
		
		int parentArticledId = Integer.parseInt(request.getParameter("parentArticleId"));//댓글을 달고자 하는 작성자의 아이디
		String writername = request.getParameter("writerName");
		String title = request.getParameter("title");
		String password = request.getParameter("password");
		String content = request.getParameter("content");
		
		ReplyingRequest replyingRequest = new ReplyingRequest(writername,title,password,content);
		replyingRequest.setParentArticleId(parentArticledId);
		try {
			Article postedArticle = ReplyArticleService.getInstance().
					reply(replyingRequest);
			request.setAttribute("postedArticle", postedArticle);
			return "/WEB-INF/view/reply_success.jsp";
		} catch(Exception ex) {
			request.setAttribute("replyException", ex);
			return "/WEB-INF/view/reply_error.jsp";
		}
	}
	/*
	   http://localhost:8080/chap18/controllerUsingFile?cmd=hello --> 결과값: 안녕하세요!
	   cmd는 ControllerUsingFile.java에서 String command = request.getParameter("cmd"); 해당 부분
	   HaspMap에서 hello 핸들러 찾기 --> CommandHandler handler = commandHandlerMap.get(command);
	   
	*/
}
