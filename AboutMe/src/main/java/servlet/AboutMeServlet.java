package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class AboutMeServlet
 */
public class AboutMeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	  protected void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        processRequest(request, response);
	    }

	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        processRequest(request, response);
	    }

	    private void processRequest(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	       
	        response.setContentType("text/html;charset=UTF-8");

	        // Lấy đối tượng PrintWriter để ghi dữ liệu vào response
	        PrintWriter out = response.getWriter();

	        // Lấy dữ liệu nhập từ form
	        String fullName = request.getParameter("fullName");
	        String dob = request.getParameter("dob");
	        String hometown = request.getParameter("hometown");

	        // In thông tin cá nhân vào đối tượng PrintWriter
	        out.println("<html>");
	        out.println("<head>");
	        out.println("<title>About Me</title>");
	        out.println("</head>");
	        out.println("<body>");
	        out.println("<h1>Thông tin cá nhân của bạn</h1>");
	        out.println("<p>Họ và tên: " + fullName + "</p>");
	        out.println("<p>Ngày sinh: " + dob + "</p>");
	        out.println("<p>Quê quán: " + hometown + "</p>");
	        // Thêm thông tin cá nhân khác nếu cần thiết
	        out.println("</body>");
	        out.println("</html>");
	    }
}
