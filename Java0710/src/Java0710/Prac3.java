package Java0710;

import java.util.Scanner;
public class Prac3 {
	public static int getNum(String msg, Scanner scan) {
		System.out.println(msg);
		String input = scan.nextLine();
		return Integer.parseInt(input);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//스캐너를 사용해서 키보드로 입력을 받는다 (표준 입력 사용)
		for(;;) {
			int num1 = getNum("첫번째 수: ",sc);
			int num2 = getNum("두번째 수: ",sc);
			int result = (num1 > num2) ? num1 : (num1 < num2)? num2 : 0;
			System.out.println("결과: " +result);
			if(result == 0) {
				break;
			}
		}
		System.out.println("종료");
		
	}
}