package java0729;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Ex4 {

	public static void main(String[] args) {
		Date now = new Date();//스레드 사용시 비추천
		System.out.println(now);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");//MM = 달을 의미, mm = 분을 의미 date 클래스에서만 사용 가능 SimpleDateFormat -> var.format()해줘야 함
		
		String strNow = sdf.format(now);
		System.out.println(strNow);
		
		LocalDateTime now1 = LocalDateTime.now();
		System.out.println(now1);
		
		LocalDateTime now2 = LocalDateTime.now();//스레드 쓸 때 추천
		String strNow1 = DateTimeFormatter.ofPattern("yyyy/MM/dd").format(now2);
		System.out.println(strNow1);
	}

}
