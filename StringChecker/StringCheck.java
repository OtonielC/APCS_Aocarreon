import java.util.*;
/**
 * Checks For key string in array
 *
 * @author (Oats)
 * @version (10/31)
 */
public class StringCheck
{   
    public static void main(String[] args){
        ArrayList<String> strList = new ArrayList<String>(10);
        
        strList.add("catch");
        strList.add("caterpillar");
        strList.add("catastrophe");
        strList.add("dog");
        
        Scanner kb = new Scanner(System.in);
        String inputStr = "";
        while(!inputStr.equals("quit")){
            System.out.println("Enter a key or type \"quit\" to quit");
            inputStr = kb.nextLine();
            System.out.println(inputStr);
        }
        
        
        
        System.out.println(strList);
    }
}
