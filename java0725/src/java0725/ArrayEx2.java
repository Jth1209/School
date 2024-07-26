package java0725;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayEx2 {

	public static void main(String[] args) {
		Integer[] array = {3,1,13,2,8,5,1};
		Comparator<Integer> com = new Comparator<Integer>() {//숫자를 역순으로 만들어주는 메소드
			
			@Override
			public int compare(Integer o1, Integer o2) {//o2 를 o1과 값을 비교해서 자리 교체 
				return o2.compareTo(o1);
			}
		};
		Arrays.sort(array,com);//sort 해주는 명령어, 위에 만든 Comparator객체 변수를 매개변수 2번째 자리에 넣어줌
		System.out.println(Arrays.toString(array));//배열을 문자열로 보내주는 명령어
		for(int i : array) {
			System.out.println(i);
		}
	}

}
