package java0725;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentEx2 {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("홍길동",97));
		list.add(new Student("김길동",63));
		list.add(new Student("이길동",89));
		list.add(new Student("천길동",93));
		list.add(new Student("백길동",44));
		
		Comparator<Student> c = new Comparator<Student>() {//두 수를 비교해서 값을 정렬시켜주는 것 이게 중요! 배열 ArrayList 등등으로 쓸 수 있다.
		//인터페이스임	
			@Override
			public int compare(Student o1, Student o2) {
				
				return Integer.compare(o2.getScore(), o1.getScore());
			}
		};
		
		Collections.sort(list,c);//ArrayList 형일 때 정렬을 사용할 수 있는 Collection 배열은 Arrays
		System.out.println(list);
		
	}

}
