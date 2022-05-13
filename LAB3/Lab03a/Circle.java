/**
 * A circle class extending shape class 
 * @author Ayşe Kelleci
 * @version 29.06.2021
*/ 
public class Circle extends Shape
{
    //properties
    private int radius;
    boolean controller;
    
    //constructors
    public Circle( int radius)
    {
        this.radius = radius;
    }
    
    //methods
    public double getArea()
    {
        return Math.PI * radius * radius;
    }
    
    public double getPerimeter()
    {
        return 2 * Math.PI * radius;
    }
    
    public String toString()
    {
        return "The shape is: " + getClass() + "/ the radius: "  + "/ the area: " + getArea() + 
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
    
    
    public boolean getSelected()
    {
        return controller;  
    } 
    
    public void setSelected(boolean b)
    {
        controller = b;
    }
    
    public Shape contains( int x, int y )
    {
        if( Math.pow(getX()- x , 2) + Math.pow(getY()-y , 2) <= Math.pow(radius, 2))
            return this;
        
        return null;
    }
    
}
