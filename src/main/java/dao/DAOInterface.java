package main.java.dao;

import java.util.List;

import main.java.model.Product;

public interface DAOInterface {

    List<Product> getProducts();

    void addProduct(Product product);
    void deleteProduct(Product product);
    void updateProduct(Product product);
    
}
