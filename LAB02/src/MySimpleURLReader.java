import cs1.SimpleURLReader;
/**
 * this class test the SimpleURLReader class and use its methods
 * @author Ayşe Kelleci
 * @version 21.06.2021
*/ 
public class MySimpleURLReader extends SimpleURLReader  {
    
    String url;
    
    public MySimpleURLReader(String url)
    {
        super(url);
        this.url = url;
    }
    
    /**
     *  @return the url of website
     */
    public String getURL()
    {
        return url;
        
    }
    
    /** return the name of the url
     *  @return url part which are after than /
     */
    public String getName()
    {
        for(int i = url.length() -1; i > -1; i--)
        {
            if(url.charAt(i) == '/')
            {
                url = url.substring( i , url.length() );
                return url;
            }
            
        }
        return url;
    }
    
    /** this method finds the css links in the page content
     *  @return the number of css links in given text
     */
    public int getNumberOfCSSLinks()
    {
        int index = this.getPageContents().indexOf( "<link" , 0 );
        int count = 0;
        int lastIndex = 0;
        
        while(this.getPageContents().indexOf( "<link" , index ) != -1 )
        {
            lastIndex = this.getPageContents().indexOf( ">" , index);
            
            if( this.getPageContents().substring(index , lastIndex +1 ).indexOf( ".css" , 0) != -1 )
            {
                index = this.getPageContents().indexOf( ".css" , index) +1;
                count++;
            }
            else
            {
                index = this.getPageContents().indexOf(  "<link" , index ) + 3;
            }
        }
        return count;
    }
}
