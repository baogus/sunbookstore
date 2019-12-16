package sunbookstore.customer.service;

import java.sql.SQLException;

import sunbookstore.customer.dao.CustomerDao;
import sunbookstore.customer.domain.Customer;
import sunbookstore.pageBean.PageBean;

public class CustomerService {
	CustomerDao customerDao = new CustomerDao();

	/* 查询所有分页显示*/
	public PageBean<Customer> findAllCustomer(int pc,int ps)throws SQLException{
		return customerDao.findAllCustmoer(pc, ps);
	}

	/* 通过ID删除用户 */
	public int deleteCustomerByid(int cid) {
		return customerDao.deleteCustomerById(cid);
	}
	/* 通过姓名模糊查询分页显示 */
	public PageBean<Customer> selectLikeByname(int pc,int ps,String likeString)throws SQLException{
		return customerDao.selectLikeByname(pc, ps,likeString);
	}
}
