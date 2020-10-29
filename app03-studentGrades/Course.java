
/**
 * Write a description of class Course here.
 *
 * @author (Berzin Daruwala)
 * @version (28/10/2020)
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
     * Stores the title and code number
     */
    public Course(String coursename, String courseID)
    {
        // this is the course number
        this.codeNo = courseID;
       
        //this is the course name
        this.title = coursename;
        

        module1 = new Module("Programming Concepts", "CO452");
        module2 = new Module("Computer architchectures", "CO452");
        module3 = new Module("Web development", "CO451");
        // add the others 
  
    }
    
    private int ModuleNo;
    
    public void addMark (int mark, int moduleNo)
    {
        if(moduleNo == 1)
        {
            module1.awardMark(mark);
        }
    }
    public void calculateFinalMark()
    {
        int total = module1.getMark() + module2.getMark() + module3.getMark() + module4.getMark();
        
        finalMark = total / ModuleNo;
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
        if((mark >= 40) && (mark < 49))
        {
            return Grades.D;
        }
        if((mark >= 50) && (mark < 59))
        {
            return Grades.C;
        }
        if((mark >= 60) && (mark < 69))
        {
            return Grades.B;
        }
        if((mark >= 70) && (mark < 100))
        {
            return Grades.A;
        }
        
        return Grades.X;
    }
}// end of class
