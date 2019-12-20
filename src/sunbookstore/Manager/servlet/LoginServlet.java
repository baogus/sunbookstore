package sunbookstore.Manager.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sunbookstore.Manager.domain.Manager;
import sunbookstore.Manager.service.ManagerService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8");
		ManagerService managerService = new ManagerService();
		String mname = request.getParameter("mname");
		String mpassword = request.getParameter("mpassword");
		Manager manager = new Manager(mname, mpassword);
		int count = managerService.login(manager);
		if(count>0) {
			request.getSession().setAttribute("manager", manager);
			request.getRequestDispatcher("/admin/index.jsp").forward(request, response);
		}else {
			request.setAttribute("msg", "用户名或密码错误");
			request.setAttribute("manager", manager);
			request.getRequestDispatcher("/admin/admin/login.jsp").forward(request, response);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
