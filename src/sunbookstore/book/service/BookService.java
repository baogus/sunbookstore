package sunbookstore.book.service;

import java.sql.SQLException;

import sunbookstore.book.dao.BookDao;
import sunbookstore.book.domin.Book;

import sunbookstore.pageBean.PageBean;

public class BookService {
	BookDao bookDao = new BookDao();
	public int addBook(Book book) {
		return bookDao.addBook(book);
	}

	
	public PageBean<Book> findAllBook(int pc, int ps) throws SQLException {		
		return bookDao.findAllBook(pc,ps);
		
	}
}
