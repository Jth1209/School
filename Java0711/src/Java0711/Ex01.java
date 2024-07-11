package Java0711;

import java.util.Scanner;

public class Ex01 {
	public static int getNum(String msg, Scanner scan) {
		System.out.println(msg);
		String input = scan.nextLine();
		return Integer.parseInt(input);
	}
	public static int getMNum(int a, int b, int c) {
		if(a >= b) {
			if(b >= c) {
				return b;
			}else if(a <= c) {
				return a;
			}else {
				return c;
			}
		}else if(a > c) {
			return a;
		}else if(b < c) {
			return b;
		}
		return c;
	}
	public static int getBMNum(int a, int b, int c) {
		if((a>b && b>c) || (c>b && b>a)) {
			return b;
		}else if((b>a && a>c) || (a>b && a<c)) {
			return a;
		}else {
			return c;
		}
	}
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
		int a = getNum("1:",sc);
		int b = getNum("2:",sc);
		int c = getNum("3:",sc);
		
//			if((a>b && b>c) || (c>b && b>a)) {
//				System.out.println(b);
//			}else if((b>a && a>c) || (a>b && a<c)) {
//				System.out.println(a);
//			}else if((a>c && c>b) || (b>c && c<a)){
//				System.out.println(c);
//			}else {
//				System.out.println("범위를 벗어남. 재입력(중복 수 불가)");
//			}
		int result = getMNum(a,b,c);
		System.out.println(result);
	  }
}
