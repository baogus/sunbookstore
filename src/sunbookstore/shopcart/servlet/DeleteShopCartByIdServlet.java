package sunbookstore.shopcart.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jdt.internal.compiler.lookup.ImplicitNullAnnotationVerifier;

import sunbookstore.shopcart.service.DeleteShopCartByIdService;

@WebServlet("/DeleteShopCartByIdServlet")
public class DeleteShopCartByIdServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DeleteShopCartByIdService deleteShopCartByIdService = new DeleteShopCartByIdService();
		int sid = Integer.parseInt(request.getParameter("cid"));
		deleteShopCartByIdService.deleteShop_BookById(sid);
		request.getRequestDispatcher("QueryShopServlet?cid="+sid).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
