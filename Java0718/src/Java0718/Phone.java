package Java0718;

public abstract class Phone {//오로지 설계하고 상속시키는 역할만 가능하다. 기본 메소드 기본 필드 다 선언 가능함.
	String name;
	void turnOn() {
		System.out.println("Phone TrunOn");
	}
	abstract void trunOff();//메소드의 오버라이딩을 강제하는 역할
}
