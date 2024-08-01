package java0801;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteEx2 {

	public static void main(String[] args) throws IOException {
		Writer writer = new FileWriter("C:\\Temp\\test1.txt");
		
//		char[] c = {'a','b','c'};
//		writer.write(c);
//		char a = 'A';
//		char b = 'B';
//		char c = 'C';
//		
//		writer.write(a);
//		writer.write(b);
//		writer.write(c);
		
		String str = "ABC";
		
		writer.write(str);
		writer.flush();
		writer.close();
	}

}
