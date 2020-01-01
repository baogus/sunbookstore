package sunbookstore.order.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.util.Introspection;

import sunbookstore.order.domin.Orders;
import sunbookstore.order.service.PayOrderService;

@WebServlet("/PayOrderServlet")
public class PayOrderServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PayOrderService payOrderService = new PayOrderService();
		request.setCharacterEncoding("utf-8");
		double oid = Double.parseDouble(request.getParameter("oid"));
		List<Orders> orderList = payOrderService.PayOrder(oid);
		request.setAttribute("orderList", orderList);
		request.getRequestDispatcher("/jsps/order/OrderDetail.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
