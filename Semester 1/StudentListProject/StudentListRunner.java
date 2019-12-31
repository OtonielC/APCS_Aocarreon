
/**
 * Runs the Student List
 *
 * @author (Oats)
 * @version (11/14)
 */
import java.util.*;
public class StudentListRunner
{
    StudentList studentlist = new StudentList();
    public StudentListRunner(){
        mainMenu();
    }

    public void mainMenu(){
        Scanner kb = new Scanner(System.in);
        String inputStr = "";
        while(!inputStr.equals("9")){
            System.out.println("type in a number to make an action");
            System.out.println("1 ADDS STUDENT TO LIST");
            System.out.println("2 DELETES STUDENT FROM LiST");
            System.out.println("3 EDITS STUDENT LIST");
            System.out.println("4 CLEARS LIST");
            System.out.println("5 PRINTS LIST");
            System.out.println("6 PRINTS STUDENT");
            System.out.println("7 SORTS STUDENTS");
            System.out.println("8 SEARCHES STUDENTS BY FILTER");
            System.out.println("9 QUITS PROJECT");
            inputStr = kb.nextLine();
            if(inputStr.equals("1")){

                System.out.println("Please type in the student number:");
                inputStr = kb.nextLine();
                int stuNumber = Integer.parseInt(inputStr);
                System.out.println("Please type in the gpa:");
                inputStr = kb.nextLine();
                double gpa = Integer.parseInt(inputStr);
                System.out.println("Please type in the student name:");
                inputStr = kb.nextLine();
                String fullName = inputStr;

                studentlist.addStudentToList(stuNumber, gpa, fullName);

            }
            // else if(inputStr.equals("2")){
                
            // }
            // else if(inputStr.equals("3")){
                
            // }
            // else if(inputStr.equals("4")){
                
            // }
            else if(inputStr.equals("5")){
                studentlist.printList();
            }
            // else if(inputStr.equals("6")){
                
            // }
            // else if(inputStr.equals("7")){
                
            // }
            // else if(inputStr.equals("8")){
                
            // }
            if(inputStr.equals("9")){
                System.out.println("");
                System.out.println("THANKS FOR USING MY PROGRAM");
            }
        }
    }

    public static void main(){
        StudentListRunner slr = new StudentListRunner();
    }
}
