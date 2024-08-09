package list;


import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import mybatis.SqlMapConfig;

public class ListDAO {
	//SqlSessionFactory를 SqlMapConfig를 통하여 생성한다.
	SqlSessionFactory sqlsession_f = SqlMapConfig.getSqlMapInstance();
	SqlSession session;
	
	public ListDAO() {
		//SqlSessionFactory에서 session을 할당받는다.
		//이 때 openSession에 true를 주어야 자동 커밋이 된다.
		//default는 false이다.
		session = sqlsession_f.openSession(true);
	}
}