import java.util.*;
/**
 * Write a description of class MMM here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MMM{
    private ArrayList<Integer> list = new ArrayList<Integer>();
    private double mean;
    private double median;
    private int[] mode = {-1, 1};

    public void MMM(){
        loadList(100);
        printList();
        findMean();
        getSum(list);
        findMedian();
    }

    public void loadList(int n){
        for(int i = 0; i < n; i++){
            int rnd = (int)(Math.random()*100) + 1;
            list.add(rnd);
        }
    }

    public void printList(){
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + ", ");
        }
        System.out.println();
    }

    public double findMean(){
        double sum = getSum(list);

        return (double)(sum/list.size());
    }

    public Integer getSum(ArrayList<Integer> numList){
        int sum = 0;

        for(int i = 0; i < numList.size(); i++){
            sum += numList.get(i); 
        }
        return sum;
    }

    public double findMedian(){
        double sum = 0;
        if(list.size() % 2 == 0){
            sum = list.get(list.size()/2 + list.size()/2 -1)/2;
        }else{
            sum = list.get(list.size()/2);
        }
        return sum;
    }
    
  }
