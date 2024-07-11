package Java0711;

import java.util.Scanner;

public class Ex04 {
	
	public static int getNum(String msg, Scanner scan) {
		System.out.println(msg);
		String input = scan.nextLine();
		return Integer.parseInt(input);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = getNum("숫자 입력: ",sc);
		int result = 0;
		
		for(int i = 1; i < n ; i++) {
			System.out.print(i + "+");
			result += i;
		}
		System.out.print(n + "=");
		result += n;
		System.out.println(result);
	}

}
