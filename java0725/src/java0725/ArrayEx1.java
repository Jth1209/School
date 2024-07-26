package java0725;

import java.util.Arrays;

public class ArrayEx1 {

	public static void main(String[] args) {
		int[] array = {3,1,13,2,8,5,1};
		Arrays.sort(array);//sort 해주는 명령어
		System.out.println(Arrays.toString(array));//배열을 문자열로 보내주는 명령어
		for(int i : array) {
			System.out.println(i);
		}
	}

}
