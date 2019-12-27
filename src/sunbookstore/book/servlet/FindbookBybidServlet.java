package sunbookstore.book.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sunbookstore.book.domin.Book;
import sunbookstore.book.service.BookService;

/**
 * Servlet implementation class FindbookBybidServlet
 */
@WebServlet("/FindbookBybidServlet")
public class FindbookBybidServlet extends HttpServlet {
	BookService bookService = new BookService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    	request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8");
		int bid = Integer.parseInt(request.getParameter("bid"));		
		List<Book> bookids=bookService.FindbookBybid(bid);
		if(bookids.isEmpty()){
			request.setAttribute("msg", "没有任何书籍信息");
		}
		request.getSession().setAttribute("bookids", bookids);
		request.getRequestDispatcher("OrderbookcountServlet?bid="+bid).forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
