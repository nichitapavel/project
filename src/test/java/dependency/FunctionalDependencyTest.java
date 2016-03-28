/**
 * 
 */
package dependency;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import datastructures.Attribute;
import datastructures.AttributeJoint;
import datastructures.SetUpClass;

/**
 * @author Pavel Nichita
 *
 */
public class FunctionalDependencyTest {
    private ADependency fd;
    private AttributeJoint antecedent;
    private AttributeJoint consequent;
    private SetUpClass setUpObject;
    
    /**
     * 
     */
    @Before
    public void setUp(){
        String [] antecedentArray = {"A", "B", "C"};
        antecedent = new AttributeJoint(antecedentArray);
        String [] consecuentArray = {"D", "E", "F"};
        consequent = new AttributeJoint(consecuentArray);
        fd = new FunctionalDependency(antecedent, consequent);
        setUpObject = new SetUpClass();
    }

    /**
     * Test method for {@link dependency.FunctionalDependency#FunctionalDependency(datastructures.AttributeJoint, datastructures.AttributeJoint)}.
     * 
     * Checks that a void constructor creates null antecedent and consequent.
     */
    @Test
    public void testFunctionalDependency() {
        ADependency voidFD = new FunctionalDependency();
        assertNull(voidFD.getAntecedent());
        assertNull(voidFD.getConsequent());
    }

