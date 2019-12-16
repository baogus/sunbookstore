package sunbookstore.customer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import sunbookstore.customer.domain.Customer;
import sunbookstore.pageBean.PageBean;

public class CustomerDao {
	ComboPooledDataSource dataSource = new ComboPooledDataSource();
	Customer customer = null;
	private Connection conn=null;
	private PreparedStatement pstm  = null;
	private ResultSet rs =null;
	
	/* 查询所有用户分页显示 */
	public PageBean<Customer> findAllCustmoer(int pc, int ps)  {
		PageBean<Customer> pb = new PageBean<Customer>();
		List<Customer> customerList = new ArrayList<Customer>();
		int tr =0;
		try {
		pb.setPc(pc);
		pb.setPs(ps);
		/*
		 * 得到tr总记录数
		 */
		conn = dataSource.getConnection();
		String sql = "select count(*) from customer";
		pstm = conn.prepareStatement(sql);
		rs = pstm.executeQuery();
		while(rs.next()) {
			tr = rs.getInt(1);
		}
		pb.setTr(tr);
		/*
		 * 得到beanList得到每页记录数
		 */
			/* oracle的分页查询语法 */
		sql = "select cname,csex,ctel,caddress,cid from ( select cname,csex,ctel,caddress ,cid,rownum rn from customer where rownum<= ? order by cid ) where rn >= ?";
		pstm = conn.prepareStatement(sql);
		pstm.setInt(1, ps);
		pstm.setInt(2,(pc-1)*10);//设定每页十行记录数
		rs = pstm.executeQuery();
		while(rs.next()) {
				/* int cid = rs.getInt(1); */
			String cname = rs.getString(1);
			String csex = rs.getString(2);
			String ctel = rs.getString(3);
			String caddress = rs.getString(4);
			int cid = rs.getInt(5);
			customer = new Customer(cid,cname,csex,ctel,caddress);
			customerList.add(customer);
		}		
		pb.setBeanList(customerList);
		return pb;
	} catch(SQLException e) {
		throw new RuntimeException(e);
	}finally {
		try {
			if(conn!=null)conn.close();
			if(pstm!=null)pstm.close();
			if(rs!=null)rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
	
	public int deleteCustomerById(int cid) {
		int count = -1;
		try {
			conn = dataSource.getConnection();
			String sql = "delete from customer where cid = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, cid);
			count= pstm.executeUpdate();
			return count;
			
		} catch (SQLException e) {		
			e.printStackTrace();
			count = -1;
		}finally {
			try {
				if(conn!=null)conn.close();
				if(pstm!=null)pstm.close();
				if(rs!=null)rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
		return count;
	}
}
