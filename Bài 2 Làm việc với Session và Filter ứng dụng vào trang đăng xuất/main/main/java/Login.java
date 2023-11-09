
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "Login", value = "/Login")
public class Login extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        HttpSession session = request.getSession();
        String e = "";
        String url;
            if(username.equals("admin")&&password.equals("password")){
                url="/admin.jsp";
                session.setAttribute("username",username);
                session.setAttribute("au",true);
            }
            else{
                e= "Sai mat khau";
                request.setAttribute("error",e);
                url="/Login.jsp";
            }
        RequestDispatcher rd = request.getServletContext().getRequestDispatcher(url);
        rd.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}