package project1_1;

import java.io.Serializable;

public class Member implements Serializable {
	String name; 
	String ssn;//주민번호 6자리
	String tel;
	
	int balance;
	
	@Override
	public String toString() {
		return "Member [name=" + name + ", ssn=" + ssn + ", tel=" + tel + ", balance=" + balance + "]";
	}
	public Member(String name, String ssn, String tel) {
		super();
		this.name = name;
		this.ssn = ssn;
		this.tel = tel;
	}
	public Member(int balance) {//생성자는 특이한 메소드일 뿐.
		super();
		this.balance = balance;
	}
	public Member() {
		
	}

	
}
