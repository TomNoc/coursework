// ************************************************************
// ManageAccounts.java
//
// Use Account class to create and manage Sally and Joe's
// bank accounts
// ************************************************** 
public class ManageAccounts
{
    public static void main(String[] args)
    {
        Account acct1, acct2;
        //creating account1 for Sally with $1000
        acct1 = new Account(1000, "Sally", 1111);
        //create account2 with $500 with a different account number and YOUR NAME
        acct2 = new Account(500, "Thomas", 1112);

        System.out.print("***********Starting Balances****************");
        // print the balance in each account showing name and balance -- see SAMPLE RUN (use getName() , getBalance())
        System.out.printf("\n%s's balance $%.2f", acct1.getName(), acct1.getBalance());   
        System.out.printf("\n%s's balance $%.2f", acct2.getName(), acct2.getBalance());  
        System.out.print("\n***********Transactions****************");
        //deposit $100 to YOUR account
        acct2.deposit(100);
        //print YOUR (e.g. Brian) new balance (use getBalance()) -- see SAMPLE RUN 
        System.out.printf("\n%.2f", acct2.getBalance());
        //withdraw $50 from Sally's account
        acct1.withdraw(50);
        //print Sally's new balance (use getBalance()) -- see SAMPLE RUN 
        System.out.printf("\n%.2f", acct1.getBalance());
        System.out.print("\n***********Fees****************");
        //charge fees to both accounts
        acct1.chargeFee();
        System.out.printf("\n%.2f", acct1.getBalance());
        acct2.chargeFee();
        System.out.printf("\n%.2f", acct2.getBalance());
        //change the name on Sally's account to Sabrina
        acct1.changeName("Sabrina");
        System.out.print("\n***********Final Summary****************");
        //print summary for each account -- see SAMPLE run (by printing the account objects).
        System.out.print(acct1);
        System.out.print(acct2);
    }
} // end of class
