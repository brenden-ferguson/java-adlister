import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="albumServlet",urlPatterns = "/album")
public class albumServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Album album = new Album("Pink Floyd", "The Dark Side of the Moon", 1973, 45, "Progressive/Art Rock");
        request.setAttribute("album",album);
        request.getRequestDispatcher("/album.jsp").forward(request,response);
    }
}
