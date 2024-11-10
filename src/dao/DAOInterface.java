package dao;

import Model.Product;
import java.util.List;

public interface DAOInterface {

    List<Product> getProducts();

    void addProduct(Product product);
    void deleteProduct(Product product);
    void updateProduct(Product product);
    
}
