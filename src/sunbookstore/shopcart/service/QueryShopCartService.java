package sunbookstore.shopcart.service;

import java.util.List;

import sunbookstore.book.dao.BookDao;
import sunbookstore.book.domin.Book;
import sunbookstore.shopcart.dao.ShopCartDao;
import sunbookstore.shopcart.domin.PageBean;
import sunbookstore.shopcart.domin.Shop;
import sunbookstore.shopcart.domin.Shop_Book;

public class QueryShopCartService {
	ShopCartDao shopCartDao = new ShopCartDao();
	BookDao bookDao  = new BookDao();
	//判断shop_book是否为空
	public int shop_BookISExist(int sid) {
		return shopCartDao.shop_BookISExist(sid);
	}
	
	//返回购物车条目
	public Shop_Book querShop_Book(int sid) {
		return shopCartDao.queryShop_Book(sid);
	}
	//返回 书籍的具体信息
	public Book queryBook(int bid) {
		return bookDao.queryBook(bid);
	}
	
	
	//返回的是购物车中显示的全部信息
	public List<Shop> queryShopCart(int sid){
		return shopCartDao.queryShopCart(sid);
	}
	//查找总数据量
	public int getTotalCount(int sid) {
		return shopCartDao.getTotalCount(sid);
	}
	
	//分页查询购物车中的信息
	public PageBean<Shop> queryShopCartByPage(int sid,PageBean<Shop> pageBean){
		return shopCartDao.queryShopCartByPage(sid, pageBean);
	}
	
}
