package du.db;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface memberMapper {
	@Select("select * from members where email=#{email} and password=#{password}")
	memberDTO selectOne(memberDTO dto);
	
	@Select("select count(*) FROM members where email=#{email} and password=#{password}")
	int checkUser(memberDTO dto);
	
	@Insert("insert into members (member_id,name,email,password) values\r\n"
			+ "		(#{member_id},#{name},#{email},#{password})")
	void insertUser(memberDTO dto);
	
	@Update("update members set\r\n"
			+ "		password=#{password},name=#{name},email=#{email}\r\n"
			+ "		where member_id=#{member_id}")
	void updateUser(memberDTO dto);
	
	@Delete("delete from members where member_id=#{member_id}")
	void deleteUser(String member_id);
}
