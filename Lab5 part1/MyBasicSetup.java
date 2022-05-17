//import cs102.IHangmanSetup;

public class MyBasicSetup extends BasicSetup //implements IHangmanSetup
{
	private static String[] words = { "Nom", "Rabbit", "Dream",
									"As much as", "Baby",
									"love", "candle", "harmony", "doll" , "act like a cat" };

	public int getMaxAllowedIncorrectTries()
	{
		return 7;
	}

	public char	getBlankChar()
	{
		return '?';
	}

	public String getCharsToPreserve()
	{
		return " ";
	}

	public String getAllLetters()
	{
		return "abcdefghijklmnopqrstuvwxyz";
	}

	public String chooseSecretWord()
	{
		int random = (int) (Math.random() * words.length );
		return words[ random];
	}
}
