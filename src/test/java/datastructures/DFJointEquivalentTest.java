/**
 * 
 */
package datastructures;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import dependency.FunctionalDependency;

/**
 * @author Pavel Nichita
 *
 */
public class DFJointEquivalentTest {
    private DFJoint firstDFJoint;
    private DFJoint secondDFJoint;
    private DFJoint thirdDFJoint;
    private DFJoint forthDFJoint;
    private DFJoint fifthDFJoint;

    /**
     * Set up.
     */
    @Before
    public void setUp() {
        Attribute attrA = new Attribute("A");
        Attribute attrB = new Attribute("B");
        Attribute attrC = new Attribute("C");
        
        AttributeJoint aJoint = new AttributeJoint();
        aJoint.addAttributes(attrA);
        AttributeJoint bJoint = new AttributeJoint();
        bJoint.addAttributes(attrB);
        AttributeJoint cJoint = new AttributeJoint();
        cJoint.addAttributes(attrC);
        AttributeJoint abJoint = new AttributeJoint();
        abJoint.addAttributes(attrA);
        abJoint.addAttributes(attrB);
        AttributeJoint acJoint = new AttributeJoint();
        acJoint.addAttributes(attrA);
        acJoint.addAttributes(attrC);
        AttributeJoint bcJoint = new AttributeJoint();
        bcJoint.addAttributes(attrB);
        bcJoint.addAttributes(attrC);
        
        //firstDFJoint  = {A -> BC, B -> C, A -> B, AB -> C}
        firstDFJoint = new DFJoint();
        firstDFJoint.addDependency(new FunctionalDependency(aJoint, bcJoint));
        firstDFJoint.addDependency(new FunctionalDependency(bJoint, cJoint));
        firstDFJoint.addDependency(new FunctionalDependency(aJoint, bJoint));
        firstDFJoint.addDependency(new FunctionalDependency(abJoint, cJoint));
        
        //secondDFJoint = {A -> B, B -> C}
        secondDFJoint = new DFJoint();
        secondDFJoint.addDependency(new FunctionalDependency(aJoint, bJoint));
        secondDFJoint.addDependency(new FunctionalDependency(bJoint, cJoint));
        
        //thirdDFJoint  = {A -> BC, B -> AC, C -> AB}
        thirdDFJoint = new DFJoint();
        thirdDFJoint.addDependency(new FunctionalDependency(aJoint, bcJoint));
        thirdDFJoint.addDependency(new FunctionalDependency(bJoint, acJoint));
        thirdDFJoint.addDependency(new FunctionalDependency(cJoint, abJoint));
        
        //forthDFJoint  = {A -> B, B -> C, C -> A}
        forthDFJoint = new DFJoint();
        forthDFJoint.addDependency(new FunctionalDependency(aJoint, bJoint));
        forthDFJoint.addDependency(new FunctionalDependency(bJoint, cJoint));
        forthDFJoint.addDependency(new FunctionalDependency(cJoint, aJoint));
        
        //fifthDFJoint  = {A -> B, B -> AC, C -> B}
        fifthDFJoint = new DFJoint();
        fifthDFJoint.addDependency(new FunctionalDependency(aJoint, bJoint));
        fifthDFJoint.addDependency(new FunctionalDependency(bJoint, acJoint));
        fifthDFJoint.addDependency(new FunctionalDependency(cJoint, bJoint));
    }

