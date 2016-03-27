/**
 * 
 */
package dependency;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import datastructures.Attribute;
import datastructures.AttributeJoint;

/**
 * @author Pavel Nichita
 *
 */
public class FunctionalDependencyTest {
    private ADependency fd;
    private AttributeJoint antecedent;
    private AttributeJoint consequent;
    
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
}
