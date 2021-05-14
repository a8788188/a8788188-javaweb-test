package web.test.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet(urlPatterns = { "/registerSL","/REGISTER_SL" },
//			name = "registerSLServlet",
//			loadOnStartup = 1,
//			initParams = {
//					@WebInitParam(name = "name", value = "Caleb"),
//					@WebInitParam(name = "height", value = "173") }
//)
public class RegisterSLServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
			try(PrintWriter pw = response.getWriter()){
				final ServletConfig config = getServletConfig();
				//getInitParameterNames() 取得初始化參數
				Enumeration<String> names = config.getInitParameterNames();
				while (names.hasMoreElements()) {
					final String name = names.nextElement();
					final String value = config.getInitParameter(name);
					pw.append(name)
					.append(" : ")
					.append(value)
					.append("\n");
				}
			}catch (Exception e) {
				e.printStackTrace();
			}	
	}
}
