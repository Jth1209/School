package sec01.exam01;

public class Main {

	public static void main(String[] args) {
		A a = new A();
		A.B b = a.new B();//객체 생성한 후 해당 객체를 호출하고 생성자를 호출해야 한다.
		A.B b1 = new A().new B();//위의 두 코드를 하나로 쓰는 것
		A.C c = new A.C();
		a.method2();
	}

}
