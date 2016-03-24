/**
 * 
 */
package datastructures;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Pavel Nichita
 *
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AttributeJointTest {
    private AttributeJoint mainAttributeJoint;
    
    /**
     * Set up
     */
    @Before
    public void setUp() {
        String [] attrArray = {"A", "B", "C"};
        mainAttributeJoint = new AttributeJoint(attrArray);
    }

    /**
     * Test method for {@link datastructures.AttributeJoint#AttributeJoint()}.
     */
    @Test
    public void testAttributeJoint() {
        AttributeJoint voidConstructor = new AttributeJoint();
        assertNull(voidConstructor.getAttributeJoint());
    }

    /**
     * Test method for {@link datastructures.AttributeJoint#AttributeJoint(java.lang.String[])}.
     */
    @Test
    public void testAttributeJointStringArray() {
        String [] attrArray = {"A", "B", "C"};
        AttributeJoint arrayConstructor = new AttributeJoint(attrArray);
        List<Attribute> getterJoint = arrayConstructor.getAttributeJoint();
        assertEquals(attrArray.length, getterJoint.size());
        for (int i = 0; i < attrArray.length; i++)
            assertEquals(attrArray[i], getterJoint.get(i).getAttribute());
    }

    /**
     * Test method for {@link datastructures.AttributeJoint#AttributeJoint(java.util.List)}.
     */
    @Test
    public void testAttributeJointListOfAttribute() {
        List<Attribute> attrVector = new ArrayList<>();
        attrVector.add(new Attribute("A"));
        attrVector.add(new Attribute("B"));
        
        AttributeJoint arrayListConstructor = new AttributeJoint(attrVector);
        List<Attribute> getterJoint = arrayListConstructor.getAttributeJoint();
        assertEquals(attrVector.size(), getterJoint.size());
        for (int i = 0; i < getterJoint.size(); i++)
            assertEquals(attrVector.get(i).getAttribute(), getterJoint.get(i).getAttribute());  
    }

    /**
     * Test method for {@link datastructures.AttributeJoint#AttributeJoint(datastructures.AttributeJoint)}.
     */
    @Test
    public void testAttributeJointAttributeJoint() {
        AttributeJoint objConstructor = new AttributeJoint(mainAttributeJoint);
        assertEquals(mainAttributeJoint, objConstructor);
    }

    /**
     * Test method for {@link datastructures.AttributeJoint#getAttributeJoint()}.
     */
    @Test
    public void testGetAttributeJointEqualsTrue() {
        String [] stringAttr = {"A", "B", "C"};
        List<Attribute> auxVector = new ArrayList<>();
        for (String str : stringAttr)
            auxVector.add(new Attribute(str));

        assertEquals(mainAttributeJoint.getAttributeJoint(), auxVector);
    }

    /**
     * Test method for {@link datastructures.AttributeJoint#getAttributeJoint()}.
     */
    @Test
    public void testGetAttributeJointEqualsFalse() {
        String [] stringAttr = {"A", "C"};
        List<Attribute> auxVector = new ArrayList<>();
        for (String str : stringAttr)
            auxVector.add(new Attribute(str));
        
        assertNotEquals(mainAttributeJoint.getAttributeJoint(), auxVector);
    }

    /**
     * Test method for {@link datastructures.AttributeJoint#setAttributeJoint(java.util.List)}.
     */
    @Test
    public void testSetAttributeJointEqualsTrue() {
        String [] stringAttr = {"B", "C", "D"};
        ArrayList<Attribute> auxVector = new ArrayList<>();
        for (String str : stringAttr)
            auxVector.add(new Attribute(str));
        
        mainAttributeJoint.setAttributeJoint(auxVector);
        
        assertEquals(mainAttributeJoint.getAttributeJoint(), auxVector);
    }

    /**
     * Test method for {@link datastructures.AttributeJoint#setAttributeJoint(java.util.List)}.
     */
    @Test
    public void testSetAttributeJointEqualsFalse() {
        String [] stringAttr = {"B", "C", "D"};
        ArrayList<Attribute> auxVector = new ArrayList<>();
        for (String str : stringAttr)
            auxVector.add(new Attribute(str));
        
        AttributeJoint auxAttrJoint = new AttributeJoint();
        auxAttrJoint.setAttributeJoint(auxVector);
        
        assertNotEquals(mainAttributeJoint.getAttributeJoint(), auxAttrJoint.getAttributeJoint());
    }

    /**
     * Test method for {@link datastructures.AttributeJoint#removeDuplicatedAttribute()}.
     */
    @Test
    public void testRemoveDuplicatedAttribute() {
        String [] repeatedAttrArray = {"A", "B", "B", "C"};
        AttributeJoint repeatedAttr = new AttributeJoint(repeatedAttrArray);
        repeatedAttr.removeDuplicatedAttribute();
        
        assertEquals(mainAttributeJoint, repeatedAttr);
    }

    /**
     * Test method for {@link datastructures.AttributeJoint#removeDuplicatedAttribute()}.
     */
    @Test
    public void testRemoveDuplicatedAttributeTwoOrMore() {
        String [] expectedArray = {"A", "B", "C"};
        AttributeJoint expectedResult = new AttributeJoint(expectedArray);
        
        String [] duplicatedAttr = {"A", "B", "A", "A", "C", "B"};
        AttributeJoint duplicatedResult = new AttributeJoint(duplicatedAttr);
        
        duplicatedResult.removeDuplicatedAttribute();
        
        assertEquals(expectedResult, duplicatedResult);
    }

    /**
     * Test method for {@link datastructures.AttributeJoint#toString()}.
     */
    @Test
    public void testToString() {
        String expected = "{A, B, C}";
        assertEquals(expected, mainAttributeJoint.toString());
    }

    /**
     * Test method for {@link datastructures.AttributeJoint#toString()}.
     */
    @Test
    public void testToStringNull() {
        String expected = "null";
        AttributeJoint nullAttrJoint = new AttributeJoint();
        assertEquals(expected, nullAttrJoint.toString());
    }

    /**
     * Test method for {@link datastructures.AttributeJoint#toString()}.
     */
    @Test
    public void testToStringEmpty() {
        ArrayList<Attribute> attrJointVector = new ArrayList<>();
        AttributeJoint attrJoint = new AttributeJoint(attrJointVector);
        assertEquals("null", attrJoint.toString());
    }

    /**
     * Test method for {@link datastructures.AttributeJoint#addAttributes(datastructures.Attribute)}.
     */
    @Test
    public void testAddAttributesAttribute() {
        Attribute attr = new Attribute("D");
        String [] attrArray = {"A", "B", "C", "D"};
        AttributeJoint expectedAttrJoint = new AttributeJoint(attrArray);
        mainAttributeJoint.addAttributes(attr);
        assertEquals(expectedAttrJoint, mainAttributeJoint);
    }

    /**
     * Test method for {@link datastructures.AttributeJoint#addAttributes(datastructures.Attribute)}.
     */
    @Test
    public void testAddAttributesAttributeToNullAttributeJoint() {
        String [] expectedAttrArray = {"A"};
        AttributeJoint expectedAttributeJoint = new AttributeJoint(expectedAttrArray);
        Attribute attr = new Attribute("A");
        AttributeJoint nullJoint = new AttributeJoint();
        nullJoint.addAttributes(attr);
        assertEquals(expectedAttributeJoint, nullJoint);
    }

    /**
     * Test method for {@link datastructures.AttributeJoint#addAttributes(datastructures.AttributeJoint)}.
     */
    @Test
    public void testAddAttributesAttributeJoint() {
        String [] arrayJoint = {"D", "E"};
        AttributeJoint attrJoint = new AttributeJoint(arrayJoint);
        String [] attrArray = {"A", "B", "C", "D", "E"};
        AttributeJoint expectedAttrJoint = new AttributeJoint(attrArray);
        mainAttributeJoint.addAttributes(attrJoint);
        assertEquals(expectedAttrJoint, mainAttributeJoint);
    }

    /**
     * Test method for {@link datastructures.AttributeJoint#addAttributes(datastructures.AttributeJoint)}.
     */
    @Test
    public void testAddAttributesAttributeJointRepeatedAttributes() {
        String [] arrayJoint = {"A", "E"};
        AttributeJoint attrJoint = new AttributeJoint(arrayJoint);
        String [] attrArray = {"A", "B", "C", "E"};
        AttributeJoint expectedAttrJoint = new AttributeJoint(attrArray);
        mainAttributeJoint.addAttributes(attrJoint);
        assertEquals(expectedAttrJoint, mainAttributeJoint);
    }
    
    /**
     * Test method for {@link datastructures.AttributeJoint#addAttributes(datastructures.AttributeJoint)}.
     */
    @Test
    public void testAddAttributesAttributeJointNullAttributeJoint() {
        AttributeJoint nullJoint = new AttributeJoint();
        this.mainAttributeJoint.addAttributes(nullJoint);
        AttributeJoint result = new AttributeJoint(this.mainAttributeJoint);
        assertEquals(mainAttributeJoint, result);
    }
    
    /**
     * Test method for {@link datastructures.AttributeJoint#addAttributes(datastructures.AttributeJoint)}.
     */
    @Test
    public void testAddAttributesAttributeJointSameAttributeJoint() {
        String [] expectedAttrArray = {"A", "B", "C"};
        AttributeJoint expectedAttributeJoint = new AttributeJoint(expectedAttrArray);
        mainAttributeJoint.addAttributes(expectedAttributeJoint);
        assertEquals(expectedAttributeJoint, mainAttributeJoint);
    }
    
    /**
     * Test method for {@link datastructures.AttributeJoint#addAttributes(datastructures.AttributeJoint)}.
     */
    @Test
    public void testAddAttributesAttributeJointToNullAttributeJoint() {
        AttributeJoint nullJoint = new AttributeJoint();
        nullJoint.addAttributes(mainAttributeJoint);
        assertEquals(mainAttributeJoint, nullJoint);
    }

    /**
     * Test method for {@link datastructures.AttributeJoint#hashCode()}.
     */
    @Test
    public void testHashCode() {
        String [] stringAttr = {"A", "B", "C"};
        AttributeJoint hashCodeAttrJoint = new AttributeJoint(stringAttr);
        assertEquals(mainAttributeJoint.hashCode(), hashCodeAttrJoint.hashCode());
    }
    
    /**
     * Test method for {@link datastructures.AttributeJoint#hashCode()}.
     */
    @Test
    public void testHashCodeNullObject() {
        AttributeJoint hashCodeAttrJoint = new AttributeJoint();
        assertEquals(31, hashCodeAttrJoint.hashCode());
    }
    
    /**
     * Test method for {@link datastructures.AttributeJoint#equals()}.
     */
    @Test
    public void testEquals() {
        assertTrue(mainAttributeJoint.equals(mainAttributeJoint));
    }
    
    /**
     * Test method for {@link datastructures.AttributeJoint#equals()}.
     */
    @Test
    public void testEqualsNullObjectFalse() {
        assertFalse(mainAttributeJoint.equals(null));
    }
    
    /**
     * Test method for {@link datastructures.AttributeJoint#equals()}.
     */
    @Test
    public void testEqualsDifferentClass() {
        Attribute a = new Attribute("A");
        assertFalse(mainAttributeJoint.equals(a));
    }

    /**
     * Test method for {@link datastructures.AttributeJoint#equals()}.
     */
    @Test
    public void testEqualsAttributeJointNullTrue() {
        AttributeJoint attrJointA = new AttributeJoint();
        AttributeJoint attrJointB = new AttributeJoint();
        assertTrue(attrJointA.equals(attrJointB));
    }

    /**
     * Test method for {@link datastructures.AttributeJoint#equals()}.
     */
    @Test
    public void testEqualsAttributeJointNullFalse() {
        AttributeJoint attrJointA = new AttributeJoint();
        assertFalse(attrJointA.equals(mainAttributeJoint));
    }
    
    /**
     * Test method for {@link datastructures.AttributeJoint#equals()}.
     */
    @Test
    public void testEqualsAttributeJointInverse() {
        AttributeJoint attrJointA = new AttributeJoint();
        assertFalse(mainAttributeJoint.equals(attrJointA));
    }
    
    /**
     * Test method for {@link datastructures.AttributeJoint#equals()}.
     */
    @Test
    public void testEqualsAttributeJoint() {
        String [] secondaryArray = {"A", "B", "C"};
        AttributeJoint secondaryJoint = new AttributeJoint(secondaryArray);
        assertTrue(secondaryJoint.equals(mainAttributeJoint));
    }
    
    /**
     * Test method for {@link datastructures.AttributeJoint#sort()}.
     */
    @Test
    public void testSort() {
        String [] unsortedArray = {"B", "A", "C"};
        AttributeJoint unsortedJoint = new AttributeJoint(unsortedArray);
        unsortedJoint.sort();
        assertTrue(mainAttributeJoint.equals(unsortedJoint));
    }

    /**
     * Test method for {@link datastructures.AttributeJoint#sort()}.
     */
    @Test
    public void testSortConstructor() {
        String [] unsortedArrayA = {"B", "A", "C"};
        AttributeJoint unsortedJointA = new AttributeJoint(unsortedArrayA);
        assertEquals(mainAttributeJoint, unsortedJointA);
        
        ArrayList<Attribute> unsortedVectorB = new ArrayList<>();
        unsortedVectorB.add(new Attribute("C"));
        unsortedVectorB.add(new Attribute("B"));
        unsortedVectorB.add(new Attribute("A"));
        AttributeJoint unsortedJointB = new AttributeJoint(unsortedVectorB);
        assertEquals(mainAttributeJoint, unsortedJointB);
    }

    /**
     * Test method for {@link datastructures.AttributeJoint#sort()}.
     */
    @Test
    public void testSortAddAttribute() {
        String [] unsortedArray = {"B", "C"};
        AttributeJoint unsortedJoint = new AttributeJoint(unsortedArray);
        unsortedJoint.addAttributes(new Attribute("A"));
        assertEquals(mainAttributeJoint, unsortedJoint);
    }
    
    /**
     * Test method for {@link datastructures.AttributeJoint#sort()}.
     */
    @Test
    public void testSortAddAttributeJoint() {
        String [] unsortedArray = {"B"};
        AttributeJoint unsortedJoint = new AttributeJoint(unsortedArray);
        String [] unsortedArrayB = {"A", "C"};
        AttributeJoint unsortedJointB = new AttributeJoint(unsortedArrayB);
        unsortedJoint.addAttributes(unsortedJointB);
        assertEquals(mainAttributeJoint, unsortedJoint);
    }
    
    /**
     * Test method for {@link datastructures.AttributeJoint#iterator()}.
     */
    @Test
    public void testIterator() {
        for (Attribute attr : this.mainAttributeJoint)
            assertNotNull(attr);
    }

}
