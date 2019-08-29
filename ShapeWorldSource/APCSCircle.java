
/**
 * APCSCircle is a thin extension of a DrawableShape whose underlying shape object is
 * an AWT Ellipse object.
 * 
 * @author (Tom Malloy) 
 * @version (8/2019)
 */

import java.awt.*;
import java.awt.geom.*;
public class APCSCircle extends DrawableShape
{

    /**
     * Constructor for objects of class APCSCircle
     */
    public APCSCircle(int centerX, int centerY, int radius)
    {
        super(null, Color.BLACK);
        double leftX = centerX - ((double)radius);
        double topY = centerY - ((double)radius);
        double widthAndHeight = 2*radius;
        this.shape = new Ellipse2D.Double(leftX, topY, widthAndHeight, widthAndHeight);
    }

}
