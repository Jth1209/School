package com.board.db;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface fileMapper {
	@Select("select * from (select rownum as rn,f.* from (select * from webhard order by num desc) f where rownum<#{num}+10) where rn >=#{num}")
	List<filepDTO> showFiles(int num);
	@Select("select count(*) from webhard")
	int count();
	@Select("select * from webhard where num=#{num}")
	fileDTO selectFile(int num);
	@Insert("insert into webhard (num,fname,ftime,fsize) values\r\n"
			+ "		(file_a.nextval,#{fname},#{ftime},#{fsize})")
	void insertFiles(fileDTO dto);
	@Delete("delete from webhard where num=#{num}")
	void deleteFiles(int num);
}
