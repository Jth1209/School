package java0730;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex2 {

	public static void main(String[] args) {
		Integer[] arr = new Integer[] {1,62,31,1,54,31};
		
		List<Integer> list2 = Arrays.asList(arr);//Arrays.asList()를 이럴 때 활용하면 된다. 배열을 리스트로 전환하고 리스트의 중복을 없애기 위해 Set을 이용하면 된다.
		
		Set<Integer> chg = new HashSet<>(list2);
		System.out.println(chg);
		
		List<Integer> list = Arrays.asList(1,2,3,4,4,4);//literal로 선언하기
		List<String> string = Arrays.asList("아","졸려","아");
		
		System.out.println(list);
		System.out.println(string);
		
		Set<Integer> set1 = new HashSet<>(list);//중복 없애기
		System.out.println(set1);
		Set<String> set2 = new HashSet<>(string);//중복 없애기
		System.out.println(set2);
		
	}

}
