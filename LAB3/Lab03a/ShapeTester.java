import java.util.Scanner;

/**
 * Program Description 
 * @author Program Author
 * @version 30.06.2021
*/ 
public class ShapeTester
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        // Constants
        
        // Variables
        boolean controller = true;
        ShapeContainer shapeBag = new ShapeContainer();
        
        Shape s = new Square( 5);
        
        System.out.println( s.getPerimeter());
        System.out.println( ((Shape) s).toString());
        
        
        // Program Code
        while(controller)
        {
            System.out.println( "---------------------------------------------");
            System.out.println( "1. Create an empty shape container");
            System.out.println( "2. Add new Shape into shape container");
            System.out.println( "3. Print total are of shapes");
            System.out.println( "4. Print total perimeter of shapes");
            System.out.println( "5. Print the information of all shapes");
            System.out.println( "6. Choose x and y coordinates to find in shape ");
            System.out.println( "7. remove all selected items");
            System.out.println( "8. Exit");
            System.out.println(" -----------------------------------------");
            
            System.out.println( "Please choose an option:");
            int option = scan.nextInt();
            
            if( option == 1)
            {
                shapeBag = new ShapeContainer();
            }
            
            if(option == 2)
            {
                System.out.println( "Please set location x:");
                int x = scan.nextInt();
                System.out.println( "Please set location for y");
                int y = scan.nextInt();
                System.out.println( "Choose a shape type: \n 1. Circle \n 2.Rectangle \n 3. Square \n 4. Triangle" );
                int shapeType = scan.nextInt();
                if( shapeType == 1)
                {
                    System.out.println( "Please write a radius");
                    int radius = scan.nextInt();
                    Circle circle = new Circle( radius);
                    circle.setLocation( x , y);
                    shapeBag.add( circle);
                }
                
                if( shapeType == 2)
                {
                    System.out.println( "Please write a height");
                    int height = scan.nextInt();
                    
                    System.out.println( "Please write a width");
                    int width = scan.nextInt();
                    Rectangle rectangle = new Rectangle( height , width);
                    rectangle.setLocation( x , y);
                    shapeBag.add( rectangle);
                }
                
                if( shapeType == 3)
                {
                    System.out.println( "Please write a side of square");
                    int side = scan.nextInt();
                    Square square = new Square( side);
                    square.setLocation( x , y);
                    shapeBag.add( square);
                }
                
                if( shapeType == 4)
                {
                    System.out.println( "please write first side of triangle");  
                    int side1 = scan.nextInt();
                    
                    System.out.println( "please write second side of triangle");  
                    int side2 = scan.nextInt();
                    
                    System.out.println( "please write third side of triangle");  
                    int side3 = scan.nextInt();
                    
                    Triangle triangle = new Triangle(side1 , side2, side3);
                    triangle.setLocation( x , y);
                    shapeBag.add( triangle); 
                    
                }
                
            }
            
            if(option == 3)
            {
                System.out.println( "The total area of shapes is: " + shapeBag.getArea());
            }
            
            if(option == 4)
            {
                System.out.println( "The total perimeter of shapes is: " + shapeBag.getPerimeter());
            }
            
            if( option == 5)
            {
                System.out.println( shapeBag.toString());   
            }
            
            if(option == 6)
            {
                System.out.println( "Please choose an x coordinates");
                int x = scan.nextInt();
                System.out.println( "Please choose an y coordinates");
                int y = scan.nextInt();
                shapeBag.firstSelectedShape(x , y);
                
            }
            
            if( option == 7)
            {
                shapeBag.removeAllSelected();
            }
            
            if( option == 8)
            {
                System.out.println( "Goodby");
                controller = false;   
            }
        }

        scan.close();
    }
    
}