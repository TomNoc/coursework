
/**
 * Write a description of class ComplexVarTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ComplexVarTest
{
    public static void main(String[] args){
        ComplexVar z = new ComplexVar(1,1);
        ComplexVar c = new ComplexVar(0,2);
        System.out.println("Complex Variable Z:");
        System.out.println(z);
        System.out.println("Complex Variable C:");
        System.out.println(c);
        
        System.out.println("In polar form, respectively:");
        System.out.println(z.toPolar());
        System.out.println(c.toPolar());
        
        System.out.println("Printing the conjugate of c");
        ComplexVar w = c.conjugate();
        System.out.println(w);
        
        System.out.println("Multiplying c and z");
        System.out.println(c.multiply(z));
    }
}
