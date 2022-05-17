package cardgame;

// Cards - Maintains a collection of zero or more playing cards.
//         Provides facilities to create a full pack of 52 cards
//         and to shuffle the cards.
// author:
// date:
public class Cards
{
    final static int NOOFCARDSINFULLPACK = 52;
    
    // properties
    Card[] cards;
    int    valid;  // number of cards currently in collection
    
    // constructors
    public Cards( boolean fullPack)
    {
        cards = new Card[ NOOFCARDSINFULLPACK ];
        valid = 0;
        
        if ( fullPack)
            createFullPackOfCards();
    }
    
    // methods
    public Card getTopCard()
    {
        Card tmp;

        if ( valid <= 0)
            return null;
        else
        {
            valid--;
            tmp = cards[valid];
            cards[valid] = null;
            return tmp;
        }
    }
    
    public boolean addTopCard( Card c)
    {
        if ( valid < cards.length)
        {
            cards[valid] = c;   // should this be cloned?
            valid++;
            return true;
        }
        return false;
    }
    
    private void createFullPackOfCards()
    {
        int count = 0;
        while  (count < cards.length)
        {
          addTopCard( new Card(count));
          count++;  
        }
    }
    
    public void shuffle()
    {
        //to do
        Card tempCard;
        int random;
        
        for ( int index = 0; index < valid; index++) 
        {
           random = (int)(Math.random() * valid);
           tempCard = cards[random];
           cards[random] = cards[index];
           cards[index] = tempCard;
        }
    }
    
    
    
    
} // end class Cards
