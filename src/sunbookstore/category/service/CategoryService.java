package sunbookstore.category.service;

import java.util.List;

import sunbookstore.category.dao.CategoryDao;
import sunbookstore.category.domin.Category;

public class CategoryService {
	CategoryDao categoryDao = new CategoryDao();
	
	
	public List<Category> selectCategory() {
		return categoryDao.selectCategory();
	}

}
