package java0723;

import java.time.LocalTime;

public class Th1 extends Thread{

	@Override
	public void run() {
		LocalTime localTime = LocalTime.now();//현재 시간을 알려주는 객체
		for(;;) {
		System.out.printf("%d : %d : %d\n",localTime.getHour(),localTime.getMinute(),localTime.getSecond());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	
}
