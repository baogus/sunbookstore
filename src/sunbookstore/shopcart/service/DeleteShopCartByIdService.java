package sunbookstore.shopcart.service;

import sunbookstore.shopcart.dao.ShopCartDao;

public class DeleteShopCartByIdService {
	ShopCartDao shopCartDao = new ShopCartDao();
	public int deleteShop_BookById(int sid) {
		return shopCartDao.deleteShop_BookById(sid);
	}

}
