package sunbookstore.book.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sunbookstore.book.service.BookService;

/**
 * Servlet implementation class SelectBookByCategoryServlet
 */
@WebServlet("/SelectBookByCategoryServlet")
public class SelectBookByCategoryServlet extends HttpServlet {
	BookService bookService = new BookService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cgname = request.getParameter("cgname");
		bookService.GetBookCGid(cgname);
	}

 	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
