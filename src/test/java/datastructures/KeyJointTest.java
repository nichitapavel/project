/**
 * 
 */
package datastructures;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 * @author Pavel Nichita
 *
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class KeyJointTest {
    private KeyJoint nullKeyJoint;
    private KeyJoint keyJoint;
    private ArrayList<AttributeJoint> keysVector;
    private SetUpClass setUpObject;
    /**
     * 
     */
    @Before
    public void setUp() {
        nullKeyJoint = new KeyJoint();
        setUpObject = new SetUpClass();
        keysVector = new ArrayList<>();
        keysVector.add(setUpObject.attrJntAB());
        keysVector.add(setUpObject.attrJntAC());
        keyJoint = new KeyJoint(keysVector);
    }

    /**
     * Test method for {@link datastructures.KeyJoint#getKeyJoint()}.
     * 
     * A null KeyJoint returns null.
     */
    @Test
    public void testGetterNullKeyJoint() {
        assertNull(nullKeyJoint.getKeyJoint());
    }
    
    /**
     * Test method for {@link datastructures.KeyJoint#getKeyJoint()}.
     * 
     * Checks that expected value is returned: {{A, B}, {A, C}}.
     */
    @Test
    public void testGetterKeyJoint() {
        assertEquals(keysVector, keyJoint.getKeyJoint());
    }
    
    /**
     * Test method for {@link datastructures.KeyJoint#getKeyJoint()}.
     * 
     * Check that a KeyJoint constructed from a KeyJoint has same value:
     * {{A, B}, {A, C}}.
     */
    @Test
    public void testGetterKeyJointNotEqual() {
        String [] keyStringAB = {"A", "B"};
        AttributeJoint attrJntAB = new AttributeJoint(keyStringAB);
        String [] keyStringAC = {"A", "C"};
        AttributeJoint attrJntAC = new AttributeJoint(keyStringAC);
        ArrayList<AttributeJoint> keysVectorAux = new ArrayList<>();
        keysVectorAux.add(attrJntAB);
        keysVectorAux.add(attrJntAC);
        KeyJoint keyJointAux = new KeyJoint(keysVector);
        assertEquals(keysVectorAux, keyJointAux.getKeyJoint());
    }

    /**
     * Test method for {@link datastructures.KeyJoint#toString()}.
     * 
     * Checks that KeyJoint {{A, B}, {A, C}} returns a proper string.
     */
    @Test
    public void testToString() {
        String msg = "{{A, B}, {A, C}}";
        assertEquals(msg, keyJoint.toString());
    }
    
    /**
     * Test method for {@link datastructures.KeyJoint#toString()}.
     * 
     * Checks that a null KeyJoint returns "null" string.
     */
    @Test
    public void testToStringFail() {
        assertEquals("null", nullKeyJoint.toString());
    }

    /**
     * Test method for {@link datastructures.KeyJoint#equals(java.lang.Object)}.
     * 
     * Checks if {{A, B}, {A, C}} equals {{A, B}, {A, C}}. 
     */
    @Test
    public void testEqualsTrue() {
        String [] keyStringAB = {"A", "B"};
        AttributeJoint attrJntAB = new AttributeJoint(keyStringAB);
        String [] keyStringAC = {"A", "C"};
        AttributeJoint attrJntAC = new AttributeJoint(keyStringAC);
        ArrayList<AttributeJoint> keysVectorAux = new ArrayList<>();
        keysVectorAux.add(attrJntAB);
        keysVectorAux.add(attrJntAC);
        KeyJoint keyJointAux = new KeyJoint(keysVectorAux);
        assertTrue(keyJointAux.equals(keyJoint));
    }
    
    /**
     * Test method for {@link datastructures.KeyJoint#equals(java.lang.Object)}.
     * 
     * Checks if {{A, B}, {A, C}} equals "fail", different class objects.
     */
    @Test
    public void testEqualsFalseDifferentClassObjects() {
        assertFalse(keyJoint.equals(new String()));
    }
    
    /**
     * Test method for {@link datastructures.KeyJoint#equals(java.lang.Object)}.
     * 
     * Checks if null KeyJoint equals {{A, B}, {A, C}}.
     */
    @Test
    public void testEqualsFalseNullObject() {
        assertFalse(nullKeyJoint.equals(keyJoint));
    }
    
    /**
     * Test method for {@link datastructures.KeyJoint#equals(java.lang.Object)}.
     * 
     * Checks if {{A, B}, {A, C}} equals null KeyJoint.
     */
    @Test
    public void testEqualsFalseNullKeyJointNotNullObject() {
        assertFalse(keyJoint.equals(nullKeyJoint));
    }
    
    /**
     * Test method for {@link datastructures.KeyJoint#equals(java.lang.Object)}.
     * 
     * Checks if a null KeyJoint equals null KeyJoint.
     */
    @Test
    public void testEqualsTrueNullKeyJoints() {
        KeyJoint anotherNullJoint = new KeyJoint();
        assertTrue(nullKeyJoint.equals(anotherNullJoint));
    }

    /**
     * Test method for {@link datastructures.KeyJoint#addKey(datastructures.AttributeJoint)}.
     * 
     * Adds key to a null KeyJoint.
     */
    @Test
    public void testAddKeyToNullKeyJoint() {
        nullKeyJoint.addKey(setUpObject.attrJntB());
        ArrayList<AttributeJoint> keyVector = new ArrayList<>();
        keyVector.add(setUpObject.attrJntB());
        assertEquals(keyVector, nullKeyJoint.getKeyJoint());
    }
    
    /**
     * Test method for {@link datastructures.KeyJoint#addKey(datastructures.AttributeJoint)}.
     * 
     * Addd key {B} to {{A, B}, {A, C}}, checks if it was added.
     */
    @Test
    public void testAddKeyToKeyJoint() {
        keysVector.add(setUpObject.attrJntB());
        keyJoint.addKey(setUpObject.attrJntB());
        KeyJoint otherKeyJoint = new KeyJoint(keysVector); 
        assertEquals(keysVector, keyJoint.getKeyJoint());
        assertEquals(otherKeyJoint, keyJoint);
    }

    /**
     * Test method for {@link datastructures.KeyJoint#iterator()}.
     */
    @Test
    public void testIterator() {
        for (AttributeJoint key : keyJoint) {
            assertNotNull(key);
        }
    }

    /**
     * Test method for {@link datastructures.KeyJoint#getSize()}.
     * 
     * Checks if {{A, B}, {A, C}} size is 2.
     */
    @Test
    public void testGetSizeNormalKeyJoint() {
        assertEquals(2, keyJoint.getSize());
    }
    
    /**
     * Test method for {@link datastructures.KeyJoint#getSize()}.
     * 
     * Checks if a null KeyJoint size is 0.
     */
    @Test
    public void testGetSizeVoidkeyJoint() {
        assertEquals(0, nullKeyJoint.getSize());
    }

    /**
     * Test method for {@link datastructures.KeyJoint#getKey(int)}.
     * 
     * Checks that for {{A, D}, {B, C, D}, {B, D, E}}, with position 0
     * returns {A, D}. 
     */
    @Test
    public void getKey() {
        keyJoint = setUpObject.keyJointAdBcdBde();
        assertEquals(setUpObject.attrJntAD(), keyJoint.getKey(0));
    }

    /**
     * Test method for {@link datastructures.KeyJoint#getKey(int)}.
     * 
     * Checks that for {{A, D}, {B, C, D}, {B, D, E}}, with position 5
     * returns null. 
     */
    @Test
    public void getKeyOutOfBoundsError() {
        keyJoint = setUpObject.keyJointAdBcdBde();
        assertNull(keyJoint.getKey(5));
    }

}
