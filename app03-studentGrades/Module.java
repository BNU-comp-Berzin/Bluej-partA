
/**
 * This class represents the modules the students must take with each 4 having a total mark of 100
 *
 * @author (Berzin Daruwala)
 * @version (28/10/2020)
 */
public class Module
{
    private String title;
    private String codeNo;
    private int mark;
   
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class Module
     */
    public Module(String title, String codeNo)
    {
       mark = 0;
       this.title = title;
       this.codeNo = codeNo;
    }
    
   public void awardMark(int mark)
   {
        
    if((mark >= 0) &&(mark <= 100))
    {
        this.mark = mark;
    }
    else
    {
        System.out.print("Invalid mark!!!");
    }
    
    }
         
    /**
     * prints out the details of the course
     */
    public void print()
    {
        System.out.println("Module: " + codeNo + " " + title + " Mark = " + mark);
    }

}
