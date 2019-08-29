
/**
 * 
 *
 * @author (Oats)
 * @version (821)
 */
public class Pumpkin
{
    //Instance Variables
    
    private static double rad;
    private static int id;
    
    //Constructor
    
    public Pumpkin(double r, int id)
    {
        rad = r;
        this.id = id;
    }
    
    //methods
    
    public int getId(){
        return id;    
    }
    
    public double getRadius(){
        return rad;
    }
}
