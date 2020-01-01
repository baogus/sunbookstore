package sunbookstore.order.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sunbookstore.order.domin.Order;
import sunbookstore.order.service.UpdateOrderService;

@WebServlet("/UpdateOrderServlet")
public class UpdateOrderServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UpdateOrderService updateOrderService = new UpdateOrderService();
		request.setCharacterEncoding("utf-8");
		double oid = Double.parseDouble(request.getParameter("oid"));
		String ostate = "已付款";
		String msg = "支付失败！！";
		Order order = new Order(oid, ostate);
		int i = updateOrderService.updateOrder1Ostate(order);
		if (i>0) {
			msg = "支付成功！！";
		}
		request.setAttribute("msg", msg);
		request.getRequestDispatcher("PayOrderServlet?oid="+oid).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
