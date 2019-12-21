package sunbookstore.shopcart.service;

import sunbookstore.shopcart.dao.ShopCartDao;
import sunbookstore.shopcart.domin.Shop_Book;

public class InsertShopCartService {
	ShopCartDao shopCartDao = new ShopCartDao();
	//判断shop_book是否已经存在了
	public int queryShop_BookById(Shop_Book shop_Book) {
		return shopCartDao.queryShop_BookById(shop_Book);
	}
	// 如果存在，则修改数量
	public int updateShop_BookSum(Shop_Book shop_Book) {
		return shopCartDao.updateShop_BookSum(shop_Book);
	}
	
	
	//不存在,添加
	public int insertShop_Book(Shop_Book shop_Book) {
		return shopCartDao.insertShop_Book(shop_Book);
	}		
}
