package W21COMP1008;

public class GroceryItem {

    private  String name;

    public GroceryItem(String name, double price, String category) {
        this.name = name;
        this.price = price;
        Category = category;
    }

    private double price;
    private String Category;


    public String getName() {

        return name;
    }

    public void setName(String name) {
        name = name.toLowerCase();
        if(name.length()<2)
        this.name = name;
        else{
            throw new IllegalArgumentException(name +" Please enter valid name"+ getName());
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price >= 0 && price <= 150)
        this.price = price;
        else{
            throw new IllegalArgumentException(price+"Please enter valid range of numbers"+ getPrice());
        }
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        if(category="vegetable",category="fruit",category="meat", category="fish",category="dairy", category="bread",
                category="condiments"
            this.Category =category;
        Category = category;
        else {
            this new IllegalArgumentException(category+"Please enter valid names in category"+getCategory());

        }
    }
    public String toString()
    {
     return name +  Category + price;
    }


}
