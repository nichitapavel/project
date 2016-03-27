/**
 * 
 */
package dependency;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

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
    public void constructorAttributeJoints() {
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
    public void getTest() {
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
    public void setTest() {
        String [] antecedentSetterArray = {"A", "B", "D"};
        AttributeJoint antecedentSetter = new AttributeJoint(antecedentSetterArray);
        String [] consequentSetterArray = {"C", "E"};
        AttributeJoint consequentSetter = new AttributeJoint(consequentSetterArray);
        fd.setAntecedent(antecedentSetter);
        fd.setConsequent(consequentSetter);
        assertEquals(antecedentSetter, fd.getAntecedent());
        assertEquals(consequentSetter, fd.getConsequent());     
    }
}
