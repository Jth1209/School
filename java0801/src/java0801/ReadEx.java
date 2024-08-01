package java0801;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadEx {

	public static void main(String[] args) throws IOException {
		Reader reader = new FileReader("C:\\Temp\\board1.csv");
		String line = "";
		BufferedReader br = new BufferedReader(reader);
		BoardDAO dao = new BoardDAO();
		while((line = br.readLine()) != null) {
			String[] data = line.split(", ");// ,를 기준으로 한 줄씩 읽어오는 것이기 때문에 총 3개의 데이터가 들어옴
			BoardDTO dto = new BoardDTO(0,data[0],data[1],data[2],null,0);//3개의 데이터를 DTO 생성자의 맞는 위치에 대입하여 dto생성
			dao.insertBoard(dto);//DAO를 전역으로 생성하고 위에 만들어놓은 dto를 매개변수로 사용해서 데이터베이스에 각각 삽입
		}
		reader.close();
	}

}
