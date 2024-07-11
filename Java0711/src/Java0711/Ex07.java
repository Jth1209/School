package Java0711;

import java.util.Scanner;

public class Ex07 {
	
	public static int getNum(String msg, Scanner scan) {
		System.out.print(msg);
		String input = scan.nextLine();
		return Integer.parseInt(input);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int w = 0;
		
		do {
			 n = getNum("no값: ",sc);
		}while(n < 10 || n > 99);
		
		System.out.println("변수 no값은"+ n + "입니다");
		
		/*for(int i = 0; i < n/w; i++) {
				System.out.print("*".repeat(w);
		}
		if(n%w != 0) {
			for (int i = 0; i < n%w; i++) {
				System.out.print("*");
			}
		}*/
		
//		for(int i = 0; i < n; i++) {
//			if(i % w == 0) {
//				System.out.println();
//			}
//			System.out.print("*");
//		}
	}

}