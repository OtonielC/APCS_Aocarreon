import java.util.*;
/**
 * Checks For key string in array
 *
 * @author (Oats)
 * @version (10/31)
 */
public class StringCheck
{   
    private ArrayList<String> wordList = new ArrayList<String>();
    private String[] tempList = {"cat", "catastrophe", "caterpillar", "dog"};
    
    public StringCheck(){
        wordChecker(tempList, "cat");
        for(int i = 0; i < tempList.length; i++){
            System.out.print(tempList[i]);
        }
    }
    
    public static void main(String[] args){
        ArrayList<String> strList = new ArrayList<String>(10);
        
        strList.add("catch");
        strList.add("caterpillar");
        strList.add("catastrophe");
        strList.add("dog");
    }
    
    public String[] wordChecker(ArrayList<String> str, String key){
        String[] tempList = new String[10];
        for(int i = 0; i < str.size(); i++){
            if(!str.get(i).equals(null)){
                if(str.get(i).indexOf("cat") != -1){
                    tempList[i].equals(key);
                }
            }
        }
        return tempList;
    }
    
    public ArrayList<String> wordChecker(String[] str, String key){
        ArrayList<String> tempList = new ArrayList<String>();
        for(int i = 0; i < str.length; i++){
            if(str[i] != null){
                if(str[i].indexOf(key) != -1){
                    tempList.add(str[i]);
                }
            }
        }
        return tempList;
    }
}
