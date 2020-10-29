import java.util.*;
/**
 * The course class is what the student will be enrolled in and where the 4 modules will be stored, additionaly the grade boundary data is stored here too
 * 
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
        
    private String finalGrade;
    
    private int total;
    
    private int moduleNo;
    
    private int nomodules;
    
    
    private int mark;
    

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
        module2 = new Module("Game development in java", "CO453");
        module3 = new Module("HTML coding", "CO454");
        module4 = new Module("Advanced programming", "CO455");
        
        nomodules = 4;
        
        // add the others 
  
    }
    /**
     * This code calculates the final mark of the modules, with the highest valid mark being 25 per module 
     */
    public void calculateFinalMark()
    {
        int total = module1.getMark() + module2.getMark() + module3.getMark() + module4.getMark();
        
        finalMark = module1.getMark() + module2.getMark() + module3.getMark() + module4.getMark();
        
        System.out.println(finalMark);
    }
    /**
     * This code prints out the grade
     */
    public void printGrade()
    {
        System.out.println(total);
    }
    /**
     * This displays the module name and its code 
     */ 
    public void addModule(String moduleName, String moduleCode)
    {
       if(nomodules ==1)
        {
            module1 = new Module(moduleName, moduleCode);
        }
        else if (nomodules ==2)
        {
            module2 = new Module(moduleName, moduleCode);
        }
        else if (nomodules ==3)
        {
            module3 = new Module(moduleName, moduleCode);
        }
        else if (nomodules ==4)
        {
            module4 = new Module(moduleName, moduleCode);
        }
    }
    
    /**
     * This code allows the module to recieve a mark, which is then totalled up later
     */
    public void addMark (int mark, int moduleNo)
    {
    if(moduleNo == 1)
    {
        module1.awardMark(mark); 
    }
    else if(moduleNo == 2)
    {
        module2.awardMark(mark);
    }
    else if(moduleNo == 3)
    {
        module3.awardMark(mark);
    }
    else if(moduleNo == 4)
    {
        module4.awardMark(mark);
    }
    
    }
    /**
     * Prints out details of the course 
     *
     *
     */
    public void print()
    {
    if (nomodules <= 3)
    {
        System.out.println("Invalid number of modules");
        System.out.println("Current number of modules: " + nomodules);
    }
    else
    {
        module1.print();
        module2.print();
        module3.print();
        module4.print();
        
        System.out.println(".....................................");
        System.out.println("Course: " + title + ", Course ID: " + codeNo);
        System.out.println(".....................................");
        System.out.println("You have been awarded a:" + finalGrade);
        
    }
        
        
    }
    /**
     * This shows the grade boundaries, whilst acting as the mark to grade conversion system
     */
    public Grades convertToGrade()
    {
        if(finalMark < 40)
        {
            return Grades.F;
        }
        else if((finalMark >= 40) && (finalMark < 49))
        {
            return Grades.D;
        }
        else if((finalMark >= 50) && (finalMark< 59))
        {
            return Grades.C;
        }
        else if((finalMark >= 60) && (finalMark < 69))
        {
            return Grades.B;
        }
        else if((finalMark >= 70) && (finalMark < 100))
        {
            return Grades.A;
        }
        return Grades.X;
        
    }
}// end of class
