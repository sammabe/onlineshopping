package net.kzn.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import net.kzn.shoppingbackend.dao.CatedoryDao;
import net.kzn.shoppingbackend.dto.Category;

public class CategoryDaoImpl implements CatedoryDao {

	
	private static List<Category> categories=new ArrayList<Category>();
	
	
	static {
		Category category = new Category();
		category.setId(1);
		category.setName("TV");
		category.setImageUrl("Cat_1");
		category.setDecsription("This is TV");
		categories.add(category);
	}
	@Override
	public List<Category> list() {
		
		return null;
	}

}
