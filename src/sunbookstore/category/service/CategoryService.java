package sunbookstore.category.service;

import java.sql.ResultSet;
import java.util.List;

import exception.UserException;
import sunbookstore.category.dao.CategoryDao;
import sunbookstore.category.domain.Category;

public class CategoryService {
	CategoryDao categoryDao = new CategoryDao();
	
	/* 添加分类 */
	public void addCategory(String cgname) throws UserException {
		
		String name = categoryDao.findCategoryByName(cgname);
		if(name!=null) throw new UserException("该分类已存在！");
		else {
			int count = categoryDao.addCategory(cgname);
		}	
	}
	
	/* 查询所有分类 */
	public List<Category> findAll() {
		return categoryDao.findAll();
	}

}
