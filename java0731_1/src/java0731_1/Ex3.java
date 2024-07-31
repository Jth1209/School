package java0731_1;

public class Ex3 {
	public static void main(String[] args) {
		char grade = 'k';
		int ret = switch(grade) {
		case 'A', 'a' ->{
			yield 100;
		}
		case 'B','b' ->{
			yield 90;
		}
		default ->{
			yield 80;
		}
		};
		System.out.println(ret);
	}
}
