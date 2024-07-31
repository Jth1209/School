package java0731_1;

public class Ex7 {
	public static void personInfo(Person person) {
		System.out.println("name : " + person.name);
		person.walk();
		
		if(person instanceof Student student) {
			student.study();
		}
	}
	public static void main(String[] args) {
		Person p = new Person("홍길동");
		personInfo(p);
		Student st = new Student("김길동",30);
		personInfo(st);
	}

}
