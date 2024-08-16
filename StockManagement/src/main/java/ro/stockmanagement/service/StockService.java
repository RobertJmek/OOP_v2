package ro.stockmanagement.service;

import ro.stockmanagement.model.Inventory;
import ro.stockmanagement.model.Product;

public class StockService {
    private Inventory inventory;
    public StockService(){
        this.inventory = new Inventory();
    }
    public void addProduct(Product product) {
        inventory.addProduct(product);
    }
    public void removeProduct(String productID){
        inventory.removeProduct(productID);
    }
    public void updateProduct(String productID, int newQuantity, double newPrice){
        inventory.updateProduct(productID,newQuantity,newPrice);
    }
    public void decreaseStock(String productID, int amount){
        inventory.decreaseStock(productID, amount);
    }
    public void increaseStock(String productID, int amount){
        inventory.increaseStock(productID,amount);
    }


}
