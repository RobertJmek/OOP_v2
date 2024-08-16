package ro.stockmanagement.model;

public class Product {
    private final String productID;
    private String name;
    private String description;
    private double price;
    private int quantityInStock;
    private Category categoryOfProduct;


    public Product(String productID, String name, int quantityInStock, double price, String description, Category category ) {
        this.productID = productID;
        this.name = name;
        this.quantityInStock = quantityInStock;
        this.price = price;
        this.description = description;
        this.categoryOfProduct = category;
    }

    public String getProductID() {
        return this.productID;
    }
    public String getName() {
        return this.name;
    }
    public int getQuantityInStock() {
        return this.quantityInStock;
    }
    public double getPrice() {
        return this.price;
    }
    public String getDescription() {
        return this.description;
    }

    public Category getCategoryOfProduct() {
        return categoryOfProduct;
    }
    public void setPrice(double price){
        this.price = price;
    }

    public void setCategoryOfProduct(Category categoryOfProduct) {
        this.categoryOfProduct = categoryOfProduct;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }


    @Override
    public String toString() {
        return "Product ID: " + productID + "\n" + "Name of the Product: " + productID +  "\n" + "Quantity: " +  quantityInStock + "\n" + "Price: " + price + "\n" + "Category: " + (categoryOfProduct != null ? categoryOfProduct.getCategoryName() : "None" );
    }

}
