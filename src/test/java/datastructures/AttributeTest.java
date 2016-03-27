/**
 * 
 */
package datastructures;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 * @author Pavel Nichita
 *
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AttributeTest {
    private Attribute nullAttribute;
    private Attribute namedAttribute;
    private Attribute characterlessAttribute;
    private Attribute stringAttr;
    private final String namedAttr = "Atributo";

    /**
     * Set Up
     */
    @Before
    public void setUp() {
        nullAttribute = new Attribute();
        namedAttribute = new Attribute("Name");
        characterlessAttribute = new Attribute("");
        stringAttr = new Attribute(namedAttr);
    }

    /**
     * Test method for {@link datastructures.Attribute#hashCode()}.
     */
    @Test
    public void testHashCode() {
        Attribute compareHash = new Attribute("Name");
        assertEquals(namedAttribute.hashCode(), compareHash.hashCode());
    }

    /**
     * Test method for {@link datastructures.Attribute#hashCode()}.
     */
    @Test
    public void testHashCodeDifferent() {
        Attribute compareHash = new Attribute("name");
        assertNotEquals(namedAttribute.hashCode(), compareHash.hashCode());
    }

    /**
     * Test method for {@link datastructures.Attribute#hashCode()}.
     */
    @Test
    public void testHashCodeNullAttribute() {
        assertEquals(31, nullAttribute.hashCode());
    }

    /**
     * Test method for {@link datastructures.Attribute#Attribute()}.
     */
    @Test
    public void testAttribute() {
        assertNull(nullAttribute.getAttribute());
    }

    /**
     * Test method for {@link datastructures.Attribute#Attribute(java.lang.String)}.
     */
    @Test
    public void testAttributeString() {
        assertEquals("Name", namedAttribute.getAttribute());
    }

    /**
     * Test method for {@link datastructures.Attribute#Attribute(datastructures.Attribute)}.
     */
    @Test
    public void testAttributeAttribute() {
        Attribute obj = new Attribute(namedAttribute);
        assertEquals(namedAttribute.getAttribute(), obj.getAttribute());
    }

    /**
     * Test method for {@link datastructures.Attribute#getAttribute()}.
     */
    @Test
    public void testGetAttribute() {
        assertEquals(namedAttr, stringAttr.getAttribute());
    }

    /**
     * Test method for {@link datastructures.Attribute#setAttribute(java.lang.String)}.
     */
    @Test
    public void testSetAttribute() {
        String[] arrayAttributeWithNames = {"A", "Nombre"};
        for (String name : arrayAttributeWithNames){
            nullAttribute.setAttribute(name);
            assertEquals(name, nullAttribute.getAttribute());
        }
    }

    /**
     * Test method for {@link datastructures.Attribute#isNull()}.
     */
    @Test
    public void testIsNullTrue() {
        assertTrue(nullAttribute.isNull());
    }
    
    /**
     * Test method for {@link datastructures.Attribute#isNull()}.
     */
    @Test
    public void testIsNullFalse() {
        assertFalse(namedAttribute.isNull());
    }

    /**
     * Test method for {@link datastructures.Attribute#equals(java.lang.Object)}.
     */
    @Test
    public void testEqualsNullValue() {
        assertTrue(nullAttribute.equals(characterlessAttribute));
    }

    /**
     * Test method for {@link datastructures.Attribute#equals(java.lang.Object)}.
     */    
    @Test
    public void testEqualsFalse() {
        assertFalse(nullAttribute.equals(namedAttribute));
    }

    /**
     * Test method for {@link datastructures.Attribute#equals(java.lang.Object)}.
     */    
    @Test
    public void testEqualsWithValue() {
        Attribute anotherNamedAttribute = new Attribute("Name");
        assertTrue(namedAttribute.equals(anotherNamedAttribute));
    }

    /**
     * Test method for {@link datastructures.Attribute#equals(java.lang.Object)}.
     */
    @Test
    public void testEqualsObject() {
        assertTrue(namedAttribute.equals(namedAttribute));
    }

    /**
     * Test method for {@link datastructures.Attribute#equals(java.lang.Object)}.
     */
    @Test
    public void testEqualsNullObject() {
        assertFalse(namedAttribute.equals(null));
    }

    /**
     * Test method for {@link datastructures.Attribute#equals(java.lang.Object)}.
     */
    @Test
    public void testEqualsOtherClassObject() {
        String fail = "This test must fail";
        assertFalse(namedAttribute.equals(fail));
    }

    /**
     * Test method for {@link datastructures.Attribute#equals(java.lang.Object)}.
     */
    @Test
    public void testEqualsCharacterLessAttributeIsEqualToNulAttribute() {
        assertTrue(characterlessAttribute.equals(nullAttribute));
    }

    /**
     * Test method for {@link datastructures.Attribute#toString()}.
     */
    @Test
    public void testToString() {
        assertEquals(namedAttr, stringAttr.toString());
    }

    /**
     * Test method for {@link datastructures.Attribute#compareTo(datastructures.Attribute)}.
     */
    @Test
    public void testCompareToNegativeValue() {
        Attribute a = new Attribute("a");
        Attribute b = new Attribute("b");
        
        int result = a.compareTo(b);
        assertTrue(result < 0);
    }

    /**
     * Test method for {@link datastructures.Attribute#compareTo(datastructures.Attribute)}.
     */
    @Test
    public void testCompareToPositiveValue() {
        Attribute a = new Attribute("a");
        Attribute b = new Attribute("b");
        
        int result = b.compareTo(a);
        assertTrue(result > 0);
    }

    /**
     * Test method for {@link datastructures.Attribute#compareTo(datastructures.Attribute)}.
     */
    @Test
    public void testCompareToEqualValue() {
        Attribute a = new Attribute("a");
        Attribute b = new Attribute("b");
        
        int result = b.compareTo(a);
        assertTrue(result > 0);
    }

    /**
     * Creates an AttributeJoint with these elements in it:
     * <i>Name</i>, <i>Atributo</i> and <i>A</i>. Checks for every Attribute 
     * if it is contained in the AttributeJoint.
     * 
     * Test method for {@link datastructures.Attribute#isContained(AttributeJoint)}.
     */
    @Test
    public void testIsContained() {
        String [] attributes = {"Name", "Atributo", "A"};
        AttributeJoint attrJoint = new AttributeJoint(attributes);
        assertTrue(namedAttribute.isContained(attrJoint));
        assertTrue(stringAttr.isContained(attrJoint));
        Attribute attrA = new Attribute("A");
        assertTrue(attrA.isContained(attrJoint));
    }

    /**
     * Creates an AttributeJoint with these elements in it:
     * Atributo and A. Checks if Attribute <i>Name</i> 
     * is contained in the AttributeJoint. 
     * 
     * Test method for {@link datastructures.Attribute#isContained(AttributeJoint)}.
     */
    @Test
    public void testIsContainedFalseAttrJoint() {
        String [] attributes = {"Atributo", "A"};
        AttributeJoint attrJoint = new AttributeJoint(attributes);
        assertFalse(namedAttribute.isContained(attrJoint));
    }

    /**
     * Checks if Attribute <i>Name</i> is contained in a null AttributeJoint. 
     * 
     * Test method for {@link datastructures.Attribute#isContained(AttributeJoint)}.
     */
    @Test
    public void testIsContainedNullAttrJoint() {
        AttributeJoint attrJoint = new AttributeJoint();
        assertFalse(namedAttribute.isContained(attrJoint));
    }
}
