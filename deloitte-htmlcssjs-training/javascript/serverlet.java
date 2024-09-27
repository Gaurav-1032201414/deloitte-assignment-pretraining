import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ContactServlet")
public class ContactServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Set response content type
        response.setContentType("text/html");

        // Retrieve form data
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String subject = request.getParameter("subject");
        String content = request.getParameter("content");

        // Process the data (e.g., save to database, send email)
        // For demonstration, we'll just print the data to the console
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Subject: " + subject);
        System.out.println("Content: " + content);

        // Send response back to client
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Thank you for contacting us, " + name + "!</h2>");
        out.println("<p>We have received your message and will get back to you shortly.</p>");
        out.println("</body></html>");
    }
}