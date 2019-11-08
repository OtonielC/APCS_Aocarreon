import java.util.*;
/**
 * Write a description of class StudentListRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentListRunner
{
    public static void main(){
        Scanner kb = new Scanner(System.in);
        String inputStr = "";
        while(!inputStr.equals("quit")){
            System.out.println("ENTER A NAME OR TYPE \"QUIT\" TO QUIT");
            inputStr = kb.nextLine();
            System.out.print(inputStr);
            System.out.println("Press 1 to add a student to the list");
            System.out.println("Press 2 to see the student list");
            System.out.println("Press 3 to add a student to the list");
        }
    }
    
    // public StudentListRunner(){
        // studList.add();
        
    // }
    
    
    public void studList(){
        
        
    }
}
