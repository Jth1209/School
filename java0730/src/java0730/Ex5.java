package java0730;

import java.util.stream.IntStream;

public class Ex5 {

	public static void main(String[] args) {
//		IntStream ii = IntStream.range(1, 5);//마지막 수 -1 까지의 숫자를 반환
		IntStream ii = IntStream.rangeClosed(1, 5);//rangeClosed는 범위에 포함된 모든 수를 출력
//		ii.forEach(System.out::println);
		ii.forEach(s->{
			System.out.println(s);
		});
	}

}
