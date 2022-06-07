/* Recursion class
 * Ayse Kelleci
 * 19 June 2021
*/
import java.io.File;
public class Recursion {

    /** this methods find the length of words recursively
     *  @param str is the word found the length
     *  @return the lenght of the word
     */ 
    public static int findLength( String str)
    {
        if( str.equals(""))
        {
            return 0;
        }
        else
            return findLength( str.substring(1)) +1;
    }
    
    /** this methods find the number of nonvowel letters recursively
     *  @param str is the word found the length
     *  @return the lenght of the word
     */   
    public static int findNonVowels( String str)
    {
        if( str.equals(""))
        {
            return 0;
        }
        else
            if( str.substring(1).charAt(0) == ('a') || str.substring(1).charAt(0) == ('e') || str.substring(1).charAt(0) == ('i')
            ||  str.substring(1).charAt(0) == ('o') || str.substring(1).charAt(0) == ('u') || str.substring(1).charAt(0) == (' '))
            {    
                return findLength( str.substring( 1));
            }
                
            else
            {
                return findLength( str.substring( 1)) +1;
            }
    }
    
    /** 
     * this method find the binaries step without two consecutive 1 and print it
     * @param is the int n which gives the length of binary
     */ 
    public static void findBinaries( int n , String binary)
    {
        if( n == 0 )
        {
            //binary = "0";
            System.out.println( binary);
            return;
        }
        
        if( binary.length() ==0 || binary.charAt(binary.length()-1) == '0' )
        {
            findBinaries( n-1 , binary + '1');
        }
        
        findBinaries( n-1 , binary +'0');
    }
    
    /** this methods find the number of files in given directory and also in subdirectory
     *  @param file gives the directory of files
     *  @return count, the number of files, 
     */
    public static int findNumberOfFiles( File file)
    {
        int count = 0;
        File[] pathnames = file.listFiles();
        
        if(pathnames != null)
        {
            for( File pathname: pathnames)
            {
                System.out.println(pathname);
                if( !pathname.isFile())
                {
                    count = count + findNumberOfFiles( pathname); //add files in the subdirectory
                    
                }
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) throws Exception {
        
        System.out.println( "STEP 1");
        System.out.println( "The lenght of word is: " +findLength("CS102 is the best"));
        System.out.println( "--------------------------------------------------------");
        
        System.out.println( "STEP 2");
        System.out.println( "The number of nonvowels letter is: " + findNonVowels("CS102 is a good course"));
        System.out.println("----------------------------------------------------------");
        
        System.out.println( "STEP 3");
        System.out.println( "The binary outputs: ");
        findBinaries( 3, "");
        System.out.println("----------------------------------------------------------");
        
        System.out.println(" STEP 4");
        File file = new File ("C:/Users/Hp/Desktop/math102");
        System.out.println( "Number of files " + findNumberOfFiles( file));
        
    } 
}