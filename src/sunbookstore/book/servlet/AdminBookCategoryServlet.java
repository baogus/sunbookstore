package sunbookstore.book.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sunbookstore.Manager.domain.Manager;
import sunbookstore.category.domain.Category;
import sunbookstore.category.service.CategoryService;

/**
 * Servlet implementation class AdminBookCategoryServlet
 */
@WebServlet("/AdminBookCategoryServlet")
public class AdminBookCategoryServlet extends HttpServlet {
	CategoryService categoryService  = new CategoryService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Manager manager = (Manager)request.getSession().getAttribute("manager");
		if(manager !=null) {//登录成功执行
			
			
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8");
		List<Category> listCategories = categoryService.findAll();
		request.setAttribute("category", listCategories);
		request.getRequestDispatcher("/admin/book/addbook.jsp").forward(request, response);
		
		}else {//没有登录
			request.setAttribute("msg", "您还没有登录！不能进行该操作！");
			request.getRequestDispatcher("/error/adminerror.jsp").forward(request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
