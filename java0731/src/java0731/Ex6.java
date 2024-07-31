package java0731;

import java.util.Arrays;
import java.util.List;

public class Ex6 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("홍길동","신용권","김자배","신용권","김덕배");
		
		names.stream().limit(2).forEach(System.out::println);//limit(n)는 시작부터 n개의 요소만 출력한다.
		
//		names.stream().distinct().forEach(System.out::println);//.distinct()는 중복값 없애주는 거
//		System.out.println();
//		
//		names.stream().filter(n->n.startsWith("신")).forEach(System.out::println);//신으로 시작하는 애들만 
//		System.out.println();
//		
//		names.stream().distinct().filter(n->n.startsWith("신")).forEach(System.out::println);//중복 없애고 신으로 시작하는 애들만 출력
	}

}
