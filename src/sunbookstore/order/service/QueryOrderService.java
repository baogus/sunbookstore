package sunbookstore.order.service;

import java.util.List;

import sunbookstore.order.dao.OrderDao;
import sunbookstore.order.domin.Orders;
import sunbookstore.shopcart.domin.PageBean;

public class QueryOrderService {
	OrderDao orderDao  = new OrderDao();
	public int queryOrderById(int cid) {
		return orderDao.queryOrderById(cid);
		
	}
	public List<Orders> queryOrderAll(int cid){
		return orderDao.queryOrderAll(cid);
	}
	
	//分页查询
	public PageBean<Orders> queryOrderByPage(int cid,PageBean<Orders> pageBean){
		return orderDao.queryOrderByPage(cid,pageBean);
	}
}
