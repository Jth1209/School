package java0723;

import java.time.LocalTime;

public class DisplayDate {
	
	public static void main(String[] args) {
		LocalTime localTime = LocalTime.now();//현재 시간을 알려주는 객체
		System.out.printf("%d : %d : %d\n",localTime.getHour(),localTime.getMinute(),localTime.getSecond());
	}

}
