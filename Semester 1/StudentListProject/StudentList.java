import java.util.*;
/**
 * Student Project
 *
 * @author (Oats)
 * @version (10/31)
 */
public class StudentList
{
    ArrayList<Student> studList = new ArrayList<Student>();
    
    public StudentList(){
        
    }
    
    public void addStudentToList(int stuNum, double gpa, String fullName){
        Student student = new Student(stuNum, gpa, fullName);
        studList.add(student);
    }
    
    // public void delete(){
        
    // }
    
    // public void edit(){
        
    // }
    
    public void printList(){
        for(int i = 0; i < studList.size(); i++){
            System.out.println("The student's Name is" + studList.get(i));
        }
     }
    
    // public void printStudent(int stuNumber){
        
    // }
    
    // public void search(){
        
    // }
    
    // public void clear(){
        
    // }
    
    
    
    
    
    
}
