package sunbookstore.shopcart.service;

import java.util.List;

import sunbookstore.book.dao.BookDao;
import sunbookstore.book.domin.Book;
import sunbookstore.shopcart.dao.ShopCartDao;
import sunbookstore.shopcart.domin.Shop;
import sunbookstore.shopcart.domin.Shop_Book;

public class QueryShopCartService {
	ShopCartDao shopCartDao = new ShopCartDao();
	BookDao bookDao  = new BookDao();
	//判断shop_book是否为空
	public int shop_BookISExist(int sid) {
		return shopCartDao.shop_BookISExist(sid);
	}
	
	//返回购物车中的条目
	public Shop_Book querShop_Book(int sid) {
		return shopCartDao.queryShop_Book(sid);
	}
	//返回 书籍的具体信息
	public Book queryBook(int bid) {
		return bookDao.queryBook(bid);
	}
	
	public List<Shop> queryShopCart(int sid){
		return shopCartDao.queryShopCart(sid);
	}
	
}
