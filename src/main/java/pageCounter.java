import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CountWebServlet", urlPatterns = "/count")
public class pageCounter extends HelloWorldServlet {
    private int count;

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        count++;
        PrintWriter out = resp.getWriter();
        out.println("<h1>" + count + "</h1>");
    }
}
