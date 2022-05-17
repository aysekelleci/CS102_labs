import cs102.*;

public class ConsoleHangmanView implements IHangmanView{
    
    public void updateView( Hangman hangmanModel)
    {
        if( !hangmanModel.isGameOver())
        {
        System.out.println( "All  letters: " + hangmanModel.getAllLetters());
        System.out.println( "Used letters: " + hangmanModel.getUsedLetters());
        
        System.out.println( "The remaining number of tries: "  +hangmanModel.getNumOfIncorrectTries() +"/"+
                                                                    hangmanModel.getMaxAllowedIncorrectTries());
                                                                    
        System.out.println(); 
        System.out.println( " ------------------------------");
        System.out.println( "The known so far word is:" + hangmanModel.getKnownSoFar());
        System.out.println();
        }
        
        else
        {
            System.out.println( "Game is over");
            if( hangmanModel.hasLost())
            {
                System.out.println( "you lost" );
                System.out.println("");
                System.out.println( "The secret word is:" + hangmanModel.getKnownSoFar());
            }
            else
            {
                System.out.println();
                System.out.println( "you win");
                System.out.println( "The secret word is: " + hangmanModel.getKnownSoFar());
            }
            
            System.out.println("-----------------------------------------");
            
        }    
    }
}
