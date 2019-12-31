import java.util.*;
public class FinalReview
{
    public FinalReview(){
        // sum();
        // go(3);
        print();
    }
    
    // public int sum(){
        // int[] nums = {1, 2, 3, 4, 5};
        // int sum = 0;
        // for(int i = 0; i < nums.length; i++)
            // if(sum < nums[i]) sum=nums[i];
        // return sum;
    // }
    
    // public String go(int x){
       // if (x <= 5)
          // return "same";
       // else if (x >= 3)
          // return "notsame";
       // return "done";
    // }
    
    public void print(){
        int m = 0;
        int n = 7;
        while(m < 3) {
            n--;
            m++;
        }
        System.out.print("" + m + n);

    }
    
    public static void main(){
        FinalReview fr = new FinalReview();
    }
}
