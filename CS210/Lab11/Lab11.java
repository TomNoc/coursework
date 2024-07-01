
/**
 * Thomas Nocera 
 * Lab11
 */
public class Lab11
{
    public static void main(String[] args) {
        Person[] list;
        int count;
        
        list = new Person[4];
        list[0] = new Student("Tom", "Jones", 2.76, "29 Allendale Ave", "4013745896", "Sociology");
        list[1] = new Student("Ann", "Smith", 3.42, "80 Fruit Hill Ave", "4014569999", "Math Edn");
        list[2] = new Teacher("Ray", "Davis", 45000.00, "64 Atwells Ave", "4014567678", "Mathematics");
        list[3] = new Teacher("Joy", "Marks", 52000.00, "14 Thayer St", "4015855695", "English");
        for(count = 0; count < 4; count++){
            list[count].print();
            System.out.printf("%n");
        }
    }
}
