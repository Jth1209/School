public class A {
	
	static int field1;
	
	class B{
		int field;
		static int field2;
		void method() {}
		static void method2() {}
	}
	
	static class C{
		
	}
	
	void method() {
		class D{
			
		}
	}
	public static void main(String[] args) {
		A a = new A();
		A.B b = a.new B();
		b.method2();
	}
}
