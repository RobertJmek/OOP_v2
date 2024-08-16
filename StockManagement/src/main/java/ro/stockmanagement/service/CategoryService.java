package ro.stockmanagement.service;

import ro.stockmanagement.model.Category;
import  java.util.HashMap;
import  java.util.Map;

public class CategoryService {
    private Map<String, Category> categories;
    public CategoryService() {
        categories = new HashMap<>();
    }
    public void addCategory(Category category){
        categories.put(category.getCategoryID(), category);
    }
    public void removeCategory(String categoryID){
        categories.remove(categoryID);
    }
    public Category findCategoryByID(String categoryID){
        return categories.get(categoryID);
    }
    public void listAllCategories() {
        for ( Category category : categories.values() ) {
            System.out.println(category);
        }
    }

}
