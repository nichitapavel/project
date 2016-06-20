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
     * Test method for {@link datastructures.FDSet#projectionOnAttributeJoint(datastructures.AttributeSet)}.
     * Projecting {AB -> C, C -> A} on {B, C},
     * result: {}.
     */
    @Test
    public void testProjectionOnAttributeJointDFJoint10OnBC() {
        FDSet dfJoint = this.setUpObject.dfJoint10();
        AttributeSet attrJoint = this.setUpObject.attrJntBC();
        FDSet expected = new FDSet();
        assertEquals(expected, dfJoint.projectionOnAttributeJoint(attrJoint));
    }
    
    /**
     * Test method for {@link datastructures.FDSet#projectionOnAttributeJoint(datastructures.AttributeSet)}.
     * Projecting {AB -> C, C -> A} on {A, C},
     * result: {C -> A}.
     */
    @Test
    public void testProjectionDFJointTenToAttributeJointAC() {
        FDSet dfJoint = this.setUpObject.dfJoint10();
        AttributeSet attrJoint = this.setUpObject.attrJntAC();
        FDSet expected = this.setUpObject.dfJoint11();
        assertEquals(expected, dfJoint.projectionOnAttributeJoint(attrJoint));
    }
    
    /**
     * Test method for {@link datastructures.FDSet#projectionOnAttributeJoint(datastructures.AttributeSet)}.
     * Projecting {A -> B, CD -> A, BD -> C, DE -> C} on {A, B},
     * result: {A -> B}.
     */
    @Test
    public void testProjectionDFJointTwelveToAttributeJointAB() {
        FDSet dfJoint = this.setUpObject.dfJoint12();
        AttributeSet attrJoint = this.setUpObject.attrJntAB();
        FDSet expected = this.setUpObject.dfJoint13();
        assertEquals(expected, dfJoint.projectionOnAttributeJoint(attrJoint));
    }
    
    /**
     * Test method for {@link datastructures.FDSet#projectionOnAttributeJoint(datastructures.AttributeSet)}.
     * Projecting {A -> B, CD -> A, BD -> C, DE -> C} on {A, C, D, E},
     * result: {CD -> A, DE -> C, AD -> C}.
     */
    @Test
    public void testProjectionDFJointTwelveToAttributeJointACDE() {
        FDSet dfJoint = this.setUpObject.dfJoint12();
        AttributeSet attrJoint = this.setUpObject.attrJntACDE();
        FDSet expected = this.setUpObject.dfJoint14();
        assertEquals(expected, dfJoint.projectionOnAttributeJoint(attrJoint));
    }

    /**
     * Test method for {@link datastructures.FDSet#projectionOnAttributeJoint(datastructures.AttributeSet)}.
     * Projecting {CD -> A, AD -> C, DE -> C} on {A, C, D},
     * result: {CD -> A, AD -> C}.
     */
    @Test
    public void testProjectionDFJointFourteenToAttributeJointACD() {
        FDSet dfJoint = this.setUpObject.dfJoint14();
        AttributeSet attrJoint = this.setUpObject.attrJntACD();
        FDSet expected = this.setUpObject.dfJoint15();
        assertEquals(expected, dfJoint.projectionOnAttributeJoint(attrJoint));
    }
    
    /**
     * Test method for {@link datastructures.FDSet#projectionOnAttributeJoint(datastructures.AttributeSet)}.
     * Projecting {CD -> A, AD -> C, DE -> C} on {C, D, E},
     * result: {DE -> C}.
     */
    @Test
    public void testProjectionDFJointFourteenToAttributeJointCDE() {
        FDSet dfJoint = this.setUpObject.dfJoint14();
        AttributeSet attrJoint = this.setUpObject.attrJntCDE();
        FDSet expected = this.setUpObject.dfJoint16();
        assertEquals(expected, dfJoint.projectionOnAttributeJoint(attrJoint));
    }
    
    /**
     * Test method for {@link datastructures.FDSet#projectionOnAttributeJoint(datastructures.AttributeSet)}.
     * Projecting {BCD -> E, E -> C} on {C, E},
     * result: {E -> C}.
     */
    @Test
    public void testProjectionDFJointSeventeenToAttributeJointCE() {
        FDSet dfJoint = this.setUpObject.dfJoint17();
        AttributeSet attrJoint = this.setUpObject.attrJntCE();
        FDSet expected = this.setUpObject.dfJoint18();
        assertEquals(expected, dfJoint.projectionOnAttributeJoint(attrJoint));
    }
   
    /**
     * Test method for {@link datastructures.FDSet#projectionOnAttributeJoint(datastructures.AttributeSet)}.
     * Projecting {BCD -> E, E -> C} on {B, D, E},
     * result: {}.
     */
    @Test
    public void testProjectionDFJointSeventeenToAttributeJointBDE() {
        FDSet dfJoint = this.setUpObject.dfJoint17();
        AttributeSet attrJoint = this.setUpObject.attrJntBDE();
        FDSet expected = new FDSet();
        assertEquals(expected, dfJoint.projectionOnAttributeJoint(attrJoint));
    }
    
    /**
     * Test method for {@link datastructures.FDSet#projectionOnAttributeJoint(datastructures.AttributeSet)}.
     * Projecting {AB -> C, C -> B} on {B, C},
     * result: {C -> B}.
     */
    @Test
    public void testProjectionDFJointNineteenToAttributeJointBC() {
        FDSet dfJoint = this.setUpObject.dfJoint19();
        AttributeSet attrJoint = this.setUpObject.attrJntBC();
        FDSet expected = this.setUpObject.dfJoint20();
        assertEquals(expected, dfJoint.projectionOnAttributeJoint(attrJoint));
    }
    
    /**
     * Test method for {@link datastructures.FDSet#projectionOnAttributeJoint(datastructures.AttributeSet)}.
     * Projecting {AB -> C, C -> B} on {A, C},
     * result: {}.
     */
    @Test
    public void testProjectionDFJointNineteenToAttributeJointAC() {
        FDSet dfJoint = this.setUpObject.dfJoint19();
        AttributeSet attrJoint = this.setUpObject.attrJntAC();
        FDSet expected = new FDSet();
        assertEquals(expected, dfJoint.projectionOnAttributeJoint(attrJoint));
    }
    
    /**
     * Test method for {@link datastructures.FDSet#projectionOnAttributeJoint(datastructures.AttributeSet)}.
     * Projecting {A -> BC, B -> C, A -> B, AB -> C} on {A, C},
     * result: {A -> C}.
     */
    @Test
    public void testProjectionDFJointFourToAttributeJointAC() {
        FDSet dfJoint = this.setUpObject.dfJoint04();
        AttributeSet attrJoint = this.setUpObject.attrJntAC();
        FDSet expected = this.setUpObject.dfJoint21();
        assertEquals(expected, dfJoint.projectionOnAttributeJoint(attrJoint));
    }
    
    /**
     * Test method for {@link datastructures.FDSet#projectionOnAttributeJoint(datastructures.AttributeSet)}.
     * Projecting {A -> BC, B -> C, A -> B, AB -> C} on {A, B},
     * result: {A -> B}.
     */
    @Test
    public void testProjectionDFJointFourToAttributeJointAB() {
        FDSet dfJoint = this.setUpObject.dfJoint04();
        AttributeSet attrJoint = this.setUpObject.attrJntAB();
        FDSet expected = this.setUpObject.dfJoint13();
        assertEquals(expected, dfJoint.projectionOnAttributeJoint(attrJoint));
    }
    
    /**
     * Test method for {@link datastructures.FDSet#projectionOnAttributeJoint(datastructures.AttributeSet)}.
     * Projecting {A -> BC, B -> C, A -> B, AB -> C} on {B, C},
     * result: {B -> C}.
     */
    @Test
    public void testProjectionDFJointFourToAttributeJointBC() {
        FDSet dfJoint = this.setUpObject.dfJoint04();
        AttributeSet attrJoint = this.setUpObject.attrJntBC();
        FDSet expected = this.setUpObject.dfJoint22();
        assertEquals(expected, dfJoint.projectionOnAttributeJoint(attrJoint));
    }
    
    /**
     * Test method for {@link datastructures.FDSet#projectionOnAttributeJoint(datastructures.AttributeSet)}.
     * Projecting {C -> A, CD -> E, A -> B} on {A, C},
     * result: {C -> A}.
     */
    @Test
    public void testProjectionDFJoint35AToAttributeJointAC() {
        FDSet dfJoint = this.setUpObject.dpJoint35A();
        AttributeSet attrJoint = this.setUpObject.attrJntAC();
        FDSet expected = this.setUpObject.dfJointCtoA();
        assertEquals(expected, dfJoint.projectionOnAttributeJoint(attrJoint));
    }

    /**
     * Test method for {@link datastructures.FDSet#projectionOnAttributeJoint(datastructures.AttributeSet)}.
     * Projecting {A -> B, B -> C, C -> D} on {A, D},
     * result: {A -> D}.
     */
    @Test
    public void testProjectionDFJoint07AToAttributeJointAD() {
        FDSet dfJoint = this.setUpObject.dfJoint07();
        AttributeSet attrJoint = this.setUpObject.attrJntAD();
        FDSet expected = this.setUpObject.dfJoint29();
        assertEquals(expected, dfJoint.projectionOnAttributeJoint(attrJoint));
    }
    
    /**
     * Test method for {@link datastructures.FDSet#projectionOnAttributeJoint(datastructures.AttributeSet)}.
     * Projecting {A -> B, B -> C, C -> D} on {A, B, C},
     * result: {A -> B, B -> C}.
     */
    @Test
    public void testProjectionDFJoint07AToAttributeJointABC() {
        FDSet dfJoint = this.setUpObject.dfJoint07();
        AttributeSet attrJoint = this.setUpObject.attrJntABC();
        FDSet expected = this.setUpObject.dfJoint05();
        assertEquals(expected, dfJoint.projectionOnAttributeJoint(attrJoint));
    }
    
    /**
     * Test method for {@link datastructures.FDSet#projectionOnAttributeJoint(datastructures.AttributeSet)}.
     * Projecting {A -> BE, B -> C, EC -> D} on {A, D},
     * result: {A -> D}.
     */
    @Test
    public void testProjectionDFJoint100AToAttributeJointAD() {
        FDSet dfJoint = this.setUpObject.dfJoint100();
        AttributeSet attrJoint = this.setUpObject.attrJntAD();
        FDSet expected = this.setUpObject.dfJoint29();
        assertEquals(expected, dfJoint.projectionOnAttributeJoint(attrJoint));
    }
    
    /**
     * Test method for {@link datastructures.FDSet#projectionOnAttributeJoint(datastructures.AttributeSet)}.
     * Projecting {A -> BC, BC -> A, BCD -> E, E -> C} on {A, D, E},
     * result: {AD -> E}.
     */
    @Test
    public void testProjectionDFJoint01AToAttributeJointADE() {
        FDSet dfJoint = this.setUpObject.dfJoint01();
        AttributeSet attrJoint = this.setUpObject.attrJntADE();
        FDSet expected = this.setUpObject.dfJointADtoe();
        assertEquals(expected, dfJoint.projectionOnAttributeJoint(attrJoint));
    }
}
