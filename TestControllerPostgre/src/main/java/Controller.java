import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="Controller", urlPatterns = {"/Controller"})
public class Controller extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            MotorSQL motorSQL = new MotorSQL();
            try {
                motorSQL.conectar();
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
    }
}
