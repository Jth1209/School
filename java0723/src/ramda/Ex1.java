package ramda;

public class Ex1 {

	public static void main(String[] args) {
		Thread thread2 = new Thread(()->{//람다식 함수 선언법
			for(int i = 0; i < 5; i++) {
				System.out.println("띵");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i = 0; i < 5; i++) {
					System.out.println("명");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
		});
		
		thread1.start();
		thread2.start();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("삐");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
