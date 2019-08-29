
/**
 * APCSLine is a thin extension of a DrawableShape whose underlying shape object is
 * an AWT line object
 * 
 * If the students knew about inheritance it might not be necessary
 * 
 * @author (Tom Malloy) 
 * @version (8/2019)
 */

import java.awt.*;
import java.awt.geom.*;
public class APCSLine extends DrawableShape
{
    public static int defaultStrokeWidth = 3;
    
    /**
     * Constructor for objects of class APCSLine
     */
    public APCSLine(int startX, int startY, int endX, int endY)
    {
        super(null, defaultStrokeWidth, Color.BLACK);
        this.shape = new Line2D.Double(startX, startY, endX, endY);
    }
    
}
