import cs1.SimpleURLReader;

/**
 * Simple Url Reader tester
 * @author Ayşe Kelleci
 * @version 21.06.2021
*/ 
public class ReaderTest
{
    public static void main(String[] args)
    {
        String url = "http://www.cs.bilkent.edu.tr/~ozturk/cs102/housman.txt";
        SimpleURLReader test = new SimpleURLReader(url);
        
        System.out.println(test.getPageContents());
        System.out.println(test.getLineCount());
    }
    
}
