// ****************************************************************
// LoveCS.java
//
// Use a while loop to print many messages declaring your
// passion for computer science
// ****************************************************************
import java.util.Scanner;
public class LoveCS
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many times do you want it to print?: ");
        final int LIMIT = scan.nextInt();
        int count = 1;
        int sum = 0;
        while (count <= LIMIT){
          System.out.println(count + " I love Computer Science!!");
          sum = sum + count;
          count++;
        }
        System.out.print("Printed this message " + LIMIT + " times. ");
        System.out.println("The sum of the numbers from 1 to " + LIMIT + " is " + sum + ".");
    }
}
