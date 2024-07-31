package java0731_1;

public class Ex5 {
	public static void main(String[] args) {
		String grade = null;
		switch(grade) {
		case "A", "a" ->{
			System.out.println("학점 : A");
		}
		case "B","b" ->{
			System.out.println("학점 : B");
		}
		case null ->{
			System.out.println("널 오류입니다.");
		}
		default ->{
			System.out.println("넌 아무것도 아니다.");
		}
		}
	}
}
