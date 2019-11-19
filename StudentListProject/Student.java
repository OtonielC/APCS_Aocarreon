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
    String fullName;
    int stuNumber;
    double gpa;
    
    public Student(int sn, double gpa, String name){
        gpa = gpa;
        stuNumber = sn;
        fullName = name;
        
    }
    
    public void parseName(String fullName){
        if(fullName.indexOf(",") != -1){
            int s1 = fullName.indexOf(",");
            lName = fullName.substring(0, s1);
            if(fullName.indexOf(" ") != fullName.lastIndexOf(" ")){
                int s2 = fullName.indexOf(" ");
                int s3 = fullName.lastIndexOf(" ");
                fName = fullName.substring(s2, s3);
                int s4 = fullName.lastIndexOf(" ");
                mName = fullName.substring(s4 +1);
            }
            else{
                int s2 = fullName.indexOf(" ");
                int s3 = fullName.lastIndexOf(" ");
                fName = fullName.substring(s2, s3);
            }
            System.out.print(fName + " " + mName + " " + lName + ".");
        }
        if(fullName.indexOf(",") == -1){
            int s1 = fullName.indexOf(" ");
            fName = fullName.substring(0,s1);
            if(fullName.indexOf(" ") != fullName.lastIndexOf(" ")){
                int s2 = fullName.lastIndexOf(" ");
                mName = fullName.substring(s1, s2);
                int s3 = fullName.lastIndexOf(" ");
                lName = fullName.substring(s3);
                System.out.print(fName + " " + mName + " " + lName + ".");
            }
            else{
                int s2 = fullName.lastIndexOf(" ");
                lName = fullName.substring(s2);   
                System.out.print(fName + " " + lName + ".");
            }
        }
    }    
    
    public String getfullName(){
        return fullName;
    }
    
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
