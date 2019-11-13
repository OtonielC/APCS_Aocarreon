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
        mainMenu();
    }

    public static void mainMenu(){
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
            if(inputStr.equals("9")){
                System.out.println("");
                System.out.println("THANKS FOR USING MY PROGRAM");
            }
        }
    }
}
