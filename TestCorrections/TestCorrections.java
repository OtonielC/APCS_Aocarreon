
/**
 * Corrections for the first exam of the year
 *
 * @author (Oats C)
 * @version (10/8 Test Corrections)
 */
public class TestCorrections
{
    public TestCorrections(){
        ques4();
    }
    
    public void ques4(){ //THIS QUESTION IS ANSWER B
        int num = 4;
        if(num/3 <=1){
            System.out.print("true"); //THIS PRINTS OUT TRUE 
        }
        System.out.println(" false"); //THIS WILL ALWAYS PRINT OUT ' FALSE'
    }
    
    public int ques8(){
        int[] s = {2,4,56,54,757,7};
        int count = 0;
        for(int i = 0; i < s.length; i++){
            count += s[i];
        }
        return count;
    }
}
