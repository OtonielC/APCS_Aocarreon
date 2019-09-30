
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
        while(!inputStr.equals("quit")){
            System.out.println("Enter a name or type \"quit\" to quit");
            inputStr = kb.nextLine();
            System.out.println(inputStr);
            Person p = new Person(inputStr);
        }
   }
   public Person[] extendArray(Person[] p,int n){
       Person[] p2 = new Person[p.length+n];
       for(int i = 0; i < p.length; i++){
           p2[i] = p[i];
        }
       return p2;
   }
   public Person[] printNames(Person[] p, int n){
       p = extendArray(p,n);
       return p;
    }
}
