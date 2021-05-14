package web.test.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MyFirstServlet")
public class MyFirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//  response.getWriter().append("Served at: ").append(request.getContextPath());
		SimpleDateFormat sdf = new SimpleDateFormat("yyy/MM/dd HH:mm:ss");
		Date date = new Date();

		try (PrintWriter pw = response.getWriter()) {
			pw.append(sdf.format(date)).append("\t").append("00").append("\t").append("EMT");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}