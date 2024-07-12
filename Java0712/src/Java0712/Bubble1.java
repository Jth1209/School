package Java0712;
import java.util.Scanner;
public class Bubble1 {
	public static void printArr(int a[]) {
		for(int n: a) {
			System.out.println(n+",");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//int num = Integer.parseInt(sc.nextLine());
		int[] a = {10,3,1,4,2};
		int temp = 0;
		
		for(int i =0; i< a.length-1; i++) {
			for(int j = 0; j < a.length-1; j++) {
				if(a[j] > a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					System.out.println("\t교환(j="+(j)+", j+1="+(j+1)+")");
					printArr(a);
				}
			}
			printArr(a);
		}
//		for(int i = 0; i <arr.length-1; i++) {
//			for(int j = 0; j < arr.length; j++) {
//				if(arr[j] > arr[j+1]) {
//					temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
//				}
//			}
//		}

	}

}
