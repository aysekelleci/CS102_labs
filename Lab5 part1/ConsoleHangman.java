import java.util.Scanner;
//import cs102.*;

/**
 * ConsoleHangman
 *
 * @author
 * @version 1.00 2013/4/7
 */

public class ConsoleHangman
{
    public static void main( String[] args)
	{
    	Scanner scan = new Scanner( System.in);

    	System.out.println( "Start of ConsoleHangman\n");

		// VARIABLES
		HangmanModel hangman;
		ConsoleHangmanView view;

		// PROGRAM CODE
		hangman = new HangmanModel( new MyBasicSetup() );
		view = new ConsoleHangmanView();

		System.out.println( hangman.getKnownSoFar() );

		// ToDo - allow user to repeatedly enter a letter and tryThis letter
		//		  then show game status, until gameover. Finally report win/lose.
		
		while( !hangman.isGameOver())
		{

			System.out.println( "Enter a new letter:");
			char letter = scan.next().charAt(0);
			hangman.tryThis( letter);
			
			view.updateView( hangman);
			
			
			if( hangman.isGameOver())
			{
				System.out.println( "Press y to start again");
				String s = scan.next();
				if(s.equals("y"))
				{
					System.out.println( "--------------------------");
					HangmanModel hangmanNew = new HangmanModel( new BasicSetup());
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
