package uit.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/chuyen-huong-trang")
public class PageRedirect extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		resp.sendRedirect("http://www.newpage.com");
		String site = "http://www.newpage.com" ; 
		resp.setStatus(resp.SC_MOVED_TEMPORARILY); 
		resp.setHeader("Location", site);
	}

}
