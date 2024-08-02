package drive;

import java.util.List;

import board.BoardDAO;
import board.BoardDTO;

public class Ex1 {

	public static void main(String[] args) {
		BoardDTO dto = new BoardDTO(16, "김기윤","김기윤의 글 제목", "김기윤의 글 내용", null, 0);
		BoardDAO dao = new BoardDAO();
		dao.getUpdate(dto);
	}
}


