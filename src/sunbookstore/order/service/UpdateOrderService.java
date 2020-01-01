package sunbookstore.order.service;

import sunbookstore.order.dao.OrderDao;
import sunbookstore.order.domin.Order;

public class UpdateOrderService {
	
	OrderDao orderDao = new OrderDao();
	
	public int updateOrder1Ostate(Order order) {
		return orderDao.updateOrderOstate(order);
	}
}
