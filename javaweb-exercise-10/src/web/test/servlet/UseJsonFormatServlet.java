package web.test.servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.Buffer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

@WebServlet("/UseJsonFormatServlet")
public class UseJsonFormatServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Gson gson = new Gson();

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("application/json");
		try (
				BufferedReader br = request.getReader();
				PrintWriter pw = response.getWriter();
			) {
			Member member = gson.fromJson(br, Member.class);
			member.setPass(true);
			
			pw.print(gson.toJson(member));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
