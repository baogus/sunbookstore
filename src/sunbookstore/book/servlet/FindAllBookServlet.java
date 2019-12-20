package sunbookstore.book.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import filter.adminfilter.AdminState;
import sunbookstore.Manager.domain.Manager;
import sunbookstore.book.domin.Book;
import sunbookstore.book.service.BookService;
import sunbookstore.pageBean.PageBean;

/**
 * Servlet implementation class FindAllBookServlet
 */
@WebServlet("/FindAllBookServlet")
public class FindAllBookServlet extends HttpServlet {
	BookService bookService = new BookService();
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
		PageBean<Book> pb;
		try {
			pb = bookService.findAllBook(pc, ps);
			request.setAttribute("pb", pb);//保存到request域中
			request.getRequestDispatcher("/admin/book/booklist.jsp").forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//传递pc, ps给Service，得到PageBean
		
	
		

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
