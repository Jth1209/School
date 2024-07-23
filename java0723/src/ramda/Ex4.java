package ramda;

public class Ex4 {

	public static void main(String[] args) {
		MyInterface3 i3 = (a,b)->{
			System.out.println(a+b);
		};
		i3.method(10, 100);
	}

}
