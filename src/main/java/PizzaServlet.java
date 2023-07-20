import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

@WebServlet(name = "PizzaFormServlet",urlPatterns = "/pizza-order")
public class PizzaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/pizza-order.jsp").forward(req,resp);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String crust = request.getParameter("crust-type");
        String sauce = request.getParameter("sauce-type");
        String size = request.getParameter("pizza-size");
        String[] toppings = request.getParameterValues("toppings");
        System.out.println("sauce = " + sauce);
        System.out.println("size = " + size);
        System.out.println("crust = " + crust);
        System.out.println("toppings = " + Arrays.toString(toppings));
        
    }
}
