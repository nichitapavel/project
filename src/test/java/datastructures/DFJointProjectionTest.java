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
public class DFJointProjectionTest {
    private SetUpClass setUpObject;
    
    /**
     * Set up.
     */
    @Before
    public void setUp() {
        this.setUpObject = new SetUpClass();
    }

    /**
     * Test method for {@link datastructures.DFJoint#projectionOnAttributeJoint(datastructures.AttributeJoint)}.
     * Projecting {AB -> C, C -> A} on {B, C},
     * result: {}.
     */
    @Test
    public void testProjectionOnAttributeJointDFJoint10OnBC() {
        DFJoint dfJoint = this.setUpObject.dfJoint10();
        AttributeJoint attrJoint = this.setUpObject.attrJntBC();
        DFJoint expected = new DFJoint();
        assertEquals(expected, dfJoint.projectionOnAttributeJoint(attrJoint));
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#projectionOnAttributeJoint(datastructures.AttributeJoint)}.
     * Projecting {AB -> C, C -> A} on {A, C},
     * result: {C -> A}.
     */
    @Test
    public void projectionDFJointTenToAttributeJointAC() {
        DFJoint dfJoint = this.setUpObject.dfJoint10();
        AttributeJoint attrJoint = this.setUpObject.attrJntAC();
        DFJoint expected = this.setUpObject.dfJoint11();
        assertEquals(expected, dfJoint.projectionOnAttributeJoint(attrJoint));
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#projectionOnAttributeJoint(datastructures.AttributeJoint)}.
     * Projecting {A -> B, CD -> A, BD -> C, DE -> C} on {A, B},
     * result: {A -> B}.
     */
    @Test
    public void projectionDFJointTwelveToAttributeJointAB() {
        DFJoint dfJoint = this.setUpObject.dfJoint12();
        AttributeJoint attrJoint = this.setUpObject.attrJntAB();
        DFJoint expected = this.setUpObject.dfJoint13();
        assertEquals(expected, dfJoint.projectionOnAttributeJoint(attrJoint));
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#projectionOnAttributeJoint(datastructures.AttributeJoint)}.
     * Projecting {A -> B, CD -> A, BD -> C, DE -> C} on {A, C, D, E},
     * result: {CD -> A, AD -> C, DE -> C}.
     */
    @Test
    public void projectionDFJointTwelveToAttributeJointACDE() {
        DFJoint dfJoint = this.setUpObject.dfJoint12();
        AttributeJoint attrJoint = this.setUpObject.attrJntACDE();
        DFJoint expected = this.setUpObject.dfJoint14();
        assertEquals(expected, dfJoint.projectionOnAttributeJoint(attrJoint));
    }

    /**
     * Test method for {@link datastructures.DFJoint#projectionOnAttributeJoint(datastructures.AttributeJoint)}.
     * Projecting {CD -> A, AD -> C, DE -> C} on {A, C, D},
     * result: {CD -> A, AD -> C}.
     */
    @Test
    public void projectionDFJointFourteenToAttributeJointACD() {
        DFJoint dfJoint = this.setUpObject.dfJoint14();
        AttributeJoint attrJoint = this.setUpObject.attrJntACD();
        DFJoint expected = this.setUpObject.dfJoint15();
        assertEquals(expected, dfJoint.projectionOnAttributeJoint(attrJoint));
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#projectionOnAttributeJoint(datastructures.AttributeJoint)}.
     * Projecting {CD -> A, AD -> C, DE -> C} on {C, D, E},
     * result: {DE -> C}.
     */
    @Test
    public void projectionDFJointFourteenToAttributeJointCDE() {
        DFJoint dfJoint = this.setUpObject.dfJoint14();
        AttributeJoint attrJoint = this.setUpObject.attrJntCDE();
        DFJoint expected = this.setUpObject.dfJoint16();
        assertEquals(expected, dfJoint.projectionOnAttributeJoint(attrJoint));
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#projectionOnAttributeJoint(datastructures.AttributeJoint)}.
     * Projecting {BCD -> E, E -> C} on {C, E},
     * result: {E -> C}.
     */
    @Test
    public void projectionDFJointSeventeenToAttributeJointCE() {
        DFJoint dfJoint = this.setUpObject.dfJoint17();
        AttributeJoint attrJoint = this.setUpObject.attrJntCE();
        DFJoint expected = this.setUpObject.dfJoint18();
        assertEquals(expected, dfJoint.projectionOnAttributeJoint(attrJoint));
    }
   
    /**
     * Test method for {@link datastructures.DFJoint#projectionOnAttributeJoint(datastructures.AttributeJoint)}.
     * Projecting {BCD -> E, E -> C} on {B, D, E},
     * result: {}.
     */
    @Test
    public void projectionDFJointSeventeenToAttributeJointBDE() {
        DFJoint dfJoint = this.setUpObject.dfJoint17();
        AttributeJoint attrJoint = this.setUpObject.attrJntBDE();
        DFJoint expected = new DFJoint();
        assertEquals(expected, dfJoint.projectionOnAttributeJoint(attrJoint));
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#projectionOnAttributeJoint(datastructures.AttributeJoint)}.
     * Projecting {AB -> C, C -> B} on {B, C},
     * result: {C -> B}.
     */
    @Test
    public void projectionDFJointNineteenToAttributeJointBC() {
        DFJoint dfJoint = this.setUpObject.dfJoint19();
        AttributeJoint attrJoint = this.setUpObject.attrJntBC();
        DFJoint expected = this.setUpObject.dfJoint20();
        assertEquals(expected, dfJoint.projectionOnAttributeJoint(attrJoint));
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#projectionOnAttributeJoint(datastructures.AttributeJoint)}.
     * Projecting {AB -> C, C -> B} on {A, C},
     * result: {}.
     */
    @Test
    public void projectionDFJointNineteenToAttributeJointAC() {
        DFJoint dfJoint = this.setUpObject.dfJoint19();
        AttributeJoint attrJoint = this.setUpObject.attrJntAC();
        DFJoint expected = new DFJoint();
        assertEquals(expected, dfJoint.projectionOnAttributeJoint(attrJoint));
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#projectionOnAttributeJoint(datastructures.AttributeJoint)}.
     * Projecting {A -> BC, B -> C, A -> B, AB -> C} on {A, C},
     * result: {A -> C}.
     */
    @Test
    public void projectionDFJointFourToAttributeJointAC() {
        DFJoint dfJoint = this.setUpObject.dfJoint04();
        AttributeJoint attrJoint = this.setUpObject.attrJntAC();
        DFJoint expected = this.setUpObject.dfJoint21();
        assertEquals(expected, dfJoint.projectionOnAttributeJoint(attrJoint));
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#projectionOnAttributeJoint(datastructures.AttributeJoint)}.
     * Projecting {A -> BC, B -> C, A -> B, AB -> C} on {A, B},
     * result: {A -> B}.
     */
    @Test
    public void projectionDFJointFourToAttributeJointAB() {
        DFJoint dfJoint = this.setUpObject.dfJoint04();
        AttributeJoint attrJoint = this.setUpObject.attrJntAB();
        DFJoint expected = this.setUpObject.dfJoint13();
        assertEquals(expected, dfJoint.projectionOnAttributeJoint(attrJoint));
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#projectionOnAttributeJoint(datastructures.AttributeJoint)}.
     * Projecting {A -> BC, B -> C, A -> B, AB -> C} on {B, C},
     * result: {B -> C}.
     */
    @Test
    public void projectionDFJointFourToAttributeJointBC() {
        DFJoint dfJoint = this.setUpObject.dfJoint04();
        AttributeJoint attrJoint = this.setUpObject.attrJntBC();
        DFJoint expected = this.setUpObject.dfJoint22();
        assertEquals(expected, dfJoint.projectionOnAttributeJoint(attrJoint));
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#projectionOnAttributeJoint(datastructures.AttributeJoint)}.
     * Projecting {C -> A, CD -> E, A -> B} on {A, C},
     * result: {C -> A}.
     */
    @Test
    public void projectionDFJoint35_AToAttributeJointAC() {
        DFJoint dfJoint = this.setUpObject.dpJoint35A();
        AttributeJoint attrJoint = this.setUpObject.attrJntAC();
        DFJoint expected = this.setUpObject.dfJointCtoA();
        assertEquals(expected, dfJoint.projectionOnAttributeJoint(attrJoint));
    }

}
