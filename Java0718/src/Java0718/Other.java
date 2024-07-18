package Java0718;

public class Other {
	public static void main(String[] args) {
		Parent parent = new Child();
		Other other;
		
		Child child = (Child) parent;
		child.method3();
//		if(parent instanceof Child) {
//			System.out.println("타입 강제 변환");
//		Child child = (Child) parent;
//		}else {
//			System.out.println("타입 변환 불가능");
//		}
	}
	public static void anyMethod(Parent parent) {
		parent.method1();
	}
	
}
