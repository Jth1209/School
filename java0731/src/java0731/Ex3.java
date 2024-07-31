package java0731;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Ex3 {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("홍길동",90),
				new Student("강하나",92),
				new Student("김하나",100)
				);
		int sum = list.stream().mapToInt(s->s.getScore()).sum();
		int sum2 = list.stream().mapToInt(Student::getScore).sum();//두가지 방식 모두 알고 있어야 한다.
		
		Double avg = list.stream().mapToDouble(Student::getScore).average().getAsDouble();
		System.out.println(avg);
		
		System.out.println(sum);
		System.out.println(sum2);
	}

}
