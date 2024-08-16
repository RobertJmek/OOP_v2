package ro.stockmanagement.model;

public class Category {

    private String categoryID;
    private String categoryName;
    private String categoryDescription;

    public Category(String categoryID, String name, String description) {
        this.categoryID = categoryID;
        this.categoryName = name;
        this.categoryDescription = description;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public String getCategoryID() {
        return categoryID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    @Override
    public String toString() {
        return "Category ID: " + categoryID  + "\n" + "Category name: " + categoryName + "\n" + "Category description: " + categoryDescription + "\n" ;
    }
}
