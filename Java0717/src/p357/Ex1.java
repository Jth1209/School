package p357;
	
class A{//접근제한자가 public인 클래스는 두개 이상 존재할 수 없음 
	
}
class B extends A{
	
}

public class Ex1 {
	B b = new B();
	A a = new B();
//	B b1 = (B) new A();//이러면 강제 형변환을 통해 사용은 가능하지만, b의 기능을 온전히 활용하지 못해서 오류가 발생할 수 있는 불완전 코드임
	
	
}
