/**
 * The program includes intbag methods and a property which provide us to make some changes in an array
 * @author Ayşe Kelleci
 * @version 13.06.2021
*/ 
public class IntBag {
    
    //properties
    private int bag[];
    
    //constructors
    public IntBag()   //constructor initialize a new array with 4 index
    {
        bag = new int[4];
    }
    
    //methods
    /**this method add the given value in last index if there is no place array size will be doubled
     *  @param value is the number which is added into array last index
     */
    public void addValue( int value)
    {
        if( bag[bag.length-1] == 0)
        {
            for(int i = 0; i< bag.length ; i++)
            {
                if( bag[i] <= 0) 
                {
                    bag[i] = value;
                    bag[i+1] = -1;
                    break;
                }
            }
        }
        else if(bag[bag.length-1] < 0 )
        {
            int newArray[] = new int[bag.length*2];
            for(int i = 0; i< bag.length; i++)
            {
                newArray[i] = bag[i];
                    
            }
            newArray[bag.length-1]  = value;
            newArray[bag.length] = -1;
            
            bag = newArray;
        }
    }
        /* for(int i = 0; i< bag.length ; i++)
        {
            if( bag[i] <= 0) 
            {
                bag[i] = value;
                controller = false;
                break;
            }
        }
        if(controller)
        {
        int newArray[] = new int[bag.length*2];
        for(int i = 0; i< bag.length; i++)
        {
            newArray[i] = bag[i];
            
        }
        newArray[bag.length]  = value;
        bag = newArray;*/
    
        
    /**this method add the given value in specific location if the location within in index
     *  @param value is the number which is added into array 
     *  @param location is the place value is added
     */
    public void addValue(int value, int location)
    {
        int[] currentArray = new int[this.getSize() -1];
        if( location <= bag.length && bag[location-1] != 0 && bag[location+1] != 0 )
        {
            bag[location] = value;
            
            for(int i = 0; i<this.getSize() -1; i++ )
            {
                if(i < location)
                    currentArray[i] = bag[i];
                    
                else if(i == location)
                    currentArray[i] = value;
                    
                else if(i > location)
                {
                    currentArray[i] = bag[i+1];
                }
            }
            bag = currentArray;
            
        }
    }
    
    /**
     * remove method delete the element in given index and carry the last element into this index
     * then the last element is removed from this array
     */
    public void remove(int index)
    {
        bag[index] = bag[this.getSize() -1];  //getsize kullan
        bag[this.getSize() -1] = -1;
        bag[this.getSize()] = 0;
        
       
    }
    
    
    @Override
    /** prints the all positive elements in arrays respectively
     *  @return s includes all values in array
     */
    public String toString()
    {
        String s = " {";
        for(int i = 0; i< this.getSize(); i++)
        {
            if(i < this.getSize() -1 )
            s = s + bag[i] + ", "; 
             
            else if(i == this.getSize() -1) 
            {
                s = s+ bag[i] + "}";
            }
        }
        return s;
    }
    
    /**
     * @return count, the size of array
     */
    public int getSize()
    {
        int count = 0;
        for (int i =0; i< bag.length; i++)
        {
            if(bag[i] <= 0)  
            {
                break;
            }
            else
            {
                count++;   
            }
        }
        return count;   
    }
    
    /**
     * @return the array value which is in given index
     */
    public int getValue( int index)
    {
        if(index <= this.getSize())
        {
            return bag[index];
        }
        
        return 0; 
    }
    
    /**
     *  remove all elements which is equal to the given value
     */
    public void removeAll( int value)
    {
        int[] currentArray = bag;
        bag = new int[4];
        for(int i = 0; i< currentArray.length; i++)
        {
            if(currentArray[i] != value && currentArray[i] > 0  )
            {
                this.addValue(currentArray[i]);
                System.out.println( "");
            }
        }
        
    }
}
