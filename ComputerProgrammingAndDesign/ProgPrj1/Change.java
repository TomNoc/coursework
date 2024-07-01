import java.util.Scanner;
public class Change
{
	public static void main(String[] args)
	{
		double total; //input variable
		int tens, fives, ones, quarters, dimes, nickels; //output variables
		int remainingCents; //to keep track of the remaining cents as you compute the change
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter monetary amount:");
		total = scan.nextDouble();
		remainingCents = (int) (total * 100);
		tens = remainingCents / 1000;
		remainingCents = remainingCents % 1000;
		fives = remainingCents / 500;
		remainingCents = remainingCents % 500;
		ones = remainingCents / 100;
		remainingCents = remainingCents % 100;
		quarters = remainingCents / 25;
		remainingCents = remainingCents % 25;
		dimes = remainingCents / 10;
		remainingCents = remainingCents % 10;
		nickels = remainingCents / 5;
		remainingCents = remainingCents % 5;
		System.out.println("That's equivalent to:");
		System.out.println(tens + " ten dollar bills");
		System.out.println(fives + " five dollar bills");
		System.out.println(ones + " one dollar bills");
		System.out.println(quarters + " quarters");
		System.out.println(dimes + " dimes");
		System.out.println(nickels + " nickels");
		System.out.println(remainingCents + " pennies");
	}
}