package sunbookstore.book.servlet;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.ImageIcon;

import org.apache.catalina.LifecycleListener;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadBase;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import sunbookstore.Manager.domain.Manager;
import sunbookstore.book.domin.Book;
import sunbookstore.book.service.BookService;
import sunbookstore.category.domain.Category;
import sunbookstore.category.service.CategoryService;

/**
 * Servlet implementation class AddbookServlet
 */
@WebServlet("/AddbookServlet")
public class AddbookServlet extends HttpServlet {
	CategoryService categoryService = new CategoryService();
	BookService bookService = new BookService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Manager manager = (Manager)request.getSession().getAttribute("manager");
		if(manager !=null) {//登录成功执行
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String bname = null;
		String bauthor = null;
		double bprice = -1;
		int bcount = -1;
		String bpub = null;
		String cgname = null;
		String bdesc = null;
		int cgid = -1;
		String bimage = null;// 图片路径
		String bookimg = null;// 图片名字
		double bdiscount = 0;
		
		DiskFileItemFactory factory = new DiskFileItemFactory(1024 * 1024 * 1024, new File("D:/img"));
		ServletFileUpload sfu = new ServletFileUpload(factory);
		Map<String, String> errors = new HashMap<String, String>();
		try {
			List<FileItem> fileItems = sfu.parseRequest(request);
			for (FileItem fileItem : fileItems) {
				if (fileItem.isFormField()) {// 判断是表单字段
					String fileName = fileItem.getFieldName();
					if (fileName.equals("bname")) {
						bname = fileItem.getString("UTF-8");
					} else if (fileName.equals("bauthor")) {
						bauthor = fileItem.getString("UTF-8");
					} else if (fileName.equals("bprice")) {
						String bprice1 = fileItem.getString("UTF-8");
						if (bprice1 == null || bprice1.trim().isEmpty()) {
							bprice1 = "0";
						}
						bprice = Double.parseDouble(bprice1);
					} else if (fileName.equals("bdiscount")) {
						String bdiscount1 = fileItem.getString("UTF-8");
						if (bdiscount1 == null || bdiscount1.trim().isEmpty()) {
							bdiscount1 = "0";
						}
						bdiscount = Double.parseDouble(bdiscount1);
					} else if (fileName.equals("bcount")) {
						String bcount1 = fileItem.getString("UTF-8");
						if (bcount1 == null || bcount1.trim().isEmpty()) {
							bcount1 = "0";
						}
						bcount = Integer.parseInt(bcount1);
					} else if (fileName.equals("bpub")) {
						bpub = fileItem.getString("UTF-8");
					} else if (fileName.equals("cgname")) {
						cgname = fileItem.getString("UTF-8");
						cgid = categoryService.findCategoryByName1(cgname);// 将分类名转换为分类id
					} else if (fileName.equals("bdesc")) {
						bdesc = fileItem.getString("UTF-8");
					}
				} else {// 是图片字段
						// 得到保存文件相对路径

					// String path = request.getSession().getServletContext().getRealPath("/img");

					/* String path = "D:\\img"; */

					bookimg = fileItem.getName();// 得到图片文件名
					
					  bookimg=UUID.randomUUID().toString().replaceAll("-","")+"_"+bookimg;//防止图片重复
					  File file1 = new File("D:/img");
					  if (!file1.exists()) { 
						  file1.mkdir(); 
						  }
					 
					bookimg = UUID.randomUUID().toString().replaceAll("-", "") + "_" + bookimg;
					File file = new File(file1, bookimg);
					bimage = ("img/" + bookimg);
					fileItem.write(file);
					// 将信息包装到javabean
					Book book = new Book(bname, bauthor, bprice, bdesc, bimage, bpub, cgid, bcount, bdiscount);

					if (bname == null || bname.trim().isEmpty()) {
						errors.put("bname", "书名不能为空");

					}
					if (bauthor == null || bauthor.trim().isEmpty()) {
						errors.put("bauthor", "作者不能为空");

					}
					if (bprice == 0) {
						errors.put("bprice", "填写错误");

					}
					if (bdiscount == 0) {
						errors.put("bdiscount", "填写错误");

					}
					if (bdesc == null || bdesc.trim().isEmpty()) {
						errors.put("bdesc", "简介不能为空");

					}
					if (bimage == null || bimage.trim().isEmpty()) {
						errors.put("bimage", "图片不能为空");

					}
					if (bpub == null || bpub.trim().isEmpty()) {
						errors.put("bpub", "出版社不能为空");

					}
					if (bcount == 0) {
						errors.put("bcount", "填写错误");
					}

					request.setAttribute("errors", errors);
					if (errors.size() > 0) {
						request.setAttribute("book", book);
						request.getRequestDispatcher("/AdminBookCategoryServlet").forward(request, response);
						return;
					}

					String ext = bookimg.substring(bookimg.indexOf(".") + 1);// 得到文件后缀
					// 校验文件格式
					if (!(ext.equals("png") || ext.equals("jpg") || ext.equals("gif") || ext.equals("svg"))) {
						request.setAttribute("msg", "不支持此格式上传");
						request.setAttribute("book", book);
						request.getRequestDispatcher("/AdminBookCategoryServlet").forward(request, response);
						return;
					}
					int count = bookService.addBook(book);
					if (count > 0) {
						request.setAttribute("msg1", "添加成功");
						request.getRequestDispatcher("/AdminBookCategoryServlet").forward(request, response);
					} else {
						request.setAttribute("book", book);
						request.setAttribute("msg", "添加失败");
						request.getRequestDispatcher("/AdminBookCategoryServlet").forward(request, response);
					}

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		}else {//没有登录
			request.setAttribute("msg", "您还没有登录！不能进行该操作！");
			request.getRequestDispatcher("/error/adminerror.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
