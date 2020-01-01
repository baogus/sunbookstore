package sunbookstore.shopcart.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sunbookstore.shopcart.domin.Shop_Book;
import sunbookstore.shopcart.service.UpdateShopCartService;


@WebServlet("/UpdateShopServlet")
public class UpdateShopServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UpdateShopCartService updateShopCartService = new UpdateShopCartService();
		request.setCharacterEncoding("utf-8");
		int sid = Integer.parseInt(request.getParameter("cid"));
		int bid = Integer.parseInt(request.getParameter("bid"));
		int sbnum = Integer.parseInt(request.getParameter("sbnum"));
		
		int bcount =  updateShopCartService.queryBcountById(bid);
		if (sbnum >= bcount) {
			sbnum = bcount;
		}
		Shop_Book shop_Book = new Shop_Book(sid, bid, sbnum);
		int i =updateShopCartService.updateShop_Book(shop_Book);
		if (i > 0) {
			request.getRequestDispatcher("QueryShopServlet?cid="+sid).forward(request, response);
		}else {
			System.out.println("修改失败!");
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
