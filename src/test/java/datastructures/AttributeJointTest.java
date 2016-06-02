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
    private AttributeSet mainAttributeJoint;
    private SetUpClass setUpObject;
    
    /**
     * Set up
     */
    @Before
    public void setUp() {
        String [] attrArray = {"A", "B", "C"};
        mainAttributeJoint = new AttributeSet(attrArray);
        setUpObject = new SetUpClass();
    }

    /**
     * Test method for {@link datastructures.AttributeSet#AttributeJoint()}.
     */
    @Test
    public void testAttributeJoint() {
        AttributeSet voidConstructor = new AttributeSet();
        assertNull(voidConstructor.getAttributeJoint());
    }

    /**
     * Test method for {@link datastructures.AttributeSet#AttributeJoint(java.lang.String[])}.
     */
    @Test
    public void testAttributeJointStringArray() {
        String [] attrArray = {"A", "B", "C"};
        AttributeSet arrayConstructor = new AttributeSet(attrArray);
        List<Attribute> getterJoint = arrayConstructor.getAttributeJoint();
        assertEquals(attrArray.length, getterJoint.size());
        for (int i = 0; i < attrArray.length; i++)
            assertEquals(attrArray[i], getterJoint.get(i).getAttribute());
    }

    /**
     * Test method for {@link datastructures.AttributeSet#AttributeJoint(java.util.List)}.
     */
    @Test
    public void testAttributeJointListOfAttribute() {
        List<Attribute> attrVector = new ArrayList<>();
        attrVector.add(new Attribute("A"));
        attrVector.add(new Attribute("B"));
        
        AttributeSet arrayListConstructor = new AttributeSet(attrVector);
        List<Attribute> getterJoint = arrayListConstructor.getAttributeJoint();
        assertEquals(attrVector.size(), getterJoint.size());
        for (int i = 0; i < getterJoint.size(); i++)
            assertEquals(attrVector.get(i).getAttribute(), getterJoint.get(i).getAttribute());  
    }

    /**
     * Test method for {@link datastructures.AttributeSet#AttributeJoint(datastructures.AttributeSet)}.
     */
    @Test
    public void testAttributeJointAttributeJoint() {
        AttributeSet objConstructor = new AttributeSet(mainAttributeJoint);
        assertEquals(mainAttributeJoint, objConstructor);
    }

    /**
     * Test method for {@link datastructures.AttributeSet#getAttributeJoint()}.
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
     * Test method for {@link datastructures.AttributeSet#getAttributeJoint()}.
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
     * Test method for {@link datastructures.AttributeSet#setAttributeJoint(java.util.List)}.
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
     * Test method for {@link datastructures.AttributeSet#setAttributeJoint(java.util.List)}.
     */
    @Test
    public void testSetAttributeJointEqualsFalse() {
        String [] stringAttr = {"B", "C", "D"};
        ArrayList<Attribute> auxVector = new ArrayList<>();
        for (String str : stringAttr)
            auxVector.add(new Attribute(str));
        
        AttributeSet auxAttrJoint = new AttributeSet();
        auxAttrJoint.setAttributeJoint(auxVector);
        
        assertNotEquals(mainAttributeJoint.getAttributeJoint(), auxAttrJoint.getAttributeJoint());
    }

    /**
     * Test method for {@link datastructures.AttributeSet#removeDuplicatedAttribute()}.
     */
    @Test
    public void testRemoveDuplicatedAttribute() {
        String [] repeatedAttrArray = {"A", "B", "B", "C"};
        AttributeSet repeatedAttr = new AttributeSet(repeatedAttrArray);
        repeatedAttr.removeDuplicatedAttribute();
        
        assertEquals(mainAttributeJoint, repeatedAttr);
    }

    /**
     * Test method for {@link datastructures.AttributeSet#removeDuplicatedAttribute()}.
     */
    @Test
    public void testRemoveDuplicatedAttributeTwoOrMore() {
        String [] expectedArray = {"A", "B", "C"};
        AttributeSet expectedResult = new AttributeSet(expectedArray);
        
        String [] duplicatedAttr = {"A", "B", "A", "A", "C", "B"};
        AttributeSet duplicatedResult = new AttributeSet(duplicatedAttr);
        
        duplicatedResult.removeDuplicatedAttribute();
        
        assertEquals(expectedResult, duplicatedResult);
    }

    /**
     * Test method for {@link datastructures.AttributeSet#toString()}.
     */
    @Test
    public void testToString() {
        String expected = "{A, B, C}";
        assertEquals(expected, mainAttributeJoint.toString());
    }

    /**
     * Test method for {@link datastructures.AttributeSet#toString()}.
     */
    @Test
    public void testToStringNull() {
        String expected = "null";
        AttributeSet nullAttrJoint = new AttributeSet();
        assertEquals(expected, nullAttrJoint.toString());
    }

    /**
     * Test method for {@link datastructures.AttributeSet#toString()}.
     */
    @Test
    public void testToStringEmpty() {
        ArrayList<Attribute> attrJointVector = new ArrayList<>();
        AttributeSet attrJoint = new AttributeSet(attrJointVector);
        assertEquals("null", attrJoint.toString());
    }

    /**
     * Test method for {@link datastructures.AttributeSet#addAttributes(datastructures.Attribute)}.
     */
    @Test
    public void testAddAttributesAttribute() {
        Attribute attr = new Attribute("D");
        String [] attrArray = {"A", "B", "C", "D"};
        AttributeSet expectedAttrJoint = new AttributeSet(attrArray);
        mainAttributeJoint.addAttributes(attr);
        assertEquals(expectedAttrJoint, mainAttributeJoint);
    }

    /**
     * Test method for {@link datastructures.AttributeSet#addAttributes(datastructures.Attribute)}.
     */
    @Test
    public void testAddAttributesAttributeToNullAttributeJoint() {
        String [] expectedAttrArray = {"A"};
        AttributeSet expectedAttributeJoint = new AttributeSet(expectedAttrArray);
        Attribute attr = new Attribute("A");
        AttributeSet nullJoint = new AttributeSet();
        nullJoint.addAttributes(attr);
        assertEquals(expectedAttributeJoint, nullJoint);
    }

    /**
     * Test method for {@link datastructures.AttributeSet#addAttributes(datastructures.AttributeSet)}.
     */
    @Test
    public void testAddAttributesAttributeJoint() {
        String [] arrayJoint = {"D", "E"};
        AttributeSet attrJoint = new AttributeSet(arrayJoint);
        String [] attrArray = {"A", "B", "C", "D", "E"};
        AttributeSet expectedAttrJoint = new AttributeSet(attrArray);
        mainAttributeJoint.addAttributes(attrJoint);
        assertEquals(expectedAttrJoint, mainAttributeJoint);
    }

    /**
     * Test method for {@link datastructures.AttributeSet#addAttributes(datastructures.AttributeSet)}.
     */
    @Test
    public void testAddAttributesAttributeJointRepeatedAttributes() {
        String [] arrayJoint = {"A", "E"};
        AttributeSet attrJoint = new AttributeSet(arrayJoint);
        String [] attrArray = {"A", "B", "C", "E"};
        AttributeSet expectedAttrJoint = new AttributeSet(attrArray);
        mainAttributeJoint.addAttributes(attrJoint);
        assertEquals(expectedAttrJoint, mainAttributeJoint);
    }
    
    /**
     * Test method for {@link datastructures.AttributeSet#addAttributes(datastructures.AttributeSet)}.
     */
    @Test
    public void testAddAttributesAttributeJointNullAttributeJoint() {
        AttributeSet nullJoint = new AttributeSet();
        this.mainAttributeJoint.addAttributes(nullJoint);
        AttributeSet result = new AttributeSet(this.mainAttributeJoint);
        assertEquals(mainAttributeJoint, result);
    }
    
    /**
     * Test method for {@link datastructures.AttributeSet#addAttributes(datastructures.AttributeSet)}.
     */
    @Test
    public void testAddAttributesAttributeJointSameAttributeJoint() {
        String [] expectedAttrArray = {"A", "B", "C"};
        AttributeSet expectedAttributeJoint = new AttributeSet(expectedAttrArray);
        mainAttributeJoint.addAttributes(expectedAttributeJoint);
        assertEquals(expectedAttributeJoint, mainAttributeJoint);
    }
    
    /**
     * Test method for {@link datastructures.AttributeSet#addAttributes(datastructures.AttributeSet)}.
     */
    @Test
    public void testAddAttributesAttributeJointToNullAttributeJoint() {
        AttributeSet nullJoint = new AttributeSet();
        nullJoint.addAttributes(mainAttributeJoint);
        assertEquals(mainAttributeJoint, nullJoint);
    }

    /**
     * Test method for {@link datastructures.AttributeSet#hashCode()}.
     */
    @Test
    public void testHashCode() {
        String [] stringAttr = {"A", "B", "C"};
        AttributeSet hashCodeAttrJoint = new AttributeSet(stringAttr);
        assertEquals(mainAttributeJoint.hashCode(), hashCodeAttrJoint.hashCode());
    }
    
    /**
     * Test method for {@link datastructures.AttributeSet#hashCode()}.
     */
    @Test
    public void testHashCodeNullObject() {
        AttributeSet hashCodeAttrJoint = new AttributeSet();
        assertEquals(31, hashCodeAttrJoint.hashCode());
    }
    
    /**
     * Test method for {@link datastructures.AttributeSet#equals()}.
     */
    @Test
    public void testEquals() {
        assertTrue(mainAttributeJoint.equals(mainAttributeJoint));
    }
    
    /**
     * Test method for {@link datastructures.AttributeSet#equals()}.
     */
    @Test
    public void testEqualsNullObjectFalse() {
        assertFalse(mainAttributeJoint.equals(null));
    }
    
    /**
     * Test method for {@link datastructures.AttributeSet#equals()}.
     */
    @Test
    public void testEqualsDifferentClass() {
        Attribute a = new Attribute("A");
        assertFalse(mainAttributeJoint.equals(a));
    }

    /**
     * Test method for {@link datastructures.AttributeSet#equals()}.
     */
    @Test
    public void testEqualsAttributeJointNullTrue() {
        AttributeSet attrJointA = new AttributeSet();
        AttributeSet attrJointB = new AttributeSet();
        assertTrue(attrJointA.equals(attrJointB));
    }

    /**
     * Test method for {@link datastructures.AttributeSet#equals()}.
     */
    @Test
    public void testEqualsAttributeJointNullFalse() {
        AttributeSet attrJointA = new AttributeSet();
        assertFalse(attrJointA.equals(mainAttributeJoint));
    }
    
    /**
     * Test method for {@link datastructures.AttributeSet#equals()}.
     */
    @Test
    public void testEqualsAttributeJointInverse() {
        AttributeSet attrJointA = new AttributeSet();
        assertFalse(mainAttributeJoint.equals(attrJointA));
    }
    
    /**
     * Test method for {@link datastructures.AttributeSet#equals()}.
     */
    @Test
    public void testEqualsAttributeJoint() {
        String [] secondaryArray = {"A", "B", "C"};
        AttributeSet secondaryJoint = new AttributeSet(secondaryArray);
        assertTrue(secondaryJoint.equals(mainAttributeJoint));
    }
    
    /**
     * Test method for {@link datastructures.AttributeSet#sort()}.
     */
    @Test
    public void testSort() {
        String [] unsortedArray = {"B", "A", "C"};
        AttributeSet unsortedJoint = new AttributeSet(unsortedArray);
        unsortedJoint.sort();
        assertTrue(mainAttributeJoint.equals(unsortedJoint));
    }

    /**
     * Test method for {@link datastructures.AttributeSet#sort()}.
     */
    @Test
    public void testSortConstructor() {
        String [] unsortedArrayA = {"B", "A", "C"};
        AttributeSet unsortedJointA = new AttributeSet(unsortedArrayA);
        assertEquals(mainAttributeJoint, unsortedJointA);
        
        ArrayList<Attribute> unsortedVectorB = new ArrayList<>();
        unsortedVectorB.add(new Attribute("C"));
        unsortedVectorB.add(new Attribute("B"));
        unsortedVectorB.add(new Attribute("A"));
        AttributeSet unsortedJointB = new AttributeSet(unsortedVectorB);
        assertEquals(mainAttributeJoint, unsortedJointB);
    }

    /**
     * Test method for {@link datastructures.AttributeSet#sort()}.
     */
    @Test
    public void testSortAddAttribute() {
        String [] unsortedArray = {"B", "C"};
        AttributeSet unsortedJoint = new AttributeSet(unsortedArray);
        unsortedJoint.addAttributes(new Attribute("A"));
        assertEquals(mainAttributeJoint, unsortedJoint);
    }
    
    /**
     * Test method for {@link datastructures.AttributeSet#sort()}.
     */
    @Test
    public void testSortAddAttributeJoint() {
        String [] unsortedArray = {"B"};
        AttributeSet unsortedJoint = new AttributeSet(unsortedArray);
        String [] unsortedArrayB = {"A", "C"};
        AttributeSet unsortedJointB = new AttributeSet(unsortedArrayB);
        unsortedJoint.addAttributes(unsortedJointB);
        assertEquals(mainAttributeJoint, unsortedJoint);
    }
    
    /**
     * Test method for {@link datastructures.AttributeSet#iterator()}.
     */
    @Test
    public void testIterator() {
        for (Attribute attr : this.mainAttributeJoint)
            assertNotNull(attr);
    }

    /**
     * Checks if {A} isContained in {A, B, C}.
     * 
     * Test method for {@link datastructures.AttributeSet#isContained(AttributeSet)}.
     */
    @Test
    public void testIsContainedSingleElementAttributeJoint() {
        String [] containedJointArray = {"A"};
        AttributeSet containedJoint = new AttributeSet(containedJointArray);
        assertTrue(containedJoint.isContained(mainAttributeJoint));
    }
    
    /**
     * Checks if {A, C} isContained in {A, B, C}.
     * 
     * Test method for {@link datastructures.AttributeSet#isContained(AttributeSet)}.
     */
    @Test
    public void testIsContainedAttributeJoint() {
        String [] containedJointArray = {"A", "C"};
        AttributeSet containedJoint = new AttributeSet(containedJointArray);
        assertTrue(containedJoint.isContained(mainAttributeJoint));
    }
    
    /**
     * Checks if {A, B, C} isContained in null AttributeSet.
     * 
     * Test method for {@link datastructures.AttributeSet#isContained(AttributeSet)}.
     */
    @Test
    public void testIsContainedNullAttributeJointFalse() {
        AttributeSet nullJoint = new AttributeSet();
        assertFalse(mainAttributeJoint.isContained(nullJoint));
    }
    
    /**
     * Checks if a null AttributeSet isContained in {A, B, C}.
     * 
     * Test method for {@link datastructures.AttributeSet#isContained(AttributeSet)}.
     */
    @Test
    public void testIsContainedNullAttributeJointDoesNotContainAnyAttributeJoint() {
        AttributeSet nullJoint = new AttributeSet();
        assertFalse(nullJoint.isContained(mainAttributeJoint));
    }
    
    /**
     * Checks if {D} isContained in {A, B, C}.
     * 
     * Test method for {@link datastructures.AttributeSet#isContained(AttributeSet)}.
     */
    @Test
    public void testIsContainedSingleElementAttributeJointFalse() {
        String [] containedJointArray = {"D"};
        AttributeSet containedJoint = new AttributeSet(containedJointArray);
        assertFalse(containedJoint.isContained(mainAttributeJoint));
    }
    
    /**
     * Checks if {D, E} isContained in {A, B, C}.
     * 
     * Test method for {@link datastructures.AttributeSet#isContained(AttributeSet)}.
     */
    @Test
    public void testIsContainedAttributeJointFalse() {
        String [] containedJointArray = {"D", "E"};
        AttributeSet containedJoint = new AttributeSet(containedJointArray);
        assertFalse(containedJoint.isContained(mainAttributeJoint));
    }
    
    /**
     * Checks if {A, C, D} isContained in {A, B, C}.
     * 
     * Test method for {@link datastructures.AttributeSet#isContained(AttributeSet)}.
     */
    @Test
    public void testIsNotContainedAttributeJointWithSimilarAttributesFalse() {
        String [] containedJointArray = {"A", "C", "D"};
        AttributeSet containedJoint = new AttributeSet(containedJointArray);
        assertFalse(containedJoint.isContained(mainAttributeJoint));
    }
    
    /**
     * Checks the position of Attribute: A, C and D in {A, B, C}.
     * 
     * Test method for {@link datastructures.AttributeSet#getAttributePosition(Attribute)}.
     */
    @Test
    public void testGetAttributePositionNormalAttributeJoint() {
        assertEquals(0, this.mainAttributeJoint.getAttributePosition(new Attribute("A")));
        assertEquals(1, this.mainAttributeJoint.getAttributePosition(new Attribute("B")));
        assertEquals(2, this.mainAttributeJoint.getAttributePosition(new Attribute("C")));
    }
    
    /**
     * Checks the position of Attribute: A in a null AttributeSet.
     * 
     * Test method for {@link datastructures.AttributeSet#getAttributePosition(Attribute)}.
     */
    @Test
    public void testGetAttributePositionVoidAttributeJoint() {
        AttributeSet nullAttrJoint = new AttributeSet();
        assertEquals(-1, nullAttrJoint.getAttributePosition(new Attribute("A")));
    }
    
    /**
     * Checks the position of Attribute: D in {A, B, C}.
     * 
     * Test method for {@link datastructures.AttributeSet#getAttributePosition(Attribute)}.
     */
    @Test
    public void testGetAttributePositionThatDoesNotExistInNormalAttributeJoint() {
        assertEquals(-1, this.mainAttributeJoint.getAttributePosition(new Attribute("D")));
    }

    /**
     * Checks that AttributeSet: {A, B, C} has a size of three.
     * 
     * Test method for {@link datastructures.AttributeSet#getSize()}.
     */
    @Test
    public void testGetSizeAssert() {
        assertEquals(mainAttributeJoint.getSize(), 3);
    }

    /**
     * Checks that AttributeSet: {A, B, C} does not have a size of zero.
     * 
     * Test method for {@link datastructures.AttributeSet#getSize()}.
     */
    @Test
    public void testGetSizeFail() {
        assertNotEquals(mainAttributeJoint.getSize(), 0);
    }

    /**
     * Checks that AttributeSet: {null} has a size of zero.
     * 
     * Test method for {@link datastructures.AttributeSet#getSize()}.
     */
    @Test
    public void testGetSizeNullAttributeJoint() {
        assertEquals(0, new AttributeSet().getSize());
    }
 
    /**
     * Checks that after {@code clear} method is called on AtributeJoint:
     * {A, B, C} the object is empty.
     * 
     * Test method for {@link datastructures.AttributeSet#clear()}.
     */
    @Test
    public void testClearJoint() {
        this.mainAttributeJoint.clear();
        assertEquals(0, this.mainAttributeJoint.getSize());
    }
    
    /**
     * Checks if the result of removing Attribute C from AttributeSet {A, B, C} 
     * is equal with {A, B} .
     * 
     * Test method for {@link datastructures.AttributeSet#removeAttributes(Attribute)}.
     */
    @Test
    public void testRemoveAttribute() {
        String [] expectedAttrArray = {"A", "B"};
        AttributeSet expectedAttributeJoint = new AttributeSet(expectedAttrArray);
        Attribute attr = new Attribute("C");
        mainAttributeJoint.removeAttributes(attr);
        assertEquals(expectedAttributeJoint, mainAttributeJoint);
    }
    
    /**
     * Checks if removing Attribute C from a null AttributeSet fails.
     * 
     * Test method for {@link datastructures.AttributeSet#removeAttributes(Attribute)}.
     */
    @Test
    public void testRemoveAttributeFromNullJoint() {
        AttributeSet nullJoint = new AttributeSet();
        Attribute attr = new Attribute("C");
        nullJoint.removeAttributes(attr);
        assertNull(nullJoint.getAttributeJoint());
    }
    
    /**
     * Checks if the result of removing AttributeSet {A, C} from AttributeSet
     * {A, B, C} is equal with {B} .
     * 
     * Test method for {@link datastructures.AttributeSet#removeAttributes(AttributeSet)}.
     */
    @Test
    public void testRemoveAttributeJoint() {
        String [] expArray = {"B"};
        AttributeSet expectedJoint = new AttributeSet(expArray);
        String [] removeArray = {"A", "C"};
        AttributeSet removedJoint = new AttributeSet(removeArray);
        mainAttributeJoint.removeAttributes(removedJoint);
        assertEquals(expectedJoint, mainAttributeJoint);
    }
    
    /**
     * Checks if removing AttributeJoin {A, B, C} from a null AttributeSet fails.
     * 
     * Test method for {@link datastructures.AttributeSet#removeAttributes(AttributeSet)}.
     */
    @Test
    public void testRemoveAttributeJointFromNullJoint() {
        AttributeSet nullJoint = new AttributeSet();
        nullJoint.removeAttributes(mainAttributeJoint);
        assertNull(nullJoint.getAttributeJoint());
    }
    
    /**
     * Checks that from AttributeSet {A, B, C} returns Attribute A when 
     * {@code position == 0} and Attribute C when {@code position == 2}.
     * 
     * Test method for {@link datastructures.AttributeSet#getAttributeAt(int)}.
     */
    @Test
    public void testGetAttributeAt(){
        assertEquals(new Attribute("A"), this.mainAttributeJoint.getAttributeAt(0));
        assertEquals(new Attribute("C"), this.mainAttributeJoint.getAttributeAt(2));
    }
    
    /**
     * Changes C Attribute from AttributeSet {A, B, C} with Attribute G and
     * checks if operation was successful.
     * 
     * Test method for {@link datastructures.AttributeSet#changeAttributeAt(int, Attribute)}.
     */
    @Test
    public void testChangeAttributeAtTest() {
        Attribute attrG = new Attribute("G");
        this.mainAttributeJoint.changeAttributeAt(this.mainAttributeJoint.getSize()-1, attrG);
        assertEquals(attrG, this.mainAttributeJoint.getAttributeAt(this.mainAttributeJoint.getSize() - 1));     
    }
    
    /**
     * Union AttributeSet {A, B, C} with {D, E, F}, result must be {A, B, C, D, E, F}.
     * 
     * Test method for {@link datastructures.AttributeSet#union(AttributeSet)}.
     */
    @Test
    public void testUnionNormalAttributeJoints() {
        String [] stringAttr = {"D", "E", "F"};
        AttributeSet attrJoint = new AttributeSet(stringAttr);
        AttributeSet result = this.mainAttributeJoint.union(attrJoint);
        String [] expectedStringAttr = {"A", "B", "C", "D", "E", "F"};
        AttributeSet expected = new AttributeSet(expectedStringAttr);
        assertEquals(expected, result);
    }
    
    /**
     * Union AttributeSet {A, B, C} with a null AttributeSet, result must be {A, B, C}.
     * 
     * Test method for {@link datastructures.AttributeSet#union(AttributeSet)}.
     */
    @Test
    public void testUnionVoidAttributeJoint() {
        AttributeSet voidAttrJoint = new AttributeSet();
        AttributeSet result = this.mainAttributeJoint.union(voidAttrJoint);
        assertEquals(this.mainAttributeJoint, result);
    }
    
    /**
     * Union AttributeSet {A, B, C} with {A, C, F}, result must be {A, B, C, F}.
     * 
     * Test method for {@link datastructures.AttributeSet#union(AttributeSet)}.
     */
    @Test
    public void testUnionRepetedAttributes() {
        String [] stringAttr = {"A", "C", "F"};
        AttributeSet attrJoint = new AttributeSet(stringAttr);
        AttributeSet result = this.mainAttributeJoint.union(attrJoint);
        String [] expectedStringAttr = {"A", "B", "C", "F"};
        AttributeSet expected = new AttributeSet(expectedStringAttr);
        assertEquals(expected, result);
    }

    /**
     * Union AttributeSet {A, B, C} with {A, B, C}, result must be {A, B, C}.
     * 
     * Test method for {@link datastructures.AttributeSet#union(AttributeSet)}.
     */
    @Test
    public void testUnionRepeatedAllAttributes() {
        String [] stringAttr = {"A", "B", "C"};
        AttributeSet attrJoint = new AttributeSet(stringAttr);
        AttributeSet result = this.mainAttributeJoint.union(attrJoint);
        String [] expectedStringAttr = {"A", "B", "C"};
        AttributeSet expected = new AttributeSet(expectedStringAttr);
        assertEquals(expected, result);
    }
    
    /**
     * Union a null AttributeSet with {A, B, C}, result must be {A, B, C}.
     * 
     * Test method for {@link datastructures.AttributeSet#union(AttributeSet)}.
     */
    @Test
    public void testUnionVoidAttributeJointWithAttributeJoint() {
        AttributeSet voidAttrJoint = new AttributeSet();
        AttributeSet result = voidAttrJoint.union(this.mainAttributeJoint);
        assertEquals(this.mainAttributeJoint, result);
    }
    
    /**
     * Checks if last Attribute of AttributeSet {A, B, C} is Attribute C. 
     * 
     * Test method for {@link datastructures.AttributeSet#getLastAttribute()}.
     */
    @Test
    public void testGetLastAttributeAttributeJoint() {
        Attribute attrC = new Attribute("C");
        assertEquals(attrC, this.mainAttributeJoint.getLastAttribute());
    }
    
    /**
     * Checks if a null AttributeSet returns null. 
     * 
     * Test method for {@link datastructures.AttributeSet#getLastAttribute()}.
     */
    @Test
    public void testGetLastAttributeNullAttributeJoint() {
        AttributeSet attrJoint = new AttributeSet();
        assertNull(attrJoint.getLastAttribute());
    }
    
    /**
     * Test method for {@link datastructures.AttributeSet#intersect(AttributeSet)}.
     * 
     * Intersects AttributeJoin {A, B} with {A}, result must be {A}. 
     */
    @Test
    public void testIntersectAFromAB() {
        AttributeSet expected = this.setUpObject.attrJntA();
        AttributeSet firstJoined = this.setUpObject.attrJntAB();
        AttributeSet secondJoined = this.setUpObject.attrJntA();
        assertEquals(expected, firstJoined.intersect(secondJoined));
    }
    
    /**
     * Test method for {@link datastructures.AttributeSet#intersect(AttributeSet)}.
     * 
     * Intersects AttributeJoin {A} with a null, result must be a null AttributeSet.
     */
    @Test
    public void testIntersectNullFromA() {
        AttributeSet expected = new AttributeSet();
        AttributeSet firstJoined = this.setUpObject.attrJntA();
        AttributeSet secondJoined = new AttributeSet();
        assertEquals(expected, firstJoined.intersect(secondJoined));
    }
    
    /**
     * Test method for {@link datastructures.AttributeSet#intersect(AttributeSet)}.
     * 
     * Intersects AttributeJoin {A, B, C, D, E} with {D, F}, result must be {D}.
     */
    @Test
    public void testIntersectDromABCDEandDF() {
        AttributeSet expected = this.setUpObject.attrJntD();
        AttributeSet firstJoined = this.setUpObject.attrJntABCDE();
        AttributeSet secondJoined = this.setUpObject.attrJntDF();
        assertEquals(expected, firstJoined.intersect(secondJoined));
    }

    /**
     * Test method for {@link datastructures.AttributeSet#substract(AttributeSet)}.
     * 
     * Substracts AttributeSet {A, B} from {A, B, C}, result must be {C}.
     */
    @Test
    public void testSubstracABFromABC() {
        AttributeSet expected = this.setUpObject.attrJntC();
        AttributeSet firstJoined = this.setUpObject.attrJntABC();
        AttributeSet secondJoined = this.setUpObject.attrJntAB();
        assertEquals(expected, firstJoined.substract(secondJoined));
    }
    
    /**
     * Test method for {@link datastructures.AttributeSet#substract(AttributeSet)}.
     * 
     * Substracts AttributeSet {B, C} from {A, D, E}, result must be {A, D, E}.
     */
    @Test
    public void testSubstracBCFromADE() {
        AttributeSet expected = this.setUpObject.attrJntADE();
        AttributeSet firstJoined = this.setUpObject.attrJntADE();
        AttributeSet secondJoined = this.setUpObject.attrJntBC();
        assertEquals(expected, firstJoined.substract(secondJoined));
    }
    
    /**
     * Test method for {@link datastructures.AttributeSet#substract(AttributeSet)}.
     * 
     * Substracts AttributeSet {B, C} from {A, B}, result must be {A}.
     */
    @Test
    public void testSubstracBCFromAB() {
        AttributeSet expected = this.setUpObject.attrJntA();
        AttributeSet firstJoined = this.setUpObject.attrJntAB();
        AttributeSet secondJoined = this.setUpObject.attrJntBC();
        assertEquals(expected, firstJoined.substract(secondJoined));
    }
    
    /**
     * Test method for {@link datastructures.AttributeSet#substract(AttributeSet)}.
     * 
     * Substracts AttributeSet {B, C} from a null one, result must be an empty AttributeSet.
     */
    @Test
    public void testSubstracBCFromNull() {
        AttributeSet expected = new AttributeSet();
        AttributeSet firstJoined = new AttributeSet();
        AttributeSet secondJoined = this.setUpObject.attrJntBC();
        assertEquals(expected, firstJoined.substract(secondJoined));
    }
    
    /**
     * Test method for {@link datastructures.AttributeSet#isNull()}.
     * 
     * Checks if null AttributeSet returns true.
     */
    @Test
    public void testIsNullNullAttributeJoint() {
        assertTrue(new AttributeSet().isNull());
    }
    
    /**
     * Test method for {@link datastructures.AttributeSet#isNull()}.
     * 
     * Checks if AttributeSet {A, B} returns false.
     */
    @Test
    public void testIsNullAttributeJointAB() {
        assertFalse(this.setUpObject.attrJntAB().isNull());
    }
    
    /**
     * Test method for {@link datastructures.AttributeSet#isNull()}.
     * 
     * Checks if AttributeSet {} returns true.
     */
    @Test
    public void testIsNullAttributeJointAMinusA() {
        AttributeSet attrJnt = this.setUpObject.attrJntA();
        attrJnt.removeAttributes(this.setUpObject.attrA());
        assertTrue(attrJnt.isNull());
    }
    
    /**
     * Test method for {@link datastructures.AttributeSet#isPartOf(KeyJoint)}.
     * 
     * Checks if AttributeSet {A, B} is a subset of {{A, B}}, result True.
     */
    @Test
    public void testIsPartOfTrueABinAb() {
        AttributeSet attrJoint = this.setUpObject.attrJntAB(); 
        assertTrue(attrJoint.isPartOf(this.setUpObject.keyJointAb()));
    }
    
    /**
     * Test method for {@link datastructures.AttributeSet#isPartOf(KeyJoint)}.
     * 
     * Checks if AttributeSet {A, B} is a subset of {{A, B}, {A, C}}, result True.
     */
    @Test
    public void testIsPartOfTrueABinAbAc() {
        AttributeSet attrJoint = this.setUpObject.attrJntAB(); 
        assertTrue(attrJoint.isPartOf(this.setUpObject.keyJointAbAc()));
    }
    
    /**
     * Test method for {@link datastructures.AttributeSet#isPartOf(KeyJoint)}.
     * 
     * Checks if AttributeSet {A, B} is a subset of {{A}}, result False.
     */
    @Test
    public void testIsPartOfFalseABinA() {
        AttributeSet attrJoint = this.setUpObject.attrJntAB();
        assertFalse(attrJoint.isPartOf(this.setUpObject.keyJointA()));
    }
    
    /**
     * Test method for {@link datastructures.AttributeSet#isPartOf(KeyJoint)}.
     * 
     * Checks if AttributeSet {A} is a subset of {{A, C}}, result True.
     */
    @Test
    public void testIsPartOfTrueAinAc() {
        AttributeSet attrJoint = this.setUpObject.attrJntA();
        assertTrue(attrJoint.isPartOf(this.setUpObject.keyJointAb()));
    }
    
    /**
     * Test method for {@link datastructures.AttributeSet#isPartOf(KeyJoint)}.
     * 
     * Checks if AttributeSet {A} is a subset of null KeyJoint, result False.
     */
    @Test
    public void testIsPartOfFalseAinNullKeyJoint() {
        AttributeSet attrJoint = this.setUpObject.attrJntA();
        assertFalse(attrJoint.isPartOf(new KeyJoint()));
    }
    
    /**
     * Test method for {@link datastructures.AttributeSet#containsJoinsFrom(KeyJoint)}.
     * 
     * Checks if AttributeSet {A, B} contains joins from {{A}}, result True.
     */
    @Test
    public void testContainsJointsFromTrueAbFromA() {
        AttributeSet attrJoint = this.setUpObject.attrJntAB();
        assertTrue(attrJoint.containsJoinsFrom(this.setUpObject.keyJointA()));
    }

    /**
     * Test method for {@link datastructures.AttributeSet#containsJoinsFrom(KeyJoint)}.
     * 
     * Checks if AttributeSet {A, B, C, D} contains joins from 
     * {{C, D}, {C, E}, {C, F}, {A, B, D}, {A, B, E}, {A, B, F}}, result True.
     */
    @Test
    public void testContainsJointsFromTrueAbcdFromCdCeCfAbdAbeAbf() {
        AttributeSet attrJoint = this.setUpObject.attrJntABCD();
        assertTrue(attrJoint.containsJoinsFrom(this.setUpObject.keyJointCdCeCfAbdAbeAbf()));
    }
    
    /**
     * Test method for {@link datastructures.AttributeSet#containsJoinsFrom(KeyJoint)}.
     * 
     * Checks if AttributeSet {A, B} contains joins from 
     * {{C, D}, {C, E}, {C, F}, {A, B, D}, {A, B, E}, {A, B, F}}, result False.
     */
    @Test
    public void testContainsJointsFromFalseAbFromCdCeCfAbdAbeAbf() {
        AttributeSet attrJoint = this.setUpObject.attrJntAB();
        assertFalse(attrJoint.containsJoinsFrom(this.setUpObject.keyJointCdCeCfAbdAbeAbf()));
    }
    
    /**
     * Test method for {@link datastructures.AttributeSet#containsJoinsFrom(KeyJoint)}.
     * 
     * Checks if AttributeSet {B} contains joins from {{A}}, result False.
     */
    @Test
    public void testContainsJointsFromFalseBFromA() {
        AttributeSet attrJoint = this.setUpObject.attrJntB();
        assertFalse(attrJoint.containsJoinsFrom(this.setUpObject.keyJointA()));
    }
    
    /**
     * Test method for {@link datastructures.AttributeSet#containsJoinsFrom(KeyJoint)}.
     * 
     * Checks if AttributeSet {B} contains joins from null KeyJoint, result False.
     */
    @Test
    public void testContainsJointFromFalseNullKeyJoint() {
        AttributeSet attrJoint = this.setUpObject.attrJntB();
        assertFalse(attrJoint.containsJoinsFrom(new KeyJoint()));
    }
    
    /**
     * Test method for {@link datastructures.AttributeSet#isKey(Relation)}.
     * Checks if {ABC} is key in {ABC} {A -> B, B -> C},
     * result: super key.
     */
    @Test
    public void testIsKeyResultNotKeyRelationFive() {
        assertEquals(0, this.mainAttributeJoint.isKey(this.setUpObject.relation05()));
    }
    
    /**
     * Test method for {@link datastructures.AttributeSet#isKey(Relation)}.
     * Checks if {A} is key in {ABC} {A -> B, B -> C},
     * result: key.
     */
    @Test
    public void testIsKeyResultKeyRelationFive() {
        AttributeSet attrJoint = this.setUpObject.attrJntA();
        assertEquals(1, attrJoint.isKey(this.setUpObject.relation05()));
    }
    
    /**
     * Test method for {@link datastructures.AttributeSet#isKey(Relation)}.
     * Checks if {C} is key in {ABC} {A -> B, B -> C},
     * result: not key.
     */
    @Test
    public void testIsKeyResultSuperKeyRelationFive() {
        AttributeSet attrJoint = this.setUpObject.attrJntC();
        assertEquals(-1, attrJoint.isKey(this.setUpObject.relation05()));
    }
}
