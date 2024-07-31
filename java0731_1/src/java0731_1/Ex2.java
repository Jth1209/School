package java0731_1;

public class Ex2 {

	public static void main(String[] args) {
		String str = """
				{ 
				"user" = "홍길동",
				"age" = 30
				}
				""";//말 그대로 문자열을 그대로 copy and paste해야 할 때, """를 사용하면 그대로 출력해 준다.
		System.out.println(str);
	}

}
