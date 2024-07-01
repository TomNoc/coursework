
/**
 * Creates the Date data type
 * 
 * @Thomas Nocera
 * @2/13/15
 */
public class Date
{
    private int month; //instance variables
    private int day;
    private int year;
    
    public Date(int m, int d, int y)
    {
        month = m;
        day = d;
        year = y;
    }
    
    public int getMonth() //accessor method (getters)
    {
        return month;
    }
    
    
    public int getDay() //accessor method (getters)
    {
        return day;
    }
    
    public int getYear() //accessor method (getters)
    {
        return year;
    }
    
    public void setMonth(int m) //mutator method (setter)
    {
        if(m >= 1 && m <= 12)
        {
            month = m;
        }
    }
    
    public void setDay(int d) //mutator method (setter)
    {
        if(d >= 1 && d <= 31)
        {
            day = d;
        }
    }
    
    public void setYear(int y) //mutator method (setter)
    {
        if(y >= 1890 && y <= 2015)
        {
            year = y;
        }
    }
    
    public String toString()
    {
        String result;
        result = month + "/" + day + "/" + year;
        return result;
    }
}
