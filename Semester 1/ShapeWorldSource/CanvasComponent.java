
/**
 * A canvasComponent object contains the contents of a shapeWorld window.
 * It maintains the list of drawable shapes added to the window and draws them
 * when necessary using the paintComponent method.
 * 
 * @author (Tom Malloy) 
 * @version (8/2019)
 */

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;

//public class CanvasComponent extends JComponent implements MouseListener, MouseMotionListener, ActionListener, KeyListener
public class CanvasComponent extends JComponent {
    private ArrayList<DrawableShape> drawableShapeList;

    /**
     * Constructor for objects of class CanvasComponent
     */
    public CanvasComponent(int width, int height)
    {
        this.setSize(width,height);
        drawableShapeList = new ArrayList<DrawableShape>();
    }

    public void paintComponent(Graphics graphicsContext)
    {
        //       super.paintComponent(graphicsContext);
        // System.out.println("paintComponent called");
        Graphics2D localGraphicsContext = (Graphics2D)graphicsContext.create();
        for (int drawableShapeIndex = 0; drawableShapeIndex < drawableShapeList.size(); drawableShapeIndex++) {
            DrawableShape drawableShape = drawableShapeList.get(drawableShapeIndex);
            Color strokeColor = drawableShape.getStrokeColor();
            Shape shape = drawableShape.getShape();
            if (strokeColor != null) {
                localGraphicsContext.setColor(strokeColor);
                localGraphicsContext.setStroke(drawableShape.getStroke());
                localGraphicsContext.draw(shape);
            }
            Color fillColor = drawableShape.getFillColor();
            if (fillColor != null) {
                localGraphicsContext.setColor(fillColor);
                localGraphicsContext.fill(shape);
            }
        }
        localGraphicsContext.dispose();
    }

    public void addDrawableShape(DrawableShape drawableShape) {
        drawableShapeList.add(drawableShape);
        repaint();
    }

}
