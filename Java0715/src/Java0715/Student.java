package Java0715;

public class Student {

	private Professor advisor ;
	
	public void advise(String msg) {
		System.out.println("상담 내용:"+msg);
	}

	public Professor getAdvisor() {
		return advisor;
	}

	public void setAdvisor(Professor advisor) {
		this.advisor = advisor;
	}
	
}
