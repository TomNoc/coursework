
/**
 * Uses a new data type to test out object oriented programming
 * 
 * @Thomas Nocera
 * @2/13/15
 */
public class PlayWithClasses
{
    public static void main(String[] args)
    {
        Date birthday = new Date(0, 28, 1996);
        Date anniversary = new Date(12, 3, 2013);

        birthday.setMonth(4);
        
        System.out.println("My birthday is: " + birthday);
        System.out.println("My anniversary is: " + anniversary);
    }
}
