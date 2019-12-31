
/**
 * APCSColor is a thin extension of an AWT color object
 * 
 * I created it because we haven't taught them about import statements, yet
 * 
 * @author (Tom Malloy) 
 * @version (8/2019)
 */


import java.awt.Color;
public class APCSColor extends Color
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class APCSColor
     */
    public APCSColor(float red, float green, float blue)
    {
        super(red, green, blue);
    }

}
