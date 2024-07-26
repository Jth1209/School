package java0725;

public class Member {
	String id;//id 여야만 하는듯

	public Member(String id) {
		super();
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {//Object 클래스의 메소드를 오버라이딩 하여 문자열을 비교해주는 것으로 변경
		if(obj instanceof Member) {//매개변수로 받는 객체를 형변환 가능한지 조건문을 꼭 써줘야만 한
			Member member = (Member) obj;
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return id.hashCode();
	}
	
}
