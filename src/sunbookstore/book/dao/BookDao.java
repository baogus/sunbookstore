package sunbookstore.book.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import sunbookstore.book.domin.Book;

public class BookDao {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public Book queryBook(int bid) {
		Book book = new Book();
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		try {
			conn = dataSource.getConnection();
			String sql = "select * from book where bid=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bid);
			rs= pstmt.executeQuery();
			if (rs.next()) {
				 String bname = rs.getString("bname");
				 int bsum = rs.getInt("bsum");
				 int bprice = rs.getInt("bprice");
				 String bimage = rs.getString("bimage");
				 int bdiscount = rs.getInt("bdiscount");
				 book = new Book(bname, bsum, bprice, bimage, bdiscount);
			}
			return book;
		} catch (SQLException e) {
			e.printStackTrace();
			return book;
		}catch (Exception e) {
			e.printStackTrace();
			return book;
		}finally {
			try {
					if(rs != null)rs.close();
					if(pstmt != null)pstmt.close();
					if(conn != null)conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}catch (Exception e) {
					e.printStackTrace();
				}
		}
	}

}
