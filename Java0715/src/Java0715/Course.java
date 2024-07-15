package Java0715;

import java.util.Vector;

public class Course {
	private String id;
	private String name;
	private int numOfStudents;
	private Vector<StudentEx> students;
	
	public Course(String id, String name) {
		super();
		this.id = id;
		this.name = name;
		this.students = new Vector<StudentEx>();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

	public void addStudent(StudentEx student) {
		students.add(student);
		++numOfStudents;
	}
	
	public void deleteStudent(StudentEx student) {
		if (students.contains(student)) {
			students.remove(student);
			--numOfStudents;
		}
	}
	public Vector<StudentEx> getStudents() {
		return students;
	}
	public int getNumOfStudents() {
		return numOfStudents;
	}
	
	
	
}