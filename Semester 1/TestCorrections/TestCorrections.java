
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
    
    public void ques9(){
        for(int i = 0; i < 4;i++){
            for(int j = 0; j<=i ; j++){
                System.out.print("X ");
            }
            System.out.println();
        }
    }
    
    public int digitsSum(int num, int x){ // the last question
        int count = 0;
        while(num > 0){
            x = num % 10;
            count += x;
            num = num/10;
        }
        return count;
    }
}
