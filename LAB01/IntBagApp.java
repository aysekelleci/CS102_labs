import java.util.Scanner;

/**
 * The program testing the intbag methods and properties
 * @author Ayşe Kelleci
 * @version 13.06.2021
*/ 
public class IntBagApp
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        // Constants
        
        // Variables
        boolean controller = true;
        IntBag bag1 = new IntBag();
        
        // Program Code
        System.out.println("Welcome");
        
        while(controller)
        {
            System.out.println( "1. Create a new empty collection(any previous values are lost!");
            System.out.println( "2. Read a set of positive values into the collection ");
            System.out.println( "3. Print the collection of values.");
            System.out.println( "4. Add a value to the collection of values at a specified location");
            System.out.println( "5. Remove the value at a specified location from the collection of values");
            System.out.println( "6. Remove all instances of a value within the collection* (see note below).");
            System.out.println( "7. Quit the program");
            
            System.out.println( "Please choose an option: ");
            int option = scan.nextInt();
            
            if(option == 1)
            {
                IntBag bag2 = new IntBag();
                bag1 = bag2;
            }
            
            else if(option == 2)
            {
                boolean control = true;
                while(control)
                {
                    System.out.println( "please enter a value, to finish it please press zero");
                    int value = scan.nextInt();
                
                    if( value > 0 )
                    {
                        bag1.addValue( value);   
                    
                    }
                    else
                    {
                        control = false; 
                    }
                
                }
            }
                
            else if( option == 3)
            {
                System.out.println(bag1.toString());
            }
            
            else if( option == 4)
            {
                System.out.println( "Please enter a value which you want to add into collection: ");
                int value = scan.nextInt();
                System.out.println( "And write the location: ");
                int location = scan.nextInt();
                
                bag1.addValue( value, location);
            }
            
            else if( option == 5)
            {
               System.out.println( "Please enter the location of value which you want to remove from colllection"); 
               int location = scan.nextInt();
               
               bag1.remove(location);
            }
            
            else if( option == 6)
            {
                System.out.println( "Please enter the value which you want to remove from collection ");   
                int value = scan.nextInt();
                
                bag1.removeAll(value);
            }
            
            else if( option == 7)
            {
                controller = false;
                System.out.println( "GoodBye");
            }
                
        }
        
        System.out.println("End.");
        scan.close();
    }
    
}