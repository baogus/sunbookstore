package sunbookstore.order.service;

import sunbookstore.order.dao.OrderDao;
import sunbookstore.order.domin.Book_Order;
import sunbookstore.order.domin.Order;

public class InsertOrderService {
	OrderDao orderDao = new OrderDao();
	public int insertOrder(Order order,Book_Order book_Order) {
		if (orderDao.insertOrder(order) > 0) {
			return orderDao.insertBook_Order(book_Order);
		}else {
			return -1;
		}
	}
	
}
