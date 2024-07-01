import java.util.Scanner;
public class Money
{
	public static void main(String[] args)
	{
		int quarters, dimes, nickels, pennies; //input variables
		int total, dollars, cents;
		//total will be the total value of the change in cents
		//dollars will be the dollars part in total
		//cents will be the cents part in the total
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of quarters: ");
		quarters = scan.nextInt();
		System.out.println("Enter the number of dimes: ");
		dimes = scan.nextInt();
		System.out.println("Enter the number of nickels: ");
		nickels = scan.nextInt();
		System.out.println("Enter the number of pennies: ");
		pennies = scan.nextInt();
		total = (quarters * 25) + (dimes * 10) + (nickels * 5) + (pennies);
		dollars = total / 100;
		cents = total % 100;
		if(cents < 10)
		{
			System.out.println("Total value: $" + dollars + ".0" + cents);
		} else {
			System.out.println("Total value: $" + dollars + "." + cents);
		}
	}
}