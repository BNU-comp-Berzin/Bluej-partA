
/**
 * This class represents the modules the students must take with all 4 having a total mark of 100
 *
 * @author (Berzin Daruwala)
 * @version (28/10/2020)
 */
public class Module
{
    private String title;
    
    
    private String codeNo;
    
    
    private int mark;
   
    

    /**
     * Constructor for objects of class Module
     */
    public Module(String title, String codeNo)
    {
       this.title = title;
       this.codeNo = codeNo;
    }
    
    public int getMark()
    {
        return mark;
    }
    
    public void awardMark(int mark)
    {
        if((mark >= 0) && (mark <= 100))
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
