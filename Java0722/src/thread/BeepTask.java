package thread;

import java.awt.Toolkit;

public class BeepTask implements Runnable{//구현 활용

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
}
