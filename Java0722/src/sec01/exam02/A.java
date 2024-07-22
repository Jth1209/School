package sec01.exam02;

public class A {
	B field = new B();//인스턴스 멤버 클래스는 정적에 관련된 대부분의 요소에서 사용할 수 없다.
	C field2 = new C();
	
	void method() {//인스턴스 메소드 내부에선 인스턴스 멤버 클래스와 정적 멤버 클래스를 둘 다 사용할 수 있다.
		B var1 = new B();
		C var2 = new C();
	}
	
//	static B field3 = new B();//인스턴스 멤버 클래스는 정적으로 생성 불가
	static C field4 = new C();
	
	static void method2() {//정적 메소드 내부에서 인스턴스 클래스를 사용할 수 없다.(java version 11에서는)
		C var2 = new C();
	}
	
	
	class B{ B(){System.out.println("B 객체 생성");}}
	static class C{C(){System.out.println("C 객체 생성");}}
	
}
