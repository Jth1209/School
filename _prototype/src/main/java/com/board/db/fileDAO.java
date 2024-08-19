package com.board.db;

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
	
	public List<filepDTO> showFiles(int num) {
		return session.selectList("File.showFiles",num);
	}
	
	public fileDTO selectFile(int num) {
		return session.selectOne("File.selectFile",num);
	}
	
	public int Count() {
		return session.selectOne("File.count");
	}
	
	public void insertFiles(fileDTO dto) {
		session.insert("File.insertFiles",dto);
	}
	
	public void deleteFiles(int num) {
		session.delete("File.deleteFiles",num);
	}
}