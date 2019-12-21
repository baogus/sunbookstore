package sunbookstore.shopcart.service;

import sunbookstore.shopcart.dao.ShopCartDao;
import sunbookstore.shopcart.domin.Shop_Book;

public class DeleteShopCartService {
	ShopCartDao shopCartDao = new ShopCartDao();
	//判断shop_book是否为空
	public int shop_BookISExist(int sid) {
		return shopCartDao.shop_BookISExist(sid);
	}
	//刪除
	public int deleteShop_Book(Shop_Book shop_Book) {
		return shopCartDao.deleteShop_Book(shop_Book);
	}
}
