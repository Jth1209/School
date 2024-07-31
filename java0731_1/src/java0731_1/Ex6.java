package java0731_1;

public class Ex6 {

	public static void method(Object obj) {
		switch(obj) {
		case Integer i ->{
			System.out.println("정수형 입니다.");
		}
		case String s ->{
			System.out.println("문자열형 입니다.");
		}
		default ->{
			System.out.println("아무것도 아닙니다.");
		}
		}
	}
	public static void main(String[] args) {
		
		method("시발럼");
	}

}