    /**
     * Test method for {@link dependency.FunctionalDependency#FunctionalDependency(datastructures.AttributeJoint, datastructures.AttributeJoint)}.
     * 
     * Checks that a argument constructor creates a not null antecedent and consequent.
     */
    @Test
    public void testConstructorAttributeJoints() {
        assertNotNull(fd.getAntecedent());
        assertNotNull(fd.getConsequent());
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#getAntecedent()}.
     * Test method for {@link dependency.FunctionalDependency#getConsequent()}.
     * 
     * Checks that fd returns AttributeJoint {A, B, C}.
     * Checks that fd returns AttributeJoint {D, E, F}.
     * 
     */
    @Test
    public void testGet() {
        assertEquals(this.antecedent, fd.getAntecedent());
        assertEquals(this.consequent, fd.getConsequent());
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#setAntecedent()}.
     * Test method for {@link dependency.FunctionalDependency#setConsequent()}.
     * 
     * Sets antecedent to AttributeJoint {A, B, D} and
     * sets consequent to AttributeJoint {C, E}.
     * 
     * Checks that fd returns {A, B, D} for antecedent and
     * Checks that fd returns {C, E} for consequent.
     */
    @Test
    public void testSet() {
        String [] antecedentSetterArray = {"A", "B", "D"};
        AttributeJoint antecedentSetter = new AttributeJoint(antecedentSetterArray);
        String [] consequentSetterArray = {"C", "E"};
        AttributeJoint consequentSetter = new AttributeJoint(consequentSetterArray);
        fd.setAntecedent(antecedentSetter);
        fd.setConsequent(consequentSetter);
        assertEquals(antecedentSetter, fd.getAntecedent());
        assertEquals(consequentSetter, fd.getConsequent());     
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#removeAttributeFromAntecedent(Attribute)}.
     * 
     * Remove Attribute B from antecedent {A, B, C}, result must be {A, C}.
     */
    @Test
    public void testRemoveAttributeFromAntecedent() {
        String [] attr = {"A", "C"}; 
        AttributeJoint expected = new AttributeJoint(attr);
        fd.removeAttributeFromAntecedent(new Attribute("B"));
        assertEquals(expected, fd.getAntecedent());
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#removeAttributeFromConsequent(Attribute)}.
     * 
     * Remove Attribute E from consequent {D, E, F}, result must be {D, F}.
     */
    @Test
    public void testRemoveAttributeFromConsequent() {
        String [] attr = {"D", "F"}; 
        AttributeJoint expected = new AttributeJoint(attr);
        fd.removeAttributeFromConsequent(new Attribute("E"));
        assertEquals(expected, fd.getConsequent());
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#removeAttributeFromAntecedent(AttributeJoint)}.
     * 
     * Remove AttributeJoint {A, B} from antecedent {A, B, C}, result must be {C}.
     */
    @Test
    public void testRemoveAttributeJointFromAntecedent() {
        String [] attr = {"C"}; 
        AttributeJoint expected = new AttributeJoint(attr);
        String [] toBeRemovedArray = {"B", "A"}; 
        AttributeJoint toBeRemoved = new AttributeJoint(toBeRemovedArray);
        fd.removeAttributeFromAntecedent(toBeRemoved);
        assertEquals(expected, fd.getAntecedent());
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#removeAttributeFromConsequent(AttributeJoint)}.
     * 
     * Remove AttributeJoint {E, D} from consequent {D, E, F}, result must be {F}.
     */
    @Test
    public void testRemoveAttributeJointFromConsequent() {
        String [] attr = {"F"}; 
        AttributeJoint expected = new AttributeJoint(attr);
        String [] toBeRemovedArray = {"E", "D"}; 
        AttributeJoint toBeRemoved = new AttributeJoint(toBeRemovedArray);
        fd.removeAttributeFromConsequent(toBeRemoved);
        assertEquals(expected, fd.getConsequent());
    }

    /**
     * Test method for {@link dependency.FunctionalDependency#isDestroyable()}.
     * 
     * Checks if dependency {A, B, C} -> {D, E, F} can be destroyed,
     * result must be false.
     */
    @Test
    public void testFuncDepIsNotDestroyable() {
        assertFalse(fd.isDestroyable());
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#isDestroyable()}.
     * 
     * Checks if dependency {} -> {D, E, F} can be destroyed,
     * result must be true.
     */
    @Test
    public void testFuncDepIsDestroyableAntecedent() {
        String [] antecedentArray = {"A", "B", "C"};
        this.antecedent = new AttributeJoint(antecedentArray);
        fd.removeAttributeFromAntecedent(this.antecedent);
        assertTrue(fd.isDestroyable());
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#isDestroyable()}.
     * 
     * Checks if dependency {A, B, C} -> {} can be destroyed,
     * result must be true.
     */
    @Test
    public void testFuncDepIsDestroyableConsequent() {
        String [] consecuentArray = {"D", "E", "F"};
        this.consequent = new AttributeJoint(consecuentArray);
        fd.removeAttributeFromConsequent(this.consequent);
        assertTrue(fd.isDestroyable());
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#clear()}.
     * 
     * Clears dependency {A, B, C} -> {D, E, F} and checks that antecedent
     * and consequent are zero.
     */
    @Test
    public void testClearFunctionalDependency() {
        this.fd.clear();
        assertEquals(0, this.fd.getAntecedent().getSize());
        assertEquals(0, this.fd.getConsequent().getSize());
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#getAttributeJoint()}.
     * 
     * Check that Dependency {A} -> {B, C, D} returns AttributeJoint {A, B, C, D}.
     */
    @Test
    public void testGetAttributeJoint() {
        this.fd = this.setUpObject.funcDepAtoBCD();
        AttributeJoint expected = this.setUpObject.attrJntABCD();
        assertEquals(expected, this.fd.getAttributeJoint());
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#toString()}.
     * 
     * Check that Dependency {A, B, C} -> {D, E, F} to string is
     * {A, B, C} -> {D, E, F}. 
     */
    @Test
    public void testToStringFunctionalDependency() {
        String expected = "{A, B, C} -> {D, E, F}";
        assertEquals(expected, fd.toString());
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#toString()}.
     * 
     * Check that empty Dependency to string is
     * null -> null. 
     */
    @Test
    public void testToStringNullFunctionalDependency() {
        this.fd = new FunctionalDependency();
        String expected = "null -> null";
        assertEquals(expected, this.fd.toString());
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#hashCode()}.
     * 
     * Checks that two different FD, but with same value, have the same hash code.
     */
    @Test
    public void testHashCodeEquals() {
        String [] antecedentArray = {"A", "B", "C"};
        antecedent = new AttributeJoint(antecedentArray);
        String [] consecuentArray = {"D", "E", "F"};
        consequent = new AttributeJoint(consecuentArray);
        ADependency auxFD = new FunctionalDependency(antecedent, consequent);
        assertEquals(fd.hashCode(), auxFD.hashCode());
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#hashCode()}.
     * 
     * Checks that the same FD has the same hash code.
     */
    @Test
    public void testHashCodeSameFD() {
        assertEquals(fd.hashCode(), fd.hashCode());
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#hashCode()}.
     * 
     * Checks that two different FD have different hash code.
     */
    @Test
    public void testHashCodeDifferent() {
        String [] antecedentArray = {"A"};
        antecedent = new AttributeJoint(antecedentArray);
        String [] consecuentArray = {"E", "F"};
        consequent = new AttributeJoint(consecuentArray);
        ADependency auxFD = new FunctionalDependency(antecedent, consequent);
        assertNotEquals(fd.hashCode(), auxFD.hashCode());
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#hashCode()}.
     * 
     * Checks that an empty FD has a valid hash code.
     */
    @Test
    public void testHashCodeNullValues() {
        ADependency funcDep = new FunctionalDependency();
        assertEquals(961, funcDep.hashCode());
    }

    /**
     * Test method for {@link dependency.FunctionalDependency#equals(Object)}.
     * 
     * Checks that {A, B, C} -> {D, E, F} equals himself.
     */
    @Test
    public void testEqualsSameObject() {
        assertTrue(fd.equals(fd));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#equals(Object)}.
     * 
     * Checks that two different FD with same values are equal.
     */
    @Test
    public void testEqualsSameValues() {
        String [] antecedentArray = {"A", "B", "C"};
        antecedent = new AttributeJoint(antecedentArray);
        String [] consecuentArray = {"D", "E", "F"};
        consequent = new AttributeJoint(consecuentArray);
        ADependency auxFD = new FunctionalDependency(antecedent, consequent);
        assertTrue(fd.equals(auxFD));
        assertTrue(auxFD.equals(fd));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#equals(Object)}.
     * 
     * Checks that a FD not equals an Attribute.
     */
    @Test
    public void testEqualsOtherClassObject() {
        Attribute attrA = new Attribute("A");
        assertFalse(fd.equals(attrA));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#equals(Object)}.
     * 
     * Checks that two different FD are not equal.
     */
    @Test
    public void testEqualsNotDifferentValues() {
        String [] antecedentArray = {"A"};
        antecedent = new AttributeJoint(antecedentArray);
        String [] consecuentArray = {"E", "F"};
        consequent = new AttributeJoint(consecuentArray);
        ADependency auxFD = new FunctionalDependency(antecedent, consequent);
        assertFalse(fd.equals(auxFD));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#equals(Object)}.
     * 
     * Checks that a FD not equals null.
     */
    @Test
    public void testEqualsNotNullObject() {
        assertFalse(fd.equals(null));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#equals(Object)}.
     * 
     * Checks that an empty FD does not equal {A, B, C} -> {D, E, F}.
     */
    @Test
    public void testEqualsNotObjectWithNullValues() {
        ADependency funcDep = new FunctionalDependency();
        assertFalse(funcDep.equals(fd));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#equals(Object)}.
     * 
     * Checks that two empty FD are equal.
     */
    @Test
    public void testEqualsBothObjectsWithNullValues() {
        ADependency funcDep1 = new FunctionalDependency();
        ADependency funcDep2 = new FunctionalDependency();
        assertTrue(funcDep1.equals(funcDep2));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#equals(Object)}.
     * 
     * Checks that {A, B, C} -> {D, E, F} not equals {A, B, C} -> {null}.
     */
    @Test
    public void testEqualsNotConsquentWithNullValues() {
        ADependency funcDep = new FunctionalDependency();
        String [] attrString = { "A", "B", "C" };
        AttributeJoint attrJoint = new AttributeJoint(attrString);
        funcDep.setAntecedent(attrJoint);
        assertFalse(fd.equals(funcDep));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#equals(Object)}.
     * 
     * Checks that {A, B, C} -> {null} not equals {A, B, C} -> {D, E, F}.
     */
    @Test
    public void testEqualsConsequentWithNullValues() {
        ADependency funcDep = new FunctionalDependency();
        String [] attrString = { "A", "B", "C" };
        AttributeJoint attrJoint = new AttributeJoint(attrString);
        funcDep.setAntecedent(attrJoint);
        assertFalse(funcDep.equals(fd));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#clearTrivialElements()}.
     * 
     * A cleared FD {A, B, C} -> {D, E, F} from trivial elements is
     * {A, B, C} -> {D, E, F}.
     */
    @Test
    public void testClearTrivialElementsABCtoCDE() {
        ADependency newFD = new FunctionalDependency(this.fd.getAntecedent(), this.fd.getConsequent());
        this.fd.clearTrivialElements();
        assertEquals(newFD, this.fd);
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#clearTrivialElements()}.
     * 
     * A cleared FD {A, B} -> {B, C, D} from trivial elements is
     * {A, B} -> {C, D}.
     */
    @Test
    public void testClearTrivialElementsABtoB() {
        ADependency newFD = this.setUpObject.funcDepABtoBCD();
        ADependency expected = this.setUpObject.funcDepABtoCD();
        newFD.clearTrivialElements();
        assertEquals(expected, newFD);
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#clearTrivialElements()}.
     * 
     */
    @Test
    public void clearTrivialElementsABCtoVoid() {
        this.fd.setConsequent(new AttributeJoint());
        this.fd.clearTrivialElements();
    }
    
}
