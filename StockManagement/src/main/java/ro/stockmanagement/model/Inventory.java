package ro.stockmanagement.model;

import java.util.HashMap;
import java.util.Map;

public class Inventory {

    private Map<String, Product> products;

    public Inventory() {
        products = new HashMap<>();
    }

    // Add a new product to the inventory
    public void addProduct(Product product) {
        products.put(product.getProductID(), product);
    }

    // Remove a product from the inventory by its ID
    public void removeProduct(String productID) {
        products.remove(productID);
    }

    // Update the quantity and price of a product
    public void updateProduct(String productID, int newQuantity, double newPrice) {
        Product product = products.get(productID);
        if (product != null) {
            product.setQuantityInStock(newQuantity);
            product.setPrice(newPrice);
        }
    }

    // Retrieve a product by its ID
    public Product getProductByID(String ID) {
        return products.get(ID);
    }

    // Decrease the stock of a product by a specified amount
    public void decreaseStock(String ID, int amount) {
        Product product = products.get(ID);
        if (product != null) {
            int currentQuantity = product.getQuantityInStock();
            if (currentQuantity >= amount) {
                product.setQuantityInStock(currentQuantity - amount);
            } else {
                System.out.println("Not enough stock");
            }
        }
    }

    // Decrease the stock of a product by 1
    public void decreaseStockBy1(String ID) {
        Product product = products.get(ID);
        if (product != null) {
            if (product.getQuantityInStock() >= 1) {
                product.setQuantityInStock(product.getQuantityInStock() - 1);
            } else {
                System.out.println("Not enough stock");
            }
        }
    }

    // Increase the stock of a product by 1
    public void increaseStockBy1(String ID) {
        Product product = products.get(ID);
        if (product != null) {
            product.setQuantityInStock(product.getQuantityInStock() + 1);
        }
    }

    // Increase the stock of a product by a specified amount
    public void increaseStock(String ID, int amount) {
        Product product = products.get(ID);
        if (product != null) {
            product.setQuantityInStock(product.getQuantityInStock() + amount);
        }
    }

    // List all products in the inventory
    public void listAllProducts() {
        for (Product product : products.values()) {
            System.out.println(product);
        }
    }

    // Calculate the total value of all products in the inventory
    public double totalInventoryValue() {
        double totalValue = 0;
        for (Product product : products.values()) {
            totalValue += product.getPrice() * product.getQuantityInStock();
        }
        return totalValue;
    }
}
