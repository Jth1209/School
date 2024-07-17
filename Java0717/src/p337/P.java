package p337;

public class P {//final을 클래스에 사용하면 상속을 할 수 없다.
	final int x;
	
	public P(int x) {
		this.x = x;
		System.out.println("부모 생성자 호출");
	};
	final void method1() {//final을 메소드에 사용하면 오버라이딩 불가 (final은 값을 고정하는 것을 의미)
		System.out.println(x);
	}
}
