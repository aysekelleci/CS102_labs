/**
 * Fibonacci number class
 * @author Ayşe Kelleci
 * @version 13.06.2021
*/ 
public class Fibonacci
{
    public static void main(String[] args)
    {
        // Constants
        
        // Variables
        IntBag fibonacciBag = new IntBag(); //initialize new Intbag which includes first 40 fibonacci elements
        int firstNumber;
        int secondNumber;
        int thirdNumber;
        
        // Program Code
        firstNumber = 0;
        secondNumber = 1;
        
        fibonacciBag.addValue(firstNumber);
        fibonacciBag.addValue(secondNumber);
        System.out.println(1 + ". " + firstNumber);
        System.out.println(2 + ". " + secondNumber);
        
        for(int i = 0; i< 38; i++)
        {
            //calculate the next fibonacci number
            thirdNumber = secondNumber + firstNumber;
            firstNumber = secondNumber;
            secondNumber = thirdNumber;
            fibonacciBag.addValue(thirdNumber);   //add this to the Intbag object
            System.out.println( i+3 + ". "+ thirdNumber);
        }  
        
        System.out.println( fibonacciBag.toString());
    } 
}