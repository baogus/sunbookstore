package sunbookstore.shopcart.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.sun.org.apache.regexp.internal.recompile;

import sunbookstore.shopcart.domin.PageBean;
import sunbookstore.shopcart.domin.Shop;
import sunbookstore.shopcart.domin.Shop_Book;

public class ShopCartDao {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	ComboPooledDataSource dataSource = new ComboPooledDataSource();
	
	//查找书库中的书籍的数目
		public int queryBcountById(int bid) {
			int i = -1;
			try {
				conn = dataSource.getConnection();
				String sql = "select bcount from book where bid=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, bid);
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
					if (rs != null)
						rs.close();
					if (pstmt != null)
						pstmt.close();
					if (conn != null)
						conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			return i;
		}
	
	// 根据bid查找购物车中是不是有同样得一本书
	public int queryShop_BookById(Shop_Book shop_Book) {
		int i = -1;
		try {
			conn = dataSource.getConnection();
			String sql = "select count(*) from shop_book where sid=?and bid=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, shop_Book.getSid());
			pstmt.setInt(2, shop_Book.getBid());

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
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return i;
	}
	
	// 修改shop_book中的sbnum的值
		public int updateShop_BookSum(Shop_Book shop_Book) {
			int i = -1;
			try {
				conn = dataSource.getConnection();
				String sql = "update shop_book set sbnum=sbnum+? where bid=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, shop_Book.getSbnum());
				pstmt.setInt(2, shop_Book.getBid());
				i = pstmt.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if (rs != null)
						rs.close();
					if (pstmt != null)
						pstmt.close();
					if (conn != null)
						conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			return i;
		}
	// 修改shop_book中的sbnum的值
	public int updateShop_Book(Shop_Book shop_Book) {
		int i = -1;
		try {
			conn = dataSource.getConnection();
			String sql = "update shop_book set sbnum=? where bid=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, shop_Book.getSbnum());
			pstmt.setInt(2, shop_Book.getBid());
			i = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return i;
	}

	// 刪除shop_book中的信息
	public int deleteShop_Book(Shop_Book shop_Book) {
		int i = -1;
		try {
			conn = dataSource.getConnection();
			String sql = "delete from shop_book where sid=? and bid=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, shop_Book.getSid());
			pstmt.setInt(2, shop_Book.getBid());
			System.out.println(shop_Book.getSid());
			System.out.println(shop_Book.getBid());
			i = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return i;
	}
	
	//删除购物车中的物品
	public int deleteShop_BookById(int sid) {
		int i = -1;
		try {
			conn = dataSource.getConnection();
			String sql = "delete from shop_book where sid=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, sid);
			i = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return i;
	}
	
	// 向shop_book中添加书籍的信息
	public int insertShop_Book(Shop_Book shop_Book) {
		int i = -1;
		try {
			conn = dataSource.getConnection();
			String sql = "insert into shop_book values (?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, shop_Book.getSid());
			pstmt.setInt(2, shop_Book.getBid());
			pstmt.setInt(3, shop_Book.getSbnum());
			i = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return i;

	}

	// 判断购物车条目是不是为空
	public int shop_BookISExist(int sid) {
		int result = -1;
		try {
			conn = dataSource.getConnection();
			String sql = "select count(*) from shop_book where sid=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, sid);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				result = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	// 判断是不是第一次加入购物车
	public boolean isExist(int cid) {
		return queryShopById(cid) == 0 ? false : true;
	}

	// 根据用户的ID，查询购物车编号
	public int queryShopById(int cid) {
		int sid = 0;
		try {
			conn = dataSource.getConnection();
			String sql = "select * from shoppingcart where cid=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, cid);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				sid = rs.getInt("sid");
			}
			return sid;
		} catch (SQLException e) {
			e.printStackTrace();
			return sid;
		} catch (Exception e) {
			e.printStackTrace();
			return sid;
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	// 如果用户是第一次使用购物车，则在购物车添加一个对应的购物车编号
	public boolean insertShopCart(int cid) {
		int i = 0;
		boolean result = false;
		try {
			conn = dataSource.getConnection();
			String sql = "insert into shop values(?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, cid);
			pstmt.setInt(2, cid);
			i = pstmt.executeUpdate();
			if (i > 0) {
				result = true;
			}
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return result;
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	//根据购物车编号查询购物车中的总数据量
	public int getTotalCount(int sid) {
		int total = 0;
		try {
			conn = dataSource.getConnection();
			String sql = "select count(*) from shop_book where sid=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, sid);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				total = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return total;
	}
	
	//根据购物车编号联合多表分页查询shopcart
		public PageBean<Shop> queryShopCartByPage(int sid,PageBean<Shop> pageBean) {
			PageBean<Shop> pageBean1 = new PageBean<Shop>();
			List<Shop> shops = new ArrayList<>();
			Shop shop = null;
			int tr = shop_BookISExist(sid);
			int pc = pageBean.getPc();
			int ps = pageBean.getPs();
				try {
					conn = dataSource.getConnection();
					String sql = "select * from (select rownum r,t.* from (select shop_book.bid,bname,bprice,bimage,bdiscount,sbnum from shop_book,book where sid=? and shop_book.bid = book.bid) t) s where r>=(?-1)*?+1 and r<=?*?";
					pstmt = conn.prepareStatement(sql);
					pstmt.setInt(1, sid);
					pstmt.setInt(2, pc);
					pstmt.setInt(3, ps);
					pstmt.setInt(4, pc);
					pstmt.setInt(5, ps);
					rs = pstmt.executeQuery();
					while (rs.next()) {
						int bid = rs.getInt("bid");
						String bname = rs.getString("bname");
						int bprice = rs.getInt("bprice");
						String bimage = rs.getString("bimage");
						int bdiscount = rs.getInt("bdiscount");
						int sbnum = rs.getInt("sbnum");
						shop = new Shop(sid,bid, sbnum, bname, bprice, bimage, bdiscount);
						shops.add(shop);
					}
					pageBean1.setTr(tr);
					pageBean1.setPc(pc);
					pageBean1.setPs(ps);
					pageBean1.setBeanList(shops);
					return pageBean1;
				} catch (SQLException e) {
					e.printStackTrace();
					return null;
				} catch (Exception e) {
					e.printStackTrace();
					return null;
				} finally {
					try {
						if (rs != null)
							rs.close();
						if (pstmt != null)
							pstmt.close();
						if (conn != null)
							conn.close();
					} catch (SQLException e) {
						e.printStackTrace();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
	
	//根据购物车编号联合多表查询shopcart
	public List<Shop> queryShopCart(int sid) {
		List<Shop> shops = new ArrayList<>();
		Shop shop = null;
				
			try {
				conn = dataSource.getConnection();
				String sql = "select shop_book.bid,bname,bprice,bimage,bdiscount,sbnum from shop_book,book "
						+ "where sid=? and shop_book.bid = book.bid";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, sid);
				rs = pstmt.executeQuery();
				while (rs.next()) {
					int bid = rs.getInt("bid");
					String bname = rs.getString("bname");
					int bprice = rs.getInt("bprice");
					String bimage = rs.getString("bimage");
					int bdiscount = rs.getInt("bdiscount");
					int sbnum = rs.getInt("sbnum");
					shop = new Shop(sid,bid, sbnum, bname, bprice, bimage, bdiscount);
					shops.add(shop);
				}
				return shops;
			} catch (SQLException e) {
				e.printStackTrace();
				return null;
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			} finally {
				try {
					if (rs != null)
						rs.close();
					if (pstmt != null)
						pstmt.close();
					if (conn != null)
						conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	
	// 根据购物车编号查询shop_book内容
	public Shop_Book queryShop_Book(int sid) {
		Shop_Book shop_Book = new Shop_Book();
		try {
			conn = dataSource.getConnection();
			String sql = "select * from shop_book where sid=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, sid);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int bid = rs.getInt("bid");
				int sbnum = rs.getInt("sbnum");
				shop_Book = new Shop_Book(sid, bid, sbnum);
			}
			return shop_Book;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
