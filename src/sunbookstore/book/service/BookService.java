package sunbookstore.book.service;

import sunbookstore.book.dao.BookDao;

public class BookService {
	BookDao bookDao  = new BookDao();
	
	public int GetBookCGid() {
		String cgname = null;
		return bookDao.GetBookCGid(cgname);
	}
}
