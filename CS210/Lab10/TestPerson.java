
/**
 * Write a description of class TestPerson here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestPerson
{
    public static void main(String[] args) {
        Person[] list;
        int count;
        
        list = new Person[4];
        list[0] = new Student("Tom", "Jones", 2.76);
        list[1] = new Student("Ann", "Smith", 3.42);
        list[2] = new Teacher("Ray", "Davis", 45000.00);
        list[3] = new Teacher("Joy", "Marks", 52000.00);
        for(count = 0; count < 4; count++){
            list[count].print();
            System.out.printf("%n");
        }
    }
}
