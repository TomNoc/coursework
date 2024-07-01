
/**
 * Messing around with the LibraryBook class
 * 
 * @Thomas Nocera
 * @2/24/15
 */
public class PlayWithLib
{
    public static void main(String args[])
    {
        LibraryBook b1 = new LibraryBook("Charles Dickens","Oliver Twist",496);
        LibraryBook b2 = new LibraryBook("Thomas Nocera","Ferret Palooza",1080);
        
        System.out.println("Book 1 author:");
        b1.printAuthor();
        System.out.println("Book 2 title:");
        b2.printTitle();
        System.out.println("Book 2 borrowed:");
        System.out.println(b2.timesBorrowed());
        System.out.println("Book 2 borrowed twice:");
        b2.borrow();
        b2.borrow();
        System.out.println(b2.timesBorrowed());
        System.out.println("Book 1 refNumber being set to \"AC\"");
        b1.setRefNumber("AC");
        System.out.println("Book 1 refNumber being set to \"ABC\"");
        b1.setRefNumber("ABC");
        System.out.println("Book 1 printDetails:");
        b1.printDetails();
        System.out.println("Book 2 printDetails:");
        b2.printDetails();
    }
}
