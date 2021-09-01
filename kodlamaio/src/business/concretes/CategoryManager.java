package business.concretes;

import java.util.List;

import business.abstracts.CategoryService;
import dataAccess.abstracts.CategoryDao;
import entities.concretes.Category;

public class CategoryManager implements CategoryService{
	
	CategoryDao categoryDao;
	
	public CategoryManager(CategoryDao categoryDao) {
		super();
		this.categoryDao = categoryDao;
	}

	@Override
	public List<Category> getAll() {
		
		return this.categoryDao.getAll();
	}

	@Override
	public void add(Category category) {
		this.categoryDao.add(category);
	}

	@Override
	public void update(Category category) {
		this.categoryDao.update(category);
		
	}

	@Override
	public void delete(Category category) {
		this.categoryDao.delete(category);
		
	}
}
