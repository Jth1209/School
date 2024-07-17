package tireExample;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i = 0; i <=5; i++) {
			TireLoc tl = car.run();
		
		switch(tl) {
		case FL:
			System.out.println("앞 바퀴를 HankookTire로 교체");
			car.frontLeftTire = new HankookTire("앞왼쪽",15);
			break;
		case FR:
			System.out.println("앞 바퀴를 KumhoTire로 교체");
			car.frontRightTire = new KumhoTire("앞오른쪽",13);
			break;
		case BL:
			System.out.println("뒤 바퀴를 HankookTire로 교체");
			car.BackLeftTire = new HankookTire("뒤왼쪽",14);
			break;
		case BR:
			System.out.println("앞 바퀴를 KumhoTire로 교체");
			car.BackRightTire = new KumhoTire("뒤오른쪽",17);
			break;
		case NP:
			System.out.println("Finished");
			}
		System.out.println("---------------------------");
		}
	}
}
