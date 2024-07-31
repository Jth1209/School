package java0731;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class MyFileReader {

	public static void main(String[] args) throws IOException {
		Reader reader = new FileReader("C:/Temp/text/file1.txt");
		char[] buffer = new char[6];
		int readerNum = reader.read(buffer);
		if(readerNum != -1) {
			for(char ch : buffer) {
				System.out.print(ch);
			}
			System.out.println();
		}
		reader.close();
	}

}
