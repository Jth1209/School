package java0729;

public class Ex3 {

	public static void main(String[] args) {
		int x = 100;
		Integer y;
		Integer z = 400;
		y = 100;
		
		x =Integer.parseInt("400");//Wrapper type
		y = Integer.valueOf("400");//클래스의 형태로 변형 valueOf()
		if(y.equals(z)) {//wrapper 클래스들은 equals를 사용해 값을 비교한다.
			System.out.println("same");
		}else {
			System.out.println("different");
		}
		String str2 =  String.valueOf(123);//문자열로 변환해주는 메소드
		String str1 = "이것은 자바 대치 예제입니다.";
		String newStr = str1.replace("예제","코드");
		str1 = str1.replace("예제","코드");
		System.out.println(str1);
		System.out.println(newStr);//사실상 새로 만든것
		
		if(str1 == newStr) {
			System.out.println("같은 메모리");
		}else {
			System.out.println("다른 저장소");
		}
		
		if(str1.equals(newStr)) {
			System.out.println("같다");
		}
	}

}
