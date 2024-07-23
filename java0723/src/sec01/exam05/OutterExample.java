package sec01.exam05;

public class OutterExample {

	public static void main(String[] args) {
		Outter out = new Outter();
		Outter.Nested nested = out.new Nested();
		System.out.println(out.field);
		out.method();
		System.out.println(nested.field);
		nested.method();
		nested.print();
	}

}
