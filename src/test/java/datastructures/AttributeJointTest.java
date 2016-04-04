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
    private SetUpClass setUpObject;
    
    /**
     * Set up
     */
    @Before
    public void setUp() {
        String [] attrArray = {"A", "B", "C"};
        mainAttributeJoint = new AttributeJoint(attrArray);
        setUpObject = new SetUpClass();
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
    public void testGetAttributeAt(){
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
    public void testChangeAttributeAtTest() {
        Attribute attrG = new Attribute("G");
        this.mainAttributeJoint.changeAttributeAt(this.mainAttributeJoint.getSize()-1, attrG);
        assertEquals(attrG, this.mainAttributeJoint.getAttributeAt(this.mainAttributeJoint.getSize() - 1));     
    }
    
    /**
     * Union AttributeJoint {A, B, C} with {D, E, F}, result must be {A, B, C, D, E, F}.
     * 
     * Test method for {@link datastructures.AttributeJoint#union(AttributeJoint)}.
     */
    @Test
    public void testUnionNormalAttributeJoints() {
        String [] stringAttr = {"D", "E", "F"};
        AttributeJoint attrJoint = new AttributeJoint(stringAttr);
        AttributeJoint result = this.mainAttributeJoint.union(attrJoint);
        String [] expectedStringAttr = {"A", "B", "C", "D", "E", "F"};
        AttributeJoint expected = new AttributeJoint(expectedStringAttr);
        assertEquals(expected, result);
    }
    
    /**
     * Union AttributeJoint {A, B, C} with a null AttributeJoint, result must be {A, B, C}.
     * 
     * Test method for {@link datastructures.AttributeJoint#union(AttributeJoint)}.
     */
    @Test
    public void testUnionVoidAttributeJoint() {
        AttributeJoint voidAttrJoint = new AttributeJoint();
        AttributeJoint result = this.mainAttributeJoint.union(voidAttrJoint);
        assertEquals(this.mainAttributeJoint, result);
    }
    
    /**
     * Union AttributeJoint {A, B, C} with {A, C, F}, result must be {A, B, C, F}.
     * 
     * Test method for {@link datastructures.AttributeJoint#union(AttributeJoint)}.
     */
    @Test
    public void testUnionRepetedAttributes() {
        String [] stringAttr = {"A", "C", "F"};
        AttributeJoint attrJoint = new AttributeJoint(stringAttr);
        AttributeJoint result = this.mainAttributeJoint.union(attrJoint);
        String [] expectedStringAttr = {"A", "B", "C", "F"};
        AttributeJoint expected = new AttributeJoint(expectedStringAttr);
        assertEquals(expected, result);
    }

    /**
     * Union AttributeJoint {A, B, C} with {A, B, C}, result must be {A, B, C}.
     * 
     * Test method for {@link datastructures.AttributeJoint#union(AttributeJoint)}.
     */
    @Test
    public void testUnionRepeatedAllAttributes() {
        String [] stringAttr = {"A", "B", "C"};
        AttributeJoint attrJoint = new AttributeJoint(stringAttr);
        AttributeJoint result = this.mainAttributeJoint.union(attrJoint);
        String [] expectedStringAttr = {"A", "B", "C"};
        AttributeJoint expected = new AttributeJoint(expectedStringAttr);
        assertEquals(expected, result);
    }
    
    /**
     * Union a null AttributeJoint with {A, B, C}, result must be {A, B, C}.
     * 
     * Test method for {@link datastructures.AttributeJoint#union(AttributeJoint)}.
     */
    @Test
    public void testUnionVoidAttributeJointWithAttributeJoint() {
        AttributeJoint voidAttrJoint = new AttributeJoint();
        AttributeJoint result = voidAttrJoint.union(this.mainAttributeJoint);
        assertEquals(this.mainAttributeJoint, result);
    }
    
    /**
     * Checks if last Attribute of AttributeJoint {A, B, C} is Attribute C. 
     * 
     * Test method for {@link datastructures.AttributeJoint#getLastAttribute()}.
     */
    @Test
    public void testGetLastAttributeAttributeJoint() {
        Attribute attrC = new Attribute("C");
        assertEquals(attrC, this.mainAttributeJoint.getLastAttribute());
    }
    
    /**
     * Checks if a null AttributeJoint returns null. 
     * 
     * Test method for {@link datastructures.AttributeJoint#getLastAttribute()}.
     */
    @Test
    public void testGetLastAttributeNullAttributeJoint() {
        AttributeJoint attrJoint = new AttributeJoint();
        assertNull(attrJoint.getLastAttribute());
    }
    
    /**
     * Test method for {@link datastructures.AttributeJoint#intersect(AttributeJoint)}.
     * 
     * Intersects AttributeJoin {A, B} with {A}, result must be {A}. 
     */
    @Test
    public void testIntersectAFromAB() {
        AttributeJoint expected = this.setUpObject.attrJntA();
        AttributeJoint firstJoined = this.setUpObject.attrJntAB();
        AttributeJoint secondJoined = this.setUpObject.attrJntA();
        assertEquals(expected, firstJoined.intersect(secondJoined));
    }
    
    /**
     * Test method for {@link datastructures.AttributeJoint#intersect(AttributeJoint)}.
     * 
     * Intersects AttributeJoin {A} with a null, result must be a null AttributeJoint.
     */
    @Test
    public void testIntersectNullFromA() {
        AttributeJoint expected = new AttributeJoint();
        AttributeJoint firstJoined = this.setUpObject.attrJntA();
        AttributeJoint secondJoined = new AttributeJoint();
        assertEquals(expected, firstJoined.intersect(secondJoined));
    }
    
    /**
     * Test method for {@link datastructures.AttributeJoint#intersect(AttributeJoint)}.
     * 
     * Intersects AttributeJoin {A, B, C, D, E} with {D, F}, result must be {D}.
     */
    @Test
    public void testIntersectDromABCDEandDF() {
        AttributeJoint expected = this.setUpObject.attrJntD();
        AttributeJoint firstJoined = this.setUpObject.attrJntABCDE();
        AttributeJoint secondJoined = this.setUpObject.attrJntDF();
        assertEquals(expected, firstJoined.intersect(secondJoined));
    }

    /**
     * Test method for {@link datastructures.AttributeJoint#substract(AttributeJoint)}.
     * 
     * Substracts AttributeJoint {A, B} from {A, B, C}, result must be {C}.
     */
    @Test
    public void testSubstracABFromABC() {
        AttributeJoint expected = this.setUpObject.attrJntC();
        AttributeJoint firstJoined = this.setUpObject.attrJntABC();
        AttributeJoint secondJoined = this.setUpObject.attrJntAB();
        assertEquals(expected, firstJoined.substract(secondJoined));
    }
    
    /**
     * Test method for {@link datastructures.AttributeJoint#substract(AttributeJoint)}.
     * 
     * Substracts AttributeJoint {B, C} from {A, D, E}, result must be {A, D, E}.
     */
    @Test
    public void testSubstracBCFromADE() {
        AttributeJoint expected = this.setUpObject.attrJntADE();
        AttributeJoint firstJoined = this.setUpObject.attrJntADE();
        AttributeJoint secondJoined = this.setUpObject.attrJntBC();
        assertEquals(expected, firstJoined.substract(secondJoined));
    }
    
    /**
     * Test method for {@link datastructures.AttributeJoint#substract(AttributeJoint)}.
     * 
     * Substracts AttributeJoint {B, C} from {A, B}, result must be {A}.
     */
    @Test
    public void testSubstracBCFromAB() {
        AttributeJoint expected = this.setUpObject.attrJntA();
        AttributeJoint firstJoined = this.setUpObject.attrJntAB();
        AttributeJoint secondJoined = this.setUpObject.attrJntBC();
        assertEquals(expected, firstJoined.substract(secondJoined));
    }
    
    /**
     * Test method for {@link datastructures.AttributeJoint#substract(AttributeJoint)}.
     * 
     * Substracts AttributeJoint {B, C} from a null one, result must be an empty AttributeJoint.
     */
    @Test
    public void testSubstracBCFromNull() {
        AttributeJoint expected = new AttributeJoint();
        AttributeJoint firstJoined = new AttributeJoint();
        AttributeJoint secondJoined = this.setUpObject.attrJntBC();
        assertEquals(expected, firstJoined.substract(secondJoined));
    }
    
    /**
     * Test method for {@link datastructures.AttributeJoint#isNull()}.
     * 
     * Checks if null AttributeJoint returns true.
     */
    @Test
    public void testIsNullNullAttributeJoint() {
        assertTrue(new AttributeJoint().isNull());
    }
    
    /**
     * Test method for {@link datastructures.AttributeJoint#isNull()}.
     * 
     * Checks if AttributeJoint {A, B} returns false.
     */
    @Test
    public void testIsNullAttributeJointAB() {
        assertFalse(this.setUpObject.attrJntAB().isNull());
    }
    
    /**
     * Test method for {@link datastructures.AttributeJoint#isNull()}.
     * 
     * Checks if AttributeJoint {} returns true.
     */
    @Test
    public void testIsNullAttributeJointAMinusA() {
        AttributeJoint attrJnt = this.setUpObject.attrJntA();
        attrJnt.removeAttributes(this.setUpObject.attrA());
        assertTrue(attrJnt.isNull());
    }
    
    /**
     * Test method for {@link datastructures.AttributeJoint#isPartOf(KeyJoint)}.
     * 
     * Checks if AttributeJoint {A, B} is a subset of {{A, B}}, result True.
     */
    @Test
    public void testIsPartOfTrueABinAb() {
        AttributeJoint attrJoint = this.setUpObject.attrJntAB(); 
        assertTrue(attrJoint.isPartOf(this.setUpObject.keyJointAb()));
    }
    
    /**
     * Test method for {@link datastructures.AttributeJoint#isPartOf(KeyJoint)}.
     * 
     * Checks if AttributeJoint {A, B} is a subset of {{A, B}, {A, C}}, result True.
     */
    @Test
    public void testIsPartOfTrueABinAbAc() {
        AttributeJoint attrJoint = this.setUpObject.attrJntAB(); 
        assertTrue(attrJoint.isPartOf(this.setUpObject.keyJointAbAc()));
    }
    
    /**
     * Test method for {@link datastructures.AttributeJoint#isPartOf(KeyJoint)}.
     * 
     * Checks if AttributeJoint {A, B} is a subset of {{A}}, result False.
     */
    @Test
    public void testIsPartOfFalseABinA() {
        AttributeJoint attrJoint = this.setUpObject.attrJntAB();
        assertFalse(attrJoint.isPartOf(this.setUpObject.keyJointA()));
    }
    
    /**
     * Test method for {@link datastructures.AttributeJoint#isPartOf(KeyJoint)}.
     * 
     * Checks if AttributeJoint {A} is a subset of {{A, C}}, result True.
     */
    @Test
    public void testIsPartOfTrueAinAc() {
        AttributeJoint attrJoint = this.setUpObject.attrJntA();
        assertTrue(attrJoint.isPartOf(this.setUpObject.keyJointAb()));
    }
    
    /**
     * Test method for {@link datastructures.AttributeJoint#isPartOf(KeyJoint)}.
     * 
     * Checks if AttributeJoint {A} is a subset of null KeyJoint, result False.
     */
    @Test
    public void testIsPartOfFalseAinNullKeyJoint() {
        AttributeJoint attrJoint = this.setUpObject.attrJntA();
        assertFalse(attrJoint.isPartOf(new KeyJoint()));
    }
    
    /**
     * Test method for {@link datastructures.AttributeJoint#containsJoinsFrom(KeyJoint)}.
     * 
     * Checks if AttributeJoint {A, B} contains joins from {{A}}, result True.
     */
    @Test
    public void testContainsJointsFromTrueAbFromA() {
        AttributeJoint attrJoint = this.setUpObject.attrJntAB();
        assertTrue(attrJoint.containsJoinsFrom(this.setUpObject.keyJointA()));
    }

    /**
     * Test method for {@link datastructures.AttributeJoint#containsJoinsFrom(KeyJoint)}.
     * 
     * Checks if AttributeJoint {A, B, C, D} contains joins from 
     * {{C, D}, {C, E}, {C, F}, {A, B, D}, {A, B, E}, {A, B, F}}, result True.
     */
    @Test
    public void testContainsJointsFromTrueAbcdFromCdCeCfAbdAbeAbf() {
        AttributeJoint attrJoint = this.setUpObject.attrJntABCD();
        assertTrue(attrJoint.containsJoinsFrom(this.setUpObject.keyJointCdCeCfAbdAbeAbf()));
    }
    
    /**
     * Test method for {@link datastructures.AttributeJoint#containsJoinsFrom(KeyJoint)}.
     * 
     * Checks if AttributeJoint {A, B} contains joins from 
     * {{C, D}, {C, E}, {C, F}, {A, B, D}, {A, B, E}, {A, B, F}}, result False.
     */
    @Test
    public void testContainsJointsFromFalseAbFromCdCeCfAbdAbeAbf() {
        AttributeJoint attrJoint = this.setUpObject.attrJntAB();
        assertFalse(attrJoint.containsJoinsFrom(this.setUpObject.keyJointCdCeCfAbdAbeAbf()));
    }
    
    /**
     * Test method for {@link datastructures.AttributeJoint#containsJoinsFrom(KeyJoint)}.
     * 
     * Checks if AttributeJoint {B} contains joins from {{A}}, result False.
     */
    @Test
    public void testContainsJointsFromFalseBFromA() {
        AttributeJoint attrJoint = this.setUpObject.attrJntB();
        assertFalse(attrJoint.containsJoinsFrom(this.setUpObject.keyJointA()));
    }
    
    /**
     * Test method for {@link datastructures.AttributeJoint#containsJoinsFrom(KeyJoint)}.
     * 
     * Checks if AttributeJoint {B} contains joins from null KeyJoint, result False.
     */
    @Test
    public void testContainsJointFromFalseNullKeyJoint() {
        AttributeJoint attrJoint = this.setUpObject.attrJntB();
        assertFalse(attrJoint.containsJoinsFrom(new KeyJoint()));
    }
    
    /**
     * Test method for {@link datastructures.AttributeJoint#isKey(Relation)}.
     * Checks if {ABC} is key in {ABC} {A -> B, B -> C},
     * result: super key.
     */
    @Test
    public void testIsKeyResultNotKeyRelationFive() {
        assertEquals(0, this.mainAttributeJoint.isKey(this.setUpObject.relation05()));
    }
    
    /**
     * Test method for {@link datastructures.AttributeJoint#isKey(Relation)}.
     * Checks if {A} is key in {ABC} {A -> B, B -> C},
     * result: key.
     */
    @Test
    public void testIsKeyResultKeyRelationFive() {
        AttributeJoint attrJoint = this.setUpObject.attrJntA();
        assertEquals(1, attrJoint.isKey(this.setUpObject.relation05()));
    }
    
    /**
     * Test method for {@link datastructures.AttributeJoint#isKey(Relation)}.
     * Checks if {C} is key in {ABC} {A -> B, B -> C},
     * result: not key.
     */
    @Test
    public void testIsKeyResultSuperKeyRelationFive() {
        AttributeJoint attrJoint = this.setUpObject.attrJntC();
        assertEquals(-1, attrJoint.isKey(this.setUpObject.relation05()));
    }
}
