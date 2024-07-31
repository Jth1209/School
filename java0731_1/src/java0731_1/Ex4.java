package java0731_1;

public class Ex4 {
	public static void main(String[] args) {
		char grade = 'k';
		switch(grade) {
		case 'A', 'a' ->{
			System.out.println("학점 : A");
		}
		case 'B','b' ->{
			System.out.println("학점 : B");
		}
		default ->{
			System.out.println("넌 아무것도 아니다.");
		}
		}
	}
}
