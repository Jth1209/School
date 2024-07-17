package tireExample;

public class Car {
	Tire frontLeftTire = new Tire("앞왼쪽",7);
	Tire frontRightTire = new Tire("앞오른쪽",4);
	Tire BackLeftTire = new Tire("뒤왼쪽",3);
	Tire BackRightTire = new Tire("뒤오른쪽",7);
	
	TireLoc run() {
		System.out.println("[자동차가 달립니다]");
		if(frontLeftTire.roll() == false) {stop(); return TireLoc.FL;}
		if(frontRightTire.roll() == false) {stop(); return TireLoc.FR;}
		if(BackLeftTire.roll() == false) {stop(); return TireLoc.BL;}
		if(BackRightTire.roll() == false) {stop(); return TireLoc.BR;}
		return TireLoc.NP;
	}
	void stop() {
		System.out.println("[자동차가 멈춥니다]");
	}
}
