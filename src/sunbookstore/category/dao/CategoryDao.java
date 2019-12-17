package sunbookstore.category.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import sunbookstore.category.domin.Category;



public class CategoryDao {
	ComboPooledDataSource dataSource = new ComboPooledDataSource();
	Connection conn = null;
	PreparedStatement pstm = null;
	ResultSet rs = null;
	
	public List<Category> selectCategory() {
		Category category = null;
		List<Category> categories = new ArrayList<Category>();
		
	try {
		conn = dataSource.getConnection();
		String  sql = "select cgid,cgname  from category";
		pstm = conn.prepareStatement(sql);
		rs  =pstm.executeQuery();
		while(rs.next()) {
			int cgid = rs.getInt(1);
			String cgname = rs.getString(2);
			category  = new Category(cgid,cgname);
			categories.add(category);
		}
		return categories;
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	return categories;
	} 

}
