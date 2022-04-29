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
		
		String get1 = request.getParameter(Resources.GET1);
		String get2 = request.getParameter(Resources.GET2);
		
		request.setAttribute(Resources.GET1, get1);
		request.setAttribute(Resources.GET2, get2);
		
		request.getRequestDispatcher(Resources.VIEWS_LOGIN).forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		// attributes submitted via jsp form
		String name = request.getParameter(Resources.NAME);
		String password = request.getParameter(Resources.PASSWORD);
		
		boolean isUserValid = service.isUserValid(name, password);
		if (isUserValid) {
			request.setAttribute(Resources.NAME, name);
			request.setAttribute(Resources.PASSWORD, password);
			request.getRequestDispatcher(Resources.VIEWS_WELCOME).forward(request, response);
		} else {
			request.setAttribute(Resources.ERROR, Resources.INVALID_CREDENTIALS);
			request.getRequestDispatcher(Resources.VIEWS_LOGIN).forward(request, response);
		}
	}

}