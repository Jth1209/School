package sec01.exam05;

public class Outter {
	String field = "Outter-field";
	void method() {
		System.out.println("Outter-method()");
	}
	
	class Nested{
		String field = "Nested-field";
		void method() {
			System.out.println("Nested-method()");
		}
		
		void print() {
			System.out.println(this.field);
			this.method();
			System.out.println(Outter.this.field);//외부 클래스의 이름만 빌려서 this를 활용함
			Outter.this.method();//이하동문
		}
	}
}
