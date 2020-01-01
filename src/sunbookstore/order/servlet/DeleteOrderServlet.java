package sunbookstore.order.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sunbookstore.order.service.DeleteOrderService;

@WebServlet("/DeleteOrderServlet")
public class DeleteOrderServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int cid = Integer.parseInt(request.getParameter("cid"));
		Double oid = Double.parseDouble(request.getParameter("oid"));
		DeleteOrderService deleteOrderService =  new DeleteOrderService();
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8");
		int i = deleteOrderService.deleteBook_Order(oid);
		if (i > 0) {
			int result = deleteOrderService.deleteOrder(oid);
			if (result > 0) {
				request.getRequestDispatcher("/QueryOrderServlet?cid="+cid).forward(request, response);
			}else {
				response.getWriter().print("删除失败！");
				
			}
		}else {
			response.getWriter().print("删除失败！");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
