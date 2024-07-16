package Java0716;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Calculator {
	private int x;
	private int y;

	int plus() {
		int result = x + y;
		return result;
	}
	double avg() {
		double result = (double) plus() / 2;
		return result;
	}
	
	void execteP() {System.out.println(this.plus());}
	void execteA() {System.out.println(this.avg());}
	
	void turnOff() {System.out.println("계산기가 종료되었습니다.");}
}
