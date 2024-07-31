package java0731;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class MyFileWriter2 {

	public static void main(String[] args) throws IOException {
		File dir = new File("C:/Temp/file");
		if(dir.exists() == false) {dir.mkdir();}
		Writer writer = new FileWriter("C:/Temp/file/data.txt");//없는 폴더를 만들면서 내부에 내용까지 작성할 수 있다.
		String str = "안녕하세요!";
		writer.write(str);
		writer.flush();
		writer.close();//flush와 close는 writer를 다 쓰고 해줘야 하는 것
	}

}
