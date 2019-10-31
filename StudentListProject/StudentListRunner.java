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
            StudList studList = new StudList();
        }
    }
    
    public StudentListRunner(){
        studList.add();
        
    }
}
