package net.kzn.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.kzn.shoppingbackend.dao.CategoryDao;
import net.kzn.shoppingbackend.dto.Category;


@Repository("CategoryDao")
public class CategoryDaoImpl implements CategoryDao {

	
	private static List<Category> categories=new ArrayList<Category>();
	
	
	static {
		Category category = new Category();
		category.setId(1);
		category.setName("TV");
		category.setImageUrl("Cat_1");
		category.setDecsription("This is TV");
		categories.add(category);
		
		
		category =new Category();
		category.setId(2);
		category.setName("Laptop");
		category.setImageUrl("Cat_2");
		category.setDecsription("This is Laptop");
		categories.add(category);
		
		category =new Category();
		category.setId(3);
		category.setName("Furniture");
		category.setImageUrl("Cat_3");
		category.setDecsription("This is Sofa");
		categories.add(category);
	}
	
	
	@Override
	public List<Category> list() {
		
		return categories;
	}

}
