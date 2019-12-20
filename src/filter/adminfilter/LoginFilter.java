package filter.adminfilter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import sunbookstore.Manager.domain.Manager;

/**
 * Servlet Filter implementation class LoginFilter
 */
@WebFilter(
		urlPatterns = { "/admin/admin/updateadmin.jsp" ,
				"/admin/book/addbook.jsp" 
				
			
		}, 
		servletNames = { 
				"UpdateBookMsgServlet", 
				"AddbookServlet", 
				"AddCategoryServlet", 
				"AdminBookCategoryServlet", 
				"DeleteBookById", 
				"DeleteCategoryServlet", 
				"DeleteCustomerServlet", 
				"FindAllBookServlet", 
				"FindAllCategoryServlet", 
				"FindAllCustomerServlet", 
				"FindAllServlet", 
				"FindBookByIDServlet", 
				"FindLikeBookServlet", 
				"QuitServlet", 
				"SelectLikeBynameSerevlet", 
				"UpdateAdminServlet"
		})
public class LoginFilter implements Filter {

    public LoginFilter() {
      
    }

	public void destroy() {
		
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		Manager manager = (Manager)httpRequest.getSession().getAttribute("manager");
		if(manager != null) {
			chain.doFilter(request, response);
		} else {
			httpRequest.setAttribute("msg", "您还没有登录！不能进行该操作！");
			
			httpRequest.getRequestDispatcher("/error/adminerror.jsp").forward(httpRequest, response);
		}
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
