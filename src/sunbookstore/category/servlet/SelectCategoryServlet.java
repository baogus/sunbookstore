package sunbookstore.category.servlet;

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
 * Servlet implementation class SelectCategoryServlet
 */
@WebServlet("/SelectCategoryServlet")
public class SelectCategoryServlet extends HttpServlet {
	CategoryService categoryService = new CategoryService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8");
		List<Category> categories = categoryService.selectCategory();
		request.setAttribute("categories", categories);
		request.getRequestDispatcher("/jsps/book/bookselect/left.jsp").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
