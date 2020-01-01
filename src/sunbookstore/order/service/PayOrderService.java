package sunbookstore.order.service;

import java.util.List;

import sunbookstore.order.dao.OrderDao;
import sunbookstore.order.domin.Orders;

public class PayOrderService {
	OrderDao orderDao = new OrderDao();
	public List<Orders> PayOrder( double oid){
		return orderDao.PayOrder(oid);
	}
}
