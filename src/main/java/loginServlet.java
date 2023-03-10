import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/login")
public class loginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        // display the form
        request.getRequestDispatcher("/login.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("inputUsername");
        String password = request.getParameter("inputPassword");

        if (username != null && password != null && username.equals("admin") && password.equals("password")) {
            request.getRequestDispatcher("profile.jsp").forward(request, response);
            return;
        }

    request.getRequestDispatcher("/login.jsp").forward(request, response);

    }

}
