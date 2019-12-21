package sunbookstore.book.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.bcel.internal.generic.NEW;

import sunbookstore.book.domin.Book;
import sunbookstore.book.service.BookService;

/**
 * Servlet implementation class FindBookByCategoryServlet
 */
@WebServlet("/FindBookByCategoryServlet")
public class FindBookByCategoryServlet extends HttpServlet {
	BookService bookService = new BookService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8");
		int cgid = Integer.parseInt(request.getParameter("cgid"));
		List<Book> books=bookService.selectbook(cgid);
		request.getSession().setAttribute("books", books);
		request.getRequestDispatcher("/jsps/book/bookselect/classical.jsp").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
