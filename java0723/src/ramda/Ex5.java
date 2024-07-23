package ramda;

public class Ex5 {

	public static void main(String[] args) {
		MyInterface4 i4 = (a,b)->{//인터페이스에 오직 한개의 메소드만 존재하면(메소드의 자료형 매개변수 개수 등등 상관 없이) 람다식으로 사용하는 것이 효율적이다.
			return a+b;
		};
		System.out.println(i4.method(20, 30));
	}

}
