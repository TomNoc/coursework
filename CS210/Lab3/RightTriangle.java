
/**
 * Compute the length of the hypotenuse of a right triangle
 * 
 * @Thomas Nocera
 * @2/8/15
 */
import java.util.Scanner;
public class RightTriangle
{
    public static void main (String[] args)
    {
        double side1, side2; // lengths of the sides of a right triangle
        double hypotenuse; // length of the hypotenuse
        Scanner scan = new Scanner(System.in);
        // Get the lengths of the sides as input
        //Prompting the user
        System.out.print ("Please enter the lengths of the two sides of " +
        "a right triangle (separate by a blank space): ");
        // read the two inputs one after the other
        side1 = scan.nextDouble();
        side2 = scan.nextDouble();
        // Compute the length of the hypotenuse
        hypotenuse = Math.hypot(side1, side2);
        // Print the result
        System.out.println ("Length of the hypotenuse: " + hypotenuse);
    }
}
