package java0731;

import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class Ex1 {

	public static void main(String[] args) {
		//stream 내부에서 값을 중첩하고싶으면 해당 변수를 정적(static)으로 선언해주면 된다.
		int ret = IntStream.rangeClosed(1, 5).sum();//코드의 사용을 줄이고 직관성을 높인다.
		System.out.println(ret);
	}

}
