
/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person
{
    private String fname;
    private String lname;
    
    public Person(String fn, String ln) {
        fname = fn;
        lname = ln;
    }
    
    public void print() {
        System.out.printf("%s %s%n", fname, lname);
    }
}
