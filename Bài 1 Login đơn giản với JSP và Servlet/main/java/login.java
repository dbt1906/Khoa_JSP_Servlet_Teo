import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "login", value = "/login")
public class login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String url;
            if(username.equals("admin")&&password.equals("admin")){
                request.setAttribute("username",username);
                url="/index.jsp";
            }
            else{
                request.setAttribute("error","Sai user hoặc mật khẩu");
                request.setAttribute("username",username);
                request.setAttribute("password",password);
                url ="/login.jsp";
            }
            RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
            rd.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                doGet(request,response);
    }
}