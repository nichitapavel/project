/**
 * 
 */
package normalization;

import datastructures.AttributeJoint;
import datastructures.DFJoint;

import static org.junit.Assert.*;

/**
 * @author Pavel Nichita
 *
 */
public final class TestUtils {
    
    private TestUtils() {
        // Private constructor to prevent instantiation.
    }
    
    public static void simpleUllmanTest(String[] attr, String[] result, DFJoint dfJoint) {
        AttributeJoint cierre = new AttributeJoint(attr);
        AttributeJoint res = new AttributeJoint(result);
        assertEquals(res, Normalization.simpleUllman(cierre, dfJoint));
    }
}
