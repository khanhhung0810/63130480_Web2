import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ServletBMI
 */
public class ServletBMI extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	  protected void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        response.setContentType("text/html;charset=UTF-8");
	        PrintWriter out = response.getWriter();

	        out.println("<html>");
	        out.println("<head>");
	        out.println("<title>Calculator BMI</title>");
	        out.println("</head>");
	        out.println("<body>");
	        out.println("<h1>Calculator BMI</h1>");
	        out.println("<form method=\"post\" action=\"/BMI/ServletBMI\">");
	        out.println("    <label for=\"height\">Chiều cao (cm):</label>");
	        out.println("    <input type=\"text\" name=\"height\" required><br>");

	        out.println("    <label for=\"weight\">Cân nặng (kg):</label>");
	        out.println("    <input type=\"text\" name=\"weight\" required><br>");

	        out.println("    <input type=\"submit\" value=\"Tính BMI\">");
	        out.println("</form>");
	        out.println("</body>");
	        out.println("</html>");
	    }

	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        response.setContentType("text/html;charset=UTF-8");

	        String heightStr = request.getParameter("height");
	        String weightStr = request.getParameter("weight");

	        try {
	            double height = Double.parseDouble(heightStr);
	            double weight = Double.parseDouble(weightStr);

	            double bmi = calculateBMI(height, weight);

	            PrintWriter out = response.getWriter();
	            out.println("<html>");
	            out.println("<head>");
	            out.println("<title>Kết quả BMI</title>");
	            out.println("</head>");
	            out.println("<body>");
	            out.println("<h1>Kết quả BMI</h1>");
	            out.println("<p>Chiều cao: " + height + " cm</p>");
	            out.println("<p>Cân nặng: " + weight + " kg</p>");
	            out.println("<p>BMI: " + bmi + "</p>");
	            out.println("</body>");
	            out.println("</html>");
	        } catch (NumberFormatException e) {
	            response.getWriter().println("Lỗi: Vui lòng nhập số hợp lệ cho chiều cao và cân nặng.");
	        }
	    }

	    private double calculateBMI(double height, double weight) {
	        // Công thức tính BMI: BMI = Cân nặng (kg) / (Chiều cao (m))^2
	        double heightInMeter = height / 100.0;
	        return weight / (heightInMeter * heightInMeter);
	    }
}