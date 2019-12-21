package sunbookstore.shopcart.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sunbookstore.book.domin.Book;
import sunbookstore.shopcart.dao.ShopCartDao;
import sunbookstore.shopcart.domin.Shop;
import sunbookstore.shopcart.domin.Shop_Book;
import sunbookstore.shopcart.service.QueryShopCartService;

@WebServlet("/QueryShopServlet")
public class QueryShopServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		QueryShopCartService shopCartService = new QueryShopCartService();
		int cid = Integer.parseInt(request.getParameter("cid"));
		List<Shop> shops = null;
		int i = shopCartService.shop_BookISExist(cid);
		if (i > 0) {
			shops = shopCartService.queryShopCart(cid);
			request.setAttribute("shops", shops);
			request.getRequestDispatcher("/jsps/shopcart/queryall.jsp").forward(request, response);
		} else {
			response.setCharacterEncoding("utf-8");
			response.setContentType("text/html; charset=UTF-8");
			response.getWriter().println("您的购物车为空！");
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
