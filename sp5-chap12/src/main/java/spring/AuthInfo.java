package spring;

public class AuthInfo {
	
	private Long id;
	private String email;
	private String password;
	
	public AuthInfo(Long id, String email, String password) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
	}

	public Long getId() {
		return id;
	}



	public String getEmail() {
		return email;
	}

	

	public String getPassword() {
		return password;
	}

	
	
	

}
