package du.db;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import mybatis.SqlMapConfig;

public class memberDAO implements memberMapper {
	SqlSessionFactory sqlsession_f = SqlMapConfig.getSqlMapInstance();
	SqlSession session;
	
	public memberDAO() {
		//SqlSessionFactory에서 session을 할당받는다.
		//이 때 openSession에 true를 주어야 자동 커밋이 된다.
		//default는 false이다.
		session = sqlsession_f.openSession(true);
	}

	@Override
	public memberDTO selectOne(memberDTO dto) {
		memberMapper mm = session.getMapper(memberMapper.class);
		return mm.selectOne(dto);
	}

	@Override
	public int checkUser(memberDTO dto) {
		memberMapper mm = session.getMapper(memberMapper.class);
		return mm.checkUser(dto);
	}

	@Override
	public void insertUser(memberDTO dto) {
		memberMapper mm = session.getMapper(memberMapper.class);
		mm.insertUser(dto);	
	}

	@Override
	public void updateUser(memberDTO dto) {
		memberMapper mm = session.getMapper(memberMapper.class);
		mm.updateUser(dto);
	}

	@Override
	public void deleteUser(String member_id) {
		memberMapper mm = session.getMapper(memberMapper.class);
		mm.deleteUser(member_id);
	}
	
	
}
