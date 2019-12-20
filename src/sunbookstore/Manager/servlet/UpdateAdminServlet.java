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
 * Servlet implementation class UpdateAdminServlet
 */
@WebServlet("/UpdateAdminServlet")
public class UpdateAdminServlet extends HttpServlet {
	ManagerService managerService = new ManagerService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String mname = request.getParameter("mname");
		String mpassword = request.getParameter("mpassword");
		Manager manager1 = new Manager(mname,mpassword);
		Manager manager2 = (Manager)request.getSession().getAttribute("manager");
		int count = managerService.updatePassword(manager1,manager2);
		if(count > 0) {
			request.setAttribute("msg", "修改成功！");
			request.getSession().invalidate();
			response.sendRedirect("/sunbookstore/admin/index.jsp");
		}else {
			request.setAttribute("msg", "修改失败！！");
			request.getRequestDispatcher("/admin/admin/updateadmin.jsp").forward(request, response);
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
