package java0731;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Ex4 {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C:/Temp/file/data.txt");
		Stream<String> stream = Files.lines(path,Charset.defaultCharset()); 
		
		stream.forEach(System.out::println);//스트림을 활용한 파일 데이터 읽어오는 방법 1
		//--------------------------------------------------------------------
		File file = path.toFile();
		BufferedReader br = new BufferedReader(new FileReader(file));
		stream = br.lines();
		stream.forEach(System.out::println);//스트림을 활용한 파일 데이터 읽어오는 방법 2
	}

}
