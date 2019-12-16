package sunbookstore.category.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sunbookstore.category.service.CategoryService;

/**
 * Servlet implementation class DeleteCategoryServlet
 */
@WebServlet("/DeleteCategoryServlet")
public class DeleteCategoryServlet extends HttpServlet {
	 CategoryService categoryService = new CategoryService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int cgid = Integer.parseInt(request.getParameter("cgid"));
		int count = categoryService.deleteById(cgid);
		if (count>0) {
			request.setAttribute("msg", "删除成功！");
			
		}else {
		request.setAttribute("msg", "删除失败");
		}
		
		request.getRequestDispatcher("/FindAllCategoryServlet?pc=1").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
