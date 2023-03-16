package uit.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(
        urlPatterns = "/param")
public class ParamURL extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html;charset=UTF-8");
		 PrintWriter out = resp.getWriter();
		 
		 out.println("test");
		 
		 String ten = req.getParameter("ten");
		 //http://localhost:8080/ProjectServlet1/param?ten=khanh
		 out.println(" xin chào "+ten);
	}

}
