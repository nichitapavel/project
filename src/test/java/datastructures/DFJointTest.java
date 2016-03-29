/**
 * 
 */
package datastructures;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

import dependency.ADependency;
import dependency.FunctionalDependency;

/**
 * @author Pavel Nichita
 *
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DFJointTest {
    private DFJoint nullDFJoint;
    private ArrayList<ADependency> dfJointVector;
    private ADependency one;
    private ADependency two;
    
    /* DFJoint = {A -> BC, BC -> A, BCD -> E, E -> C} */
    private DFJoint dfJoint;
    /* firstDFJoint  = {A -> BC, B -> C, A -> B, AB -> C} */
    private DFJoint firstDFJoint;
    /* secondDFJoint = {A -> B, B -> C} */
    private DFJoint secondDFJoint;
    
    private SetUpClass setUpObject;
    /**
     * Set Up.
     */
    @Before
    public void setUp() {
        this.setUpObject = new SetUpClass();
        nullDFJoint = new DFJoint();
        dfJoint = this.setUpObject.dfJoint01();
        
        this.one = this.setUpObject.funcDepAtoB();
        this.two = this.setUpObject.funcDepCtoA();
        
        dfJointVector = new ArrayList<>();
        dfJointVector.add(this.one);
        dfJointVector.add(this.two);
        
        /* firstDFJoint  = {A -> BC, B -> C, A -> B, AB -> C}*/
        firstDFJoint = this.setUpObject.dfJoint04();
        
        /* secondDFJoint = {A -> B, B -> C} */
        secondDFJoint = this.setUpObject.dfJoint05();
    }

    /**
     * Test method for {@link datastructures.DFJoint#DFJoint()}.
     * 
     * Null constructor has size 0.
     */
    @Test
    public void testDFJoint() {
        assertEquals(0, nullDFJoint.getDFJoint().size());
    }

    /**
     * Test method for {@link datastructures.DFJoint#DFJoint(java.util.List)}.
     * 
     * Checks every element after construct with a list of dependencies.
     */
    @Test
    public void testConstructorArgumentVector() {
        DFJoint auxDFJoint = new DFJoint(dfJointVector);
        assertEquals(2, auxDFJoint.getDFJoint().size());
        assertEquals(this.one, auxDFJoint.getDFJoint().get(0));
        assertEquals(this.two, auxDFJoint.getDFJoint().get(1));
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#DFJoint(DFJoint)}.
     * 
     * Checks the list and name after construct with another DFJoint.
     */
    @Test
    public void testConstructorArgumentDFJoint() {
        DFJoint auxDFJoint = new DFJoint(dfJointVector);
        DFJoint testDFJoint = new DFJoint(auxDFJoint);
        assertEquals(dfJointVector, testDFJoint.getDFJoint());
        assertEquals(auxDFJoint.getName(), testDFJoint.getName());
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#getDFJoint()}.
     * 
     * A DFJoint not null should not have it list size equal to zero.
     */
    @Test
    public void testGetDFJointNotEqualZero() {
        assertNotEquals(0, dfJoint.getDFJoint().size());
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#getDFJoint()}.
     * 
     * Is equal list size to 4? Result True. 
     */
    @Test
    public void testGetDFJointEqual() {
        assertEquals(4, dfJoint.getDFJoint().size());
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#getDFJoint()}.
     * 
     * A return list of non null DFJoint is no empty.
     */
    @Test
    public void testGetDFJointNotNull() {
        for (ADependency item : dfJoint.getDFJoint())
            assertNotNull(item);
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#getDFJoint()}.
     * 
     * The return list of dependencies are the ones expected.
     */
    @Test
    public void testGetDFJoint() {
        String [] antecedent = {"A"};
        String [] consequent = {"B", "C"};
        FunctionalDependency expected = new FunctionalDependency(
                new AttributeJoint(antecedent), new AttributeJoint(consequent)
                );
        assertEquals(expected, dfJoint.getDFJoint().get(0));
    }

    /**
     * Test method for {@link datastructures.DFJoint#setDFJoint(java.util.ArrayList)}.
     * 
     * Sets a list of dependencies, and checks that is returned the same list.
     */
    @Test
    public void testSetDFJoint() {
        nullDFJoint.setDFJoint(dfJointVector);
        assertEquals(dfJointVector, nullDFJoint.getDFJoint());
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#setDFJoint(java.util.ArrayList)}.
     * 
     * Sets a list of dependencies, and checks that is returned list has the right size.
     */
    @Test
    public void testSetDFJointAssertSize() {
        nullDFJoint.setDFJoint(dfJointVector);
        assertEquals(2, nullDFJoint.getDFJoint().size());
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#setDFJoint(java.util.ArrayList)}.
     * 
     * Sets a list of dependencies, and checks every dependency is in the returned list.
     */
    @Test
    public void testSetDFJointAssertFunctionalDependencies() {
        nullDFJoint.setDFJoint(dfJointVector);
        assertEquals(this.one, nullDFJoint.getDFJoint().get(0));
        assertEquals(this.two, nullDFJoint.getDFJoint().get(1));
    }

    /**
     * Test method for {@link datastructures.DFJoint#setName(java.lang.String)}.
     * 
     * Sets name, checks that the returned name is correct.
     */
    @Test
    public void testSetName() {
        String expected = "DFJoint";
        this.nullDFJoint.setName(expected);
        assertEquals(expected, this.nullDFJoint.getName());
    }

    /**
     * Test method for {@link datastructures.DFJoint#getName()}.
     * 
     * Checks that the returned names is the expected one.
     */
    @Test
    public void testGetName() {
        String expected = "No name";
        assertEquals(expected, this.nullDFJoint.getName());
    }

    /**
     * Test method for {@link datastructures.DFJoint#iterator()}.
     * 
     * Return iterator is not empty.
     */
    @Test
    public void testIterator() {
        for (ADependency item : dfJoint)
            assertNotNull(item);
    }

    /**
     * Test method for {@link datastructures.DFJoint#addDependency(ADependency)}.
     * 
     * Adds dependency to null DFJoint, checks that after size is 1 and
     * that it got inserted.
     */
    @Test
    public void testAddFuncDepToEmptyDFJoint() {
        nullDFJoint.addDependency(this.one);
        assertEquals(1, nullDFJoint.getDFJoint().size());
        assertEquals(this.one, nullDFJoint.getDFJoint().get(0));
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#addDependency(ADependency)}.
     * 
     * Adds dependency to a DFJoint, checks that after size is +1 and
     * that it got inserted.
     */
    @Test
    public void testAddFuncDepToNormalDFJoint() {
        dfJoint.addDependency(this.one);
        assertEquals(5, dfJoint.getDFJoint().size());
        assertEquals(this.one, dfJoint.getDFJoint().get(4));
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#addDependency(ADependency)}.
     * 
     * Adds dependency that already exists to DFJoint, checks that after size didn't
     * changed and that has the same list of dependencies.
     */
    @Test
    public void testAddFuncDepThatExist() {
        DFJoint expected = this.setUpObject.dfJoint04();
        this.firstDFJoint.addDependency(this.setUpObject.funcDepAtoBC());
        assertEquals(expected, this.firstDFJoint);
    }

    /**
     * Test method for {@link datastructures.DFJoint#hashCode()}.
     * 
     * Checks that two DFJoint with same values have same hashCode.
     */
    @Test
    public void testHashCodeDFJointsWithSameValues() {
        DFJoint auxDFJoint = new SetUpClass().dfJoint01();
        assertEquals(dfJoint.hashCode(), auxDFJoint.hashCode());
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#hashCode()}.
     * 
     * Checks that two different DFJoint have different hashCode.
     */
    @Test
    public void testHashCodeDifferentDFJoints() {
        assertNotEquals(dfJoint.hashCode(), nullDFJoint.getDFJoint());
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#hashCode()}.
     * 
     * Checks hashCode value of an empty DFJoint. 
     */
    @Test
    public void testHashCodeEmptyValueDFJoint() {
        nullDFJoint.setDFJoint(null);
        assertEquals(31, nullDFJoint.hashCode());
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#equals(Object)}.
     * 
     * Same DFJoint is equal to himself.
     */
    @Test
    public void testEqualsTrueSameObject() {
        assertTrue(dfJoint.equals(dfJoint));
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#equals(Object)}.
     * 
     * DFJoint is not equal to null.
     */
    @Test
    public void testEqualsFalseNullObject() {
        assertFalse(dfJoint.equals(null));
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#equals(Object)}.
     * 
     * DFJoint is not equal to different class.
     */
    @Test
    public void testEqualsFalseDifferentClassObject() {
        Attribute attrA = new Attribute("A");
        assertFalse(dfJoint.equals(attrA));
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#equals(Object)}.
     * 
     * One good DFJoint is not equal to one with no list of dependencies.
     */
    @Test
    public void testEqualsFalseDFJointWithNullValue() {
        nullDFJoint.setDFJoint(null);
        assertFalse(nullDFJoint.equals(dfJoint));
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#equals(Object)}.
     * 
     * Two different DFJoints are not equal.
     */
    @Test
    public void testEqualsFalseDFJointWithDifferentValues() {
        nullDFJoint.addDependency(this.one);
        assertFalse(dfJoint.equals(nullDFJoint));
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#equals(Object)}.
     * 
     * Two DFJoints with same value are equal.
     */
    @Test
    public void testEqualsTrueDFJoints() {
        DFJoint auxDFJoint = new SetUpClass().dfJoint01();
        assertTrue(dfJoint.equals(auxDFJoint));
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#equals(Object)}.
     * 
     * Two DFJoints with same null lists are equal.
     */
    @Test
    public void testEqualsTrueNullDFJoint() {
        nullDFJoint.setDFJoint(null);
        dfJoint.setDFJoint(null);
        assertTrue(dfJoint.equals(nullDFJoint));
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#contains(ADependency)}.
     * 
     * DFJoint contains A to BC? Result true.
     */
    @Test
    public void containsTrue() {
        assertTrue(this.firstDFJoint.contains(this.setUpObject.funcDepAtoBC()));
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#contains(ADependency)}.
     * 
     * DFJoint contains E to C? Result false.
     */
    public void containsFalse() {
        assertFalse(this.firstDFJoint.contains(this.setUpObject.funcDepEtoC()));
    }
}
