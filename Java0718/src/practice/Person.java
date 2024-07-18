package practice;

public class Person {
	private Role role = new Driver();
	
	
	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	public void doIt() {
		role.doIt();
	}
//	public static void main(String[] args) {
//		Person person = new Person();
//		Role role = new Driver();
//		person.doIt();
//		person.setRole(role);
//		person.doIt();
//		
//	}
}
