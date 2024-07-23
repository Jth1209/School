package ramda;

public class Ex3 {

	public static void main(String[] args) {
		MyInterface2 interf = (a,b) -> {
			System.out.println(a+b);
		};
		interf.method(10,20);
	}

}
