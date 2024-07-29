package sec01.exam07;

public class MainThreadExample {

	public static void main(String[] args) {
		Calculator cal1 = new Calculator();
		
		User1 us1 = new User1();
		us1.setCalulator(cal1);//객체 주입
		us1.start();
		
		User2 us2 = new User2();
		us2.setCalculator(cal1);//객체 주입
		us2.start();

	}

}
