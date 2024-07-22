package java0722;

public class User1 extends Thread{
	Calculator cal1;
	
	void setCalculator(Calculator calculator) {
		this.setName("USer1");
		this.cal1 = calculator;
	}
	
	public void run() {
		cal1.setMemory(100);
	}
}
