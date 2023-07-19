import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

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
        String topping1 = request.getParameter("toppings1");
        String topping2 = request.getParameter("topping2");
        String topping3 = request.getParameter("topping3");
        System.out.println("sauce = " + sauce);
        System.out.println("size = " + size);
        System.out.println("crust = " + crust);
        if(topping1 != null){
            System.out.println("topping1 = " + topping1);
        }
        if(topping2 != null){
            System.out.println("topping2 = " + topping2);
        }
        if(topping3 != null){
            System.out.println("topping3 = " + topping3);
        }
    }
}
