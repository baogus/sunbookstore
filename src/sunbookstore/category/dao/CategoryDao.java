package sunbookstore.category.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.sun.org.apache.regexp.internal.recompile;
import com.sun.prism.paint.RadialGradient;

import sunbookstore.category.domain.Category;

public class CategoryDao {
	ComboPooledDataSource dataSource = new ComboPooledDataSource();
	Category category = null;
	private Connection conn=null;
	private PreparedStatement pstm  = null;
	private ResultSet rs =null;
	
	/* 添加分类 */
	public int addCategory(String cgname) {
		int count=-1;
		try {
			conn = dataSource.getConnection();
			String sql = "insert into category (cgname) values (?)";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, cgname);
			count= pstm.executeUpdate();
			return count;
			
		} catch (SQLException e) {		
			e.printStackTrace();
			count = -1;
		}
		return count;
	}

	/* 通过分类名查询分类 */
	public String findCategoryByName(String name) {
		String cgname = null;
		try {
			conn = dataSource.getConnection();
			String sql = "select cgname from category where cgname=?";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, name);
			rs= pstm.executeQuery();
			while (rs.next()) {
				cgname = rs.getString(1);
				
			}
			return cgname;
			
		
			
		} catch (SQLException e) {		
			e.printStackTrace();
			return null;
		}
	}

	/* 查询所有分类 */
	public List<Category> findAll() {
		List<Category> categories = new ArrayList<Category>();
		try {
			conn = dataSource.getConnection();
			String sql = "select * from category order by cgid ";
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			while(rs.next()) {
				int cgid = rs.getInt(1);
				String cgname = rs.getString(2);
				category = new Category(cgid,cgname);
				categories.add(category);
			}
			return categories;
			
		} catch (SQLException e) {		
			e.printStackTrace();
			return null;
		}
	}

}
