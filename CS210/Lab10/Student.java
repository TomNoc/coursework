
/**
 * Write a description of class Student here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Student extends Person
{
    private double gpa;
   
    public Student(String fn, String ln, double avg) {
        super(fn, ln);
        gpa = avg;
    }
    
    public void print() {
        super.print();
        System.out.printf("GPA: %.2f%n", gpa);
    }
}
