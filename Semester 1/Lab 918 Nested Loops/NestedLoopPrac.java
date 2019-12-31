
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
        halfPyramid();
        square();
        universal();
        e();
    }
    
    public void halfPyramid(){
      int rows = 5;
      for(int i = 1; i <= rows; ++i)
      {
          for(int j = 1; j <= i; ++j)
          {
             System.out.print(j + " ");
          }
          System.out.println("");
      }
   }
    
    public void square(){
        for(int i = 5; i <= 10; i++){
            for(int j = 0; j < i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public void universal(){
        for(int r = 0; r <= 5; r++){
            for(int c = 0; c < r; c++){
                System.out.print(r);
            }
            System.out.println();
        }

    }
    
    public void e(){
       for(int i = 5; i > -5; i--)
      {
         for(int j = 0; j < i; j++)
         {
            System.out.print(" ");
         }
         for(int j = 0; j >= i; j--)
         {
            System.out.print(" ");
         }
         System.out.println("*");
      }
    }
}