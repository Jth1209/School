package java0722;

public class MultiThreadEx {

	public static void main(String[] args) {
		Calculator calMain = new Calculator();
		
		User1 u1 = new User1();
		u1.setCalculator(calMain);
		u1.start();
	
		User2 u2 = new User2();
		u2.setCalculator(calMain);
		u2.start();
	}

}
