
/**
 * Write a description of class UseBank here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;

public class UseBank
{
   public static void main (String[] args)
   {
        Bank bayBank = new Bank();
        bayBank.addAccount("George Washington", 100.75);
        bayBank.addAccount("Abraham Lincoln", 351.50);
        bayBank.addAccount("George Bush", 20000.50);
        bayBank.addAccount("Bill Clinton", 100000.50);
        bayBank.addAccount("Jimmy Carter", 200.50);
        bayBank.addAccount("John F. Kennedy", 675.50);
        bayBank.addAccount("Barrack Obama", 50000.00);  
        bayBank.addAccount("Slumdog Millionaire", 1000000.00);  
    
        System.out.println("ALL ACCOUNTS: ");
        bayBank.showAllAccounts();
    // Uncomment the 2 lines below if you do the extra credit
        // bayBank.removeAccount("George Bush");
        //bayBank.showAllAccounts();
       
        ATM atm1 = new ATM(bayBank, "Shut Down");
        System.out.println();
        System.out.println();
        atm1.start();
    }
}