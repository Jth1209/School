package Login;

public class DTO {
	private int num;
	private String name;
	private String ssn;
	private String tel;
	private int account;
	
	public DTO(int num, String name, String ssn, String tel, int account) {
		super();
		this.num = num;
		this.name = name;
		this.ssn = ssn;
		this.tel = tel;
		this.account = account;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "DTO [num=" + num + ", name=" + name + ", ssn=" + ssn + ", tel=" + tel + ", account=" + account + "]";
	}
	
	
}
