package Java0712;

import java.util.Scanner;


public class Ex6 {
	public static double getNum(Scanner scan) {
		String input = scan.nextLine();
		return Double.parseDouble(input);
	}
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("학생 수 입력:");
        int num = Integer.parseInt(sc.nextLine());
		double[][] arr = new double[num][3];
		
		for(int i = 0; i< arr.length; i++) {
			System.out.println((i+1)+"번째 학생 점수 입력");
			System.out.print("국어:");
			arr[i][0] = getNum(sc) ;
			System.out.print("수학:");
			arr[i][1] = getNum(sc) ;
		}
		for(int i = 0; i < arr.length; i++) {
			arr[i][2] = (double) (arr[i][0] + arr[i][1]) / ((int)(arr[i].length) -1);//그냥 arr[i].length - 1은 2가 아님 아마 (arr[i].length) <- 이 새끼 때문인듯
			System.out.printf("%d번 학생의 점수와 평균 :%3.2f\t%3.2f\t%3.2f\n", i+1 ,arr[i][0],arr[i][1],arr[i][2]);
		}
	}
}
