/**
 * 
 */
package datastructures;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Pavel Nichita
 *
 */
public class GetHiddenDFTest {
    private SetUpClass setUpObject;
    private FDSet dfJointEx;
    private FDSet dfJointOriginal;
    
    /**
     * Set up
     */
    @Before
    public void setUp() {
        this.setUpObject = new SetUpClass();
    }

    /**
     * Test method for {@link datastructures.FDSet#getHiddenDF()}.
     */
    @Test
    public void hiddenDFDFJoint30() {
        this.dfJointEx = this.setUpObject.dpJoint30();
        this.dfJointOriginal = this.setUpObject.dpJoint30();
        assertEquals(this.dfJointEx, this.dfJointOriginal.getHiddenDF());
    }
    
    @Test
    public void hiddenDFDFJoint31() {
        this.dfJointEx = this.setUpObject.dpJoint31();
        this.dfJointOriginal = this.setUpObject.dpJoint31();
        this.dfJointEx.addDependency(this.setUpObject.funcDepAtoD());
        assertEquals(this.dfJointEx, this.dfJointOriginal.getHiddenDF());
    }
    
    @Test
    public void hiddenDFDFJoint33() {
        this.dfJointEx = this.setUpObject.dpJoint33();
        this.dfJointOriginal = this.setUpObject.dpJoint33();
        this.dfJointEx.addDependency(this.setUpObject.funcDepBtoC());
        assertEquals(this.dfJointEx, this.dfJointOriginal.getHiddenDF());
    }

}
