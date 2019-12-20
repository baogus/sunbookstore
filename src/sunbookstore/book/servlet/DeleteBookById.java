package sunbookstore.book.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sunbookstore.Manager.domain.Manager;
import sunbookstore.book.service.BookService;

/**
 * Servlet implementation class DeleteBookById
 */
@WebServlet("/DeleteBookById")
public class DeleteBookById extends HttpServlet {
	
  BookService bookService = new BookService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		Manager manager = (Manager)request.getSession().getAttribute("manager");
		if(manager !=null) {//登录成功执行
		int bid = Integer.parseInt(request.getParameter("bid"));
		int count = bookService.deleteBookById(bid);
		if(count>0) {
			request.setAttribute("msg", "删除成功！");
			request.getRequestDispatcher("FindAllBookServlet?pc=1").forward(request, response);
		}else {
			request.setAttribute("msg", "删除失败！");
			request.getRequestDispatcher("FindAllBookServlet?pc=1").forward(request, response);
			
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
