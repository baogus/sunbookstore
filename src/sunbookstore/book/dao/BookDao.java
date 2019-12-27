package sunbookstore.book.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mchange.v2.c3p0.ComboPooledDataSource;


import sunbookstore.book.domin.Book;


public class BookDao {
	ComboPooledDataSource dataSource = new ComboPooledDataSource();
	Connection conn = null;
	PreparedStatement pstm = null;
	ResultSet rs = null;

	//按照分类查询
	public List<Book> selectbook(int cgid) {
		Book book = null;
		List<Book> books = new ArrayList<Book>();
		
	try {
		conn = dataSource.getConnection();
		String  sql = "select * from book where cgid =?";
		pstm = conn.prepareStatement(sql);
		pstm.setInt(1, cgid);
		rs  =pstm.executeQuery();
		while(rs.next()) {
			int bid = rs.getInt(1);
			String bname = rs.getString(2);
			String bauthor=rs.getString(3) ;
			double bprice=rs.getDouble(4);
			String bdesc=rs.getString(5);
			String bimage=rs.getString(6);
			String bpub=rs.getString(7);
			int bsum=rs.getInt(9);
			
			double bdiscount=rs.getDouble(10);
			book = new Book(bid,bname,bauthor,bprice,bdesc,bimage,bpub,bsum,bdiscount);
			books.add(book);
		}
		return books;
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	return books;
	} 
	
//模糊查询
	public List<Book> FindbookBybookname(String name){
		Book bookname=null;
		List<Book> booknames = new ArrayList<Book>();
		
		try {
		conn = dataSource.getConnection();
		String  sql = "select * from book where bname like ? or bauthor like ? or bpub like ? or bdesc like ?";
		pstm = conn.prepareStatement(sql);
		pstm.setString(1, "%"+name+"%");
		pstm.setString(2, "%"+name+"%");
		pstm.setString(3,"%"+name+"%");
		pstm.setString(4, "%"+name+"%");
		rs = pstm.executeQuery();
		while(rs.next()) {
			int bid = rs.getInt(1);
			String bname = rs.getString(2);
			String bauthor=rs.getString(3) ;
			double bprice=rs.getDouble(4);
			String bdesc=rs.getString(5);
			String bimage=rs.getString(6);
			String bpub=rs.getString(7);
			int bsum=rs.getInt(9);
			double bdiscount=rs.getDouble(10);
			
			bookname = new Book(bid,bname,bauthor,bprice,bdesc,bimage,bpub,bsum,bdiscount);
			booknames.add(bookname);
		}
		return booknames;
	    }catch (SQLException e) {
			
			e.printStackTrace();
		}
		return booknames;
   }
 //按图书编号查找
	public List<Book> FindbookBybid(int bid){
		Book bookid=null;
		List<Book> bookids = new ArrayList<Book>();
		
		try {
		conn = dataSource.getConnection();
		String  sql = "select * from book where bid=?";
		pstm = conn.prepareStatement(sql);
		pstm.setInt(1, bid);	
		rs = pstm.executeQuery();
		while(rs.next()) {
			String bname = rs.getString(2);
			String bauthor=rs.getString(3) ;
			double bprice=rs.getDouble(4);
			String bdesc=rs.getString(5);
			String bimage=rs.getString(6);
			String bpub=rs.getString(7);
			int bsum=rs.getInt(9);
			double bdiscount=rs.getDouble(10);
			int cgid=rs.getInt(8);
			
			bookid = new Book(bname,bauthor,bprice,bdesc,bimage,bpub,bsum,bdiscount,cgid);
			bookids.add(bookid);
		}
		return bookids;
	    }catch (SQLException e) {
			
			e.printStackTrace();
		}
		return bookids;
   }
}

	


