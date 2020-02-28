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
    
    //---------------------------------------------------------------------------

    int[] bob = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    public void mergeSort(int[] a, int n){
        a = bob;
        if(n < 2) {return;} // Base Case
        int mid = n/2;
        int[] l = new int[mid];
        int[] r = new int[n-mid];
        for(int i = 0; i < mid; i++){
            l[i] = a[i];
        }
        for(int i = mid; i < n; i++){
            r[i-mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n-mid);
        //-------------Helper Function-------------
        merge(a, l, r, mid, n-mid);
    }
    
    public static void merge(int[] a, int[] l, int[] r, int left, int right){
        int i = 0, j = 0, k = 0;
        while(i < left && j < right){
            if(l[i] <= r[j]){
                a[k++] = l[i++];
            }
            else{
                a[k++] = r[i++];
            }
        }
        while(i < left) { a[k++] = l[i++];}
        while(j < right) {a[k++] = r[j++];}
    }
    
    
}
