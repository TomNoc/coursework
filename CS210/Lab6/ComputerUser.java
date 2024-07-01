/**
 * This class represnts a Computer User.
 * Thomas Nocera
 * 2/27/15
 */

public class ComputerUser
{
    private String firstname;
    private String lastname;
    private String username;

    public ComputerUser (String fname, String lname)
    {
        firstname = fname;
        lastname = lname;
    }

    public ComputerUser ()
    {
        firstname = "User";
        lastname = "Default";
        
    } 

    public void setFirstname (String fn)
    {
        firstname = fn;
    }

    public String getFirstname ()
    {
        return firstname;
    }
    
    public void setLastname (String ln)
    {
        lastname = ln;
    }

    public String getLastname ()
    {
        return lastname;
    }
    
    public void setUsername() {
        String fn = firstname.substring(0,1);
        String ln = lastname.substring(0,5);
        int rnd = (int) (Math.random() * 90) + 10;
        username = String.format("%s%s%d", fn, ln, rnd);
    }
    
    public String getUsername() {
        return username;
    }
    
    public String toString ()
    {
        return lastname + ", " + firstname + " : " + username;
    }
}