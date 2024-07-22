package thread;

import java.awt.Toolkit;

public class BeepPrintExample {

	public static void main(String[] args) {
		BeepTask bp = new BeepTask();
		Thread thread = new Thread(bp);//thread 객체의 매개변수로 Runnable을 구현한 클래스를 받음
		thread.start();
		
		for(int i = 0; i< 5; i++) {
			System.out.println("THing");
			try {Thread.sleep(500);}catch(Exception e) {}
		}
	}

}
