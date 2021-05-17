package web.test.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Arrays;
import java.util.Map;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Map<String, String[]> parpMap = request.getParameterMap();
		for (String name : parpMap.keySet()) {
			System.out.println(name+" : "+Arrays.toString(parpMap.get(name)));
			
		}
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			DataSource ds = (DataSource) new InitialContext().lookup("java:/comp/env/jdbc/example");
			try (
					Connection conn = ds.getConnection();
					PreparedStatement pstmt = conn.prepareStatement("select *from EMP");
					ResultSet rs = pstmt.executeQuery();
					){
				while (rs.next()) {
					System.out.println(rs.getNString("ENAME"));
				}
				
			} catch (Exception e) {
			}
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

}
