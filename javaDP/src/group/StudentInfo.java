package group;

import java.util.Iterator;

public class StudentInfo implements Iterable<Student>{

	private Student[] students;
	private int last = 0;
	
	@Override
	public Iterator<Student> iterator() {//반복자 책들을 모두 가져올 수 있도록 준비
		return new StudentInfoIterator(this);
	}
	public StudentInfo(int maxsize) {//생성자
		this.students = new Student[maxsize];
	}
	public Student getstudentAt(int index) {//해당 인덱스의 책을 리턴
		return students[index];
	}
	public void appendstudent(Student student) {//책을 추가
		this.students[last] = student;
		last++;
	}
	public int getLength() {//책의 총 개수 
		return last;
	}
	
}
