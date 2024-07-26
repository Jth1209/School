package java0725;

class Parents{
	int x = 10;
	void method1() {
		System.out.println(x);
	}
}

public class Ex1 {

	public static void main(String[] args) {
		Parents parent = new Parents() {
			
			void method2() {
				System.out.println("자식 객체만 쓸 수 있는 메소드");
			}//자식 객체 타입으로 선언해야 쓸 수 있음 내부에서 사용할 수 있다.
			@Override
			void method1() {
				super.method1();//부모 메소드 호출
				method2();
				x = 100;//자식 필드값 설정
				System.out.println("나는 익명 자식 객체입니다." + x);//자식 메소드 오버라이딩
			}
			
		};
		parent.method1();
	}

}
