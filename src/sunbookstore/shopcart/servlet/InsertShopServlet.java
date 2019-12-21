package sunbookstore.shopcart.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sunbookstore.shopcart.domin.Shop_Book;
import sunbookstore.shopcart.service.InsertShopCartService;


@WebServlet("/InsertShopServlet")
public class InsertShopServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		InsertShopCartService insertShopCartService = new InsertShopCartService();
		int cid = Integer.parseInt(request.getParameter("cid"));
		int bid = Integer.parseInt(request.getParameter("bid"));
		int sbnum = Integer.parseInt(request.getParameter("sbnum"));
		Shop_Book shop_Book = new Shop_Book(cid, bid, sbnum);
		
		int result = insertShopCartService.queryShop_BookById(shop_Book);
		if (result > 0) {
			//说明已经在购物车中有这本书，只需要修改数量即可
			//System.out.println("已经有了！");
			insertShopCartService.updateShop_BookSum(shop_Book);
		}else {
			//说明在购物车中暂时没有相同的书存在
			//System.out.println("没有的！");
			int i = insertShopCartService.insertShop_Book(shop_Book);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
