package java0730;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

public class Ex1 {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("Ken",100));
		list.add(new Student("Shin",60));
		list.add(new Student("Kim",80));
		
		long num = list.stream()
		.filter(s->s.getScore() >= 70)
		.count();
		System.out.println(num);
		
//		long sum = list.stream()
//				.filter(s->s.getScore() >= 70)
//				.sum();
//				System.out.println(num);
		
		list.stream()//스트림
		.filter(s->s.getScore() >= 70)//중간 작업 (조건 설정)
		.forEach(s->System.out.println(s.getName())); //최종 작업(출력할 형태 및 값 설정)
		
//		for(Student stu : list) {
//			if(stu.getScore() < 70) {
//				list.remove(stu.getIndex());
//			}
//		}
		list.stream()
		.forEach(s->{//foreach 는 모든 요소를 출력
			String str = MessageFormat.format("{0},{1}", s.getName(),s.getScore());
			System.out.println(str);
		});
	}
}
