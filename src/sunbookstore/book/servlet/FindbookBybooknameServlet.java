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


@WebServlet("/FindbookBybooknameServlet")
public class FindbookBybooknameServlet extends HttpServlet {
	BookService bookService = new BookService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
    	request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8");
		String  name = request.getParameter("name");
		List<Book> booknames=bookService.FindbookBybookname(name);
		if(booknames.isEmpty()){
			request.setAttribute("msg", "meiyoushu");
		}
		request.getSession().setAttribute("booknames", booknames);
		request.getRequestDispatcher("/jsps/book/bookselect/findbookname.jsp").forward(request, response);
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
