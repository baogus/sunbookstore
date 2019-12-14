package sunbookstore.category.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import sunbookstore.category.domain.Category;
import sunbookstore.category.service.CategoryService;

/**
 * Servlet implementation class FindAllServlet
 */
@WebServlet("/FindAllServlet")
public class FindAllServlet extends HttpServlet {
	private CategoryService categoryService = new CategoryService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8");
		List<Category> categories = categoryService.findAll();
		request.setAttribute("categories",categories );
		request.getRequestDispatcher("/admin/category/categorylist.jsp").forward(request, response);
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
