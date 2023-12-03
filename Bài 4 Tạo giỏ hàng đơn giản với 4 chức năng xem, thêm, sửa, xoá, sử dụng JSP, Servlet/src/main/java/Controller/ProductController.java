package Controller;

import Beans.Product;
import Service.IProductService;
import Service.ProductService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductController", value = "/ProductController")
public class ProductController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        IProductService productService = new ProductService();
        List<Product> products = productService.findAll();
        request.setAttribute("products",products);
        String url = "/productsList.jsp";
        request.getRequestDispatcher(url).forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}