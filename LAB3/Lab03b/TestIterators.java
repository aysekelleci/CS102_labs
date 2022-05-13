import java.util.Scanner;
import java.util.Iterator;
/**
 * Program Description 
 * @author Program Author
 * @version 01.07.2021
*/ 
public class TestIterators
{
    public static void main(String[] args)
    {
        IntBag bag = new IntBag();
        //  … insert some elements
        bag.addValue(5);
        bag.addValue(10);
        bag.addValue(8);
        
        Iterator i, j;
        i = bag.iterator();
        while ( i.hasNext() )
        {
            System.out.println( i.next() );
            j = bag.iterator();
            while ( j.hasNext() )
            {
                System.out.println( "--" + j.next() );
            }
        }
        
        //test ıntBagStepIterator
        IntBag bag2 = new IntBag(2);
        for( int index = 0; index < 20; index++)
        {
            bag2.addValue( index+1);   
        }
        Iterator k;
        k = bag2.iterator();
        while ( k.hasNext() )
        {
            System.out.println( k.next() );
        }
        

    }
    
}