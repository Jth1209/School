package java0725;

import java.util.Arrays;

public class ArrayEx3 {

	public static void main(String[] args) {
		int[] array = {1,1,4,5,7,8,11,12,17,21,24};//배열이 정렬된 이후에 찾을 수 있다.
//		int[] array = {3,1,13,2,8,5,1};//정렬이 안되어있는 상태면 음수값 등 이상한 값이 나옴
		int found = Arrays.binarySearch(array, 8);//매개변수로 배열과 해당 배열에서 찾고싶은 값을 적으면 found에 해당 값이 배열에 존재하는 인덱스를 반환
		System.out.println(found);//해당 숫자의 인덱스 번호를 출력
	}

}
