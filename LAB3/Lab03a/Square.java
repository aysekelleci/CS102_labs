/**
 * A tringle class extending rectangle class 
 * @author Ayşe Kelleci
 * @version 30.06.2021
*/  
public class Square extends Rectangle {
    
    //Properties
    private int side;
    
    //Constructors
    public Square( int side)
    {
        super(side ,side);
    }
    
    //Methods
    /*public double getPerimeter()
    {
        return 4* side;
    }*/
    @Override
    public String toString()
    {
        return "The shape is: " + getClass() + "/ the side: " + side + "/ the area: " + getArea() + 
            "/ the perimeter: " + getPerimeter() + "/ the location (" +getX() +","+ getY() + ")" + "/ Selected: " + getSelected();
    }
    
    public void setLocation( int x, int y )
    {
        this.x = x;
        this.y = y;
    }
    
    public int getX()
    {
        return this.x;
    }
  
    public int getY(){
        return this.y;
    } 
    
}
