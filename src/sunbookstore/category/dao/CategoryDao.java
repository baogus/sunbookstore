package sunbookstore.category.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



import com.mchange.v2.c3p0.ComboPooledDataSource;

import sunbookstore.category.domain.Category;
import sunbookstore.pageBean.PageBean;


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
		}finally {
			try {
				if(conn!=null)conn.close();
				if(pstm!=null)pstm.close();
				if(rs!=null)rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
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
		}finally {
			try {
				if(conn!=null)conn.close();
				if(pstm!=null)pstm.close();
				if(rs!=null)rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}}

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
		}finally {
			try {
				if(conn!=null)conn.close();
				if(pstm!=null)pstm.close();
				if(rs!=null)rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	/* 删除分类 */
	public int deleteById(int cgid) {
		int count = -1;
		try {
			conn = dataSource.getConnection();
			String sql = "delete from category where cgid = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, cgid);
			count= pstm.executeUpdate();
			return count;
			
		} catch (SQLException e) {		
			e.printStackTrace();
			count = -1;
		}finally {
			try {
				if(conn!=null)conn.close();
				if(pstm!=null)pstm.close();
				if(rs!=null)rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		return count;	
	
	}
	
	public PageBean<Category> findAllCategory(int pc, int ps)  {
		PageBean<Category> pb = new PageBean<Category>();
		List<Category> categorieList = new ArrayList<Category>();
		int tr =0;
		try {
		pb.setPc(pc);
		pb.setPs(ps);
		/*
		 * 得到tr总记录数
		 */
		conn = dataSource.getConnection();
		String sql = "select count(*) from category";
		pstm = conn.prepareStatement(sql);
		rs = pstm.executeQuery();
		while(rs.next()) {
			tr = rs.getInt(1);
		}
		pb.setTr(tr);
		/*
		 * 得到beanList得到每页记录数
		 */
			/* oracle的分页查询语法 */
		sql = "select cgid,cgname from ( select cgid,cgname ,rownum rn from category where rownum<= ? order by cgid ) where rn >= ?";
		pstm = conn.prepareStatement(sql);
		pstm.setInt(1, ps);
		pstm.setInt(2,(pc-1)*10);
		rs = pstm.executeQuery();
		while(rs.next()) {
			int cgid = rs.getInt(1);
			String cgname = rs.getString(2);
			category = new Category(cgid,cgname);
			categorieList.add(category);
		}		
		pb.setBeanList(categorieList);
		return pb;
	} catch(SQLException e) {
		throw new RuntimeException(e);
	}finally {
		try {
			if(conn!=null)conn.close();
			if(pstm!=null)pstm.close();
			if(rs!=null)rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
}

	}
	
	/* 通过分类名查询分类编号 */
	public int findCategoryByName1(String name) {
		int cgid = -1;
		try {
			conn = dataSource.getConnection();
			String sql = "select cgid from category where cgname=?";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, name);
			rs= pstm.executeQuery();
			while (rs.next()) {
				cgid = rs.getInt(1);			
			}
			return cgid;		
			
		} catch (SQLException e) {		
			e.printStackTrace();
			return -1;
		}finally {
			try {
				if(conn!=null)conn.close();
				if(pstm!=null)pstm.close();
				if(rs!=null)rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}}
	
}
