
/**
 * Write a description of class Bank here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bank
{
   private final int MAXSIZE = 100;
   private BankAccount[] accounts;
   private int size;
   
   public Bank() {
       accounts = new BankAccount[MAXSIZE];
       size = 0;
   }
   // Adds an account to the bank that calls this method
   public void addAccount(String customerName, double initialBalance) {
       BankAccount account = new BankAccount(customerName, initialBalance);
       accounts[size] = account;
       size++;
   }
   // Prints all accounts in this bank
   public void showAllAccounts() {
       for(int i = 0; i < size; i++) {
           System.out.println(accounts[i]);
       }
   }
   //returns the bankAccount using the customer's name
   public BankAccount findAccount(String custName) {
       for(int i = 0; i < size; i++) {
           if(accounts[i].getName().equals(custName)) {
               return accounts[i];
           }
       }
       return null;
   }
}
