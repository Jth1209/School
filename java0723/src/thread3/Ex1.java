package thread3;

public class Ex1 {

	public static void main(String[] args) {
		Thread thread1 = new Th1();
		Thread thread2 = new Th2();
		
		thread1.start();//해당 스레드의 run 메소드를 시작 대기 상태로 만들고, 메인 스레드가 실행될 때 같이 시작하게 해줌
		thread2.start();
	}

}
