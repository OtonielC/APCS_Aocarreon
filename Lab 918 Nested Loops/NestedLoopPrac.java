
/**
 * Write a description of class NestedLoopPrac here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NestedLoopPrac
{
    public NestedLoopPrac()
    {
        
    }
    
    public static void halfPyramid(){
        for(var r = 0; r <= 5; r++){
            for(var c = 0; c < r; c++){
                System.out.print(r);
            }
            System.out.println();
        }
    }
    public static void square(){
        for(var i = 5; i <= 10; i++){
            for(var j = 0; j < i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void universal(){
        for(var r = 0; r <= 5; r++){
            for(var c = 0; c < r; c++){
                System.out.print(r);
            }
            System.out.println();
        }

    }
}