import java.util.Iterator;
public class IntBagIterator implements Iterator
{
    IntBag aBag;
    int index;
    
    public IntBagIterator( IntBag bag)
    {
        this.aBag = bag;
        index = 0;
    }
    
    
    @Override
    public Object next()
    {
        if( hasNext())
        {
            index = index + 1;
            return (Object) aBag.getValue(index);
        }
        return null;
    }
    
    @Override
    public boolean hasNext()
    {
        if( index < aBag.getSize() )
            return true;
            
        return false;
    }
}