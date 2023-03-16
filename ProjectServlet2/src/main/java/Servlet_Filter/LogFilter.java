package Servlet_Filter;

import java.io.IOException;

import java.util.*;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;

//@WebFilter(urlPatterns = {"/session1","/session2"})
//@WebFilter(urlPatterns = {"/*"} ,
//initParams =  {@WebInitParam(name = "count", value = "100")
//	
//	}
//) // tất cả các file
public class LogFilter implements Filter {
	private int count;
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// đọc giá trị InitParam
//		  // Get init parameter 
	      String c = filterConfig.getInitParameter("count"); 
//
//	      //Print the init parameter 
	      count = Integer.valueOf(c);
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		count++;
		
//		 // Get the IP address of client machine.   
//	      String ipAddress = arg0.getRemoteAddr();
//
//	      // Log the IP address and current timestamp.
//	      System.out.println("IP "+ ipAddress + ", Time "
//	                                       + new Date().toString());
//	      arg1.setContentType("text/plain");
	      
	      System.out.println("count"+count);
	      // Pass request back down the filter chain
	      arg2.doFilter(arg0,arg1);
	}
	@Override
	public void destroy() {
		
	}

}
