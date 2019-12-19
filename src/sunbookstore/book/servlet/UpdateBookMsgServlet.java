package sunbookstore.book.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sunbookstore.book.service.BookService;

/**
 * Servlet implementation class UpdateBookMsgServlet
 */
@WebServlet("/UpdateBookMsgServlet")
public class UpdateBookMsgServlet extends HttpServlet {
	BookService bookService = new BookService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int bid = Integer.parseInt(request.getParameter("bid"));
		int bcount = Integer.parseInt(request.getParameter("bcount"));
		double bprice = Double.parseDouble(request.getParameter("bprice"));
		double bdiscount = Double.parseDouble(request.getParameter("bdiscount"));
		int count = bookService.updateBookMsg(bid, bcount, bprice, bdiscount);
		if(count > 0) {
			request.setAttribute("msg", "修改成功");
			request.getRequestDispatcher("FindAllBookServlet?pc=1").forward(request, response);
		}
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
