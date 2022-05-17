package cardgame;
import java.util.ArrayList;

// ScoreCard - Maintains one integer score per player, for any number of players
//             Caution: invalid playernumbers result in run-time exception!
// author: Zeynep Öztunç
// date: 20.02.2021
public class ScoreCard
{
    // properties
    public int[] scores;
    
    // constructors
    public ScoreCard( int noOfPlayers)
    {
        scores = new int[noOfPlayers];
        
        // init all scores to zero
        for ( int i = 0; i < scores.length; i++)
            scores[i] = 0;
    }
    
    // methods
    public int getScore( int playerNo)
    {
        return scores[ playerNo];
    }
    
    public void update( int playerNo, int amount)
    {
        scores[playerNo] = scores[playerNo] + amount;
    }
    
    public String toString()
    {
        String s;
        s = "\n"
            + "\n_____________\n"
            + "\nPlayer\tScore\n"
            + "_____________\n";
        
        for ( int playerNo = 0; playerNo < scores.length; playerNo++)
        {
            s = s + (playerNo + 1) + "\t" + scores[playerNo] + "\n";
        }
        
        s += "_____________\n";
        return s;
    }
    
    public int[] getWinners(){
        ArrayList<Integer> a = new ArrayList<Integer>();   
        int winner = 0; //the highest score of the winner(s)
       
        //finds the highest  score
        for (int i = 0; i < scores.length; i++)
        {
            if (scores[i] > winner)
            {   
                winner = scores[i];    
            }
        }
           
        //adds maximum scorers to an arraylist
        for (int i = 0; i < scores.length; i++){
            if (scores[i] == winner)
            {   
                a.add(i);//adds player num to the list  
            }
        }
        int[] winners = new int[a.size()];//array of players with highest score
          
        for (int i = 0; i < a.size(); i++)
        {
            winners[i] = a.get(i);
        }
        
        return winners;
    }
    
} // end class ScoreCard
