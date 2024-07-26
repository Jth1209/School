package group;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class StudentInfoIterator implements Iterator<Student> {

	private StudentInfo studentinfo;
	private int index;
	
	public StudentInfoIterator(StudentInfo studentinfo) {//생성자
		this.studentinfo = studentinfo;
		this.index = 0;
	}
	@Override
	public boolean hasNext() {//다음 책 존재 유무
		if(index < studentinfo.getLength()) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public Student next() {//다음책을 가지고 올 때 
		if(!hasNext()) {
			throw new NoSuchElementException();//throw 예외 생성 
		}
		Student student = studentinfo.getstudentAt(index);
		index++;
		return student;
	}

}
