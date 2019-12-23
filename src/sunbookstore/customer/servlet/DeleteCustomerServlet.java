package sunbookstore.customer.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sunbookstore.Manager.domain.Manager;
import sunbookstore.customer.service.CustomerService;

/**
 * Servlet implementation class DeleteCustomerServlet
 */
@WebServlet("/DeleteCustomerServlet")
public class DeleteCustomerServlet extends HttpServlet {
	CustomerService customerService = new CustomerService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Manager manager = (Manager)request.getSession().getAttribute("manager");
		if(manager !=null) {//登录成功执行
		
		int cid = Integer.parseInt(request.getParameter("cid"));
		int count = customerService.deleteCustomerByid(cid);
		if(count >0) {
			request.setAttribute("msg", "删除成功");
			request.getRequestDispatcher("/FindAllCustomerServlet?pc=1").forward(request, response);
		}else {
			request.setAttribute("msg", "删除失败");
		}
		
		}else {//没有登录
			request.setAttribute("msg", "您还没有登录！不能进行该操作！");
			request.getRequestDispatcher("/error/adminerror.jsp").forward(request, response);
		}
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
