import java.util.*;
/**
 * This class is inside of all of the students that will be created
 *
 * @author (Oats)
 * @version (11/8)
 */
public class Student
{
    String fName;
    String mName;
    String lName;
    int stuNumber;
    double gpa;
    
    public String getfName(){
        return fName;
    }
    
    public String getmName(){
        return mName;
    }
    
    public String getlName(){
        return lName;
    }
    
    public void setfName(String n){
        fName = n;
    }
    
    public void setmName(String n){
        mName = n;
    }
    
    public void setlName(String n){
        lName = n;
    }
    
    public int getstuNumber(){
        return stuNumber;
    }
    
    public void setstuNumber(int n){
        stuNumber = n;
    }
    
    public double getGpa(){
        return gpa;
    }
    
    public void setGpa(double n){
        gpa = n;
    }
}
