package java0729;

public class Thread1 {

	public static void main(String[] args) {
		Thread mainthread = Thread.currentThread();
		System.out.println(mainthread.getName());//스레드의 이름을 출력할 수 있음.
		
		
		ThreadA threadA = new ThreadA();
		threadA.start();
		
		Thread threadB = new Thread(){

			@Override
			public void run() {
				for(int i = 0; i <2; i++) {
					System.out.println(this.getName());
					try {
						Thread.sleep(1);//스레드 살짝 휴식쓰
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}

			
			
		};
		threadB.setName("TheadB");
		threadB.start();
		
		Thread threadC = new Thread(new Runnable() {
			
			
			@Override
			public void run() {
				for(int i = 0; i <2; i++) {
					System.out.println("ThreadC");
					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
			
		});
		threadC.start();
	}

}
