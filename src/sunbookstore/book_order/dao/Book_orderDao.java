package sunbookstore.book_order.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import sunbookstore.book_order.domin.Book_order;

public class Book_orderDao {
	ComboPooledDataSource dataSource = new ComboPooledDataSource();
	Connection conn = null;
	PreparedStatement pstm = null;
	ResultSet rs = null;
	
	
	public int Orderbookcount(int bid){
		
		int mothcount=0;
		/*Book_order  book_order = null;*/

		
	try {
		conn = dataSource.getConnection();
		String  sql = "select add(onum) from book_order where bid =? and otime=to_char(sysdate,'YYYY-MM')";
		pstm = conn.prepareStatement(sql);
		pstm.setInt(1, bid);
		rs  =pstm.executeQuery();
		while(rs.next()){
			 mothcount = rs.getInt(1);	
			/*book_order = new Book_order(mothcount);*/
				
		}
	
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	return mothcount;
	
	}
	
	
	
	
}
