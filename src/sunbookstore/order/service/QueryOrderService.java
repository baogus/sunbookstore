package sunbookstore.order.service;

import java.util.List;

import sunbookstore.order.dao.OrderDao;
import sunbookstore.order.domin.Orders;

public class QueryOrderService {
	OrderDao orderDao  = new OrderDao();
	public int queryOrderById(int cid) {
		return orderDao.queryOrderById(cid);
		/*if (result > 0) {//说明用户的订单表中是有数据的
			return true;
		}else {
			return false;//说明用户的订单表中是空的
		}*/
	}
	public List<Orders> queryOrderAll(int cid){
		return orderDao.queryOrderAll(cid);
	}
	/*
	 * response.setContentType("text/html; charset=UTF-8");
	 * response.setCharacterEncoding("utf-8");
	 */
}
