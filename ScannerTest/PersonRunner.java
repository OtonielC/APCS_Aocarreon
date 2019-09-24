
/**
 * Scanner tester
 *
 * @author (Oats)
 * @version (924)
 */

import java.util.*;
public class PersonRunner{
   public static void main(){
        Scanner kb = new Scanner(System.in);
        String inputStr = "";
        String person = new String("");
        //  if(str1 == str2)
        while(!inputStr.equals("quit")){
            System.out.println("Enter a name or type \"quit\" to quit");
            inputStr = kb.nextLine();
            System.out.println(inputStr);
            person = inputStr;
        }
        
        
   }
}
