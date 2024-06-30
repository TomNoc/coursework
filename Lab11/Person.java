
/**
 * Thomas Nocera 
 * Lab11
 */
public class Person
{
    protected String fname;
    protected String lname;
    protected String address;
    protected String phoneNumber;
    
    public Person(String fn, String ln, String whereLive, String pNumber) {
        fname = fn;
        lname = ln;
        address = whereLive;
        phoneNumber = pNumber;
    }
    
    public void print() {
        System.out.printf("%s %s%n%s%n%s%n", fname, lname, address, phoneNumber);
    }
}
