import java.util.*;
/**
 * Student Project
 *
 * @author (Oats)
 * @version (10/31)
 */
public class StudentList
{
    String inputStr = "";
    ArrayList<Student> studlist = new ArrayList<Student>();
    public StudentList(){
        
        
        addStudentToList(inputStr);
        // delete();
        // edit();
        printStudentList();
        // search();
        // clear();
        
    }
    
    public void addStudentToList(String fullName){
        
        if(fullName.indexOf(",") != -1){
            int s1 = fullName.indexOf(",");
            lname = fullName.substring(0, s1);
            if(fullName.indexOf(" ") != fullName.lastIndexOf(" ")){
                int s2 = fullName.indexOf(" ");
                int s3 = fullName.lastIndexOf(" ");
                fname = fullName.substring(s2, s3);
                int s4 = fullName.lastIndexOf(" ");
                mname = fullName.substring(s4 +1);
            }
            else{
                int s2 = fullName.indexOf(" ");
                int s3 = fullName.lastIndexOf(" ");
                fname = fullName.substring(s2, s3);
            }
            System.out.print(fname + " " + mname + " " + lname + ".");
        }
        if(fullName.indexOf(",") == -1){
            int s1 = fullName.indexOf(" ");
            fname = fullName.substring(0,s1);
            if(fullName.indexOf(" ") != fullName.lastIndexOf(" ")){
                int s2 = fullName.lastIndexOf(" ");
                mname = fullName.substring(s1, s2);
                int s3 = fullName.lastIndexOf(" ");
                lname = fullName.substring(s3);
                System.out.print(fname + " " + mname + " " + lname + ".");
            }
            else{
                int s2 = fullName.lastIndexOf(" ");
                lname = fullName.substring(s2);   
                System.out.print(fname + " " + lname + ".");
            }
        }
    }
    
    // public void delete(){
        
    // }
    
    // public void edit(){
        
    // }
    
    public void printStudentList(){
        
    }
    
    // public void search(){
        
    // }
    
    // public void clear(){
        
    // }
    
    public static void main(){
        StudentList studlist = new StudentList();
    }
}
