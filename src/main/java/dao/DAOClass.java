package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Product;

// HANDLES CRUD FOR DATABASE
    public class DAOClass implements DAOInterface {

    // private Connection getConnection() throws ClassNotFoundException, SQLException{
    //     Class.forName("oracle.jdbc.OracleDriver");
    //     return DriverManager.getConnection("url", "username", "password");
    // }

    @Override
    public List<Product> getProducts() {

        List<Product> products = new ArrayList<>();

        try {
            Connection conn = ConnectionUtility.getConnection();
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
            
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return products;
    }

    @Override
    public void addProduct(Product product){
        try {
            Connection conn = ConnectionUtility.getConnection();
            String sql = "INSERT INTO products VALUES (?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setLong(1, product.getProductId());
            ps.setString(2, product.getProductName());
            ps.setString(3, product.getProductDescription());
            ps.executeUpdate();
            System.out.println("Product Added Successfully!");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
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
