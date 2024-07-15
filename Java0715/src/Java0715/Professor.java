package Java0715;

public class Professor {

	private Student student ;
	private String confirm;

	public void advise() {
		System.out.println("상담인원: "+getStudent());
		System.out.println("상담 내용:"+ getConfirm());	
	}
	
	public String getConfirm() {
		return confirm;
	}

	public void setConfirm(String confirm) {
		this.confirm = confirm;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
}
