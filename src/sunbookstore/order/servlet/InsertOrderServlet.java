package sunbookstore.order.servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sunbookstore.order.dao.OrderDao;
import sunbookstore.order.domin.Book_Order;
import sunbookstore.order.domin.Order;
import sunbookstore.order.service.InsertOrderService;

@WebServlet("/InsertOrderServlet")
public class InsertOrderServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		Date date = new Date();
		int cid = Integer.parseInt(request.getParameter("cid"));
		int bid = Integer.parseInt(request.getParameter("bid"));
		int onum = Integer.parseInt(request.getParameter("onum"));
		int osubtotal = Integer.parseInt(request.getParameter("osubtotal"));
		String ostate = request.getParameter("ostate");
		//得到时间和用户id合成的oid
		double oid = Double.parseDouble(date.getTime()+request.getParameter("cid"));
		//得到当前的下单时间
		java.sql.Date otime= new java.sql.Date(new java.util.Date().getTime());
		Order order = new Order(oid, cid, ostate);
		
		Book_Order book_Order = new Book_Order(oid, bid, otime, osubtotal, onum);
		InsertOrderService insertOrderService = new InsertOrderService();
		int i =  insertOrderService.insertOrder(order, book_Order);
		if (i > 0) {
			request.getRequestDispatcher("/QueryOrderServlet?cid="+cid).forward(request, response);
		}else {
			response.setCharacterEncoding("utf-8");
			response.setContentType("text/html; charset=UTF-8");
			response.getWriter().print("增加订单失败！！！");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
