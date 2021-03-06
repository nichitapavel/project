/**
 * 
 */
package datastructures;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

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
    private FDSet nullDFJoint;
    private ArrayList<ADependency> dfJointVector;
    private ADependency one;
    private ADependency two;
    
    /* FDSet = {A -> BC, BC -> A, BCD -> E, E -> C} */
    private FDSet dfJoint;
    /* firstDFJoint  = {A -> BC, B -> C, A -> B, AB -> C} */
    private FDSet firstDFJoint;
    /* secondDFJoint = {A -> B, B -> C} */
    private FDSet secondDFJoint;
    
    private SetUpClass setUpObject;
    /**
     * Set Up.
     */
    @Before
    public void setUp() {
        this.setUpObject = new SetUpClass();
        nullDFJoint = new FDSet();
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
     * Test method for {@link datastructures.FDSet#DFJoint()}.
     * 
     * Null constructor has size 0.
     */
    @Test
    public void testDFJoint() {
        assertEquals(0, nullDFJoint.getDFJoint().size());
    }

    /**
     * Test method for {@link datastructures.FDSet#DFJoint(java.util.List)}.
     * 
     * Checks every element after construct with a list of dependencies.
     */
    @Test
    public void testConstructorArgumentVector() {
        FDSet auxDFJoint = new FDSet(dfJointVector);
        assertEquals(2, auxDFJoint.getDFJoint().size());
        assertEquals(this.one, auxDFJoint.getDFJoint().get(0));
        assertEquals(this.two, auxDFJoint.getDFJoint().get(1));
    }
    
    /**
     * Test method for {@link datastructures.FDSet#DFJoint(FDSet)}.
     * 
     * Checks the list and name after construct with another FDSet.
     */
    @Test
    public void testConstructorArgumentDFJoint() {
        FDSet auxDFJoint = new FDSet(dfJointVector);
        FDSet testDFJoint = new FDSet(auxDFJoint);
        assertEquals(dfJointVector, testDFJoint.getDFJoint());
        assertEquals(auxDFJoint.getName(), testDFJoint.getName());
    }
    
    /**
     * Test method for {@link datastructures.FDSet#getDFJoint()}.
     * 
     * A FDSet not null should not have it list size equal to zero.
     */
    @Test
    public void testGetDFJointNotEqualZero() {
        assertNotEquals(0, dfJoint.getDFJoint().size());
    }
    
    /**
     * Test method for {@link datastructures.FDSet#getDFJoint()}.
     * 
     * Is equal list size to 4? Result True. 
     */
    @Test
    public void testGetDFJointEqual() {
        assertEquals(4, dfJoint.getDFJoint().size());
    }
    
    /**
     * Test method for {@link datastructures.FDSet#getDFJoint()}.
     * 
     * A return list of non null FDSet is no empty.
     */
    @Test
    public void testGetDFJointNotNull() {
        for (ADependency item : dfJoint.getDFJoint())
            assertNotNull(item);
    }
    
    /**
     * Test method for {@link datastructures.FDSet#getDFJoint()}.
     * 
     * The return list of dependencies are the ones expected.
     */
    @Test
    public void testGetDFJoint() {
        String [] antecedent = {"A"};
        String [] consequent = {"B", "C"};
        FunctionalDependency expected = new FunctionalDependency(
                new AttributeSet(antecedent), new AttributeSet(consequent)
                );
        assertEquals(expected, dfJoint.getDFJoint().get(0));
    }

    /**
     * Test method for {@link datastructures.FDSet#setDFJoint(java.util.ArrayList)}.
     * 
     * Sets a list of dependencies, and checks that is returned the same list.
     */
    @Test
    public void testSetDFJoint() {
        nullDFJoint.setDFJoint(dfJointVector);
        assertEquals(dfJointVector, nullDFJoint.getDFJoint());
    }
    
    /**
     * Test method for {@link datastructures.FDSet#setDFJoint(java.util.ArrayList)}.
     * 
     * Sets a list of dependencies, and checks that is returned list has the right size.
     */
    @Test
    public void testSetDFJointAssertSize() {
        nullDFJoint.setDFJoint(dfJointVector);
        assertEquals(2, nullDFJoint.getDFJoint().size());
    }
    
    /**
     * Test method for {@link datastructures.FDSet#setDFJoint(java.util.ArrayList)}.
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
     * Test method for {@link datastructures.FDSet#setName(java.lang.String)}.
     * 
     * Sets name, checks that the returned name is correct.
     */
    @Test
    public void testSetName() {
        String expected = "FDSet";
        this.nullDFJoint.setName(expected);
        assertEquals(expected, this.nullDFJoint.getName());
    }

    /**
     * Test method for {@link datastructures.FDSet#getName()}.
     * 
     * Checks that the returned names is the expected one.
     */
    @Test
    public void testGetName() {
        String expected = "No name";
        assertEquals(expected, this.nullDFJoint.getName());
    }

    /**
     * Test method for {@link datastructures.FDSet#iterator()}.
     * 
     * Return iterator is not empty.
     */
    @Test
    public void testIterator() {
        for (ADependency item : dfJoint)
            assertNotNull(item);
    }

    /**
     * Test method for {@link datastructures.FDSet#addDependency(ADependency)}.
     * 
     * Adds dependency to null FDSet, checks that after size is 1 and
     * that it got inserted.
     */
    @Test
    public void testAddFuncDepToEmptyDFJoint() {
        nullDFJoint.addDependency(this.one);
        assertEquals(1, nullDFJoint.getDFJoint().size());
        assertEquals(this.one, nullDFJoint.getDFJoint().get(0));
    }
    
    /**
     * Test method for {@link datastructures.FDSet#addDependency(ADependency)}.
     * 
     * Adds dependency to a FDSet, checks that after size is +1 and
     * that it got inserted.
     */
    @Test
    public void testAddFuncDepToNormalDFJoint() {
        dfJoint.addDependency(this.one);
        assertEquals(5, dfJoint.getDFJoint().size());
        assertEquals(this.one, dfJoint.getDFJoint().get(4));
    }
    
    /**
     * Test method for {@link datastructures.FDSet#addDependency(ADependency)}.
     * 
     * Adds dependency that already exists to FDSet, checks that after size didn't
     * changed and that has the same list of dependencies.
     */
    @Test
    public void testAddFuncDepThatExist() {
        FDSet expected = this.setUpObject.dfJoint04();
        this.firstDFJoint.addDependency(this.setUpObject.funcDepAtoBC());
        assertEquals(expected, this.firstDFJoint);
    }

    /**
     * Test method for {@link datastructures.FDSet#hashCode()}.
     * 
     * Checks that two FDSet with same values have same hashCode.
     */
    @Test
    public void testHashCodeDFJointsWithSameValues() {
        FDSet auxDFJoint = new SetUpClass().dfJoint01();
        assertEquals(dfJoint.hashCode(), auxDFJoint.hashCode());
    }
    
    /**
     * Test method for {@link datastructures.FDSet#hashCode()}.
     * 
     * Checks that two different FDSet have different hashCode.
     */
    @Test
    public void testHashCodeDifferentDFJoints() {
        assertNotEquals(dfJoint.hashCode(), nullDFJoint.getDFJoint());
    }
    
    /**
     * Test method for {@link datastructures.FDSet#hashCode()}.
     * 
     * Checks hashCode value of an empty FDSet. 
     */
    @Test
    public void testHashCodeEmptyValueDFJoint() {
        nullDFJoint.setDFJoint(null);
        assertEquals(31, nullDFJoint.hashCode());
    }
    
    /**
     * Test method for {@link datastructures.FDSet#equals(Object)}.
     * 
     * Same FDSet is equal to himself.
     */
    @Test
    public void testEqualsTrueSameObject() {
        assertTrue(dfJoint.equals(dfJoint));
    }
    
    /**
     * Test method for {@link datastructures.FDSet#equals(Object)}.
     * 
     * FDSet is not equal to null.
     */
    @Test
    public void testEqualsFalseNullObject() {
        assertFalse(dfJoint.equals(null));
    }
    
    /**
     * Test method for {@link datastructures.FDSet#equals(Object)}.
     * 
     * FDSet is not equal to different class.
     */
    @Test
    public void testEqualsFalseDifferentClassObject() {
        Attribute attrA = new Attribute("A");
        assertFalse(dfJoint.equals(attrA));
    }
    
    /**
     * Test method for {@link datastructures.FDSet#equals(Object)}.
     * 
     * One good FDSet is not equal to one with no list of dependencies.
     */
    @Test
    public void testEqualsFalseDFJointWithNullValue() {
        nullDFJoint.setDFJoint(null);
        assertFalse(nullDFJoint.equals(dfJoint));
    }
    
    /**
     * Test method for {@link datastructures.FDSet#equals(Object)}.
     * 
     * Two different DFJoints are not equal.
     */
    @Test
    public void testEqualsFalseDFJointWithDifferentValues() {
        nullDFJoint.addDependency(this.one);
        assertFalse(dfJoint.equals(nullDFJoint));
    }
    
    /**
     * Test method for {@link datastructures.FDSet#equals(Object)}.
     * 
     * Two DFJoints with same value are equal.
     */
    @Test
    public void testEqualsTrueDFJoints() {
        FDSet auxDFJoint = new SetUpClass().dfJoint01();
        assertTrue(dfJoint.equals(auxDFJoint));
    }
    
    /**
     * Test method for {@link datastructures.FDSet#equals(Object)}.
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
     * Test method for {@link datastructures.FDSet#contains(ADependency)}.
     * 
     * FDSet contains A to BC? Result true.
     */
    @Test
    public void testContainsTrue() {
        assertTrue(this.firstDFJoint.contains(this.setUpObject.funcDepAtoBC()));
    }
    
    /**
     * Test method for {@link datastructures.FDSet#contains(ADependency)}.
     * 
     * FDSet contains E to C? Result false.
     */
    public void testContainsFalse() {
        assertFalse(this.firstDFJoint.contains(this.setUpObject.funcDepEtoC()));
    }
    
    /**
     * Test method for {@link datastructures.FDSet#toString()}.
     * 
     * Checks if the returned string is the expected one.
     */
    @Test
    public void testToStringTest() {
        String msg = "{ ((A) -> (B, C)), ((B, C) -> (A)), ((B, C, D) -> (E)), ((E) -> (C)) }";
        assertEquals(msg, dfJoint.toString());
    }

    /**
     * Test method for {@link datastructures.FDSet#toString()}.
     * 
     * Checks that "null" is returned if FDSet is null.
     */
    @Test
    public void testToStringNullValuesObject() {
        assertEquals("null", nullDFJoint.toString());
    }
    
    /**
     * Test method for {@link datastructures.FDSet#getSize()}.
     * 
     * Checks that FDSet size is four.
     */
    @Test
    public void testGetSizeDFJoint() {
        assertEquals(4, dfJoint.getSize());
    }
    
    /**
     * Test method for {@link datastructures.FDSet#getSize()}.
     * 
     * Checks that zero is returned if FDSet is null.
     */
    @Test
    public void testGetSizeNullDFJoint() {
        assertEquals(0, nullDFJoint.getSize());
    }
    
    /**
     * Test method for {@link datastructures.FDSet#getSize()}.
     * 
     * Sets a FDSet to null, then checks if returned size is zero.
     */
    @Test
    public void testGetSizeNullDfJointVector() {
        nullDFJoint.setDFJoint(null);
        assertEquals(0, nullDFJoint.getSize());
    }
    
    /**
     * Test method for {@link datastructures.FDSet#removeDF(ADependency)}.
     * 
     * Removes A to BC dependency, checks that it is not more present.
     */
    @Test 
    public void testRemoveDFJointOneMinusAtoBC() {
        this.dfJoint.removeDF(this.setUpObject.funcDepAtoBC());
        assertEquals(this.setUpObject.dfJoint1MinusAtoBC(), this.dfJoint);
    }
    
    /**
     * Test method for {@link datastructures.FDSet#removeDF(ADependency)}.
     * Removes B to C dependency, checks that it is not more present.
     */
    @Test
    public void testRemoveDFJointFiveMinusBtoC() {
        this.dfJoint = this.setUpObject.dfJoint05();
        this.dfJoint.removeDF(this.setUpObject.funcDepBtoC());
        assertEquals(this.setUpObject.dfJoint5MinusBtoC(), this.dfJoint);
    }
    
    /**
     * Test method for {@link datastructures.FDSet#removeDF(ADependency)}.
     * Tries to remove DE to C dependency if a FDSet where it is not present.
     */
    @Test
    public void testRemoveDFJointAnNonExistentFD() {
        FDSet dfJointCopy = new FDSet(this.dfJoint);
        this.dfJoint.removeDF(this.setUpObject.funcDepDEtoC());
        assertEquals(dfJointCopy, this.dfJoint);
    }
    
    /**
     * Test method for {@link datastructures.FDSet#removeDF(ADependency)}.
     * Remove B to C and leave it with zero dependencies.
     */
    @Test
    public void testRemoveDFJointTwentyTwoAndLeaveItEmpty() {
        this.dfJoint = this.setUpObject.dfJoint22();
        this.dfJoint.removeDF(this.setUpObject.funcDepBtoC());
        assertEquals("null", this.dfJoint.toString());
        assertEquals(this.nullDFJoint, this.dfJoint);
    }
    
    /**
     * Test method for {@link datastructures.FDSet#removeDF(ADependency)}.
     * Tries to remove a dependency from a null FDSet
     */
    @Test
    public void testRemoveDFJointException() {
        this.nullDFJoint.removeDF(this.one);
    }
    
    /**
     * Test method for {@link datastructures.FDSet#getAttributesDFJoint()}.
     * Checks if FDSet return list is {A, B, C, D, E}.
     */
    @Test
    public void testGetAttributesDFJointTest() {
        AttributeSet attrJointFromDF = dfJoint.getAttributesDFJoint();
        AttributeSet attrJoint = this.setUpObject.attrJntABCDE();
        assertEquals(attrJoint, attrJointFromDF);
    }
    
    /**
     * Test method for {@link datastructures.FDSet#getAttributesDFJoint()}.
     * Checks if FDSet return list is {A, B, C}.
     */
    @Test
    public void testGetAttributesFirstDFJointTest() {
        AttributeSet attrJointFromDF = firstDFJoint.getAttributesDFJoint();
        AttributeSet attrJoint = this.setUpObject.attrJntABC();
        assertEquals(attrJoint, attrJointFromDF);
    }
    
    /**
     * Test method for {@link datastructures.FDSet#getAttributesDFJoint()}.
     * Checks if FDSet return list is {A, B, C}.
     */
    @Test
    public void testGetAttributesSecondDFJointTest() {
        AttributeSet attrJointFromDF = secondDFJoint.getAttributesDFJoint();
        AttributeSet attrJoint = this.setUpObject.attrJntABC();
        assertEquals(attrJoint, attrJointFromDF);
    }
    
    /**
     * Test method for {@link datastructures.FDSet#isImplied(FDSet)}.
     * Checks if firstDFJoint is implied by secondDFJoint, result true.
     */ 
    @Test
    public void testIsImpliedTrueFirstToSecondDFJoint() {
        assertTrue(firstDFJoint.isImplied(secondDFJoint));
    }
    
    /**
     * Test method for {@link datastructures.FDSet#isImplied(FDSet)}.
     * Checks if secondDFJoint is implied by firstDFJoint, result true.
     */
    @Test
    public void testIsImpliedTrueSecondToFirstDFJoint() {
        assertTrue(secondDFJoint.isImplied(firstDFJoint));
    }
    
    /**
     * Test method for {@link datastructures.FDSet#isImplied(FDSet)}.
     * Checks if dfJoint is implied by firstDFJoint, result false.
     */
    @Test
    public void testIsImpliedFalseDFJointObjectToFirsDFJoint() {
        assertFalse(dfJoint.isImplied(firstDFJoint));
    }
    
    /**
     * Test method for {@link datastructures.FDSet#removeAttribute(RareElement)}.
     * Removes C in {A} -> {BC} in {A -> BC, B -> C, A -> B, AB -> C}
     * Result: {A -> B, B -> C, AB -> C}
     */
    @Test
    public void testRemoveAttributeCinAtoBCDFJoint4Consequent() {
        this.firstDFJoint.removeAttribute(this.setUpObject.rareElementCinAtoBCDFJoint4Consequent());
        assertEquals(this.setUpObject.dfJoint4ReGroupedWithoutCinAtoBC(), this.firstDFJoint);
    }

    /**
     * Test method for {@link datastructures.FDSet#removeAttribute(RareElement)}.
     * Removes A in {A, B} -> {C} in {A -> BC, B -> C, A -> B, AB -> C}
     * Result: {A -> BC, B -> C}
     */
    @Test
    public void testRemoveAttributeAinABtoCDFJoint4Antecedent() {
        this.firstDFJoint.removeAttribute(this.setUpObject.rareElementAinABtoCDFJoint4Antecedent());
        assertEquals(this.setUpObject.dfJoint4RegroupedWithoutAinABtoC(), this.firstDFJoint);
    }
    
    /**
     * Test method for {@link datastructures.FDSet#removeAttribute(RareElement)}.
     * Removes B in {A, B} -> {C} in {A -> BC, B -> C, A -> B, AB -> C}
     * Result: {A -> BC, B -> C}
     */
    @Test
    public void testRemoveAttributeBinABtoCDFJoint4Antecedent() {
        this.firstDFJoint.removeAttribute(this.setUpObject.rareElementBinABtoCDFJoint4Antecedent());
        assertEquals(this.setUpObject.dfJoint4RegroupedWithoutAinABtoC(), this.firstDFJoint);
    }

    /**
     * Test method for {@link datastructures.FDSet#removeAttribute(RareElement)}.
     * Removes C in {A} -> {B, C} in {A -> BC, B -> C, AB -> C}
     * Result: {A -> B, B -> C, AB -> C}
     */
    @Test
    public void testRemoveAinttributeCinAtoBCDFJoint24Consequent() {
        FDSet newDFjoint = this.setUpObject.dfJoint24();
        newDFjoint.removeAttribute(this.setUpObject.rareElementCinAtoBCDFJoint24Consequent());
        assertEquals(this.setUpObject.dfJoint4ReGroupedWithoutCinAtoBC(), newDFjoint);
    }

    /**
     * Test method for {@link datastructures.FDSet#removeAttribute(RareElement)}.
     * Removes A in {A, B} -> {C} in {A -> BC, B -> C, AB -> C}
     * Result: {A -> BC, B -> C}
     */
    @Test
    public void testRemoveAttributeAinABtoCDFJoint24Antecedent() {
        FDSet newDFjoint = this.setUpObject.dfJoint24();
        newDFjoint.removeAttribute(this.setUpObject.rareElementAinABtoCDFJoint24Antecedent());
        assertEquals(this.setUpObject.dfJoint4RegroupedWithoutAinABtoC(), newDFjoint);
    }
    
    /**
     * Test method for {@link datastructures.FDSet#removeAttribute(RareElement)}.
     * Removes A in {A, B} -> {C} in {A -> BC, B -> C, AB -> C}
     * Result: {A -> BC, B -> C}
     */
    @Test
    public void testRemoveAttributeBinABtoCDFJoint24Antecedent() {
        FDSet newDFjoint = this.setUpObject.dfJoint24();
        newDFjoint.removeAttribute(this.setUpObject.rareElementBinABtoCDFJoint24Antecedent());
        assertEquals(this.setUpObject.dfJoint4RegroupedWithoutAinABtoC(), newDFjoint);
    }
    
    /**
     * Test method for {@link datastructures.FDSet#removeRareAttributes(boolean)}.
     * Removes all rare attribute in {A -> BC, B -> C, AB -> C}
     * Result: {A -> B, B -> C}
     */
    @Test
    public void removeRareAttributesAutoDFJoint24() {
        FDSet expected = this.setUpObject.dfJoint05();
        FDSet toBeMinimal = this.setUpObject.dfJoint24();
        toBeMinimal.removeRareAttributes(true);
        assertEquals(expected, toBeMinimal);
    }
    
    /**
     * Test method for {@link datastructures.FDSet#removeRareAttributes(boolean)}.
     * Removes all rare attribute in {A -> BC, B -> C, A -> B, AB -> C}
     * Result: {A -> B, B -> C}
     */
    @Test
    public void removeRareAttributesAutoDFJoint4() {
        FDSet expected = this.setUpObject.dfJoint05();
        FDSet toBeMinimal = this.setUpObject.dfJoint04();
        toBeMinimal.removeRareAttributes(true);
        assertEquals(expected, toBeMinimal);
    }
    
    /**
     * Test method for {@link datastructures.FDSet#isMinimal()}.
     * Checks if {A -> BC, B -> C, A -> B, AB -> C} is minimal.
     * Result: False.
     */
    @Test
    public void testIsMinimalDFJoint4() {
        assertFalse(this.firstDFJoint.isMinimal());
    }
    
    /**
     * Test method for {@link datastructures.FDSet#isMinimal()}.
     * Checks if {A -> BC, B -> C, AB -> C} is minimal.
     * Result: False.
     */
    @Test
    public void testIsMinimalDFJoint24() {
        this.dfJoint = this.setUpObject.dfJoint24();
        assertFalse(this.dfJoint.isMinimal());
    }
    
    /**
     * Test method for {@link datastructures.FDSet#isMinimal()}.
     * Checks if {A -> BC, BC -> A, BCD -> E, E -> C} is minimal.
     * Result: True.
     */
    @Test
    public void testIsMinimalDFJoint1() {
        this.dfJoint = this.setUpObject.dfJoint01();
        assertTrue(this.dfJoint.isMinimal());
    }
    
    /**
     * Test method for {@link datastructures.FDSet#isMinimal()}.
     * Checks if {A -> BC, BC -> A, BCD -> E, E -> C} is minimal.
     * Result: True.
     */
    @Test
    public void testIsMinimalDFJoint2() {
        this.dfJoint = this.setUpObject.dfJoint02();
        assertTrue(this.dfJoint.isMinimal());
    }
    
    /**
     * Test method for {@link datastructures.FDSet#isMinimal()}.
     * Checks if {AB -> C, C -> AB, E -> D, D -> E, E -> F, F -> E, ABD -> G, CF -> H} is minimal.
     * Result: True.
     */
    @Test
    public void testIsMinimalDFJoint3() {
        this.dfJoint = this.setUpObject.dfJoint03();
        assertTrue(this.dfJoint.isMinimal());
    }
    
    /**
     * Test method for {@link datastructures.FDSet#isMinimal()}.
     * Checks if {AB -> C, C -> AB, E ->DF, D -> E, F -> E, ABD -> G, CF -> H} is minimal.
     * Result: True.
     */
    @Test
    public void testIsMinimalDFJoint23() {
        this.dfJoint = this.setUpObject.dfJoint23();
        assertTrue(this.dfJoint.isMinimal());
    }
    
    /**
     * Test method for {@link datastructures.FDSet#isMinimal()}.
     * Checks if {A -> BCD} is minimal.
     * Result: True.
     */
    @Test
    public void testIsMinimalDFJoint28() {
        this.dfJoint = this.setUpObject.dfJoint28();
        assertTrue(this.dfJoint.isMinimal());
    }
    
    /**
     * Test method for {@link datastructures.FDSet#getNonBCNFDFs(Relation)}.
     * Checks if FDSet of {ABCDE} {A -> BC, BC -> A, BCD -> E, E -> C}
     * returns non BCNF dependencies {A -> BC, BC -> A, E -> C}.
     */
    @Test
    public void testGetNonBCNFDFsDFJoint1() {
        List<ADependency> expected = this.setUpObject.listNonBCNFDFJoint1();
        this.dfJoint = this.setUpObject.dfJoint01();
        assertEquals(expected, this.dfJoint.getNonBCNFDFs(this.setUpObject.relation01()));    
    }
    
    /**
     * Test method for {@link datastructures.FDSet#getNonBCNFDFs(Relation)}.
     * Checks if FDSet of {ABCDE} {A -> BC, BC -> E, CD -> A}
     * returns non BCNF dependencies {A -> BC, BC -> E}.
     */
    @Test
    public void testGetNonBCNFDFsDFJoint2() {
        List<ADependency> expected = this.setUpObject.listNonBCNFDFJoint2();      
        this.dfJoint = this.setUpObject.dfJoint02();
        assertEquals(expected, this.dfJoint.getNonBCNFDFs(this.setUpObject.relation02()));    
    }
    
    /**
     * Test method for {@link datastructures.FDSet#getNonBCNFDFs(Relation)}.
     * Checks if FDSet of {ABCDEFGH} {AB -> C, C -> AB, E -> D, D -> E, E -> F, F -> E, ABD -> G, CF -> H}
     * returns non BCNF dependencies {ABD -> G, CF -> H}.
     */
    @Test
    public void testGetNonBCNFDFsDFJoint3() {
        List<ADependency> expected = this.setUpObject.listNonBCNFDFJoint3();      
        this.dfJoint = this.setUpObject.dfJoint03();
        assertEquals(expected, this.dfJoint.getNonBCNFDFs(this.setUpObject.relation03()));    
    }
    
    /**
     * Test method for {@link datastructures.FDSet#getNonBCNFDFs(Relation)}.
     * Checks if FDSet of {ABC} {A -> BC, B -> C, A -> B, AB -> C}
     * returns non BCNF dependencies {B -> C}.
     */
    @Test
    public void testGetNonBCNFDFsDFJoint4() {
        List<ADependency> expected = this.setUpObject.listNonBCNFDFJoint4and5();        
        this.dfJoint = this.setUpObject.dfJoint04();
        assertEquals(expected, this.dfJoint.getNonBCNFDFs(this.setUpObject.relation04()));
    }
    
    /**
     * Test method for {@link datastructures.FDSet#getNonBCNFDFs(Relation)}.
     * Checks if FDSet of {ABC} {A -> B, B -> C}
     * returns non BCNF dependencies {B -> C}.
     */
    @Test
    public void testGetNonBCNFDFsDFJoint5() {
        List<ADependency> expected = this.setUpObject.listNonBCNFDFJoint4and5();        
        this.dfJoint = this.setUpObject.dfJoint05();
        assertEquals(expected, this.dfJoint.getNonBCNFDFs(this.setUpObject.relation05()));    
    }
    
    /**
     * Test method for {@link datastructures.FDSet#getNonBCNFDFs(Relation)}.
     * Checks if FDSet of {ABCDE}  {AB -> D, B -> C, C -> B, B -> E}
     * returns non BCNF dependencies {B -> C, C -> B, B -> E}.
     */
    @Test
    public void testGetNonBCNFDFsDFJoint6() {
        List<ADependency> expected = this.setUpObject.listNonBCNFDFJoint6();      
        this.dfJoint = this.setUpObject.dfJoint06();
        assertEquals(expected, this.dfJoint.getNonBCNFDFs(this.setUpObject.relation06()));    
    }
    
    /**
     * Test method for {@link datastructures.FDSet#getNonBCNFDFs(Relation)}.
     * Checks if FDSet of {ABCD}  {A -> B, B -> C, C -> D}
     * returns non BCNF dependencies {B -> C, C -> D}.
     */
    @Test
    public void testGetNonBCNFDFsDFJoint7() {
        List<ADependency> expected = this.setUpObject.listNonBCNFDFJoint7();      
        this.dfJoint = this.setUpObject.dfJoint07();
        assertEquals(expected, this.dfJoint.getNonBCNFDFs(this.setUpObject.relation07()));
    }
    
    /**
     * Test method for {@link datastructures.FDSet#getNonBCNFDFs(Relation)}.
     * Checks if FDSet of {ABCD} {B -> C, AB -> D, C -> B}
     * returns non BCNF dependencies {B -> C, C -> B}.
     */
    @Test
    public void testGetNonBCNFDFsDFJoint8() {
        List<ADependency> expected = this.setUpObject.listNonBCNFDFJoint8();      
        this.dfJoint = this.setUpObject.dfJoint08();
        assertEquals(expected, this.dfJoint.getNonBCNFDFs(this.setUpObject.relation08()));    
    }
    
    /**
     * Test method for {@link datastructures.FDSet#getNonBCNFDFs(Relation)}.
     * Checks if FDSet of {ABC} {AB -> C}
     * returns non BCNF dependencies {}.
     */
    @Test
    public void testGetNonBCNFDFsDFJoint9() {
        List<ADependency> expected = new ArrayList<>();
        this.dfJoint = this.setUpObject.dfJoint09();
        assertEquals(expected, this.dfJoint.getNonBCNFDFs(this.setUpObject.relation09()));
    }
    
    /**
     * Test method for {@link datastructures.FDSet#getNon3NFDFs(Relation)}.
     * Checks if FDSet of {ABCDE} {A -> BC, BC -> A, BCD -> E, E -> C}
     * returns non 3NF dependencies {}.
     */
    @Test
    public void testGetNon3NFDFsDFJoint1() {
        List<ADependency> expected = new ArrayList<>();
        this.dfJoint = this.setUpObject.dfJoint01();
        assertEquals(expected, this.dfJoint.getNon3NFDFs(this.setUpObject.relation01())); 
    }
    
    /**
     * Test method for {@link datastructures.FDSet#getNon3NFDFs(Relation)}.
     * Checks if FDSet of {ABCDE} {A -> BC, BC -> E, CD -> A}
     * returns non 3NF dependencies {A -> BC, BC -> E}.
     */
    @Test
    public void testGetNon3NFDFsDFJoint2() {
        List<ADependency> expected = new ArrayList<>();
        expected.add(this.setUpObject.funcDepAtoBC());
        expected.add(this.setUpObject.funcDepBCtoE());
        this.dfJoint = this.setUpObject.dfJoint02();
        assertEquals(expected, this.dfJoint.getNon3NFDFs(this.setUpObject.relation02())); 
    }
    
    /**
     * Test method for {@link datastructures.FDSet#getNon3NFDFs(Relation)}.
     * Checks if FDSet of {ABCDEFGH} {AB -> C, C -> AB, E -> D, D -> E, E -> F, F -> E, ABD -> G, CF -> H}
     * returns non 3NF dependencies {}.
     */
    @Test
    public void testGetNon3NFDFsDFJoint3() {
        List<ADependency> expected = new ArrayList<>();
        this.dfJoint = this.setUpObject.dfJoint03();
        assertEquals(expected, this.dfJoint.getNon3NFDFs(this.setUpObject.relation03())); 
    }
    
    /**
     * Test method for {@link datastructures.FDSet#getNon3NFDFs(Relation)}.
     * Checks if FDSet of {ABC} {A -> BC, B -> C, A -> B, AB -> C}
     * returns non 3NF dependencies {B -> C}.
     */
    @Test
    public void testGetNon3NFDFsDFJoint4() {
        List<ADependency> expected = new ArrayList<>();
        expected.add(this.setUpObject.funcDepBtoC());
        this.dfJoint = this.setUpObject.dfJoint04();
        assertEquals(expected, this.dfJoint.getNon3NFDFs(this.setUpObject.relation04()));
    }
    
    /**
     * Test method for {@link datastructures.FDSet#getNon3NFDFs(Relation)}.
     * Checks if FDSet of {ABC} {A -> B, B -> C}
     * returns non 3NF dependencies {B -> C}.
     */
    @Test
    public void testGetNon3NFDFsDFJoint5() {
        List<ADependency> expected = new ArrayList<>();
        expected.add(this.setUpObject.funcDepBtoC());
        this.dfJoint = this.setUpObject.dfJoint05();
        assertEquals(expected, this.dfJoint.getNon3NFDFs(this.setUpObject.relation05())); 
    }
    
    /**
     * Test method for {@link datastructures.FDSet#getNon3NFDFs(Relation)}.
     * Checks if FDSet of {ABCDE}  {AB -> D, B -> C, C -> B, B -> E}
     * returns non 3NF dependencies {B -> E}.
     */
    @Test
    public void testGetNon3NFDFsDFJoint6() {
        List<ADependency> expected = new ArrayList<>();
        expected.add(this.setUpObject.funcDepBtoE());
        this.dfJoint = this.setUpObject.dfJoint06();
        assertEquals(expected, this.dfJoint.getNon3NFDFs(this.setUpObject.relation06())); 
    }
    
    /**
     * Test method for {@link datastructures.FDSet#getNon3NFDFs(Relation)}.
     * Checks if FDSet of {ABCD}  {A -> B, B -> C, C -> D}
     * returns non 3NF dependencies {B -> C, C -> D}.
     */
    @Test
    public void testGetNon3NFDFsDFJoint7() {
        List<ADependency> expected = new ArrayList<>();
        expected.add(this.setUpObject.funcDepBtoC());
        expected.add(this.setUpObject.funcDepCtoD());
        this.dfJoint = this.setUpObject.dfJoint07();
        assertEquals(expected, this.dfJoint.getNon3NFDFs(this.setUpObject.relation07()));
    }
    
    /**
     * Test method for {@link datastructures.FDSet#getNon3NFDFs(Relation)}.
     * Checks if FDSet of {ABCD} {B -> C, AB -> D, C -> B}
     * returns non 3NF dependencies {}.
     */
    @Test
    public void testGetNon3NFDFsDFJoint8() {
        List<ADependency> expected = new ArrayList<>();
        this.dfJoint = this.setUpObject.dfJoint08();
        assertEquals(expected, this.dfJoint.getNon3NFDFs(this.setUpObject.relation08())); 
    }
    
    /**
     * Test method for {@link datastructures.FDSet#getNon3NFDFs(Relation)}.
     * Checks if FDSet of {ABC} {AB -> C}
     * returns non 3NF dependencies {}.
     */
    @Test
    public void testGetNon3NFDFsDFJoint9() {
        List<ADependency> expected = new ArrayList<>();
        this.dfJoint = this.setUpObject.dfJoint09();
        assertEquals(expected, this.dfJoint.getNon3NFDFs(this.setUpObject.relation09()));
    }

}
