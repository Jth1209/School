package Dp2;

public class Transcript {
	private Course course;
	private Student student;
	private String data;
	private String grade;
	
	
	public Transcript(Course course, Student student, String data, String grade) {
		super();
		this.course = course;
		this.student = student;
		this.data = data;
		this.grade = grade;
	}
	
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public Course getCourse() {
		return course;
	}


	public void setCourse(Course course) {
		this.course = course;
	}


	public Student getStudent() {
		return student;
	}


	public void setStudent(Student student) {
		this.student = student;
	}
	
	public String getGrade() {
		return grade;
	}
	public Course Course() {
		return course;
	}
		
}
