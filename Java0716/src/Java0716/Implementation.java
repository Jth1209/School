package Java0716;

public class Implementation {

	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		
		impl.methodA();
		impl.methodB();
		impl.methodC();
		
		InterfaceA inA = impl;
		inA.methodA();
		
		InterfaceB inB = impl;
		inB.methodB();
		
		InterfaceC inC = impl;
		impl.methodA();
		impl.methodB();
		impl.methodC();

	}

}
