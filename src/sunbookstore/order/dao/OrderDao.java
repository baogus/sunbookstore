package sunbookstore.order.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;



import com.mchange.v2.c3p0.ComboPooledDataSource;

import sunbookstore.book.domin.Book;
import sunbookstore.order.domin.Book_Order;
import sunbookstore.order.domin.Order;
import sunbookstore.order.domin.Orders;
import sunbookstore.shopcart.domin.PageBean;

public class OrderDao {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	ComboPooledDataSource dataSource = new ComboPooledDataSource();
	
	//修改书籍的库存信息
		public int updateBookBcount(Book book) {
			int i = -1;
			try {
			
				conn = dataSource.getConnection();
				String sql = "update book set bcount -=? where bid = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, book.getBcount());
				pstmt.setInt(2,book.getBid());
				
				i = pstmt.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if (rs != null)rs.close();
					if (pstmt != null)pstmt.close();
					if (conn != null)conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			return i;
		}
	
	//修改订单中的状态信息
	public int updateOrderOstate(Order order) {
		int i = -1;
		try {
		
			conn = dataSource.getConnection();
			String sql = "update order1 set ostate=? where oid = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, order.getOstate());
			pstmt.setDouble(2,order.getOid());
			
			i = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)rs.close();
				if (pstmt != null)pstmt.close();
				if (conn != null)conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return i;
	}
	
	//增加订单详细信息
		public int insertBook_Order(Book_Order book_Order) {
			//System.out.println(date.getTime());
			int i = -1;
			try {
			
				conn = dataSource.getConnection();
				String sql = " insert into book_order (oid,bid,otime,osubtotal,onum) values(?,?,?,?,?)";
				pstmt = conn.prepareStatement(sql);
				pstmt.setDouble(1,book_Order.getOid());
				pstmt.setInt(2, book_Order.getBid() );
				pstmt.setDate(3,book_Order.getOtime());
				pstmt.setInt(4,book_Order.getOsubtotal()  );
				pstmt.setInt(5, book_Order.getOnum());
				i = pstmt.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if (rs != null)rs.close();
					if (pstmt != null)pstmt.close();
					if (conn != null)conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			return i;
		}
	
	//增加订单基本信息
	public int insertOrder(Order order) {
		int i = -1;
		try {
			conn = dataSource.getConnection();
			String sql = " insert into order1 values(?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setDouble(1,order.getOid() );
			pstmt.setInt(2,  order.getCid());
			pstmt.setString(3,  order.getOstate());
			i = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)rs.close();
				if (pstmt != null)pstmt.close();
				if (conn != null)conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return i;
	}
	
	
	//根据订单号删除该订单
		public int deleteOrder(double oid) {
			int i = -1;
			try {
				conn = dataSource.getConnection();
				String sql = "delete from order1 where oid=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setDouble(1,  oid);
				i = pstmt.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if (rs != null)rs.close();
					if (pstmt != null)pstmt.close();
					if (conn != null)conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			return i;
		}
	
	//根据订单号删除该订单明细
	public int deleteBook_Order(double oid) {
		int i = -1;
		try {
			conn = dataSource.getConnection();
			String sql = "delete from book_order where oid=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setDouble(1,  oid);
			i = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)rs.close();
				if (pstmt != null)pstmt.close();
				if (conn != null)conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return i;
	}
	
	//分页查询用户的订单
	public PageBean<Orders> queryOrderByPage(int cid,PageBean<Orders> pageBean) {
		List<Orders> orders = new ArrayList<Orders>();
		PageBean<Orders> pageBean1 = new PageBean<Orders>();
		Orders order = null;
		int tr = queryOrderById(cid);
		int pc = pageBean.getPc();
		int ps = pageBean.getPs(); 
		try {
			conn = dataSource.getConnection();
			String sql = "select * from (select rownum r,t.* from (select customer.cid,book.bid,order1.oid,otime,bimage,bname,bprice,cname,caddress,ostate,onum,osubtotal from customer left join order1 on order1.cid = customer.cid left join book_order on book_order.oid=order1.oid left join book on book_order.bid=book.bid where customer.cid = ? ) t) where r>=(?-1)*?+1 and r<=?*?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,  cid);
			pstmt.setInt(2,  pc);
			pstmt.setInt(3,  ps);
			pstmt.setInt(4,  pc);
			pstmt.setInt(5,  ps);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int bid = rs.getInt("bid");
				double oid = rs.getDouble("oid");
				Date otime = rs.getDate("otime");
				String bimage = rs.getString("bimage");
				String bname = rs.getString("bname");
				int bprice = rs.getInt("bprice");
				String cname = rs.getString("cname");
				String caddress = rs.getString("caddress");
				String ostate = rs.getString("ostate");
				int onum = rs.getInt("onum");
				int osubtotal = rs.getInt("osubtotal");
				order = new Orders(cid, bid, oid, otime, bimage, bname, bprice, cname, caddress, ostate, onum, osubtotal);
				orders.add(order);
			}
			pageBean1.setPc(pc);
			pageBean1.setPs(ps);
			pageBean1.setTr(tr);
			pageBean1.setBeanList(orders);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)rs.close();
				if (pstmt != null)pstmt.close();
				if (conn != null)conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return pageBean1;
	}
	//根据oid查询某用户的某一订单
	public List<Orders> PayOrder(double oid) {
		List<Orders> orders = new ArrayList<Orders>();
		Orders order = null;
		try {
			conn = dataSource.getConnection();
			String sql = "select book.bid,otime,bimage,bname,bprice,cname,caddress,onum,osubtotal,bdiscount,ostate from  customer left join order1 on order1.cid = customer.cid left join book_order on book_order.oid=order1.oid left join book on book_order.bid=book.bid where order1.oid =?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setDouble(1,  oid);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int bid = rs.getInt("bid");
				Date otime = rs.getDate("otime");
				String bimage = rs.getString("bimage");
				String bname = rs.getString("bname");
				int bprice = rs.getInt("bprice");
				String cname = rs.getString("cname");
				String caddress = rs.getString("caddress");
				int onum = rs.getInt("onum");
				int osubtotal = rs.getInt("osubtotal");
				int bdiscount = rs.getInt("bdiscount");
				String ostate = rs.getString("ostate");
				order = new Orders( bid, oid, otime, bimage, bname, bprice, cname, caddress, onum, osubtotal,bdiscount,ostate);
				orders.add(order);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)rs.close();
				if (pstmt != null)pstmt.close();
				if (conn != null)conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return orders;
	}
	
	//根据用户的cid查找用户的全部订单 
	public List<Orders> queryOrderAll(int cid) {
		List<Orders> orders = new ArrayList<Orders>();
		Orders order = null;
		try {
			conn = dataSource.getConnection();
			String sql = "select customer.cid,book.bid,order1.oid,otime,bimage,"+
					"bname,bprice,cname,caddress,ostate,onum,osubtotal from customer" + 
					"left join order1 on order1.cid = customer.cid" + 
					"left join book_order on book_order.oid=order1.oid"+ 
					"left join book on book_order.bid=book.bid "+ 
					"where customer.cid = ?";
			String sqlString = "select customer.cid,book.bid,order1.oid,otime, bimage,bname,bprice,cname,caddress,ostate,onum,osubtotal from  customer left join order1 on order1.cid = customer.cid left join book_order on book_order.oid=order1.oid left join book on book_order.bid=book.bid where customer.cid =?";
			pstmt = conn.prepareStatement(sqlString);
			pstmt.setInt(1,  cid);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int bid = rs.getInt("bid");
				double oid = rs.getDouble("oid");
				Date otime = rs.getDate("otime");
				String bimage = rs.getString("bimage");
				String bname = rs.getString("bname");
				int bprice = rs.getInt("bprice");
				String cname = rs.getString("cname");
				String caddress = rs.getString("caddress");
				String ostate = rs.getString("ostate");
				int onum = rs.getInt("onum");
				int osubtotal = rs.getInt("osubtotal");
				order = new Orders(cid, bid, oid, otime, bimage, bname, bprice, cname, caddress, ostate, onum, osubtotal);
				orders.add(order);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)rs.close();
				if (pstmt != null)pstmt.close();
				if (conn != null)conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return orders;
	}
	
	// 根据cid判断用户是不是产生了订单
		public int queryOrderById( int cid) {
			int i = -1;
			try {
				conn = dataSource.getConnection();
				String sql = "select count(*) from order1 where cid=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1,  cid);
				rs = pstmt.executeQuery();
				while (rs.next()) {
					i = rs.getInt(1);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if (rs != null)rs.close();
					if (pstmt != null)pstmt.close();
					if (conn != null)conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			return i;
		}
}
