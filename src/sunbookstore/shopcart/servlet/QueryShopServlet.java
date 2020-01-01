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
import sunbookstore.shopcart.domin.PageBean;
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
		//List<Shop> shops = null;
		int i = shopCartService.shop_BookISExist(cid);
		if (i > 0) {
			/*//一次性全部查找购物车中的所有书籍
			 * shops = shopCartService.queryShopCart(cid); request.setAttribute("shops",
			 * shops);
			 * request.getRequestDispatcher("/jsps/shopcart/queryall.jsp").forward(request,
			 * response);
			 */
			//根据分页显示书籍
			//1.定义每页显示的数据个数
			int ps = 2;
			//2.得到当前的页数
			int pc = getPc(request);
			PageBean<Shop> pageBean1 = new PageBean<Shop>(pc, ps);
			PageBean<Shop> pageBean = shopCartService.queryShopCartByPage(cid, pageBean1);
			request.setAttribute("pageBean", pageBean);
			request.setAttribute("cid", cid);
			//System.out.println(pageBean);
			request.getRequestDispatcher("/jsps/shopcart/queryall.jsp").forward(request,response);
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
	private int getPc(HttpServletRequest request) {
		String value = request.getParameter("pc");
		if (value == null || value.trim().isEmpty()) {
			return 1;
		}
		return Integer.parseInt(value);
	}

}
