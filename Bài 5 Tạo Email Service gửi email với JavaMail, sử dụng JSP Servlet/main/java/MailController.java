import JavaMail.EmailService;
import JavaMail.IJavaMail;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "MailController", value = "/MailController")
public class MailController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String to = request.getParameter("email");
        IJavaMail emailService = new EmailService();
        String mess = "Chúc mừng bạn đã đăng ký nhận email từ cửa hàng chúng tôi thành công!";
        emailService.send(to,"Cửa hàng ABC thông báo",mess);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}