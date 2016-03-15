package ull.project;

/**
 * Hello world!
 *
 */
public class App 
{
	/**
	 * Returns an Image object that can then be painted on the screen. 
	 * The url argument must specify an absolute. The name
	 * argument is a specifier that is relative to the url argument. 
	 * <p>
	 * This method always returns immediately, whether or not the 
	 * image exists. When this applet attempts to draw the image on
	 * the screen, the data will be loaded. The graphics primitives 
	 * that draw the image will incrementally paint on the screen. 
	 *
	 * @param  args the location of the image, relative to the url argument
	 */
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        return;
    }

	/**
	 * Testing. 
	 * <p>
	 * Testing 
	 *
	 * @param  a the location of the image, relative to the url argument
	 */
    public static Boolean test(Boolean a)
    {
    	System.out.println( "Test World!" );
        return a;
    }
}
