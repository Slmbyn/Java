package main.java.model;

public class Product {
    long productId;
    String productName;
    String productDescription;

    public long getProductId() {
        return productId;
    }
    public String getProductName() {
        return productName;
    }
    public String getProductDescription() {
        return productDescription;
    }
    public long setProductId(long productId) {
        return this.productId = productId;
    }
    public String setProductName(String productName) {
        return this.productName = productName;
    }
    public String setProductDescription(String productDescription) {
        return this.productDescription = productDescription;
    }

    
}
