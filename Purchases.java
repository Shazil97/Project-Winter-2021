package W21COMP1008;

import java.util.ArrayList;
import java.util.Arrays;

public class Purchases {
 ArrayList<GroceryItem> purchases;

    public ArrayList<GroceryItem> getPurchases() {
        return purchases;
    }

    public void setPurchases(ArrayList<GroceryItem> purchases) {
        this.purchases = purchases;
    }

    public double getTotalPrice() {
        return TotalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        TotalPrice = totalPrice;
    }

    public String getGroceryName() {
        return GroceryName;
    }

    public void setGroceryName(String groceryName) {
        GroceryName = groceryName;
    }

    public String getCategoriesString() {
        return CategoriesString;
    }

    public void setCategoriesString(String categoriesString) {
        CategoriesString = categoriesString;
    }

    private double TotalPrice;
    private String GroceryName;

    public Purchases(ArrayList<GroceryItem> purchases, double totalPrice, String groceryName, String categoriesString) {
        this.purchases = purchases;
        TotalPrice = totalPrice;
        GroceryName = groceryName;
        CategoriesString = categoriesString;
    }

    private String CategoriesString;


}
