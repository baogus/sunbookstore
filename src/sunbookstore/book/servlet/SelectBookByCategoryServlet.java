package sunbookstore.book.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sunbookstore.category.domin.Category;
import sunbookstore.category.service.CategoryService;


/**
 * Servlet implementation class SelectBookByCategoryServlet
 */
@WebServlet("/SelectBookByCategoryServlet")
public class SelectBookByCategoryServlet extends HttpServlet {	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CategoryService categoryService = new CategoryService();
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8");
		
		List<Category> categories = categoryService.selectCategory();
		
		request.setAttribute("categories", categories);
		request.getRequestDispatcher("/jsps/book/bookselect/classical.jsp").forward(request, response);
		
	}

 	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
