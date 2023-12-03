package DAO;

import Beans.Product;
import JDBIConnector.JDBIConnector;
import org.jdbi.v3.core.Jdbi;

import java.util.List;
import java.util.stream.Collectors;

public class ProductDAO implements IProductDAO{

    @Override
    public List<Product> findALl() {
        Jdbi jdbi = JDBIConnector.getJdbi();
        List<Product> products = jdbi.withHandle(handle -> {
            String sql = "SELECT * FROM products";
            return handle.createQuery(sql).mapToBean(Product.class).stream().collect(Collectors.toList());

        });
        return products;
    }

    @Override
    public List<Product> findById(int id) {
        Jdbi jdbi = JDBIConnector.getJdbi();
        List<Product> products = jdbi.withHandle(handle -> {
            String sql = "SELECT * FROM products where id =?";
            return handle.createQuery(sql).bind(0,id).mapToBean(Product.class).stream().collect(Collectors.toList());

        });
        return products;
    }
}
