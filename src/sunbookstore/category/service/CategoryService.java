package sunbookstore.category.service;

<<<<<<< HEAD
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.table.TableStringConverter;

import exception.UserException;
import sunbookstore.category.dao.CategoryDao;
import sunbookstore.category.domain.Category;
import sunbookstore.pageBean.PageBean;

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
	
	/* 通过ID删除分类 */
	public int deleteById(int cgid) {
		return categoryDao.deleteById(cgid);
		
	}
	//分页查询所有
		public PageBean<Category> selectAllCategory(int pc, int ps) throws SQLException {		
			return categoryDao.findAllCategory(pc,ps);
			
		}
		/* 查询所有分类 */
		public int findCategoryByName1(String cgname) {
			return categoryDao.findCategoryByName1(cgname);
		}
=======
import java.util.List;

import sunbookstore.category.dao.CategoryDao;
import sunbookstore.category.domin.Category;

public class CategoryService {
	CategoryDao categoryDao = new CategoryDao();
	
	
	public List<Category> selectCategory() {
		return categoryDao.selectCategory();
	}
>>>>>>> xr

}