    /**
     * Test method for {@link datastructures.DFJoint#isEquivalent(datastructures.DFJoint)}.
     * Check if {A -> BC, B -> C, A -> B, AB -> C} is equivalent to
     * {A -> B, B -> C}, result: true.
     */
    @Test
    public void testIsEquivalent() {
        assertTrue(firstDFJoint.isEquivalent(secondDFJoint));
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#isEquivalent(datastructures.DFJoint)}.
     * Check if {A -> B, B -> C} is equivalent to
     * {A -> BC, B -> C, A -> B, AB -> C}, result: true.
     */
    @Test
    public void isEquivalentSecondAndFirstDFJoints() {
        assertTrue(secondDFJoint.isEquivalent(firstDFJoint));
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#isEquivalent(datastructures.DFJoint)}.
     * Check if {A -> BC, B -> AC, C -> AB} is equivalent to
     * {A -> B, B -> C, C -> A}, result: true.
     */
    @Test
    public void isEquivalentThirdAndForthDFJoints() {
        assertTrue(thirdDFJoint.isEquivalent(forthDFJoint));
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#isEquivalent(datastructures.DFJoint)}.
     * Check if {A -> B, B -> C, C -> A} is equivalent to
     * {A -> BC, B -> AC, C -> AB}, result: true.
     */
    @Test
    public void isEquivalentForthAndThirdDFJoints() {
        assertTrue(forthDFJoint.isEquivalent(thirdDFJoint));
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#isEquivalent(datastructures.DFJoint)}.
     * Check if {A -> BC, B -> AC, C -> AB} is equivalent to
     * {A -> B, B -> AC, C -> B}, result: true.
     */
    @Test
    public void isEquivalentThirdAndFifthDFJoints() {
        assertTrue(thirdDFJoint.isEquivalent(fifthDFJoint));
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#isEquivalent(datastructures.DFJoint)}.
     * Check if {A -> BC, B -> AC, C -> AB} is equivalent to
     * {A -> BC, B -> AC, C -> AB}, result: true.
     */
    @Test
    public void isEquivalentFifthAndThirdDFJoints() {
        assertTrue(fifthDFJoint.isEquivalent(thirdDFJoint));
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#isEquivalent(datastructures.DFJoint)}.
     * Check if {A -> B, B -> C, C -> A} is equivalent to
     * {A -> BC, B -> AC, C -> AB}, result: true.
     */
    @Test
    public void isEquivalentForthAndFifthDFJoints() {
        assertTrue(forthDFJoint.isEquivalent(fifthDFJoint));
    }

    /**
     * Test method for {@link datastructures.DFJoint#isEquivalent(datastructures.DFJoint)}.
     * Check if {A -> BC, B -> AC, C -> AB} is equivalent to
     * {A -> B, B -> C, C -> A}, result: true.
     */
    @Test
    public void isEquivalentFifthAndForthDFJoints() {
        assertTrue(fifthDFJoint.isEquivalent(forthDFJoint));
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#isEquivalent(datastructures.DFJoint)}.
     * Check if {A -> BC, B -> C, A -> B, AB -> C} is equivalent to
     * {A -> BC, B -> AC, C -> AB}, result: false.
     */
    @Test
    public void isNotEquivalentFirstAndThirdDFJoints() {
        assertFalse(firstDFJoint.isEquivalent(thirdDFJoint));
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#isEquivalent(datastructures.DFJoint)}.
     * Check if {A -> BC, B -> AC, C -> AB} is equivalent to
     * {A -> BC, B -> C, A -> B, AB -> C}, result: false.
     */
    @Test
    public void isNotEquivalentThirdAndFirstDFJoints() {
        assertFalse(thirdDFJoint.isEquivalent(firstDFJoint));
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#isEquivalent(datastructures.DFJoint)}.
     * Check if {A -> BC, B -> C, A -> B, AB -> C} is equivalent to
     * {A -> B, B -> C, C -> A}, result: false.
     */
    @Test
    public void isNotEquivalentFirstAndForthDFJoints() {
        assertFalse(firstDFJoint.isEquivalent(forthDFJoint));
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#isEquivalent(datastructures.DFJoint)}.
     * Check if {A -> B, B -> C, C -> A} is equivalent to
     * {A -> BC, B -> C, A -> B, AB -> C}, result: false.
     */
    @Test
    public void isNotEquivalentForthAndFirstDFJoints() {
        assertFalse(forthDFJoint.isEquivalent(firstDFJoint));
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#isEquivalent(datastructures.DFJoint)}.
     * Check if {A -> BC, B -> C, A -> B, AB -> C} is equivalent to
     * {A -> BC, B -> AC, C -> AB}, result: false.
     */
    @Test
    public void isNotEquivalentFirstAndFifthDFJoints() {
        assertFalse(firstDFJoint.isEquivalent(fifthDFJoint));
    }

    /**
     * Test method for {@link datastructures.DFJoint#isEquivalent(datastructures.DFJoint)}.
     * Check if {A -> BC, B -> AC, C -> AB} is equivalent to
     * {A -> BC, B -> C, A -> B, AB -> C}, result: false.
     */
    @Test
    public void isNotEquivalentFifthAndFirstDFJoints() {
        assertFalse(fifthDFJoint.isEquivalent(firstDFJoint));
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#isEquivalent(datastructures.DFJoint)}.
     * Check if {A -> B, B -> C} is equivalent to
     * {A -> BC, B -> AC, C -> AB}, result: false.
     */
    @Test
    public void isNotEquivalentSecondAndThirdDFJoints() {
        assertFalse(secondDFJoint.isEquivalent(thirdDFJoint));
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#isEquivalent(datastructures.DFJoint)}.
     * Check if {A -> BC, B -> AC, C -> AB} is equivalent to
     * {A -> B, B -> C}, result: false.
     */
    @Test
    public void isNotEquivalentThirdAndSecondDFJoints() {
        assertFalse(thirdDFJoint.isEquivalent(secondDFJoint));
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#isEquivalent(datastructures.DFJoint)}.
     * Check if {A -> B, B -> C} is equivalent to
     * {A -> B, B -> C, C -> A}, result: false.
     */
    @Test
    public void isNotEquivalentSecondAndForthDFJoints() {
        assertFalse(secondDFJoint.isEquivalent(forthDFJoint));
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#isEquivalent(datastructures.DFJoint)}.
     * Check if {A -> B, B -> C, C -> A} is equivalent to
     * {A -> B, B -> C}, result: false.
     */
    @Test
    public void isNotEquivalentForthAndSecondDFJoints() {
        assertFalse(forthDFJoint.isEquivalent(secondDFJoint));
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#isEquivalent(datastructures.DFJoint)}.
     * Check if {A -> B, B -> C} is equivalent to
     * {A -> BC, B -> AC, C -> AB}, result: false.
     */
    @Test
    public void isNotEquivalentSecondAndFifthDFJoints() {
        assertFalse(secondDFJoint.isEquivalent(fifthDFJoint));
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#isEquivalent(datastructures.DFJoint)}.
     * Check if {A -> BC, B -> AC, C -> AB} is equivalent to
     * {A -> B, B -> C}, result: false.
     */
    @Test
    public void isNotEquivalentFifthAndSecondDFJoints() {
        assertFalse(fifthDFJoint.isEquivalent(secondDFJoint));
    }
        
}
