package Java0710;

import java.util.Scanner;

public class prac4 {
	public static int maxNum(int a, int b, int c) {
		int max = (a>b) ? a : (b>c) ? b : c;//삼항 연산자
		return max;
	}//최대값 구하는 메소드
	public static int getNum(String msg, Scanner scan) {
		System.out.println(msg);
		String input = scan.nextLine();
		return Integer.parseInt(input);
	}//사용자 인터페이스 메소드
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("반복 수 결정: ");
		String input = sc.nextLine();
		int i = Integer.parseInt(input);//반복 수 결정
		
		for(int j = 0; j < i ; j++) {// 10번 반복
		int n1 = getNum("1번:",sc);
		int n2 = getNum("2번:",sc);
		int n3 = getNum("3번:",sc);
		
		int result = maxNum(n1,n2,n3);
		System.out.println("가장 큰 값:" + result);
		}
		System.out.println("종료");
	}

}
