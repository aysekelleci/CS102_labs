import java.util.Scanner;
import cs102.*;

/**
 * ConsoleHangman
 *
 * @author
 * @version 1.00 2013/4/7
 */

public class CopyConsole
{
    public static void main( String[] args)
	{
    	Scanner scan = new Scanner( System.in);

    	System.out.println( "Start of ConsoleHangman\n");

		// VARIABLES
		Hangman	hangman;

		// PROGRAM CODE
		hangman = new Hangman( new BasicSetup() );

		System.out.println( hangman.getKnownSoFar() );

		// ToDo - allow user to repeatedly enter a letter and tryThis letter
		//		  then show game status, until gameover. Finally report win/lose.
		
		while( !hangman.isGameOver())
		{
			System.out.println( "All  letters: " + hangman.getAllLetters());
			System.out.println( "Used letters: " + hangman.getUsedLetters());
			
			System.out.println( "Enter a new letter:");
			char letter = scan.next().charAt(0);
			hangman.tryThis( letter);
			System.out.println( "The remaining number of tries: "  +hangman.getNumOfIncorrectTries() +"/"+ hangman.getMaxAllowedIncorrectTries());
			System.out.println(); 
 
			
			System.out.println( " ------------------------------");
			System.out.println( "The secret word is:" + hangman.getKnownSoFar());
			System.out.println();
			
			if(  hangman.isGameOver())
			{
				System.out.println( "Game is over");
				if( hangman.hasLost())
				{
					System.out.println( "you lost" );
				}
				else
				{
					System.out.println( "you win");
				}
					
				System.out.println( "Press y to start again");
				String s = scan.next();
				if(s.equals("y"))
				{
					System.out.println( "--------------------------");
					Hangman hangmanNew = new Hangman( new BasicSetup());
					hangman = hangmanNew;
					System.out.println( hangman.getKnownSoFar() );
				}
				else 
				{   
					System.out.println( "Goodbye!");
				}
			}
		}


		System.out.println( "\nEnd of ConsoleHangman\n" );
		scan.close();
	}

} // end of class ConsoleHangman