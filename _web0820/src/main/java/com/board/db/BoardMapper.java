package com.board.db;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BoardMapper {
	@Select("select count(*) from board")
	int countBoard();
	@Select("select * from(select rownum as rn,b.* from (select * from board order by num desc) b where #{num}+10>=rownum) where rn>=#{num}")
	List<BoardpDto> selectBoard(int num);
}
