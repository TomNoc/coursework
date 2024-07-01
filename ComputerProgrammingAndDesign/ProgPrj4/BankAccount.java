
/**
 * Write a description of class BankAccount here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BankAccount
{
    private String name;
    private double balance;
    
    public BankAccount() {
        name = "";
        balance = 0.0;
    }
    
    public BankAccount(String aname, double startBalance) {
        name = aname;
        balance = startBalance;
    }
    
    public void deposit(double amount) {
        balance = balance + amount;
    }
    //takes money out of the bank account
    public void withdraw(double amount) {
        balance = balance - amount;
    }
    // prints the balance of the bank account
    public void displayBalance() {
        System.out.printf("The current balance is $%.2f%n",balance);
    }
    // returns the balance of the bank account
    public double getBalance() {
        return balance;
    }
    //returns the name of the person who owns this bank account
    public String getName() {
        return name;
    }
    //prints the bank account's name and balance
    public String toString() {
        return String.format("%-24s$%-10.2f",name,balance);
    }
}
