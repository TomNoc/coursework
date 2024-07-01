/**
 * This class tests all the methods of the ComputerUser class
 * Thomas Nocera
 * 2/27/15
 */

public class Usernames
{
    public static void main (String[] args)
    {
        ComputerUser user1 = new ComputerUser("Abraham",  "Lincoln");
        ComputerUser user2 = new ComputerUser("Mahatama" , "Gandhi");
        ComputerUser user3 = new ComputerUser("Albert" ,  "Einstein");
        ComputerUser def = new ComputerUser();

        System.out.println("THE COMPUTER USERS");
        System.out.println("BEFORE SETTING THE USERNAMES ");
        System.out.println("The Computer Users on my network are: ");
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        System.out.println(def);
        
        System.out.println("\nSETTING THE USERNAMES ");
        // set the usernames for the 4 ComputerUser objects below
        user1.setUsername();
        user2.setUsername();
        user3.setUsername();
        def.setUsername();

        
        // Display all the usernames
        System.out.println("\nGETTING THE USERNAMES ");
        // Display all the 4 usernames only
        // System.out.println(user1.getUsername ()); etc. 
        System.out.println(user1.getUsername());
        System.out.println(user2.getUsername());
        System.out.println(user3.getUsername());
        System.out.println(def.getUsername());        

        // 
        System.out.println("THE COMPUTER USERS");
        System.out.println("\nAFTER SETTING THE USERNAMES ");
        System.out.println("The Computer Users on my network are: ");
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        System.out.println(def);
         
    }
}