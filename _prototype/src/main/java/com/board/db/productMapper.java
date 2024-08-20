package com.board.db;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface productMapper {
	@Select("select * from (select rownum as rn,p.* from (select * from products order by id desc) p where rownum<#{num}+10) where rn>=#{num}")
	List<productpDto> selectAll(int num);
	@Select("select count(*) from products")
	int count();
	@Select("select * from products where id=#{id}")
	productDto selectOne(int id);
	@Insert("insert into products (id,name,description,price,stock) values\r\n"
			+ "		(products_a.nextval,#{name},#{description},#{price},#{stock})")
	void isnertProducts(productDto dto);
	@Update("update products set\r\n"
			+ "		name=#{name},description=#{description},price=#{price},stock=#{stock}\r\n"
			+ "		where id=#{id}")
	void updateProducts(productDto dto);
	@Delete("delete from products where id=#{id}")
	void deleteProducts(int id);
}
