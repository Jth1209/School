package java0730;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex3 {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("Ken",100));
		list.add(new Student("Shin",60));
		list.add(new Student("Kim",80));
		Collections.sort(list,(Student s1 , Student s2)->Integer.compare(s2.getScore(),s1.getScore()));//앞서서 했던 Comparator<>이 가지고 있던 하나의 메소드를 람다식으로 작성한 것
		//종류는 Arrays와 Collections 가 있다.
		list.stream().forEach(s->
		System.out.println(s.getName() + " , " +  s.getScore())
		);
	}
}
