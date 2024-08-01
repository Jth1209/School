package java0801;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamEx {

	public static void main(String[] args) throws IOException {
		OutputStream os = new FileOutputStream("C:\\Temp\\test1.db");
		
//		byte a = 10;
//		byte b = 20;
//		byte c = 30;
//		
//		os.write(a);
//		os.write(b);
//		os.write(c);
		
		byte[] b = {40,50,60,70,80,90,100};
		
		os.write(b,2,4);//2번 인덱스 값부터 4개만 읽겠다는 말.
		
		os.flush();
		os.close();
	}

}
