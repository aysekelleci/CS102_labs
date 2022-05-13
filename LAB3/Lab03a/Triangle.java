/**
 * A triangle class extending shape class 
 * @author Ayşe Kelleci
 * @version 30.06.2021
*/ 
public class Triangle extends Shape {
    
    //properties
    private int side1;
    private int side2;
    private int side3;
    boolean controller;
    
    
    //constructors
    public Triangle( int side1 , int side2, int side3 )
    {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    //methods
    public double getPerimeter()
    {
        return side1 + side2 + side3;
    }
    
    
    public double getArea()
    {
        double u = (side1 + side2 + side3) * 2;
        return Math.sqrt (Math.pow( u- side1, 2) + Math.pow(u-side2 , 2) + Math.pow(u-side3, 2));
    }
    
    public String toString()
    {
        return "The shape is: " + getClass() + "/ the sides are " + side1 +", "+ side2+ ", " + side3 + "/ the area: " + getArea() + 
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
        double radius = getArea() / getPerimeter() * 2; 
        if( (Math.pow (getX()-x, 2) + Math.pow (getY()-y, 2) <= Math.pow(radius, 2) ))
            return this;
        return null;
    }
}
