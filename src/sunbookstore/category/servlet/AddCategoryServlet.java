package sunbookstore.category.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import exception.UserException;
import sunbookstore.category.service.CategoryService;

/**
 * Servlet implementation class AddCategoryServlet
 */
@WebServlet("/AddCategoryServlet")
public class AddCategoryServlet extends HttpServlet {
	private CategoryService categoryService = new CategoryService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8");
		String cgname = request.getParameter("cgname");
		Map<String , String >errors = new HashMap<String, String>();
		if(cgname==null||cgname.trim().isEmpty()) {
			errors.put("error", " 分类不能为空！" );
			request.setAttribute("error", errors);
			request.getRequestDispatcher("FindAllServlet").forward(request, response);
			}else {
		try {
			categoryService.addCategory(cgname);
			request.setAttribute("msg","添加成功！");
			request.getRequestDispatcher("FindAllServlet").forward(request, response);
		} catch (UserException e) {
			request.setAttribute("msg",e.getMessage());
			request.setAttribute("cgname", cgname);
			request.getRequestDispatcher("FindAllServlet").forward(request, response);
		}
	}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}