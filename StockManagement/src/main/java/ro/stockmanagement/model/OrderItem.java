package ro.stockmanagement.model;

public class OrderItem {
    private Product item;
    private int quantity;
    private double price;

    public OrderItem(Product item, int quantity, double price){
        this.item = item;
        this.quantity = quantity;
        this.price = price;
    }

    public Product getItem() {
        return item;
    }

    public void setItem(Product item) {
        this.item = item;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getTotalPrice(){
        return price * quantity;
    }
    @Override
    public String toString(){
        return "Product: " + item.getName() + "\n Quantity: " + this.quantity + "\n Price per unit: " + this.price;
    }
}

