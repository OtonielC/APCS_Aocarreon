package ReviewOneFinalTest;


/**
 * Write a description of class Answers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Answers
{
    public Answers(){
        test();
    }
    
    public int test(){
        int[] nums = {1, 2, 3, 4, 5};
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
		if(sum > nums[i]){sum+=nums[i];}
        }
        return sum;
    }
    
    public static void main(){
        Answers answers = new Answers();
    }
}
