package uit.session;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(urlPatterns = "/session2")
public class Session2 extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		HttpSession httpSession = req.getSession();
		Object obj  = httpSession.getAttribute("name");
		String name =" ";
		if(obj!=null) {
			name = String.valueOf(obj);
		}else {
			resp.sendRedirect("ProjectServlet2/session1");
		}
		//C1
		//int age = Integer.valueOf(String.valueOf(httpSession.getAttribute("age")));
		//C2
//		int age = (int) httpSession.getAttribute("age");
        PrintWriter out = resp.getWriter();
        out.println("xin chao"+ name);
	}

}
