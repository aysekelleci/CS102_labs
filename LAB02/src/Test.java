/**
 * Tester of wordSearch and  MySimpleURLReader class
 * @author Ayşe Kelleci
 * @version 22.06.2021
*/ 
public class Test
{
    public static void main(String[] args)
    {
        
        //PART B
        String url =  "http://www.cs.bilkent.edu.tr/~ozturk/cs102/scrapethissite.html ";
        
        MySimpleURLReader urlReader = new MySimpleURLReader( url);
        System.out.println (urlReader.getURL());
        
        //PART C
        System.out.println( "The number of css links of " + url + ":" +urlReader.getNumberOfCSSLinks());
        
        String url2 = "http://www.cs.bilkent.edu.tr/~ozturk/cs102/housman.txt";
        MySimpleURLReader urlReader2 = new MySimpleURLReader( url2);
        System.out.println( "the number of css links of " + url2 + ": " + urlReader2.getNumberOfCSSLinks());
        
        
        //PART D
        HTMLFilteredReader urlReader3 = new HTMLFilteredReader( url);
        System.out.println(urlReader3.getPageContents());
        
        
        //PART E
        String url3  = "https://scrapethissite.com/pages/simple/";
        WordSearch urlReader4 = new WordSearch(url3);
        //System.out.println(urlReader4.improvedFilterHtml());
        //System.out.println( urlReader4.words());
        System.out.println( urlReader4.findWords( "Area")); 
    }
    
}
