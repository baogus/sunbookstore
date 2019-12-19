package sunbookstore.book.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sunbookstore.book.domin.Book;
import sunbookstore.book.service.BookService;

/**
 * Servlet implementation class FindBookByIDServlet
 */
@WebServlet("/FindBookByIDServlet")
public class FindBookByIDServlet extends HttpServlet {
	BookService bookService = new BookService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int bid  = Integer.parseInt(request.getParameter("bid"));
		 Book book=bookService.findBookById(bid);
		 request.setAttribute("book", book);
		 request.getRequestDispatcher("/admin/book/updatebook.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
