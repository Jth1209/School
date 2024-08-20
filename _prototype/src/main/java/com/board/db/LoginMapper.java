package com.board.db;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface LoginMapper {
	@Select("select * from memeber where id=#{id}")
	LoginDto selectOne(String id);
	@Select("select count(*) from member where id=#{id} and pw=#{pw}")
	int checkUser(LoginDto dto);
	@Insert("insert into member (id,pw,name) values\r\n"
			+ "		(#{id},#{pw},#{name})")
	void insertUser(LoginDto dto);
	@Update("update member set\r\n"
			+ "		pw=#{pw},name=#{name}\r\n"
			+ "		where id=#{id}")
	void updateUser(LoginDto dto);
	@Delete("delete from member where id=#{id}")
	void deleteUser(int id);
}
