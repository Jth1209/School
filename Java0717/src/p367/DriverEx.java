package p367;

import java.util.Scanner;

public class DriverEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("차량을 선택해주세요: 1. 버스 2. 택시");
		int num = sc.nextInt();
		Driver driver = new Driver();
		Vehicle vi = null;
		switch(num) {
		case 1: vi = new Bus();
		break;
		case 2: vi = new Texi();
		break;
		default:
			System.out.println("선택 오류!");
		}
		
		driver.driver(vi);

	}

}
