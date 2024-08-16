package ro.stockmanagement.model;

import java.util.HashMap;


public class Supplier {
    private String supplierID;
    private String supplierName;
    private String contact;
    private HashMap<String, Double> products;

    public Supplier(String supplierID, String contact, String name, HashMap<String,Double> products){
        this.supplierID = supplierID;
        this.contact = contact;
        this.supplierName = name;
        this.products = new HashMap<String,Double>();
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(String supplierID) {
        this.supplierID = supplierID;
    }

    public HashMap<String, Double> getProducts() {
        return products;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setProducts(HashMap<String, Double> products) {
        this.products = products;
    }
    public void addProduct(Product product, double price){
        products.put(product.getProductID(),price);
    }
    public void removeProduct(Product product){
        products.remove(product.getProductID());
    }
    @Override
    public String toString() {
        return "Supplier ID: " + supplierID + "\n Name: " + supplierName + "\n " + "Supplier products IDs: " + products.toString();
    }
}
