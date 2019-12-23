package sunbookstore.book.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.LifecycleListener;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import sunbookstore.book.domin.Book;
import sunbookstore.category.domin.Category;
import sunbookstore.pageBean.PageBean;

public class BookDao {
	ComboPooledDataSource dataSource = new ComboPooledDataSource();
	Category category = null;
	private Connection conn=null;
	private PreparedStatement pstm  = null;
	private ResultSet rs =null;
	
	

	/* 添加图书 */
	public int addBook(Book book) {
		int count=-1;
		try {
			conn = dataSource.getConnection();
			String sql = "insert into book (bname, bauthor, bprice, bdesc, bimage, bpub, cgid, bcount,bdiscount) values (?,?,?,?,?,?,?,?,?)";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, book.getBname());
			pstm.setString(2, book.getBauthor());
			pstm.setDouble(3, book.getBprice());
			pstm.setString(4, book.getBdesc());
			pstm.setString(5, book.getBimage());
			pstm.setString(6, book.getBpub());
			pstm.setInt(7, book.getCgid());
			pstm.setInt(8, book.getBcount());
			pstm.setDouble(9, book.getBdiscount());
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
	
	public PageBean<Book> findAllBook(int pc, int ps)  {
		PageBean<Book> pb = new PageBean<Book>();
		List<Book> books = new ArrayList<Book>();
		Book book = null;
		int tr =0;
		try {
		pb.setPc(pc);
		pb.setPs(ps);
		/*
		 * 得到tr总记录数
		 */
		conn = dataSource.getConnection();
		String sql = "select count(*) from book";
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
		sql = "select bimage,bname,bauthor,bprice,bdiscount,bcount,bdesc,bpub,bid from ( select bimage,bname,bauthor,bprice,bdiscount,bcount,bdesc,bpub ,bid,rownum rn from book where rownum<= ? order by bid ) where rn >= ?";
		pstm = conn.prepareStatement(sql);
		pstm.setInt(1, ps);
		pstm.setInt(2,(pc-1)*10);
		rs = pstm.executeQuery();
		while(rs.next()) {
			String bimage = rs.getString(1);
			String bname = rs.getString(2);
			String bauthor = rs.getString(3);
			Double bprice = rs.getDouble(4);
			Double bdiscount = rs.getDouble(5);
			int bcount = rs.getInt(6);
			String bdesc = rs.getString(7);
			String bpub = rs.getString(8);
			int bid = rs.getInt(9);
		book = new Book(bname, bauthor, bprice, bdesc, bimage, bpub, bcount, bdiscount,bid);
			books.add(book);
		}		
		pb.setBeanList(books);
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
	//通过id删除图书
	public int deleteBookById(int bid) {
		int count = -1;
		try {
			conn = dataSource.getConnection();
			String sql = "delete from book where bid = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, bid);
			count =pstm.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
			count  =  -1;
		}
		return count;
	}
	
	
	/* 模糊查询图书分页显示 */
	public PageBean<Book> findLikeBook(int pc, int ps,String likeString)  {
		PageBean<Book> pb = new PageBean<Book>();
		List<Book> books = new ArrayList<Book>();
		Book book = null;
		int tr =0;
		try {
		pb.setPc(pc);
		pb.setPs(ps);
		/*
		 * 得到tr总记录数
		 */
		conn = dataSource.getConnection();
		String sql = "select count(*) from book where bname like ? or bdesc like ?";
		pstm = conn.prepareStatement(sql);
		pstm.setString(1, "%"+likeString+"%");
		pstm.setString(2, "%"+likeString+"%");
		rs = pstm.executeQuery();
		while(rs.next()) {
			tr = rs.getInt(1);
		}
		pb.setTr(tr);
		/*
		 * 得到beanList得到每页记录数
		 */
			
		sql = "select bimage,bname,bauthor,bprice,bdiscount,bcount,bdesc,bpub,bid from ( select bimage,bname,bauthor,bprice,bdiscount,bcount,bdesc,bpub ,bid,rownum rn from book where rownum<= ? order by bid ) where rn >= ? and bname like ? or bdesc like ?";
		pstm = conn.prepareStatement(sql);
		pstm.setInt(1, ps);
		pstm.setInt(2,(pc-1)*10);
		pstm.setString(3, "%"+likeString+"%");
		pstm.setString(4, "%"+likeString+"%");
		rs = pstm.executeQuery();
		while(rs.next()) {
			String bimage = rs.getString(1);
			String bname = rs.getString(2);
			String bauthor = rs.getString(3);
			Double bprice = rs.getDouble(4);
			Double bdiscount = rs.getDouble(5);
			int bcount = rs.getInt(6);
			String bdesc = rs.getString(7);
			String bpub = rs.getString(8);
			int bid = rs.getInt(9);
		book = new Book(bname, bauthor, bprice, bdesc, bimage, bpub, bcount, bdiscount,bid);
			books.add(book);
		}		
		pb.setBeanList(books);
		return pb;
	} catch(SQLException e) {
		throw new RuntimeException(e);
	}finally {
		try {
			if(conn!=null)conn.close();
			if(pstm!=null)pstm.close();
			if(rs!=null)rs.close();
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
	
}

	}
	
	//通过id删除图书
		public int updateBookMsg(int bid,int bcount,double bprice,double bdiscount) {
			int count = -1;
			try {
				conn = dataSource.getConnection();
				String sql = "update book set bprice = ?,bdiscount = ?,bcount=? where bid=?";
				pstm = conn.prepareStatement(sql);
				pstm.setDouble(1, bprice);
				pstm.setDouble(2, bdiscount);
				pstm.setInt(3, bcount);
				pstm.setInt(4, bid);
				count =pstm.executeUpdate();
			} catch (SQLException e) {
				
				e.printStackTrace();
				count  =  -1;
			}
			return count;
		}
		//通过id查询询图书
		public Book findBookById(int bid) {
			Book book  =null;
			try {
				conn = dataSource.getConnection();
				String sql = "select bimage,bname,bauthor,bprice,bdiscount,bcount,bdesc,bpub from book where bid = ?";
				pstm = conn.prepareStatement(sql);	
				pstm.setInt(1, bid);
				rs = pstm.executeQuery();
				while (rs.next()) {
					String bimage = rs.getString(1);
					String bname = rs.getString(2);
					String bauthor = rs.getString(3);
					Double bprice = rs.getDouble(4);
					Double bdiscount = rs.getDouble(5);
					int bcount = rs.getInt(6);
					String bdesc = rs.getString(7);
					String bpub = rs.getString(8);
					book = new Book(bname, bauthor, bprice, bdesc, bimage, bpub, bcount, bdiscount, bid);
					return book;
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
				
			}
			return book;
		}
	
}
