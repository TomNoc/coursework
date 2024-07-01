
/**
 * Thomas Nocera 
 * Lab11
 */
public class Student extends Person
{
    private double gpa;
    private String major;
   
    public Student(String fn, String ln, double avg, String whereLive, String pNumber, String mjr) {
        super(fn, ln, whereLive, pNumber);
        gpa = avg;
        major = mjr;
    }
    
    public void print() {
        super.print();
        System.out.println("STUDENT: " + fname + " " + lname);
        System.out.printf("MAJOR: %s GPA: %.2f%n", major, gpa);
        System.out.println("CONTACT INFO:");
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phoneNumber);
    }
}
