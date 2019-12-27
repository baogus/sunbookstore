package sunbookstore.book_order.service;


import sunbookstore.book_order.dao.Book_orderDao;


public class Book_orderSevice {
	Book_orderDao book_order = new Book_orderDao();
	
	public int Orderbookcount(int bid) {
		return book_order.Orderbookcount(bid);
	}
}
