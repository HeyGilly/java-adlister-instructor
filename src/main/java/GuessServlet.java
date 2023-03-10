import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "GuessServlet", urlPatterns = "/guess")
public class GuessServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        // display the form
        req.getRequestDispatcher("/guess.jsp").forward(req, res);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");

        Integer numInput = Integer.valueOf(req.getParameter("guessNum"));
        Integer randomNum = 1 + (int)(Math.random() * ((3 - 1) + 1));

        System.out.println(randomNum);

        if (numInput.equals(randomNum)){
            //Correct
            req.getRequestDispatcher("/correct").forward(req, res);
        }else{
            // Incorrect
            req.getRequestDispatcher("/incorrect").forward(req, res);

        }

    }


}
