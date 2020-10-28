
/**
 * Write a description of class Course here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Course
{
    // this is the codenumber
    private String codenumber;
    
    //This is the title of the course
    private String title;

    /**
     * Constructor for objects of class Course
     * Storws the title and code number
     */
    public Course(String coursename, String courseID)
    {
        // this is the course number
        this.codenumber = courseID;
       
        //this is the course name
        this.title = coursename;
       
        
  
    }

    /**
     * Prints out course name and ID
     *
     *
     */
    public void print()
    {
        // this prints out the course details 
        System.out.println("Course Name:" + title + ", Course ID:" + codenumber);
    }
}// end of class
