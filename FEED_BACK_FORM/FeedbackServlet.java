import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FeedbackServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String comments = request.getParameter("comments");

        out.println("<html><body>");
        out.println("<h2>Feedback Received</h2>");
        out.println("<p><b>Name:</b> " + name + "</p>");
        out.println("<p><b>Email:</b> " + email + "</p>");
        out.println("<p><b>Comments:</b> " + comments + "</p>");
        out.println("<a href='feedback.html'>Back to Form</a>");
        out.println("</body></html>");
    }
}
