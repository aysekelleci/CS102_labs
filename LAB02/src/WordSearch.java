
/**
 * Word Search program
 * @author Ayşe Kelleci
 * @version 23.06.2021
*/ 
import java.util.ArrayList;
public class WordSearch extends HTMLFilteredReader {
    
    public WordSearch( String url)
    {
        super(url);
    }
    
    public String findWord( String word)
    {
        if( this.getPageContents().indexOf( word, 0) != -1)
            return "The place of " + word + "is" + this.getPageContents().indexOf( word, 0);
            
        return "the word cannot be found" ;
    }
    
    /** Filter the content of html link
     * @return content of html without html entities
     */
    public String improvedFilterHtml()
    {
        int index = 0;
        String content = "";
        String pageContent = this.getPageContents();
        while( pageContent.length() -1 > index)
        {
            if(pageContent.charAt(index) == '&')
            {
                index++;
                while(pageContent.charAt(index) != ';' && pageContent.charAt(index) != ' '  )
                {
                    index++;
                }
            }
            index++;
            content = content + pageContent.charAt(index);
        }
        return content;
    }
    
    /** Find all words in given content and put them into an arrayList
     * @return arraylist which includes all words in the page content
     */
    public ArrayList<String> words()
    {
        ArrayList<String> words = new ArrayList<String> ();
        String content = this.improvedFilterHtml();
        String word = "";
        int index = 0;
        while( index < content.length())
        {
            
            if( content.charAt(index) != ' ' &&  content.length() > index + 1 ) //content.charAt(index) != ',' 
            {
                word = word + content.charAt(index);
            }
            
            else
            {
                if( !word.equals(""))
                words.add( word);
                word = "";
            }
            index++;  
        }
        return words;
        
    }
    
    /**
     * @param word is looked for in words list
     * @return the index of word in given arrayList
     */
    public int findWords( String word)
    {
        ArrayList<String> wordList = this.words();
        for( int i = 0; i < wordList.size()-1; i++)
        {
            if( word.equals( wordList.get(i)))
            {
                return i;
            }
        }
        System.out.println( "The word cannot be found");
        return -1;
        
    }
    
}
