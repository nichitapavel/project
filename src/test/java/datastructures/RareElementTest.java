/**
 * 
 */
package datastructures;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

import dependency.ADependency;

/**
 * @author Pavel Nichita
 *
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RareElementTest {
    private RareElement rareElement;
    private RareElement rareElementVoid;
    private SetUpClass setUpObject;
    
    /**
     * 
     */
    @Before
    public void setUp() {
        this.setUpObject = new SetUpClass();
        Attribute attr = this.setUpObject.attrA();
        ADependency fd = this.setUpObject.funcDepAtoB();
        FDSet dfJoint = this.setUpObject.dfJoint04();
        this.rareElement = new RareElement(attr, fd, dfJoint, "Antecedent");
        this.rareElementVoid = new RareElement();
    }

    /**
     * Test method for {@link datastructures.RareElement#RareElement()}.
     * Checks that a null RareElement has all of his attributes to null.
     */
    @Test
    public void testRareElement() {
        assertNull(this.rareElementVoid.getAttribute());
        assertNull(this.rareElementVoid.getFD());
        assertNull(this.rareElementVoid.getDFJoint());
        assertNull(this.rareElementVoid.getPosition());
    }

    /**
     * Test method for {@link datastructures.RareElement#RareElement(datastructures.Attribute, dependency.ADependency, datastructures.FDSet, java.lang.String)}.
     * Checks that a RareElement has all of his attributes with content.
     */
    @Test
    public void testRareElementAttributeADependencyDFJointString() {
        assertEquals(this.setUpObject.attrA(), this.rareElement.getAttribute());
        assertEquals(this.setUpObject.funcDepAtoB(), this.rareElement.getFD());
        assertEquals(this.setUpObject.dfJoint04(), this.rareElement.getDFJoint());
        assertEquals("Antecedent", this.rareElement.getPosition());
    }

    /**
     * Test method for {@link datastructures.RareElement#toString()}.
     * Checks if the string returned is good.
     */
    @Test
    public void testToString() {
        String expected = "//** A, Antecedent, {A} -> {B}, FDSet Four";
        assertEquals(expected, this.rareElement.toString());
    }
    
    /**
     * Test method for {@link datastructures.RareElement#toString()}.
     * Checks if a null RareElement returns "Null" string. 
     */
    @Test
    public void testToStringNull() {
        String expected = "Null";
        assertEquals(expected, this.rareElementVoid.toString());
    }

}
