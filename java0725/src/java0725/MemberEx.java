package java0725;

class Member2{
	String id;

	public Member2(String id) {
		super();
		this.id = id;
	}
	
}

public class MemberEx {

	public static void main(String[] args) {
		String s1 = new String("sde");//String 메소드를 만든 사람이 hashcode 부터 다 같게 만들어 놓음
		String s2 = new String("sde");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		Member memeber1 = new Member("blue");
		Member memeber2 = new Member("blue");
		
		
		
		if(memeber1.equals(memeber2)) {//객체가 같냐를 비교
			System.out.println("O");
		}else {
			System.out.println("X");
		}
		
		if(s1.equals(s2)) {//문자열이 같은지 확인. s1 == s2 이건 문자열이 가르키는 주소가 같은지 확인.
			System.out.println("O");
		}else {
			System.out.println("X");
		}
	}

}
