import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.PrintWriter;

//-- WebServlet: this allows us to specify what URL this servlet should handle.
@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
//-- Class definition, Class must extend HttpServlet, Class can be named anything just descriptive
//-- Commonly suffix with Servlet
public class HelloWorldServlet extends HttpServlet {

    //-- It is overriding the definition from a parent class.
    @Override
    // --
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        //-- Using the object to send some HTML as a response, similar to System.out.println
        //-- However we us it to print out the response to the browser, instead of console.
        PrintWriter out = response.getWriter();
        out.println("<h1>Hello, World!</h1>");

        //-- This allows us to extract a value for a parameter submitted with a request
        //
        String name = request.getParameter("name");
        if (name != null) {
            out.println(" <h3>hello " + name + " This is how we do it! </h3>");
        }

    }
}