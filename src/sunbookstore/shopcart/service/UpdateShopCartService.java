package sunbookstore.shopcart.service;

import sunbookstore.shopcart.dao.ShopCartDao;
import sunbookstore.shopcart.domin.Shop_Book;

public class UpdateShopCartService {
	ShopCartDao shopCartDao = new ShopCartDao();
	//判断shop_book是否为空
	public int shop_BookISExist(int sid) {
		return shopCartDao.shop_BookISExist(sid);
	}
	
	public int queryBcountById(int bid) {
		return shopCartDao.queryBcountById(bid);
	}
	
	public int updateShop_Book(Shop_Book shop_Book) {
		return shopCartDao.updateShop_Book(shop_Book);
	}
}
