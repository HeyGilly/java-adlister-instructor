import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = "/pizza-order")
public class PizzaOrderServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        // display the form
        req.getRequestDispatcher("/pizza-order.jsp").forward(req, res);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");

        String crustType = req.getParameter("crust-type");
        String sauceType = req.getParameter("sauce-type");
        String sizeOfPizza = req.getParameter("sauce-type");

        //-- Topping
        String[] toppings = req.getParameterValues("topping");

        // get the form data
        String address1 = req.getParameter("address1");
        String address2 = req.getParameter("address2");
        String city = req.getParameter("city");
        String state = req.getParameter("state");
        String zip = req.getParameter("zip");


        Boolean checkForNullForCrustSauceSize = crustType != null && sauceType != null && sizeOfPizza != null;
        Boolean checkForNullForAddress = address1 != null && city != null && state != null && zip != null;


        if (crustType != null && sauceType != null && sizeOfPizza != null && address1 != "" && city != "" && state != "" && zip != "") {

            //-- toppings
            if (toppings != null) {
                System.out.println("Toppings: ");
                for (String topping : toppings) {
                    System.out.println("\t" + topping);
                }
            }

            System.out.println("Crust Type: " + crustType);
            System.out.println("Sauce Type: " + sauceType);
            System.out.println("Size: " + sizeOfPizza);
            // print the form data to the console
            System.out.println("Address 1: " + address1);
            System.out.println("Address 2: " + address2);
            System.out.println("City: " + city);
            System.out.println("State: " + state);
            System.out.println("Zip: " + zip);

            // redirect to a success page
            req.getRequestDispatcher("/pizza-order.jsp").forward(req, res);
        } else{
            System.out.println("no answer");
            req.getRequestDispatcher("/pizza-order.jsp").forward(req, res);

        }
    }
}
