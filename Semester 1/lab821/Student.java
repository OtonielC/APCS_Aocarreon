
/**
 * 
 *
 * @author (Oats)
 * @version (821)
 */
public class Student
{
    //Instance Variables
    
    private static int stuNumber;
    private static String stuName;
    
    //Constructor
    
    public Student(String name, int num)
    {
        stuName = name;
        stuNumber = num;
    }
    
    //methods
    
    public String getName(){
        return stuName;    
    }
    
    public int getNum(){
        return stuNumber;
    }
}
