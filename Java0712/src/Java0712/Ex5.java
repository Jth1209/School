package Java0712;

import java.util.Scanner;


public class Ex5 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("배열크기 입력:");
		String[] arr = new String[Integer.parseInt(sc.nextLine())];
		
		for(int i = 0; i< arr.length; i++) {
			System.out.print((i+1)+"번째 값: ");
			arr[i] = sc.nextLine();
		}
		for(String result : arr) {
			System.out.println(result);
		}
	}
}
