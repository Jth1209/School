package file;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import mybatis.SqlMapConfig;

public class fileDAO {
	SqlSessionFactory sqlsession_f = SqlMapConfig.getSqlMapInstance();
	SqlSession session;
	
	public fileDAO() {
		//SqlSessionFactory에서 session을 할당받는다.
		//이 때 openSession에 true를 주어야 자동 커밋이 된다.
		//default는 false이다.
		session = sqlsession_f.openSession(true);
	}
	
	public List<fileDTO> selectAll(){
		return session.selectList("Files.selectAll");
	}
	
	public fileDTO selectFile(int num) {
		return session.selectOne("Files.selectFile",num);
	}
	
	public void insertFile(fileDTO dto) {
		session.insert("Files.insertFile",dto);
	}
	
	public void deleteFile(int num) {
		session.delete("Files.deleteFile",num);
	}
}
