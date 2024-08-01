package java0801;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx2 {

	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("C:\\Temp\\test1.db");
		
		byte[] buffer = new byte[4];
		int data = is.read(buffer,0,4);
		for(int i =0; i<buffer.length; i++) {
			System.out.println(buffer[i]);
		}
			//		while(true) {
//			int data = is.read(buffer);//buffer가 읽어온 데이터의 길이를 data에 반환
//			if(data == -1) break;//-1이 출력되면 비정상종료를 의미하고, 이는 내부에 데이터가 없을 경우를 의미한다.
//			for(int i = 0; i<data; i++) {//i를 data의 값(데이터의 개수)만큼 반복해서 buffer의 0번 인덱스부터 읽어온다.
//				System.out.println(buffer[i]);
//			}
//		}
		is.close();
	}

}
