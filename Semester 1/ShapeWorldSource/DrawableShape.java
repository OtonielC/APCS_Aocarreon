
/**
 * DrawableShape bundles an AWT shape object with the additional properties
 * necessary to render it; i.e. stroke, strokeColor and fillColor
 * 
 * @author (Tom Malloy) 
 * @version (8/2019)
 */

import java.awt.*;
import java.awt.geom.*;

public class DrawableShape
{
    // instance variables - replace the example below with your own
    protected Shape shape;
    private Stroke stroke;
    private Color strokeColor;
    private Color fillColor;

    /**
     * Constructor for objects of class DrawableShape
     */
    public DrawableShape(Shape shape, int strokeWidth, Color strokeColor)
    {
        this.shape = shape;
        this.stroke = new BasicStroke(strokeWidth, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);
        this.strokeColor = strokeColor;
        this.fillColor = null;
    }

    public DrawableShape(Shape shape, Color fillColor)
    {
        this.shape = shape;
        this.fillColor = fillColor;
        this.strokeColor = null;
    }

    public Shape getShape() {
        return shape;
    }

    public Stroke getStroke() {
        return stroke;
    }
    
    public Color getStrokeColor() {
        return strokeColor;
    }
    
    public Color getFillColor() {
        return fillColor;
    }
    
    public void setStroke(int strokeWidth, APCSColor strokeColor) {
        stroke = new BasicStroke(strokeWidth, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);
        this.strokeColor = strokeColor;
    }
    
    public void setFillColor(APCSColor fillColor) {
        this.fillColor = fillColor;
    }
}
