package Java0710;

import java.util.Scanner;

public class prac5 {
	public static int getNum(String msg, Scanner scan) {
		System.out.println(msg);
		String input = scan.nextLine();
		return Integer.parseInt(input);
	}
	
	public static char getScore(int score) {
		if(score > 100 || score < 0) {
			System.out.println("성적 입력 오류. 재입력: ");
		}
		char al = (score >=90) ? 'A' : (score >=80) ? 'B' : (score >=70) ? 'C' : (score >=60) ? 'D' : 'F';
		return al;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 수 입력:");
		String input = sc.nextLine();
		int vol = Integer.parseInt(input);
		
		for(int i =0; i <vol; i++) {
		int score = getNum("학생 점수 입력:ㅣ", sc);
		
		char stuscore = getScore(score);
		
		System.out.println("성적:" + stuscore);
		}
		System.out.println("성적 입력 완료");
	}

}
