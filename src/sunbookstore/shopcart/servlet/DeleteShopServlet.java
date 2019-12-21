package sunbookstore.shopcart.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sunbookstore.shopcart.domin.Shop_Book;
import sunbookstore.shopcart.service.DeleteShopCartService;

@WebServlet("/DeleteShopServlet")
public class DeleteShopServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 request.setCharacterEncoding("utf-8");
		 int sid = Integer.parseInt(request.getParameter("sid"));
		 int bid = Integer.parseInt(request.getParameter("bid"));
		 System.out.println(sid);
		 System.out.println(bid);
		 Shop_Book shop_Book = new Shop_Book(sid, bid);
		 DeleteShopCartService deleteShopCartService = new DeleteShopCartService();
		 int result = deleteShopCartService.deleteShop_Book(shop_Book);
		 if (result > 0) {
			System.out.println("删除成功！");
			request.getRequestDispatcher("QueryShopServlet?cid="+sid).forward(request, response);
		}else {
			System.out.println("删除失败！");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
