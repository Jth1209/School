package practice;

public class PersonEx {
	public static void main(String[] args) {
		Driver driver = new Driver();
		Role role = driver;
		role = new Worker();
		if(role instanceof Worker) {
			Worker worker = (Worker) role;//인터페이스의 강제 형 변환
		}
		Person person = new Person();
		
		person.doIt();
		person.setRole(new Worker());
		person.doIt();
	}
}
