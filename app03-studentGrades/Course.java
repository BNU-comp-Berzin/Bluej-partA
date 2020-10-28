
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
    
    private int finalMark;
        
    private Grades finalgrade;

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
    
    public void addMark (int mark, int moduleNo)
    {
        if(moduleNo == 1)
        {
            module1.awardMark(mark);
        }
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
    public Grades convertToGrade(int mark)
    {
        if((mark >= 0) && (mark < 40))
        {
            return Grades.F;
        }
        
        return Grades.X;
    }
}// end of class
