
/**
 * Creates the datatype library book that holds the information author, title, pages, and reference numbers
 * 
 * @Thomas Nocera
 * @2/24/15
 */
public class LibraryBook
{
    //Instance Variables
    private String author, title, refNumber;
    private int pages, borrowed;
    
    //Constructor
    public LibraryBook(String writer, String bookName, int pageNum)
    {
        author = writer;
        title = bookName;
        pages = pageNum;
        refNumber = "";
        borrowed = 0;
    }
    
    //Accessors
    //returns the author
    public String getAuthor()
    {
        return author;
    }
    //returns the title
    public String getTitle()
    {
        return title;
    }
    //returns the # pages
    public int getPages()
    {
        return pages;
    }
    //returns the reference number
    public String getRefNumber()
    {
        return refNumber;
    }
    public int timesBorrowed()
    {
        return borrowed;
    }
    
    //Mutators
    //prints the author
    public void printAuthor()
    {
        System.out.println(author);
    }
    //prints the title
    public void printTitle()
    {
        System.out.println(title);
    }
    //Increases how many times the book has been borrowed by 1
    public void borrow()
    {
        borrowed++;
    }
    //sets the reference number
    public void setRefNumber(String ref)
    {
        if(ref.length() >= 3){
            refNumber = ref;
        } else {
            System.out.println("The reference number must be at least 3 characters long");
        }
    }
    // prints all the instance variables, if reference number not set then it is "ZZZ"
    public void printDetails()
    {
        System.out.print("********************************************\n");
        System.out.printf("%-8s%s\n", "Title:", title);
        System.out.printf("%-8s%s\n", "Author:", author);
        System.out.printf("%-8s%d\n", "Pages:", pages);
        if(refNumber.equals(""))
        {
            System.out.printf("%-18s%s\n", "Reference Number:", "ZZZ");
        } else {
            System.out.printf("%-18s%s\n", "Reference Number:", refNumber);
        }
        System.out.printf("%-26s%d\n", "Number of times borrowed:", borrowed);
        System.out.print("********************************************\n");
    }
}
