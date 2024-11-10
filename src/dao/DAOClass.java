package dao;

import Model.Product;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

import java.sql.DriverManager;

public class DAOClass implements DAOInterface {

    private Connection getConnection(){
        Class.forName("oracle.jdbc.OracleDriver");
        return DriverManager.getConnection("url", "username", "password");
    }

    public List<Product> getProducts() {

        List<Product> products = new ArrayList<Product>();

        try {
            Connection conn = getConnection();
            String sql = "SELECT * FROM products";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                long id = rs.getLong(1);
                String name = rs.getString(2);
                String desc = rs.getString(3);

                Product newProduct = new Product();
                newProduct.setProductId(id);
                newProduct.setProductName(name);
                newProduct.setProductDescription(desc);
                products.add(newProduct);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return products;
    }

    @Override
    public void addProduct(Product product){
        // todo: fill-in
    }
    @Override
    public void deleteProduct(Product product){
        // todo: fill-in
    }
    @Override
    public void updateProduct(Product product){
        // todo: fill-in
    }
}
