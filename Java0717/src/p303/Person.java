package p303;

public class Person {
	final String nation = "Korea";//final은 한번 선언하면 해당 값으로 메모리를 고정
	
	static final double PI = 3.141592;
	
	public static void main(String[] args) {
		Person p1 = new Person();
//		p1.nation = "USA";//final 붙이면 오류남
		System.out.println(p1.nation);
//		Person.PI = 10;//static final이 붙으면 독립적인 메모리 공간에서 고정된 값을 가짐 => 절대 못 고침 => 상수
	}
}
