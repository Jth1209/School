package java0723;

public class A {
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	class B{
		void method() {
			field1 = 10;
			method1();
			
			field2 = 20;
			method2();
			System.out.println(A.field2);
			System.out.println(field1);
		}
	}
	static class C{
		
		static void method() {
			field2 = 10;
//			field1 = 10;//중첩 클래스가 정적이면 외부 클래스의 인스턴스 필드를 사용할 수 없다.
//			method1();//중첩 클래스가 정적이면 외부 클래스의 인스턴스 필드를 사용할 수 없다.
			method2();
		}
		void method1() {
			field2 = 10;
//			field1 = 10;//중첩 클래스가 정적이면 외부 클래스의 인스턴스 필드를 사용할 수 없다.
//			method1();//중첩 클래스가 정적이면 외부 클래스의 인스턴스 필드를 사용할 수 없다.
			method2();
		}
	}
	public static void main(String[] args) {
		A a = new A();
		A.B b = a.new B();
		b.method();
		A.C.method();
		A.C c = new A.C();
		c.method1();
		c.method();
		System.out.println(a.field1);//인스턴스 중첩 클래스
		System.out.println(A.field2);//정적 중첩 클래스
	}
}
