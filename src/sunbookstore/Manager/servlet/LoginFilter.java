package sunbookstore.Manager.servlet;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;

import sunbookstore.customer.domain.Customer;

/**
 * Servlet Filter implementation class LoginFilter
 */
@WebFilter(
		filterName = "LoginFilter1", 
		description = "u", 
		urlPatterns = { 
				"/LoginFilter", 
				"/admin/book/*"
		}, 
		initParams = { 
				@WebInitParam(name = "u", value = ""), 
				@WebInitParam(name = "uuu", value = "uu", description = "u")
		})
public class LoginFilter implements Filter {


  

	public void destroy() {
		
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		Customer customer = (Customer)httpRequest.getSession().getAttribute("manager");
		if(customer != null) {
			chain.doFilter(request, response);
		} else {
			httpRequest.setAttribute("msg", "您还没有登录！");
			httpRequest.getRequestDispatcher("/admin/admin/login.jsp")
					.forward(httpRequest, response);
		}
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
