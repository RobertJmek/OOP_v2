package ro.stockmanagement.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private String orderID;
    private Date orderDate;
    private List<OrderItem> items;
    private String customerID;


    public Order(String orderID, Date orderDate, String customerID) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.customerID = customerID;
        this.items = new ArrayList<>();
    }

    public void addItem(OrderItem item){
        this.items.add(item);
    }

    public String getOrderID() {
        return orderID;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public String getCustomerID() {
        return customerID;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }
    public double getTotalValue() {
        double sum = 0;
        for (OrderItem item : items ) {
            sum += item.getTotalPrice();
        }
        return sum;
    }
    @Override
    public String toString() {
        return "Order ID: " + orderID + "\n" + "Date: " + orderDate +  "\n CustomerID: " + customerID + "\n Total value: " + getTotalValue() + '\n';
    }

}