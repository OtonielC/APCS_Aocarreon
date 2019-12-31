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
    private String[] tempArr = {"cat", "catastrophe", "caterpillar", "dog"};
    
    public StringCheck(){
        loadList();
        System.out.println(wordList);
        //ArrayList<String> keyList =   wordChecker(tempArr, "cat");
        String[] keylist2 = wordChecker(wordList, "cat");
        // for(int i = 0; i < keyList.size(); i++){
            // System.out.print(keyList.get(i) + ",   ");
        // }
        // System.out.println("");
        for(int i = 0; i < keylist2.length; i++){
            if(keylist2[i] != null){
                System.out.print(keylist2[i] + ",   ");
            }
        }   
    }
    
    public void loadList(){
        wordList.add("catch");
        wordList.add("caterpillar");
        wordList.add("catastrophe");
        wordList.add("dog");
    }
    
    public static void main(String[] args){
        StringCheck sc = new StringCheck();
    }
    
    public String[] wordChecker(ArrayList<String> str, String key){
        String[] list = new String[str.size()];
        
        for(int i = 0; i < str.size(); i++){
                if(str.get(i).indexOf(key) != -1){
                    list[i] = str.get(i);
            }
        }
        return list;
    }
    
    public ArrayList<String> wordChecker(String[] str, String key){
        ArrayList<String> list = new ArrayList<String>();
        for(int i = 0; i < str.length; i++){
            if(str[i] != null){
                if(str[i].indexOf(key) != -1){
                    list.add(str[i]);
                }
            }
        }
        return list;
    }
}
