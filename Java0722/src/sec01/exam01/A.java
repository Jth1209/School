package sec01.exam01;

public class A {
	
	static void method2() {
		class D{
			D(){
				System.out.println("D 객체 생성");
			}
			int field1;
			static int field2;
			void method1() {}
			static void method2() {}
		}
		D d = new D();
	}
	
	A(){
		System.out.println("A 객체 생성");
	}
	class B{
		B(){
			System.out.println("B 객체 생성");
		}
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
		
	}
	static class C{
		C(){
			System.out.println("C 객체 생성");
		}
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
	}
}
