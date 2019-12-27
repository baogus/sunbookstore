package sunbookstore.book_order.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sunbookstore.book.domin.Book;
import sunbookstore.book.service.BookService;
import sunbookstore.book_order.service.Book_orderSevice;

/**
 * Servlet implementation class OrderbookcountServlet
 */
@WebServlet("/OrderbookcountServlet")
public class OrderbookcountServlet extends HttpServlet {
	Book_orderSevice book_orderService = new Book_orderSevice();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8");
		int bid = Integer.parseInt(request.getParameter("bid"));	
		int mothcount=book_orderService.Orderbookcount(bid);
		request.getSession().setAttribute("mothcount", mothcount);
		request.getRequestDispatcher("/jsps/book/bookselect/xminute.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
