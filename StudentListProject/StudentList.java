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
        StudentList studlist = new StudentList();
    }
    
    public void addStudentToList(int stuNum, double gpa, String fullName){
        Student student = new Student(stuNum, gpa, fullName);
        studList.add(student);
    }
    
    // public void delete(){
        
    // }
    
    // public void edit(){
        
    // }
    
    // public void printStudentList(String lastName){
        
    // }
    
    // public void printStudentList(int stuNumber){
        
    // }
    
    // public void search(){
        
    // }
    
    // public void clear(){
        
    // }
    
}
