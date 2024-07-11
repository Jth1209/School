package Java0711;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("값을 입력하세요:");
		do {
			System.out.print("n : ");
			String input = sc.nextLine();
			num = Integer.parseInt(input);
		}while(num<0);
		int result = 0;
		
		for(int t = 1; t < num + 1; t++) {
		    result += t;
		}
		System.out.println(result);
	}

}
