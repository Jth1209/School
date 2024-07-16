package Java0716;

public class ColorPoint extends Point{//implements는 다중 참조 가능
		
	ColorPoint() {
		super(100,200);
		System.out.println("자식 기본 생성자 호출");
		System.out.println(x);
	}
	public ColorPoint(int x, int y){
		super(x,y);
	}
	
	@Override
	void method1() {
		System.out.println("자식이 오버라이딩");
		super.method1();
	}
	
}
