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

    /**
     * Checks if {A} isContained in {A, B, C}.
     * 
     * Test method for {@link datastructures.AttributeJoint#isContained(AttributeJoint)}.
     */
    @Test
    public void testIsContainedSingleElementAttributeJoint() {
        String [] containedJointArray = {"A"};
        AttributeJoint containedJoint = new AttributeJoint(containedJointArray);
        assertTrue(containedJoint.isContained(mainAttributeJoint));
    }
    
    /**
     * Checks if {A, C} isContained in {A, B, C}.
     * 
     * Test method for {@link datastructures.AttributeJoint#isContained(AttributeJoint)}.
     */
    @Test
    public void testIsContainedAttributeJoint() {
        String [] containedJointArray = {"A", "C"};
        AttributeJoint containedJoint = new AttributeJoint(containedJointArray);
        assertTrue(containedJoint.isContained(mainAttributeJoint));
    }
    
    /**
     * Checks if {A, B, C} isContained in null AttributeJoint.
     * 
     * Test method for {@link datastructures.AttributeJoint#isContained(AttributeJoint)}.
     */
    @Test
    public void testIsContainedNullAttributeJointFalse() {
        AttributeJoint nullJoint = new AttributeJoint();
        assertFalse(mainAttributeJoint.isContained(nullJoint));
    }
    
    /**
     * Checks if a null AttributeJoint isContained in {A, B, C}.
     * 
     * Test method for {@link datastructures.AttributeJoint#isContained(AttributeJoint)}.
     */
    @Test
    public void testIsContainedNullAttributeJointDoesNotContainAnyAttributeJoint() {
        AttributeJoint nullJoint = new AttributeJoint();
        assertFalse(nullJoint.isContained(mainAttributeJoint));
    }
    
    /**
     * Checks if {D} isContained in {A, B, C}.
     * 
     * Test method for {@link datastructures.AttributeJoint#isContained(AttributeJoint)}.
     */
    @Test
    public void testIsContainedSingleElementAttributeJointFalse() {
        String [] containedJointArray = {"D"};
        AttributeJoint containedJoint = new AttributeJoint(containedJointArray);
        assertFalse(containedJoint.isContained(mainAttributeJoint));
    }
    
    /**
     * Checks if {D, E} isContained in {A, B, C}.
     * 
     * Test method for {@link datastructures.AttributeJoint#isContained(AttributeJoint)}.
     */
    @Test
    public void testIsContainedAttributeJointFalse() {
        String [] containedJointArray = {"D", "E"};
        AttributeJoint containedJoint = new AttributeJoint(containedJointArray);
        assertFalse(containedJoint.isContained(mainAttributeJoint));
    }
    
    /**
     * Checks if {A, C, D} isContained in {A, B, C}.
     * 
     * Test method for {@link datastructures.AttributeJoint#isContained(AttributeJoint)}.
     */
    @Test
    public void testIsNotContainedAttributeJointWithSimilarAttributesFalse() {
        String [] containedJointArray = {"A", "C", "D"};
        AttributeJoint containedJoint = new AttributeJoint(containedJointArray);
        assertFalse(containedJoint.isContained(mainAttributeJoint));
    }
    
    /**
     * Checks the position of Attribute: A, C and D in {A, B, C}.
     * 
     * Test method for {@link datastructures.AttributeJoint#getAttributePosition(Attribute)}.
     */
    @Test
    public void testGetAttributePositionNormalAttributeJoint() {
        assertEquals(0, this.mainAttributeJoint.getAttributePosition(new Attribute("A")));
        assertEquals(1, this.mainAttributeJoint.getAttributePosition(new Attribute("B")));
        assertEquals(2, this.mainAttributeJoint.getAttributePosition(new Attribute("C")));
    }
    
    /**
     * Checks the position of Attribute: A in a null AttributeJoint.
     * 
     * Test method for {@link datastructures.AttributeJoint#getAttributePosition(Attribute)}.
     */
    @Test
    public void testGetAttributePositionVoidAttributeJoint() {
        AttributeJoint nullAttrJoint = new AttributeJoint();
        assertEquals(-1, nullAttrJoint.getAttributePosition(new Attribute("A")));
    }
    
    /**
     * Checks the position of Attribute: D in {A, B, C}.
     * 
     * Test method for {@link datastructures.AttributeJoint#getAttributePosition(Attribute)}.
     */
    @Test
    public void testGetAttributePositionThatDoesNotExistInNormalAttributeJoint() {
        assertEquals(-1, this.mainAttributeJoint.getAttributePosition(new Attribute("D")));
    }

    /**
     * Checks that AttributeJoint: {A, B, C} has a size of three.
     * 
     * Test method for {@link datastructures.AttributeJoint#getSize()}.
     */
    @Test
    public void testGetSizeAssert() {
        assertEquals(mainAttributeJoint.getSize(), 3);
    }

    /**
     * Checks that AttributeJoint: {A, B, C} does not have a size of zero.
     * 
     * Test method for {@link datastructures.AttributeJoint#getSize()}.
     */
    @Test
    public void testGetSizeFail() {
        assertNotEquals(mainAttributeJoint.getSize(), 0);
    }

    /**
     * Checks that AttributeJoint: {null} has a size of zero.
     * 
     * Test method for {@link datastructures.AttributeJoint#getSize()}.
     */
    @Test
    public void testGetSizeNullAttributeJoint() {
        assertEquals(0, new AttributeJoint().getSize());
    }
 
    /**
     * Checks that after {@code clear} method is called on AtributeJoint:
     * {A, B, C} the object is empty.
     * 
     * Test method for {@link datastructures.AttributeJoint#clear()}.
     */
    @Test
    public void testClearJoint() {
        this.mainAttributeJoint.clear();
        assertEquals(0, this.mainAttributeJoint.getSize());
    }
    
    /**
     * Checks if the result of removing Attribute C from AttributeJoint {A, B, C} 
     * is equal with {A, B} .
     * 
     * Test method for {@link datastructures.AttributeJoint#removeAttributes(Attribute)}.
     */
    @Test
    public void testRemoveAttribute() {
        String [] expectedAttrArray = {"A", "B"};
        AttributeJoint expectedAttributeJoint = new AttributeJoint(expectedAttrArray);
        Attribute attr = new Attribute("C");
        mainAttributeJoint.removeAttributes(attr);
        assertEquals(expectedAttributeJoint, mainAttributeJoint);
    }
    
    /**
     * Checks if removing Attribute C from a null AttributeJoint fails.
     * 
     * Test method for {@link datastructures.AttributeJoint#removeAttributes(Attribute)}.
     */
    @Test
    public void testRemoveAttributeFromNullJoint() {
        AttributeJoint nullJoint = new AttributeJoint();
        Attribute attr = new Attribute("C");
        nullJoint.removeAttributes(attr);
        assertNull(nullJoint.getAttributeJoint());
    }
    
    /**
     * Checks if the result of removing AttributeJoint {A, C} from AttributeJoint
     * {A, B, C} is equal with {B} .
     * 
     * Test method for {@link datastructures.AttributeJoint#removeAttributes(AttributeJoint)}.
     */
    @Test
    public void testRemoveAttributeJoint() {
        String [] expArray = {"B"};
        AttributeJoint expectedJoint = new AttributeJoint(expArray);
        String [] removeArray = {"A", "C"};
        AttributeJoint removedJoint = new AttributeJoint(removeArray);
        mainAttributeJoint.removeAttributes(removedJoint);
        assertEquals(expectedJoint, mainAttributeJoint);
    }
    
    /**
     * Checks if removing AttributeJoin {A, B, C} from a null AttributeJoint fails.
     * 
     * Test method for {@link datastructures.AttributeJoint#removeAttributes(AttributeJoint)}.
     */
    @Test
    public void testRemoveAttributeJointFromNullJoint() {
        AttributeJoint nullJoint = new AttributeJoint();
        nullJoint.removeAttributes(mainAttributeJoint);
        assertNull(nullJoint.getAttributeJoint());
    }
    
    /**
     * Checks that from AttributeJoint {A, B, C} returns Attribute A when 
     * {@code position == 0} and Attribute C when {@code position == 2}.
     * 
     * Test method for {@link datastructures.AttributeJoint#getAttributeAt(int)}.
     */
    @Test
    public void getAttributeAt(){
        assertEquals(new Attribute("A"), this.mainAttributeJoint.getAttributeAt(0));
        assertEquals(new Attribute("C"), this.mainAttributeJoint.getAttributeAt(2));
    }
    
    /**
     * Changes C Attribute from AttributeJoint {A, B, C} with Attribute G and
     * checks if operation was successful.
     * 
     * Test method for {@link datastructures.AttributeJoint#changeAttributeAt(int, Attribute)}.
     */
    @Test
    public void changeAttributeAtTest() {
        Attribute attrG = new Attribute("G");
        this.mainAttributeJoint.changeAttributeAt(this.mainAttributeJoint.getSize()-1, attrG);
        assertEquals(attrG, this.mainAttributeJoint.getAttributeAt(this.mainAttributeJoint.getSize() - 1));     
    }
}
