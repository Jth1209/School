package Java0709;

import java.util.Scanner;

public class practice {
	public static int getInt(String msg, Scanner scan) {
		 System.out.println(msg);
        String input = scan.nextLine();
		 return Integer.parseInt(input);
		 
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = getInt("첫 번째:",sc);
		int b = getInt("두 번째:",sc);
		int c = getInt("세 번째:",sc);
		
		int result = (a > b) ? a : (b > c ? b : c);
		System.out.printf("가장 큰 수는 %d", result);

	}

}
