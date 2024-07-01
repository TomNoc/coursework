
/**
 * Write a description of class ATM here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;

public class ATM
{
    private Bank ownerBank;
    private String password;
    private Scanner myKbd = new Scanner(System.in);
    
    public ATM(Bank ownerBank, String password) {
        this.ownerBank = ownerBank;
        this.password = password;
    }
    //Determines if you are in the bank, if you are it will run the processAccount method if not
    //it will tell you incorrect name. Also if the ATM's password is typed then it will exit this method
    public void start() {
        while(true) {
            System.out.println("To use this ATM, Please enter your name");
            String cName = myKbd.nextLine();
            if(cName.equals(password)){
                return;
            }else{
                BankAccount bkAcct = ownerBank.findAccount(cName);
                if(bkAcct == null) {
                    System.out.println("Incorrect name. Sorry you don't have an account here.");
                }else{
                    processAccount(bkAcct);
                }
            }
        }
    }
    //Creates a menu that the customer can withdraw. deposit, or view their balance from.
    public void processAccount(BankAccount currentBankAcct) {
        String input;
        double amount;
        while(true) {
            System.out.println("What transaction would you like " + currentBankAcct.getName() + "?");
            System.out.println("Please enter q (quit); w (withdraw); d (deposit); b (current balance)");
            input = myKbd.nextLine();
            if(input.equals("q")) {
                break;
            }else if(input.equals("w")) {
                System.out.print("Please enter amount to withdraw: ");
                amount = myKbd.nextDouble();
                myKbd.nextLine();
                currentBankAcct.withdraw(amount);
            }else if(input.equals("d")) {
                System.out.print("Please enter amount to deposit: ");
                amount = myKbd.nextDouble();
                myKbd.nextLine();
                currentBankAcct.deposit(amount);
            }else if(input.equals("b")) {
                currentBankAcct.displayBalance();
            }else{
                System.out.println("That input is invalid.");
            }
        }
        System.out.println("Goodbye!");
    }
}
