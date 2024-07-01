
// ************************************************************
// Circle.java
//
// Print the area of a circle with two different radii
// ************************************************************
import java.util.Scanner;
public class Circle
{
    public static void main(String[] args)
    {
        final double PI = 3.14159;
        int radius;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a value for the radius.");
        radius = scan.nextInt();
        double area1 = PI * radius * radius;
        double circumference1 = 2 * PI * radius;
        System.out.println("The area of a circle with radius " + radius +
            " is " + area1);
        System.out.println("The circumference of a circle with radius " + radius +
            " is " + circumference1);
        radius = 2 * radius;
        double area2 = PI * radius * radius;
        double circumference2 = 2 * PI * radius;
        System.out.println("The area of a circle with radius " + radius +
            " is " + area2);
        System.out.println("The circumference of a circle with radius " + radius +
            " is " + circumference2);
        double areaChange = area2 / area1;
        double circumferenceChange = circumference2 / circumference1;
        System.out.println("The change in circumference when the radius of the circle is doubled is "
            + circumferenceChange);
        System.out.println("The change in area when the radius of the circle is doubled is "
            + areaChange);
    }
}

