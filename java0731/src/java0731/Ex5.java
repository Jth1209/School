package java0731;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Ex5 {

	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("머길동",Member.MALE,30),
				new Member("김길동",Member.FEMALE,20),
				new Member("박길동",Member.MALE,45),
				new Member("최길동",Member.FEMALE,27)
				);
		
		Double avg = list.stream().mapToInt(Member::getAge).average().getAsDouble();
		System.out.println(avg);
		
		Double mavg = list.stream().filter(s->s.getSex() == Member.MALE).mapToInt(Member::getAge).average().getAsDouble();
		System.out.println(mavg);
		
		Double feavg = list.stream().filter(s->s.getSex() == Member.FEMALE).mapToInt(Member::getAge).average().getAsDouble();
		System.out.println(feavg);
		
		
	}

}
