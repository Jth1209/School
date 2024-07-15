package Dp2;

public class Main {

	public static void main(String[] args) {
		Student s1 = new Student("민수");
		Student s2 = new Student("길동");
		
		Course c1 = new Course("java");
		Course c2 = new Course("C/C++");
		
		Transcript t1 = new Transcript(c1,s1,"202407","A");
		Transcript t2 = new Transcript(c2,s1,"202407","A+");
		Transcript t3 = new Transcript(c1,s2,"202407","B");
		
		s1.addTranscript(t1);
		s2.addTranscript(t2);
		s1.addTranscript(t3);

		c1.addTranscript(t1);
		c2.addTranscript(t2);
		c1.addTranscript(t3);
		
		
		System.out.println(s1);
		System.out.println(c1);
	}

}
