
/**
 * This class represents a course module and contains
 * information on the module title and code.
 *
 * @author Jesse Mwansa
 * @version 1.0 15/10/2021
 */
public class Course
{
    // instance variables- replace the eample below with your own
    
    private String code;
    // 
    private String title;
    
    private int credit;
    private Module module;
    
        /**
        * Create a course with a maximum number of enrolments.
        * All other details are set to known values.
        */
        public module(String code, String title)
        {
        // initialise instance variables
        credit=15;
        this.code= code;
        this.title=title;
        }    
        public String getCode()
        {
            return code;
        }

       
 
        public String getTitle()
      {
        return title;
        
     
      public void setCredit(int credit)
      {
       this.credit=credit;
      }
      
      /**
      * Print the details of the course, the list
      * of students enrolled and the module
      */
      public void print()
      {
      System.out.println("Module code: "+ code +":" 
                       + title +"Credit" + credit);
      System.out.println();
      }

      /**
       * Print out the details of the course to the terminal.
       */
      private void printHeading();
    {
        System.out.println("----------------------------");
        System.out.println("  Apps211: Course Details");
        System.out.println("----------------------------");
        System.out.println();
    }
    
       public addModule(Module module)
       {
            this.module = module;
       }

    
    }