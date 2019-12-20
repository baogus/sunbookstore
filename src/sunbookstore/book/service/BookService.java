package sunbookstore.book.service;

import java.util.List;

import sunbookstore.book.dao.BookDao;
import sunbookstore.book.domin.Book;

public class BookService {
	BookDao bookDao  = new BookDao();
	
	
	public List<Book> selectbook(int cgid) {
		return bookDao.selectbook(cgid);
	}
	public List<Book> FindbookBybookname(String name) {
		return bookDao.FindbookBybookname(name);
		
	}
	}
