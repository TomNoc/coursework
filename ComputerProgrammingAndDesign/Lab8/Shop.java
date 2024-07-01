// ***************************************************************
//   Shop.java
//
//   Uses the Item class to create items and add them to a shopping
//   cart stored in an ArrayList.
// ***************************************************************

import java.util.*;

public class Shop
{
    public static void main (String[] args)
    {
        Scanner kbd = new Scanner(System.in);
        int MAXSIZE = 100; /** Maximum size of shopping cart */
        int numberOfItems = 0; /** Current number of items */
        
        Item item;
        String itemName;
        double itemPrice;
        int quantity;
        Item[] cart = new Item[MAXSIZE];
        double total = 0;
        
        String keepShopping = "y";

        do 
        {
            System.out.print ("Enter the name of the item: "); 
            itemName = kbd.nextLine();

            System.out.print ("Enter the unit price: ");
            itemPrice = kbd.nextDouble();

            System.out.print ("Enter the quantity: ");
            quantity = kbd.nextInt();

            /** add an item to the cart.  This involves SEVERAL LINES OF CODE*/
            if(numberOfItems < MAXSIZE){
                item = new Item(itemName, itemPrice, quantity);
                cart[numberOfItems] = item;
                total += itemPrice*quantity;
                numberOfItems++;
            }else{System.out.println("You have too many items in your cart.");}
            
            /** print the contents of the cart */
            for(int i = 0; i < numberOfItems; i++){
                System.out.println(cart[i]);
            }
            
            System.out.print ("Continue shopping (y/n)? ");
            keepShopping = kbd.next();
            kbd.nextLine();
        }
        while (keepShopping.equals("y"));
        System.out.printf("Your total is: $%.2f\n", total);
        
        System.out.println("Have a Nice Day!");

    }
}

