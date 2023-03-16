package uit.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(
        urlPatterns = "/servlet-config",
        initParams =  {@WebInitParam(name = "name", value = "Đỗ Hoàng Mai Khanh"),
        			@WebInitParam(name = "school", value = "UIT")
        		}
        )

//@WebServlet(urlPatterns = { "/annotationExample", "/annExample" },
//	initParams = {
//        @WebInitParam(name = "location", value = "D:/Uploads"),
//        @WebInitParam(name = "maxUploadSize", value = "9900000")}
	public class MyServletConfig extends HttpServlet{
	
	 @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		 	resp.setContentType("text/html;charset=UTF-8");
		    PrintWriter out = resp.getWriter();
		    
		    ServletConfig servletconfig= getServletConfig();
		    out.println(servletconfig.getInitParameter("name")); 
		    out.println(servletconfig.getInitParameter("school")); 
		    
		    
		    ServletContext servletContext = getServletContext();
		    
		    servletContext.setAttribute("truong", "Trường đại học công nghệ thông tin");
		    
		    String value = (String) servletContext.getAttribute("truong");
		    out.println(servletContext.getInitParameter("sdt"));
		    out.println(servletContext.getInitParameter("age"));
		    out.println(value);
		    out.close();
	}

}
