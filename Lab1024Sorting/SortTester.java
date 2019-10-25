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
        System.out.println("not sorted list ");
        for(int i = 0; i < numList.size(); i++){
            System.out.print(" " + numList.get(i));
        }
        System.out.println();
        //selectionSort();
        //bubbleSort();
        insertionSort();
        System.out.println("This is the sorted list");
        for(int i = 0; i < numList.size(); i++){
            System.out.print(" " + numList.get(i));
        }
         System.out.println();
    }
    public void loadNumbers(int n){
        for(int i = 0; i < n; i++){
            int x = (int)(Math.random()*n);
            numList.add(x);
        }
    }
    
    public void bubbleSort(){
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
        SortTester sortTester = new SortTester();
    }
    
    //--------------------------------------------------------------------------
    
    public void selectionSort(){
        for(int i = 0; i < numList.size(); i++){
            int index = i;
            for(int j = i+1; j < numList.size(); j++){
                if(numList.get(j) < numList.get(index)){
                    index = j;
                }
            }
            int smallerNumber = numList.get(index);
            numList.set(index, numList.get(i));
            numList.set(i, smallerNumber);
        }
    }
    
    //---------------------------------------------------------------------------
    
    public void insertionSort(){
        int temp;
        for(int i = 0; i < numList.size(); i++){
            int j = i;
            while((j > 0) && numList.get(j) < numList.get(j-1)){
                temp = numList.get(j);
                numList.set(j, numList.get(j-1));
                numList.set(j-1, temp);
                j -= 1;
            }
        }
    }
    
    
    
    
    
    
    
}
