package sunbookstore.book.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mchange.v2.c3p0.ComboPooledDataSource;


import sunbookstore.book.domin.Book;


public class BookDao {
	ComboPooledDataSource dataSource = new ComboPooledDataSource();
	Connection conn = null;
	PreparedStatement pstm = null;
	ResultSet rs = null;

	//按照分类查询
	public List<Book> selectbook(int cgid) {
		Book book = null;
		List<Book> books = new ArrayList<Book>();
		
	try {
		conn = dataSource.getConnection();
		String  sql = "select * from book where cgid =?";
		pstm = conn.prepareStatement(sql);
		pstm.setInt(1, cgid);
		rs  =pstm.executeQuery();
		while(rs.next()) {
			int bid = rs.getInt(1);
			String bname = rs.getString(2);
			String bauthor=rs.getString(3) ;
			int bprice=rs.getInt(4);
			String bdesc=rs.getString(5);
			String bimage=rs.getString(6);
			String bpub=rs.getString(7);
			int bsum=rs.getInt(9);
			int bdiscount=rs.getInt(10);
			book = new Book(bid,bname,bauthor,bprice,bdesc,bimage,bpub,bsum,bdiscount);
			books.add(book);
		}
		return books;
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	return books;
	} 
	
	
	
	/**
     * 通过用户输入的参数，到数据库中查询到商品信息，并以集合的方式返回
     * @param pname 传入的查询参数
     * @param pdesc 传入的查询参数
     * @return 返回一个集合，其集合由实体Product组成
     * @throws SQLException
     */ 

/*    public List<Product> findProByIndis(String bname, String bdesc) throws SQLException {
 //创建dbutils下的QueryRunnner 
       QueryRunner runner = new QueryRunner(C3P0Utils.getDataSource()); 

//☆☆☆注意where 1=1后面一定要留空格，否则和后面进行字符串拼接后，到数据库查询会出现错误 
         String sql = "select * from product where 1=1 "; 

//创建一个集合用来存储查询的参数，因为我们不清楚客户到底输入几个参数，所以用集合来存放
       List<String> list = new ArrayList<String>(); if (pname != "") { 

//如果用户输入的pname不为空，那需要进行字符串拼接 
       sql += "and pname like ? "; 
//将用户输入的参数添加到集合 
   list.add("%" + pname + "%"); 
     } 
     if (pdesc != "") { 
      sql += "and pdesc like ? "; list.add("%" + pdesc + "%");
   } 

//最后将集合转化成数组 
      Object[] params = list.toArray();
 //调用runner对象的query查询方法，并将集合返回
           return runner.query(sql, new BeanListHandler<Product>(Product.class), params);

}*/
}


