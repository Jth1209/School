package com.board.db;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface cartMapper {
	@Select("SELECT c.id,c.product_id,p.name,p.description,p.price,p.stock,c.quantity FROM\r\n"
			+ "		products p,cart c where p.id=c.product_id order by c.id desc")
	List<cartpDTO> showCart();
	@Select("SELECT p.stock FROM products p,cart c where p.id=c.product_id and\r\n"
			+ "		c.id=#{id}")
	int selectStock(int id);
	@Select("SELECT c.quantity FROM products p,cart c where p.id=c.product_id and\r\n"
			+ "		c.id=#{id}")
	int selectQuantity(int id);
	@Select("select count(*) from cart where product_id=#{product_id}")
	int check(int product_id);
	@Insert("INSERT INTO cart (id,product_id,quantity)\r\n"
			+ "		VALUES (cart_a.nextval,#{product_id},1)")
	void insertCart(int product_id);
	@Update("UPDATE cart\r\n"
			+ "		SET quantity=quantity+1\r\n"
			+ "		WHERE id=#{id}")
	void plusQuantity(int id);
	@Update("UPDATE cart\r\n"
			+ "		SET quantity=quantity-1\r\n"
			+ "		WHERE id=#{id}")
	void minusQuantity(int id);
	@Delete("delete from cart where id=#{id}")
	void deleteCart(int id);
	@Delete("delete from cart")
	void deleteAll();
}
