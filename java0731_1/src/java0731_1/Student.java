package java0731_1;

public class Student extends Person{
	public int studentNum;
	public Student(String name,int stnum) {
		super(name);
		this.studentNum = stnum;
	}
	
	public void study() {
		System.out.println("공부해라~");
	}
}
