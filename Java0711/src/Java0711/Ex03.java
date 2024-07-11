package Java0711;

import java.util.Scanner;

public class Ex03 {
	public static int getNum(String msg,Scanner scan) {
		System.out.println(msg);
		String input = scan.nextLine();
		return Integer.parseInt(input);
	}
	public static int sumOf(int a, int b) {
		int min;
		int max;
		if(a>b) {
			min = b;
			max = a;
		}else {
			min = a;
			max = b;
		}
	    int sum = 0;
		
	    for(int i = min; i < max + 1; i++) {
	    	sum += i;
	    }
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = getNum("첫번째 수 :",sc);
		int num2 = getNum("두번째 수 :",sc);
		int result = 0;
		
		result = sumOf(num1,num2);
		
		System.out.println(result);
}
}
