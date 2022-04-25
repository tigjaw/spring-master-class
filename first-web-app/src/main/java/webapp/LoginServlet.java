package webapp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/* Browser sends Http Request to Web Server
 * Code in Web Server => Input:HttpRequest, Output: HttpResponse
 * JEE with Servlets
 * Web Server responds with Http Response
 * Java Platform, Enterprise Edition (Java EE) JEE6
 * Servlet is a Java programming language class
 * used to extend the capabilities of servers
 * that host applications accessed by means of
 * a request-response programming model.
 * 1. extends javax.servlet.http.HttpServlet
 * 2. @WebServlet(urlPatterns = "/login.do")
 * 3. doGet(HttpServletRequest request, HttpServletResponse response)
 * 4. How is the response created? */

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {
	
	private UserValidationService service = new UserValidationService();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		// attribute (parameter) comes after http://localhost:8080/?get1=
		
		String get1 = request.getParameter("get1");
		String get2 = request.getParameter("get2");
		
		request.setAttribute("get1", get1);
		request.setAttribute("get2", get2);
		
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		// attributes submitted via jsp form
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		
		boolean isUserValid = service.isUserValid(name, password);
		if (isUserValid) {
			request.setAttribute("name", request.getParameter("name"));
			request.setAttribute("password", request.getParameter("password"));
			request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
		} else {
			request.setAttribute("error", "Invalid username or password");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}
	}

}