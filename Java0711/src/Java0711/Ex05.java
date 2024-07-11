package Java0711;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		
		do {
			System.out.print("n의 값 : ");
			String input = sc.nextLine();
			n = Integer.parseInt(input);
		}while(n<0);
		
		
//		for(int i = 1; i < n + 1; i++) {
//			if(i % 2 == 0) {
//				System.out.print("-");
//			}
//			if(i % 2 == 1) {
//				System.out.print("+");
//			}
//		}
		
		for(int i = 0; i < n/2 ; i++) {
			System.out.print("+-");
		}
		if(n % 2 == 1) {
			System.out.print("+");
		}
	}

}
