package sunbookstore.customer.service;

import java.sql.SQLException;

import sunbookstore.customer.dao.CustomerDao;
import sunbookstore.customer.domain.Customer;
import sunbookstore.pageBean.PageBean;

public class CustomerService {
	CustomerDao customerDao = new CustomerDao();

	/* 分页查询 */
	public PageBean<Customer> findAllCustomer(int pc,int ps)throws SQLException{
		return customerDao.findAllCustmoer(pc, ps);
	}

	/* 通过ID删除用户 */
	public int deleteCustomerByid(int cid) {
		return customerDao.deleteCustomerById(cid);
	}

}
