package sunbookstore.order.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import sunbookstore.order.domin.Orders;

public class OrderDao {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	ComboPooledDataSource dataSource = new ComboPooledDataSource();
	
	//
	//根据订单号删除该订单
		public int deleteOrder(int oid) {
			int i = -1;
			try {
				conn = dataSource.getConnection();
				String sql = "delete from order1 where oid=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1,  oid);
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
	public int deleteBook_Order(int oid) {
		int i = -1;
		try {
			conn = dataSource.getConnection();
			String sql = "delete from book_order where oid=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,  oid);
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
				int oid = rs.getInt("oid");
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
