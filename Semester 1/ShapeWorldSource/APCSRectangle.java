
/**
 * APCSRectangle is a thin extension of a DrawableShape whose underlying shape object is
 * an AWT rectangle object
 * 
 * If the students knew about inheritance it might not be necessary
 * 
 * @author (Tom Malloy) 
 * @version (8/2019)
 */


import java.awt.*;
import java.awt.geom.*;
public class APCSRectangle extends DrawableShape
{
    /**
     * Constructor for objects of class APCSRectangle
     */
    public APCSRectangle(int leftX, int topY, int rightX, int bottomY)
    {
        super(null, Color.BLUE);
        this.shape = new Rectangle(leftX, topY, rightX-leftX, bottomY-topY);
    }

}
