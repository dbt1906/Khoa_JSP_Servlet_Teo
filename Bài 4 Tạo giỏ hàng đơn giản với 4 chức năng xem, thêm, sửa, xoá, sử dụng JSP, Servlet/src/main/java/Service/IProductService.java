package Service;

import Beans.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    Product findById(int id);
}
