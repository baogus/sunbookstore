package sunbookstore.order.service;

import sunbookstore.order.dao.OrderDao;

public class DeleteOrderService {
	OrderDao orderDao = new OrderDao();
	//删除订单的明细
	public int deleteBook_Order(int oid) {
		return orderDao.deleteBook_Order(oid);
	}
	//删除订单
	public int deleteOrder(int oid) {
		return orderDao.deleteOrder(oid);
	}
}
