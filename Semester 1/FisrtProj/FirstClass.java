
/**
 * 
 *
 * @author (Oats)
 * @version (815)
 */
public class FirstClass
{
    private static int x;
    public FirstClass()
    {
        
    }

    public static void main(){
        x = 0;
        MyName("Oats");
    }
    
    public static void MyName(String name){
        
        System.out.print("Hello World" + name + "  " + x);    
    }
}
