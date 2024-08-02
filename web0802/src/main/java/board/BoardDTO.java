package board;

public class BoardDTO {
	
	private int num;//DTO의 필드값은 대부분 데이터베이스의 요소와 같다.(아닌 경우도 있음)
	private String writer;
	private String title;
	private String content;
	private String regtime;
	private int hits;
	
	public BoardDTO(int num, String writer, String title, String content, String regtime, int hits) {//setter 메소드가 없는 경우는 VO(value object)로 활용하는 경우다.
		super();
		this.num = num;
		this.writer = writer;
		this.title = title;
		this.content = content;
		this.regtime = regtime;
		this.hits = hits;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getRegtime() {
		return regtime;
	}

	public void setRegtime(String regtime) {
		this.regtime = regtime;
	}

	public int getHits() {
		return hits;
	}

	public void setHits(int hits) {
		this.hits = hits;
	}

	@Override
	public String toString() {
		return "BoardDTO [num=" + num + ", writer=" + writer + ", title=" + title + ", content=" + content
				+ ", regtime=" + regtime + ", hits=" + hits + "]";
	}
	
	
}
