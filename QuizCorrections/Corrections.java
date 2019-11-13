import java.util.*;
/**
 * Write a description of class corrections here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Corrections
{
    public Corrections(){
        int[] nums = {1,2,3,4,5};
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        makeList(nums);
        reverseList(list);
        System.out.println(nums);
        System.out.println(list);
    }
    
    public ArrayList<Integer> makeList(int[] nums){
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i ++){
            temp.add(nums[i]);
        }
        return temp;
    }
    
    public int[] reverseList(ArrayList<Integer> nums){
        int[] temp = new int[nums.size()];
        for(int i = 0; i < nums.size(); i ++){
            temp[i] = nums.get((nums.size()-1)-i);
        }
        return temp;
    }
    
    public static void main(){
        Corrections c = new Corrections();
    }
}
