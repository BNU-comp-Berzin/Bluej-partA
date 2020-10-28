
/**
 * Write a description of class Module here.
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
    
    public void print()
    {
        System.out.println("Module: " + codeNo + " " + title + " Mark = " + mark);
    }

}
