package java0722;

public class User2 extends Thread{
	Calculator cal2;
	
	void setCalculator(Calculator calculator) {
		this.setName("USer2");
		this.cal2 = calculator;
	}
	
	public void run() {
		cal2.setMemory(50);
	}
}
