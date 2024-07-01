
/**
 * Write a description of class Teacher here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Teacher extends Person
{
    private double salary;
    
    public Teacher(String fn, String ln, double pay) {
        super(fn, ln);
        salary = pay;
    }
    
    public void print() {
        super.print();
        System.out.printf("Salary: %.2f%n", salary);
    }
}
