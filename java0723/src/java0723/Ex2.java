package java0723;

public class Ex2 {

	public static void main(String[] args) {
//		Thread thread1 = new Th1();
//		Thread thread2 = new Th2();
		Th1 th1 = new Th1();
		Th2 th2 = new Th2();
		
//		thread1.start();
//		thread2.start();
		th1.start();
		th2.start();
	}

}
