
/**
 * 
 *
 * @author (Oats)
 * @version (819)
 */
public class FirstMethods
{
    private static int a;
    private static int b;
    private static int x;
    public FirstMethods()
    {
        //add(3,5);
        //subtract(3,5);
        //multiply(5,5);
        divide(a,b);
        //greaterThan(5,7);
    }

    public static void main(){
       
    }
    
    public static void add(int a, int b){
        System.out.print(a + b);
    }
    
    public static void subtract(int a, int b){
        System.out.print(a - b);
    }
    
    public static void multiply(int a, int b){
        System.out.print(a * b);
    }
    
    public static void divide(int a, int b){
        if(b>1){
            System.out.print(a / b);
        }
        if(b<1){
            System.out.print("you cannot divide by 0");
        }
    }
    
    public static void greaterThan(int a, int b){
        if(a > b){
        System.out.print(a);
    }
    else{
        System.out.print(b);
    }
    }
}