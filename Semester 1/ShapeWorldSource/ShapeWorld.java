
/**
 * A shapeWorld object represents a window, within which the student may draw
 * graphic primitives using the add* methods.
 * 
 * @author (Tom Malloy) 
 * @version (8/2019)
 */

import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
import javax.swing.*; 

public class ShapeWorld implements Runnable
{
    JFrame frame = null;
    CanvasComponent canvasComponent;
    //    int width;
    //    int height;

    public ShapeWorld(int width, int height) {
        //        this.width = width;
        //        this.height = height;
        this.canvasComponent = new CanvasComponent(width, height);
        SwingUtilities.invokeLater(this);
    }

    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */

    public synchronized void run() {
        // System.out.println("ShapeWorld.run called");

        //Create and set up the window.
        frame = new JFrame("Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(canvasComponent.getSize());

        //        Container contentPane = frame.getContentPane();
        //        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));

        //        LayoutManager layout = frame.getLayout();

        //Create a component to draw on and add to frame
        // canvasComponent = new CanvasComponent(width, height);
        //        contentPane.add(canvasComponent);
        //        contentPane.setSize(canvasComponent.getSize());
        frame.setContentPane(canvasComponent);
        //        frame.pack();
        frame.setVisible(true);

        notifyAll();
    }

    public void addLine(APCSLine line) {
        addDrawableShape(line);
    }

    public synchronized void addDrawableShape(DrawableShape drawableShape) {
        // System.out.println("ShapeWorld.addDrawableShape called");
        while (canvasComponent == null) {
            try {
                this.wait();
            } catch(InterruptedException e) {
            }
        }
        canvasComponent.addDrawableShape(drawableShape);
    }

    public void addRectangle(APCSRectangle rectangle) {
        addDrawableShape(rectangle);
    }

    public void addCircle(APCSCircle circle) {
        addDrawableShape(circle);
    }

    public void addTriangle(APCSTriangle triangle) {
        addDrawableShape(triangle);
    }


}
