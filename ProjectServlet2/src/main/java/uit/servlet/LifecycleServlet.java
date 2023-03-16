package uit.servlet;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class LifecycleServlet extends HttpServlet{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7374092337972820346L;

	@Override
	public void init() throws ServletException {
		System.out.println("init");
	}
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
//		super.service(arg0, arg1);
		System.out.println("service "+ arg0.getMethod());
		
	}
	
//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		
//		resp.setContentType("text/html");
//		resp.setCharacterEncoding("UTF-8");
//		
//		   PrintWriter writer = resp.getWriter();
//		   writer.println("<h1>Xin Chào Đỗ Hoàng Mai Khanh</h1>");
//	       writer.close();
//		
//		req.getContentType();
//		req.getContextPath();
//		
//		System.out.println(req.getServerName());
//		System.out.println(req.getServletPath());
//		
//		Enumeration<String> headerNames = req.getHeaderNames();
//		
//		 while(headerNames.hasMoreElements()) {
//	         String paramName = (String)headerNames.nextElement();
//	         String paramValue = req.getHeader(paramName);
//	     	System.out.println("paramName "+paramName );
//	     	System.out.println("paramValue: "+ paramValue );
//	     	
//	         
//	      }
//		
//	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
	    String title = "HTTP Header Request Example";
	    
//	    String docType =
//	    	      "<!doctype html public \"-//w3c//dtd html 4.0 " +
//	    	      "transitional//en\">\n";
//	    	      out.println(docType +
//	    	        "<html>\n" +
//	    	        "<head><title>" + title + "</title></head>\n"+
//	    	        "<body bgcolor=\"#f0f0f0\">\n" +
//	    	        "<h1 align=\"center\">" + title + "</h1>\n" +
//	    	        "<table width=\"100%\" border=\"1\" align=\"center\">\n" +
//	    	        "<tr bgcolor=\"#949494\">\n" +
//	    	        "<th>Header Name</th><th>Header Value(s)</th>\n"+
//	    	        "</tr>\n");
//	    	      
//	   Enumeration<String> headerNames = req.getHeaderNames();
//	   
//	   while(headerNames.hasMoreElements()) {
//	         String paramName = (String)headerNames.nextElement();
//	         out.print("<tr><td>" + paramName + "</td>\n");
//	         String paramValue = req.getHeader(paramName);
//	         out.println("<td> " + paramValue + "</td></tr>\n");
//	      }
//	      out.println("</table>\n</body></html>");
	    
	    out.println("<h1>" + "Hello World" + "</h1>");
	}
	
	
	
//	@Override
//	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		
//		  doGet(req, resp);
//	
//		
//		
//	}
	
//	@Override
//	public void destroy() {
////		super.destroy();
//		System.out.println("kết thúc");
//	}


}
