package uit.ServletContext;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/servlet1")
public class Servlet1 extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		 
		 out.println("test");
		 
		 String jdbc = getServletContext().getInitParameter("jdbc");
		 
		 out.println("in "+jdbc);
		getServletContext().setAttribute("name", "trung tam java");
		
	}
	

}
