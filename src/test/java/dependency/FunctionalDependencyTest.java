/**
 * 
 */
package dependency;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import datastructures.Attribute;
import datastructures.AttributeSet;
import datastructures.DFJoint;
import datastructures.SetUpClass;

/**
 * @author Pavel Nichita
 *
 */
public class FunctionalDependencyTest {
    private ADependency fd;
    private AttributeSet antecedent;
    private AttributeSet consequent;
    private SetUpClass setUpObject;
    private DFJoint firstDFJoint;
    private DFJoint secondDFJoint;
    
    /**
     * 
     */
    @Before
    public void setUp(){
        String [] antecedentArray = {"A", "B", "C"};
        antecedent = new AttributeSet(antecedentArray);
        String [] consecuentArray = {"D", "E", "F"};
        consequent = new AttributeSet(consecuentArray);
        fd = new FunctionalDependency(antecedent, consequent);
        setUpObject = new SetUpClass();
        firstDFJoint = this.setUpObject.dfJoint04();
        secondDFJoint = this.setUpObject.dfJoint05();
    }

    /**
     * Test method for {@link dependency.FunctionalDependency#FunctionalDependency(datastructures.AttributeSet, datastructures.AttributeSet)}.
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
     * Test method for {@link dependency.FunctionalDependency#FunctionalDependency(datastructures.AttributeSet, datastructures.AttributeSet)}.
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
     * Checks that fd returns AttributeSet {A, B, C}.
     * Checks that fd returns AttributeSet {D, E, F}.
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
     * Sets antecedent to AttributeSet {A, B, D} and
     * sets consequent to AttributeSet {C, E}.
     * 
     * Checks that fd returns {A, B, D} for antecedent and
     * Checks that fd returns {C, E} for consequent.
     */
    @Test
    public void testSet() {
        String [] antecedentSetterArray = {"A", "B", "D"};
        AttributeSet antecedentSetter = new AttributeSet(antecedentSetterArray);
        String [] consequentSetterArray = {"C", "E"};
        AttributeSet consequentSetter = new AttributeSet(consequentSetterArray);
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
        AttributeSet expected = new AttributeSet(attr);
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
        AttributeSet expected = new AttributeSet(attr);
        fd.removeAttributeFromConsequent(new Attribute("E"));
        assertEquals(expected, fd.getConsequent());
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#removeAttributeFromAntecedent(AttributeSet)}.
     * 
     * Remove AttributeSet {A, B} from antecedent {A, B, C}, result must be {C}.
     */
    @Test
    public void testRemoveAttributeJointFromAntecedent() {
        String [] attr = {"C"}; 
        AttributeSet expected = new AttributeSet(attr);
        String [] toBeRemovedArray = {"B", "A"}; 
        AttributeSet toBeRemoved = new AttributeSet(toBeRemovedArray);
        fd.removeAttributeFromAntecedent(toBeRemoved);
        assertEquals(expected, fd.getAntecedent());
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#removeAttributeFromConsequent(AttributeSet)}.
     * 
     * Remove AttributeSet {E, D} from consequent {D, E, F}, result must be {F}.
     */
    @Test
    public void testRemoveAttributeJointFromConsequent() {
        String [] attr = {"F"}; 
        AttributeSet expected = new AttributeSet(attr);
        String [] toBeRemovedArray = {"E", "D"}; 
        AttributeSet toBeRemoved = new AttributeSet(toBeRemovedArray);
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
        this.antecedent = new AttributeSet(antecedentArray);
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
        this.consequent = new AttributeSet(consecuentArray);
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
     * Check that Dependency {A} -> {B, C, D} returns AttributeSet {A, B, C, D}.
     */
    @Test
    public void testGetAttributeJoint() {
        this.fd = this.setUpObject.funcDepAtoBCD();
        AttributeSet expected = this.setUpObject.attrJntABCD();
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
        antecedent = new AttributeSet(antecedentArray);
        String [] consecuentArray = {"D", "E", "F"};
        consequent = new AttributeSet(consecuentArray);
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
        antecedent = new AttributeSet(antecedentArray);
        String [] consecuentArray = {"E", "F"};
        consequent = new AttributeSet(consecuentArray);
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
        antecedent = new AttributeSet(antecedentArray);
        String [] consecuentArray = {"D", "E", "F"};
        consequent = new AttributeSet(consecuentArray);
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
        antecedent = new AttributeSet(antecedentArray);
        String [] consecuentArray = {"E", "F"};
        consequent = new AttributeSet(consecuentArray);
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
        AttributeSet attrJoint = new AttributeSet(attrString);
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
        AttributeSet attrJoint = new AttributeSet(attrString);
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
     * A cleared FD {A, B, C} -> {null} should trigger exception.
     */
    @Test
    public void testClearTrivialElementsABCtoVoid() {
        this.fd.setConsequent(new AttributeSet());
        this.fd.clearTrivialElements();
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#toFunctionalDependency(datastructures.DFJoint)}.
     * 
     * Returns a list with {A, B, C} to {D, E, F} dependency checked in a null DFJoint.
     * It doesn't matter the DFJoint, since this is a FunctinalDependency, not a PluralDependency. 
     */
    @Test
    public void testToFunctionalDependency() {
        List<ADependency> expected = new ArrayList<>();
        expected.add(new FunctionalDependency(this.antecedent, this.consequent));
        assertEquals(expected, this.fd.toFunctionalDependency(null));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#belongsTo(DFJoint, Relation)}.
     * Checks that every dependency from firstJoint belongs secondDFJoint.
     */
    @Test
    public void testBelongsToTrueSecondDFJoint() {
        for (ADependency item : firstDFJoint)
            assertTrue(item.belongsTo(secondDFJoint, null));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#belongsTo(DFJoint, Relation)}.
     * Checks that every dependency from secondDFJoint belongs firstJoint.
     */
    @Test
    public void testBelongsToTrueFirstDFJoint() {
        for (ADependency item : secondDFJoint)
            assertTrue(item.belongsTo(firstDFJoint, null));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#belongsTo(DFJoint, Relation)}.
     * Checks that {A, B, C} to {D, E, F} belongs to firstDFJoint and secondDFJoint,
     * result false.
     */
    @Test
    public void testBelongsToFalseFD() {
        assertFalse(fd.belongsTo(firstDFJoint, null));
        assertFalse(fd.belongsTo(secondDFJoint, null));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#belongsTo(DFJoint, Relation)}.
     * Checks that {C} to {A, B} belongs to firstDFJoint, result false.
     */
    @Test
    public void testBelongsToFalseFirstFD() {
        String [] antecedentArray = {"C"};
        AttributeSet antecedentFD = new AttributeSet(antecedentArray);
        String [] consecuentArray = {"A", "B"};
        AttributeSet consequentFD = new AttributeSet(consecuentArray);
        ADependency fundDep = new FunctionalDependency(antecedentFD, consequentFD);
        assertFalse(fundDep.belongsTo(firstDFJoint, null));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#belongsTo(DFJoint, Relation)}.
     * Checks that {C} to {A} belongs to firstDFJoint, result false.
     */
    @Test
    public void testBelongsFalseSecondFD() {
        String [] antecedentArray = {"C"};
        AttributeSet antecedentFD = new AttributeSet(antecedentArray);
        String [] consecuentArray = {"A"};
        AttributeSet consequentFD = new AttributeSet(consecuentArray);
        ADependency fundDep = new FunctionalDependency(antecedentFD, consequentFD);
        assertFalse(fundDep.belongsTo(firstDFJoint, null));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#isTrivial(datastructures.Relation)}.
     * Checks that {A} -> {B} is trivial,
     * result: false.
     */
    @Test
    public void isTrivialFalseAtoB() {
        assertFalse(this.setUpObject.funcDepAtoB().isTrivial());
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#isTrivial(datastructures.Relation)}.
     * Checks that {A, B} -> {B} is trivial,
     * result: true.
     */
    @Test
    public void isTrivialTrueABtoB() {
        assertTrue(this.setUpObject.funcDepABtoB().isTrivial());
    }

    /**
     * Test method for {@link dependency.FunctionalDependency#isTrivial(datastructures.Relation)}.
     * Checks that {} -> {D, E, F} is trivial,
     * result: true.
     */
    @Test
    public void isTrivialTrueVoidAntedent() {
        this.fd.setAntecedent(new AttributeSet());
        assertTrue(this.fd.isTrivial());
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#isTrivial(datastructures.Relation)}.
     * Checks that {A, B, C} -> {} is trivial,
     * result: true.
     */
    @Test
    public void isTrivialTrueVoidConsequent() {
        this.fd.setConsequent(new AttributeSet());
        assertTrue(this.fd.isTrivial());
    }
}
