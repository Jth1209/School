package java0730;

import java.util.stream.IntStream;

public class Ex6 {

	public static void main(String[] args) {
//		IntStream ii = IntStream.range(1, 5);//마지막 수 -1 까지의 숫자를 반환
		int count = 10;
		
		IntStream ii = IntStream.rangeClosed(1, count);//rangeClosed는 범위에 포함된 모든 수를 출력
//		ii.forEach(System.out::println);
		long sum = ii.sum();
		System.out.println(sum);
	}

}
