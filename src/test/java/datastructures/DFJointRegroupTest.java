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
public class DFJointRegroupTest {
    private DFJoint dfJoint;
    private SetUpClass setUpObject;
    
    /**
     * Set up.
     */
    @Before
    public void setUp() {
        this.setUpObject = new SetUpClass();
    }

    /**
     * Template that calls {@code regroupDFJoint()} method and checks if
     * result is the expected one.
     * @param expected DFJoint that should returned regroupDFJoint() method.
     * @param dfJoint The DFJoint to regroup.
     */
    private void testTemplate(DFJoint expected, DFJoint dfJoint) {
        DFJoint result = dfJoint.regroupDFJoint();
        assertEquals(expected, result);
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#regroupDFJoint()}.
     * Checks that a DFJoint that is already grouped doesn't change.
     * {A -> BC, BC -> A, BCD -> E, E -> C}
     */
    @Test
    public void testRegroupDFJoint() {
        this.dfJoint = this.setUpObject.dfJoint01();
        testTemplate(this.setUpObject.dfJoint01(), this.dfJoint);
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#regroupDFJoint()}.
     * Checks that a DFJoint that is already grouped doesn't change.
     * {A -> BC, BC -> E, CD -> A}
     */
    @Test
    public void testRegroupDFJointTwo() {
        this.dfJoint = this.setUpObject.dfJoint02();
        testTemplate(this.setUpObject.dfJoint02(), this.dfJoint);
    }

    /**
     * Test method for {@link datastructures.DFJoint#regroupDFJoint()}.
     * Checks that a DFJoint that is already grouped doesn't change.
     * {AB -> C}
     */
    @Test
    public void testRegroupDFJointNine() {
        this.dfJoint = this.setUpObject.dfJoint09();
        testTemplate(this.setUpObject.dfJoint09(), this.dfJoint);
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#regroupDFJoint()}.
     * Checks that a DFJoint is grouped as expected.
     * Expected out - {AB -> C, C -> AB, E ->DF, D -> E, F -> E, ABD -> G, CF -> H}
     * DFJoint in   - {AB -> C, C -> AB, E -> D, D -> E, E -> F, F -> E, ABD -> G, CF -> H}
     */
    @Test
    public void testRegroupDFJointThree() {
        testTemplate(this.setUpObject.dfJoint23(), this.setUpObject.dfJoint03()); 
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#regroupDFJoint()}.
     * Expected out - {A -> BC, B -> C, AB -> C}
     * DFJoint in   - {A -> BC, B -> C, A -> B, AB -> C}
     */
    @Test
    public void testRegroupDFJointFour() {
        testTemplate(this.setUpObject.dfJoint24(), this.setUpObject.dfJoint04());
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#regroupDFJoint()}.
     * Expected out - {A -> BC, D -> E}
     * DFJoint in   - {A -> B, A -> C, A -> D, D -> E}
     */
    @Test
    public void testRegroupDFJointTwentyFive() {
        testTemplate(this.setUpObject.dfJoint26(), this.setUpObject.dfJoint25());
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#regroupDFJoint()}.
     * Expected out - {AB -> D, B -> CE, C -> B}
     * DFJoint in   - {AB -> D, B -> C, C -> B, B -> E}
     */
    @Test
    public void testRegroupDFJointSix() {
        testTemplate(this.setUpObject.dfJoint27(), this.setUpObject.dfJoint06());
    }

}
