package thread;

public class Ex1 {

	public static void main(String[] args) {
		Thread thread1 = new Thread(new Th1());
		Thread thread2 = new Thread(new Th2());
		
		thread1.start();
		thread2.start();
	}

}
