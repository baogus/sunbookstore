package sunbookstore.book.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;

import sunbookstore.book.service.BookService;

public class BookDao {
	ComboPooledDataSource dataSource = new ComboPooledDataSource();
	Connection connection=null;
	PreparedStatement pstm = null;
	ResultSet rSet =null;

	/*
	 * public void fun(String ss) { try { connection=dataSource.getConnection();
	 * String sql="select * from book where cgid = ?"; pstm =
	 * connection.prepareStatement(sql); pstm.setString(1, ss); pstm.setInt(2, 5);
	 * rSet = pstm.executeQuery(); //int count = pstm.executeUpdate();
	 * while(rSet.next()) { rSet.getString(1); rSet.getInt(2); }
	 * 
	 * } catch (SQLException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } }
	 */
	//获取分类编号
	public int GetBookCGid(String cgname) {
		try {
			connection=dataSource.getConnection();
			String sql="select * from category where cgid ="+cgname;
			pstm =  connection.prepareStatement(sql);
			rSet=pstm.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		return 0;		 
	}

    
    
    //查询某分类的所有图书
    public void SelectcgBook() {
    	try {
			connection=dataSource.getConnection();
			int cgid = BookDao.GetBookCGid(rSet);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}