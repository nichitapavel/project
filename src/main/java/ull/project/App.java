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
	 * @args  url  an absolute URL giving the base location of the image
	 * @return      the image at the specified URL
	 */
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        return;
    }
}
