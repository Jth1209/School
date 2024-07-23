package sec01.exam01;

public class Outter {
	public void method1(int arg) {
		int localVar = 1;
		
//		arg = 10;
//		localVar = 100;
		
		class Inner{
			public void method2() {
				int result = arg + localVar;
				System.out.println(result);
			}
		}
		Inner inner = new Inner();
		inner.method2();
	}
	public static void main(String[] args) {
		Outter out = new Outter();
		out.method1(9);
	}
}
