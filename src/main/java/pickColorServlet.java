import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="pickColorServlet", urlPatterns = "/pickcolor")
public class pickColorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/pickcolor.jsp").forward(request,response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String color = request.getParameter("colors");
        System.out.println("color = " + color);
        if(color != null){
            request.setAttribute("color", color);
            System.out.println("color = " + color);
            request.getRequestDispatcher("/viewcolor").forward(request,response);
        }
        if(color == null){
            response.sendRedirect("/pickcolor");
        }
    }


}


