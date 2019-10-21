import java.util.*;
/**
 * Sorter Class
 *
 * @author (Oats)
 * @version (10/21)
 */
public class SortTester
{
    ArrayList<Integer> numList = new ArrayList<Integer>();
    public SortTester(){
        loadNumbers(10);
        bubbleSort(numList);
        for(int i = 0; i < numList.size(); i++){
            System.out.print(" " + numList.get(i));
        }
    }
    public void loadNumbers(int n){
        for(int i = 0; i < n; i++){
            int x = (int)(Math.random()*n);
            numList.add(x);
        }
    }
    
    public void bubbleSort(ArrayList<Integer> numList){
        int n = numList.size();
        int temp = 0;
        for(int i = n-1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(numList.get(j) > numList.get(j+1)){
                    temp = numList.get(j+1);
                    numList.set(j+1,numList.get(j));
                    numList.set(j,numList.get(temp));
                }
            }
        }
    }
    
    public static void main(){
        SortTester sorttester = new SortTester();
    }
}
