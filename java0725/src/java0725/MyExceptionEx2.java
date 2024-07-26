package java0725;

class MyClass2 {
	void method() throws MyException2 {
		int x = 100;
		if(x > 90) {throw new MyException2("나의 예외");}//예외 발생
	}
}

public class MyExceptionEx2 {

	public static void main(String[] args) {
		MyClass2 mc = new MyClass2();
		try {
			mc.method();
		} catch (MyException2 e) {
			e.printStackTrace();
		}
		

	}
}


