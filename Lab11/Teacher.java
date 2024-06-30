
/**
 * Thomas Nocera 
 * Lab11
 */
public class Teacher extends Person
{
    private double salary;
    private String department;
    
    public Teacher(String fn, String ln, double pay, String whereLive, String pNumber, String dpt) {
        super(fn, ln, whereLive, pNumber);
        salary = pay;
        department = dpt;
    }
    
    public void print() {
        System.out.println("TEACHER: " + fname + " " + lname);
        System.out.printf("DEPARTMENT: %s SALARAY: %.2f%n", department, salary);
        System.out.println("CONTACT INFO:");
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phoneNumber);
    }
}
