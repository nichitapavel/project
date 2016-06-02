/**
 * 
 */
package normalization;

import datastructures.AttributeSet;
import datastructures.FDSet;

import static org.junit.Assert.*;

/**
 * @author Pavel Nichita
 *
 */
public final class TestUtils {
    
    private TestUtils() {
        // Private constructor to prevent instantiation.
    }
    
    public static void simpleUllmanTest(String[] attr, String[] result, FDSet dfJoint) {
        AttributeSet cierre = new AttributeSet(attr);
        AttributeSet res = new AttributeSet(result);
        assertEquals(res, Normalization.simpleUllman(cierre, dfJoint));
    }
}
