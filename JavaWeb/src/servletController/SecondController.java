package servletController;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Second
 */
@WebServlet("/Second")
public class SecondController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public SecondController() {
        super();
    }
 protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
		// request
		
	 
	 
	 
	 
	 
	 
	 
	 
	 request.getRequestDispatcher("/Second.jsp").forward(request, response);
		// response
   
 
 }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
