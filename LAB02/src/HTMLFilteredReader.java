import cs1.SimpleURLReader;
public class HTMLFilteredReader extends MySimpleURLReader {
    
    //properties
    String content = super.getPageContents(); //get page content by using MySimpleURLReader class
    
    //constructors
    public HTMLFilteredReader( String url)
    {
        super(url);
    }
    
    //methods
    @Override
    public String getPageContents()
    {
        int index = 0;
        String filteredContent = "";
        while(content.length() > index)
        {
            if( content.charAt(index) == '<')
            {
                while( content.charAt(index) != '>')
                {
                    index++;
                }
                index++;
            }
            else
            {
                filteredContent = filteredContent + content.charAt(index);
                index++;
            }
        }
        return filteredContent;   
    }
    
    
    public String getUnfilteredPageContents() 
    {
        return content;
    }
    
}
