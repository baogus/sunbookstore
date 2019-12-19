package sunbookstore.book.service;

import java.sql.SQLException;

import sunbookstore.book.dao.BookDao;
import sunbookstore.book.domin.Book;

import sunbookstore.pageBean.PageBean;

public class BookService {
	BookDao bookDao = new BookDao();
	
	//添加图书
	public int addBook(Book book) {
		return bookDao.addBook(book);
	}

	//查询所有图书分页显示
	public PageBean<Book> findAllBook(int pc, int ps) throws SQLException {		
		return bookDao.findAllBook(pc,ps);
		
	}
	//通过id删除图书
	public int deleteBookById(int bid) {
		return bookDao.deleteBookById(bid);
	}
	//模糊查询图书分页显示
	public PageBean<Book> findLikeBook(int pc, int ps,String likeString)  {
		return bookDao.findLikeBook(pc, ps, likeString);
	}
	//修改图书库存价格折扣
	public int updateBookMsg(int bid,int bcount,double bprice,double bdiscount) {
		return bookDao.updateBookMsg(bid, bcount, bprice, bdiscount);
	}
	public Book findBookById(int bid) {
		return bookDao.findBookById(bid);
	}
}
