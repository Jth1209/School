package java0729;

public class Stop {
	public static void main(String[] args) {
		PrintThread1 printThread1 = new PrintThread1();
		
		printThread1.start();
		
		try {
			Thread.sleep(500);//설정한 시간만큼은 실행되고 이후에 정지 조건을 줘서 종료시킨다.
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		printThread1.setStop(true);
	}
}
