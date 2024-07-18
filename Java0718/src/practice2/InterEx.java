package practice2;

public class InterEx {

	public static void main(String[] args) {
		ImplementionC ic = new ImplementionC();
		InterA ia = ic;
		ia.methodA();
		InterB ib = ic;
		ib.methodB();
		
		InterC ic1 = ic;
//		ic.methodA();
//		ic.methodB();
//		ic.methodC();

	}

}
