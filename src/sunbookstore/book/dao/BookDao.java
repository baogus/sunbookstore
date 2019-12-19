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
			int bprice=rs.getInt(4);
			String bdesc=rs.getString(5);
			String bimage=rs.getString(6);
			String bpub=rs.getString(7);
			int bsum=rs.getInt(9);
			int bdiscount=rs.getInt(10);
			book = new Book(bid,bname,bauthor,bprice,bdesc,bimage,bpub,bsum,bdiscount);
			books.add(book);
		}
		return books;
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	return books;
	} 
	
//按照书名模糊查询
	public List<Book> FindbookBybookname(String name){
		Book bookname=null;
		List<Book> booknames = new ArrayList<Book>();
		
		try {
		conn = dataSource.getConnection();
		String  sql = "select * from book where bname like ?";
		pstm = conn.prepareStatement(sql);
		pstm.setString(1, "%"+name+"%");
		rs  =pstm.executeQuery();
		while(rs.next()) {
			int bid = rs.getInt(1);
			String bname = rs.getString(2);
			String bauthor=rs.getString(3) ;
			int bprice=rs.getInt(4);
			String bdesc=rs.getString(5);
			String bimage=rs.getString(6);
			String bpub=rs.getString(7);
			int bsum=rs.getInt(9);
			int bdiscount=rs.getInt(10);
			bookname = new Book(bid,bname,bauthor,bprice,bdesc,bimage,bpub,bsum,bdiscount);
			booknames.add(bookname);
		}
		return booknames;
	    }catch (SQLException e) {
			
			e.printStackTrace();
		}
		return booknames;
   }
}

	


