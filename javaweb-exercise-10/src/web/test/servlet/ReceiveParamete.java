package web.test.servlet;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ReceiveParamete")
public class ReceiveParamete extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		final String name = request.getParameter("name");
		final String[] hobbies = request.getParameterValues("hobbies");
		
		System.out.println("name:"+name);
		System.out.println("興趣:"+Arrays.deepToString(hobbies));
		
		response.setStatus(HttpServletResponse.SC_NO_CONTENT);
	}

}
