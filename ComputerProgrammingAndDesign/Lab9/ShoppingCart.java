
/**
 * Write a description of class ShoppingCart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShoppingCart
{
    private int itemCount; //total number of items in the cart
    private double totalPrice; //total price of items in the cart
    private final int MAXSIZE = 100; //cart macimum capacity
    
    //Creates an empty shopping cart
    public ShoppingCart() {
        itemCount = 0;
        totalPrice = 0.0;
    }
    
    //Adds an item to the shopping cart
    public void addToCart(String itemName, double price, int quantity) {
    
    }
    
    //Returns the contents of the cart together with summary information
    public String toString() {
        String contents = "\nShopping Cart\n";
        contents = contents + String.format("%-12s%-12s%-10s%-7s%n","Item","Unit Price","Quantity","Item Total");
        for(int i = 0; i < itemCount; i++)
            contents = contents + cart[i].toString() + "\n";
        contents = contents + String.format("%20s%.2f%n","Current Total:",totalPrice);
        return contents;
    }
}
