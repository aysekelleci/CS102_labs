import java.util.Iterator;
public class IntBagStepIterator implements Iterator
{
    int index;
    int step;
    IntBag aBag ; 
    
    public IntBagStepIterator( IntBag bag , int step)
    {
        this.aBag = bag;
        index = 0;
        this.step = step;
    }
    
    @Override
    public Object next()
    {
        if( hasNext())
        {
            index = index + step;
            return (Object) aBag.getValue(index);
        }
        return null;
    }
    
    @Override
    public boolean hasNext()
    {
        if( index <= aBag.getSize() - step )
            return true;
            
        return false;
    }
}
