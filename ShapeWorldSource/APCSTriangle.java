
/**
 * APCSTriangle is a thin extension of a DrawableShape whose underlying shape object is
 * an AWT path object with three line segments
 * 
 * @author (Tom Malloy) 
 * @version (8/2019)
 */

import java.awt.*;
import java.awt.geom.*;
public class APCSTriangle extends DrawableShape
{

    /**
     * Constructor for objects of class APCSTriangle
     */
    public APCSTriangle(int firstX, int firstY, int secondX, int secondY, int thirdX, int thirdY)
    {
        super(null, Color.BLACK);
        Path2D.Double triangle = new Path2D.Double();
        triangle.moveTo(firstX, firstY);
        triangle.lineTo(secondX, secondY);
        triangle.lineTo(thirdX, thirdY);
        triangle.lineTo(firstX, firstY);
        this.shape = triangle;
    }

}
