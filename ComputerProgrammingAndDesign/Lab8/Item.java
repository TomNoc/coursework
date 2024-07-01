// ***************************************************************
//   Item.java
//
//   Represents an item in a shopping cart.
// ***************************************************************

import java.text.NumberFormat;

public class Item
{
    private String name;
    private double price;
    private int quantity;


    // -------------------------------------------------------
    //  Create a new item with the given attributes.
    // -------------------------------------------------------
    public Item (String itemName, double itemPrice, int numPurchased)
    {
	name = itemName;
	price = itemPrice;
	quantity = numPurchased;
    }


    // -------------------------------------------------------
    //   Return a string with the information about the item
    // -------------------------------------------------------
    public String toString ()
    {
	NumberFormat fmt = NumberFormat.getCurrencyInstance();

	return String.format("%-15s$%-8.2f%-11d%-15.2f", name, price, quantity, price*quantity);
    }

    // -------------------------------------------------
    //   Returns the unit price of the item
    // -------------------------------------------------
    public double getPrice()
    {
	return price;
    }

    // -------------------------------------------------
    //   Returns the name of the item
    // -------------------------------------------------
    public String getName()
    {
	return name;
    }

    // -------------------------------------------------
    //   Returns the quantity of the item
    // -------------------------------------------------
    public int getQuantity()
    {
	return quantity;
    }
}  
