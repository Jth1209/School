package mvjsp.chap17.board.service;

public class ReplyingRequest extends WritingRequest {

	public ReplyingRequest(String name, String title, String password, String content) {
		super(name, title, password, content);
		// TODO Auto-generated constructor stub
	}
	public ReplyingRequest() {
		// TODO Auto-generated constructor stub
	}
	private int parentArticleId;

	public int getParentArticleId() {
		return parentArticleId;
	}
	public void setParentArticleId(int parentArticleId) {
		this.parentArticleId = parentArticleId;
	}
	
}
