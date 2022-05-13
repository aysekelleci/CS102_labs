/**
 * A rectangle class extending shape class 
 * @author Ayşe Kelleci
 * @version 30.06.2021
*/ 
public class Rectangle  extends Shape{
    
    //properties
    private int height;
    private int width;
    boolean controller = false;
    
    //constructors
    public Rectangle( int height, int width)
    {
        this.height = height;
        this.width = width;
    }
    
    //methods
    public double getArea()
    {
        return height * width;
    }
    
    public double getPerimeter()
    {
        return 2 * (height + width);
    }
    
    public String toString()
    {
        return "The shape is: " + getClass() + "/ the height: " +height  + "/ the width: "+ width + "/ the area: " + getArea() + 
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
        if( getX() < x && getX()+ width > x && getY() < y && getY()+ height > y)
        {
            return this;
        }
        return null;
    }
}
