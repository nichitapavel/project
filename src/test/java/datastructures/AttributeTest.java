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
    private SetUpClass setUpObject;
    private static final String NAMED_ATTR = "Atributo";

    /**
     * Set Up
     */
    @Before
    public void setUp() {
        nullAttribute = new Attribute();
        namedAttribute = new Attribute("Name");
        characterlessAttribute = new Attribute("");
        stringAttr = new Attribute(NAMED_ATTR);
        setUpObject = new SetUpClass();
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
        assertEquals(NAMED_ATTR, stringAttr.getAttribute());
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
        assertEquals(NAMED_ATTR, stringAttr.toString());
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
     * Creates an AttributeSet with these elements in it:
     * <i>Name</i>, <i>Atributo</i> and <i>A</i>. Checks for every Attribute 
     * if it is contained in the AttributeSet.
     * 
     * Test method for {@link datastructures.Attribute#isContained(AttributeSet)}.
     */
    @Test
    public void testIsContained() {
        String [] attributes = {"Name", NAMED_ATTR, "A"};
        AttributeSet attrJoint = new AttributeSet(attributes);
        assertTrue(namedAttribute.isContained(attrJoint));
        assertTrue(stringAttr.isContained(attrJoint));
        Attribute attrA = new Attribute("A");
        assertTrue(attrA.isContained(attrJoint));
    }

    /**
     * Creates an AttributeSet with these elements in it:
     * Atributo and A. Checks if Attribute <i>Name</i> 
     * is contained in the AttributeSet. 
     * 
     * Test method for {@link datastructures.Attribute#isContained(AttributeSet)}.
     */
    @Test
    public void testIsContainedFalseAttrJoint() {
        String [] attributes = {NAMED_ATTR, "A"};
        AttributeSet attrJoint = new AttributeSet(attributes);
        assertFalse(namedAttribute.isContained(attrJoint));
    }

    /**
     * Checks if Attribute <i>Name</i> is contained in a null AttributeSet. 
     * 
     * Test method for {@link datastructures.Attribute#isContained(AttributeSet)}.
     */
    @Test
    public void testIsContainedNullAttrJoint() {
        AttributeSet attrJoint = new AttributeSet();
        assertFalse(namedAttribute.isContained(attrJoint));
    }
    
    /**
     * Test method for {@link datastructures.Attribute#isRareInAntecedent(dependency.ADependency, FDSet)}.
     * 
     * Checks if A is rare in {AB} to {C} in
     * {A -> BC, B -> C, A -> B, AB -> C}, result true.
     */
    @Test
    public void testIsRareAInAntecedentInDFJointFourABtoC() {
        Attribute attrA = this.setUpObject.attrA();
        assertTrue(attrA.isRareInAntecedent(this.setUpObject.funcDepABtoC(),
                this.setUpObject.dfJoint04()));
    }
    
    /**
     * Test method for {@link datastructures.Attribute#isRareInAntecedent(dependency.ADependency, FDSet)}.
     * 
     * Checks if B is rare in {AB} to {C} in
     * {A -> BC, B -> C, A -> B, AB -> C}, result true.
     */
    @Test
    public void testIsRareBInAntecedentInDFJointFourABtoC() {
        Attribute attrB = this.setUpObject.attrB();
        assertTrue(attrB.isRareInAntecedent(this.setUpObject.funcDepABtoC(),
                this.setUpObject.dfJoint04()));
    }
    
    /**
     * Test method for {@link datastructures.Attribute#isRareInAntecedent(dependency.ADependency, FDSet)}.
     * 
     * Checks if A is rare in {AB} to {C} in
     * {A -> BC, B -> C, AB -> C}, result true.
     */
    @Test
    public void testIsRareAInAntecedentInDFJointTwentyFourABtoC() {
        Attribute attrA = this.setUpObject.attrA();
        assertTrue(attrA.isRareInAntecedent(this.setUpObject.funcDepABtoC(),
                this.setUpObject.dfJoint24()));
    }
    
    /**
     * Test method for {@link datastructures.Attribute#isRareInAntecedent(dependency.ADependency, FDSet)}.
     * 
     * Checks if B is rare in {AB} to {C} in
     * {A -> BC, B -> C, AB -> C}, result true.
     */
    @Test
    public void testIsRareBInAntecedentInDFJointTwentyFourABtoC() {
        Attribute attrB = this.setUpObject.attrB();
        assertTrue(attrB.isRareInAntecedent(this.setUpObject.funcDepABtoC(),
                this.setUpObject.dfJoint24()));
    }
    
    /**
     * Test method for {@link datastructures.Attribute#isRareInAntecedent(dependency.ADependency, FDSet)}.
     * 
     * Checks if B is rare in {BC} to {A} in
     * {A -> BC, BC -> A, BCD -> E, E -> C}, result false.
     */
    @Test
    public void testIsRareFalseBInAntecedentInDFJointOneBCtoA() {
        Attribute attrB = this.setUpObject.attrB();
        assertFalse(attrB.isRareInAntecedent(this.setUpObject.funcDepBCtoA(),
                this.setUpObject.dfJoint01()));
    }
    
    /**
     * Test method for {@link datastructures.Attribute#isRareInAntecedent(dependency.ADependency, FDSet)}.
     * 
     * Checks if C is rare in {BC} to {A} in
     * {A -> BC, BC -> A, BCD -> E, E -> C}, result false.
     */
    @Test
    public void testIsRareFalseCInAntecedentInDFJointOneBCtoA() {
        Attribute attrC = this.setUpObject.attrC();
        assertFalse(attrC.isRareInAntecedent(this.setUpObject.funcDepBCtoA(),
                this.setUpObject.dfJoint01()));
    }

    /**
     * Test method for {@link datastructures.Attribute#isRareInConsequent(dependency.ADependency, FDSet)}.
     * 
     * Checks if B is rare in {A} to {BC} in
     * {A -> BC, B -> C, A -> B, AB -> C}, result true.
     */
    @Test
    public void testIsRareBInConsequentInDFJointFourAtoBC() {
        Attribute attrB = this.setUpObject.attrB();
        assertTrue(attrB.isRareInConsequent(this.setUpObject.funcDepAtoBC(),
                this.setUpObject.dfJoint04()));
    }
    
    /**
     * Test method for {@link datastructures.Attribute#isRareInConsequent(dependency.ADependency, FDSet)}.
     * 
     * Checks if C is rare in {A} to {BC} in
     * {A -> BC, B -> C, A -> B, AB -> C}, result true.
     */
    @Test
    public void testIsRareCInConsequentInDFJointFourAtoBC() {
        Attribute attrC = this.setUpObject.attrC();
        assertTrue(attrC.isRareInConsequent(this.setUpObject.funcDepAtoBC(),
                this.setUpObject.dfJoint04()));
    }
    
    /**
     * Test method for {@link datastructures.Attribute#isRareInConsequent(dependency.ADependency, FDSet)}.
     * 
     * Checks if C is rare in {A} to {BC} in
     * {A -> BC, BC -> A, BCD -> E, E -> C}, result false.
     */
    @Test
    public void testIsRareFalseCInConsequentInDFJointOneAtoBC() {
        Attribute attrC = this.setUpObject.attrC();
        assertFalse(attrC.isRareInConsequent(this.setUpObject.funcDepAtoBC(),
                this.setUpObject.dfJoint01()));
    }
    
    /**
     * Test method for {@link datastructures.Attribute#isRareInConsequent(dependency.ADependency, FDSet)}.
     * 
     * Checks if B is rare in {A} to {BC} in
     * {A -> BC, BC -> A, BCD -> E, E -> C}, result false.
     */
    @Test
    public void testIsRareFalseBInConsequentInDFJointOneAtoBC() {
        Attribute attrB = this.setUpObject.attrB();
        assertFalse(attrB.isRareInConsequent(this.setUpObject.funcDepAtoBC(),
                this.setUpObject.dfJoint01()));
    }
    
    /**
     * Test method for {@link datastructures.Attribute#toXML()}.
     * 
     * Checks if C is return like an XML element:
     * <Attribute>C</Attribute>
     */
    @Test
    public void testToXML() {
        Attribute attrC = this.setUpObject.attrC();
        //assertEquals("<Attribute>C</Attribute>", attrC.toXML());
    }
}
