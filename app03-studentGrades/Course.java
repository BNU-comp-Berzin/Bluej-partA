
/**
 * Write a description of class Course here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Course
{
    // this is the codenumber
    private String codeNo;
    private String title;
    
    private Module module1;
    private Module module2;
    private Module module3;
    private Module module4;

    /**
     * Constructor for objects of class Course
     * Storws the title and code number
     */
    public Course(String coursename, String courseID)
    {
        // this is the course number
        this.codeNo = courseID;
       
        //this is the course name
        this.title = coursename;
       
        module1 = new Module("Programming Concepts", "CO452");
        // add the others 
  
    }
    
    public void addModule (Module module, int moduleNo)
    {
        
    }
    /**
     * Prints out details of the course
     *
     *
     */
    public void print()
    {
        // this prints out the course details 
        System.out.println("Course Name:" + title + ", Course ID:" + codeNo);
    }
}// end of class
