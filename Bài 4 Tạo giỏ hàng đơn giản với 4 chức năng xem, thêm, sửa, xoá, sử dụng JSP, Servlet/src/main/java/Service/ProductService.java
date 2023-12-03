package Service;

import Beans.Product;
import DAO.IProductDAO;
import DAO.ProductDAO;

import java.util.List;

public class ProductService implements IProductService{
    private IProductDAO productDAO = new ProductDAO();
    @Override
    public List<Product> findAll() {
        return productDAO.findALl();
    }

    @Override
    public Product findById(int id) {
        return productDAO.findById(id).stream().findFirst().get();
    }


}
