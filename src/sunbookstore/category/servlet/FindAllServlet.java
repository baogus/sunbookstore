package sunbookstore.category.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import sunbookstore.category.domain.Category;
import sunbookstore.category.service.CategoryService;
import sunbookstore.pageBean.PageBean;

/**
 * Servlet implementation class FindAllServlet
 */
@WebServlet("/FindAllServlet")
public class FindAllServlet extends HttpServlet {
	CategoryService categoryService = new  CategoryService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pc1 = request.getParameter("pc");
		 if(pc1==null&& pc1.trim().isEmpty()){ 
			 pc1="1";
			 }
		 int pc =Integer.parseInt(pc1);
		/*
		 * int pc = 1;;//得到pc
		 */	
		 int ps = 10*pc;//给定ps的值，第页10行记录
		PageBean<Category> pb;
		try {
			pb = categoryService.selectAllCategory(pc, ps);
			request.getSession().setAttribute("pb", pb);//保存到request域中
			request.getRequestDispatcher("/admin/book/addbook.jsp").forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//传递pc, ps给Service，得到PageBean
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
