
/**
 * Write a description of class ShapeRunner here.
 *
 * @author (Oats)
 * @version (8/27)
 */
public class ShapeRunner
{

    public ShapeRunner()
    {
        
    }
    
    public static void main(){
        ShapeWorld shapeWorld = new ShapeWorld(800,800);
        
        APCSRectangle r = new APCSRectangle(250,250,550,550);
        APCSRectangle r2 = new APCSRectangle(250,250,500,500);
        APCSCircle c = new APCSCircle(250,550,50);
        APCSLine l = new APCSLine(0, 800,800,0);
        APCSLine l2 = new APCSLine(0, 0,800,800);
        shapeWorld.addRectangle(r);
        shapeWorld.addRectangle(r2);
        //shapeWorld.addCircle(c);
        shapeWorld.addLine(l);
        shapeWorld.addLine(l2);
    }
}
