package web.test.servlet;


import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PdfServlet")
public class PdfServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String file = "/WEB-INF/pdf/10Android AdMob廣告看板.pdf";

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		response.setContentType("application/pdf");
		try (
				InputStream is = getServletContext().getResourceAsStream(file);
				ServletOutputStream sos = response.getOutputStream();
				) {
			byte[] bytes = new byte[is.available()];
			while (is.read(bytes) != -1) {
				sos.write(bytes);
			}
			sos.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
