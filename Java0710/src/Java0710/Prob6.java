package Java0710;

import java.util.Scanner;

public class Prob6 {
	public static void gugu(long a) {
		for(int j = 1; j <10; j++) {
			System.out.printf("%d X %d = %d\n",a,j,a*j);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		for(;;) {
			System.out.println("원하는 단의 숫자를 입력하세요: ");
			String input = sc.nextLine();
			if(input.equals("q")) {
				break;
			}
			long num = Long.parseLong(input);
			gugu(num);	
		}
		System.out.println("구구단 프로그램 종료");
	}

}

