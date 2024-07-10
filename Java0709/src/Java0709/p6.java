package Java0709;

import java.util.Scanner;

public class p6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수값 입력:");
		String input = sc.nextLine();
		int integer = Integer.parseInt(input);
		
		int result = (integer > 0) ? integer : (integer <0 ? Math.abs(integer) : 0);
		System.out.println(result);
	}
}
