package Java0709;

import java.util.Scanner;
public class p5 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("학생의 점수 입력:");
			String input = sc.nextLine();
			int score = Integer.parseInt(input);
			
			if(score >= 90) {
				System.out.println("A");
			}
			else if(score < 90 && score >= 80) {
				System.out.println("B");
			}
			else if(score < 80 && score >= 70) {
				System.out.println("C");
			}
			else if(score < 70 && score >= 60) {
				System.out.println("D");
			}
			else {
				System.out.println("F");
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
