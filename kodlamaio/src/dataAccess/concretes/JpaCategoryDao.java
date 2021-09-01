package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.CategoryDao;
import entities.concretes.Category;

public class JpaCategoryDao implements CategoryDao{
	
	
	List<Category> categories;
	
	public JpaCategoryDao() {
		super();
		this.categories = new ArrayList<Category>();
	}

	@Override
	public List<Category> getAll() {
		// TODO Auto-generated method stub
		return this.categories;
	}

	@Override
	public void add(Category entity) {
		this.categories.add(entity);
	}

	@Override
	public void update(Category entity) {
		int index = this.categories.indexOf(entity);
        Category category = this.categories.get(index);

        category.setId(entity.getId());
        category.setName(entity.getName());
	}

	@Override
	public void delete(Category entity) {
		this.categories.remove(entity);
	}

}
