package helloword.com.gallegos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	 private static final Logger LOGGER = Logger.getLogger("helloWord.com.gallegos.App");
	 
    public static void main( String[] args )
    {
    	LOGGER.log(Level.WARNING, "Hello World!");
    }
}
