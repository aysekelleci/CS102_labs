//an abstract class which describe general properties of shapes
public abstract class Shape implements Locatable, Selectable
{
    //properties
    int x;
    int y;
    
    //constructors
    public Shape( )
    {
    }
    
    //methods
    public abstract double getArea();
    
    
    public abstract double getPerimeter();
    
    public abstract String toString();
    
    public void setLocation( int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    public int getX()
    {
        return x;   
    }
    
    public int getY()
    {
       return y; 
    }
    
    
    public abstract boolean getSelected();
    
    public abstract void setSelected(boolean b);
    
    public abstract Shape contains( int x, int y );
}