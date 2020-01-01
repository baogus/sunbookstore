package sunbookstore.order.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sunbookstore.order.domin.Orders;
import sunbookstore.order.service.QueryOrderService;
import sunbookstore.shopcart.domin.PageBean;

@WebServlet("/QueryOrderServlet")
public class QueryOrderServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int cid = Integer.parseInt(request.getParameter("cid"));
		QueryOrderService queryOrderService = new QueryOrderService();
		int pc = getPc(request);
		int ps = 5;
		PageBean<Orders> pageBean = new PageBean<Orders>(pc, ps);
		
		int result = queryOrderService.queryOrderById(cid);
		if (result > 0 ) {
			PageBean<Orders> pageBean1 = queryOrderService.queryOrderByPage(cid, pageBean);
//			List<Orders> orders = queryOrderService.queryOrderAll(cid); 
			request.getSession().setAttribute("cid", cid);
			request.getSession().setAttribute("pageBean", pageBean1);
			request.getRequestDispatcher("/jsps/order/order.jsp").forward(request, response);
		}else {
			System.out.println("亲，还没有关于您的订单哦！");
		}
		
	} 

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
