package sec01.exam07;

public class User2 extends Thread{
	private Calculator cal;
	
	public void setCalculator(Calculator cal) {
		this.setName("User2");
		this.cal = cal;
	}
	
	public void run() {
		cal.setMemory(200);
	}
}
