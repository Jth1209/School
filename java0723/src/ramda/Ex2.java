package ramda;

public class Ex2 {

	public static void main(String[] args) {
		MyInterface1 interf = ()->{//인터페이스의 객체 생성부와 메소드 오버라이딩 부분을 없애는 것,추상 메소드가 하나만 존재하는 인터페이스에서만 사용 가능 ***
			System.out.println("method()");
		};
		
		interf.method();
	}

}
