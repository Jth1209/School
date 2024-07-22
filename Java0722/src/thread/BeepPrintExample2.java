package thread;

import java.awt.Toolkit;

public class BeepPrintExample2 {

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {//익명객체활용

			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i = 0; i< 5; i++) {
					toolkit.beep();
					try {Thread.sleep(500);
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
				
				}
			}
		});
		thread.start();
		
		for(int i = 0; i< 5; i++) {
			System.out.println("THing");
			try {Thread.sleep(500);}catch(Exception e) {}
		}
	}

}
