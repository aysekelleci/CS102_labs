/**
 * A simple Java class!
*/
import java.util.ArrayList;
public class ShapeContainer
{
    // Properties
    private ArrayList<Shape> shapes;
    
    // Constructors
    public ShapeContainer()
    {
        shapes = new ArrayList<Shape>();
    }
    
    // Methods
    public void add( Shape s)
    {
        shapes.add(s);
    }
    
    /**
     * calculates total area
     */
    public  double getArea()
    {
        double totalArea = 0;
        for(int i = 0; i < shapes.size(); i++)
        {
            totalArea = totalArea + shapes.get(i).getArea();    
        }
        return totalArea;
    }
    
    /**
     * calculates total perimeter
     */
    public double getPerimeter()
    {
        double totalPerimeter = 0;
        for(int i = 0; i < shapes.size(); i++)
        {
            totalPerimeter = totalPerimeter + shapes.get(i).getPerimeter();    
        }
        return totalPerimeter;
    }
    
    
    public String toString()
    {
        String s = "";
        for(int i = 0; i < shapes.size(); i++)
        {
            s = s + shapes.get(i).toString() + "\n";
            //s= s+"The shape is" + shapes.get(i).getClass() + " the perimeter is:" + shapes.get(i).getPerimeter()+ "the area is:"+ shapes.get(i).getArea() +"\n";
        }
        return s;
    }
    
    /**
     * finds the selected shape in shape arrayList
     */
    public void firstSelectedShape( int x, int y)
    {
        int index = 0;
        while( index < shapes.size() && ((Selectable)shapes.get(index)).contains(x,y)== null  && shapes.get(index).getSelected() != true)
        {
            index++;
        }
            if( (Selectable)shapes.get(index).contains(x,y) != null) 
            {
                ((Selectable)shapes.get(index)).setSelected(true);
                System.out.println( "selected: " + shapes.get(index).toString());
            }
            else
                System.out.println( "There are no selected item!!");
        
    }
    
    /**
     * removes all selected item from shapeContainer
     */
    public void removeAllSelected()
    {  
        ArrayList<Shape> currentShapes = new ArrayList<Shape> ();
        for( int i= 0; i < shapes.size(); i++ )
        {
            if( shapes.get(i) instanceof Selectable && !((Selectable)shapes.get( i )).getSelected() )
                currentShapes.add(shapes.get(i));
        }
        shapes = currentShapes;
    }
    
}