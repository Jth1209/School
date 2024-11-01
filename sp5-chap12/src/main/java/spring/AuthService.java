package spring;

public class AuthService {

	private MemberDao memberDao;

	public AuthService(MemberDao memberDao) {
		super();
		this.memberDao = memberDao;
	}
	
	public AuthService() {
		super();
	}

	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

	public AuthInfo authenticate(String email,String password) {
		Member member = memberDao.selectByEmail(email);
		if(member == null) {
			throw new WrongIdPasswordException();
		}
		if(!member.matchPasswrod(password)) {
			throw new WrongIdPasswordException();
		}
		return new AuthInfo(member.getId(),member.getEmail(),member.getName());
	}
}
