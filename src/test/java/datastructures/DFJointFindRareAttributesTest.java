/**
 * 
 */
package datastructures;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Pavel Nichita
 *
 */
public class DFJointFindRareAttributesTest {
    private List<RareElement> rareAttributesVector;
    private SetUpClass setUpObject;
    
    /**
     * Set up.
     */
    @Before
    public void setUp()  {
        this.rareAttributesVector = new ArrayList<>();
        this.setUpObject = new SetUpClass();
    }

    /**
     * Test method for {@link datastructures.DFJoint#findRareAttributes()}.
     * Checks that there is no rare attributes in 
     * {A -> BC, BC -> A, BCD -> E, E -> C}.
     */
    @Test
    public void testFindRareAttributesDFJointOne() {
        assertEquals(this.rareAttributesVector,
                     this.setUpObject.dfJoint01().findRareAttributes());
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#findRareAttributes()}.
     * Checks that in DFJoint {A -> BC, B -> C, AB -> C}
     * finds rare attributes:
     *  C in {A} -> {B, C}, consequent,
     *  A in {A, B} -> {C}, antecedent,
     *  B in {A, B} -> {C}, antecedent.
     */
    @Test
    public void testFindRareAttributesDFJointTwentyFour() {
        this.rareAttributesVector.add( new RareElement(
                this.setUpObject.attrC(),
                this.setUpObject.funcDepAtoBC(),
                this.setUpObject.dfJoint24(),
                "Consequent"));
        this.rareAttributesVector.add( new RareElement(
                this.setUpObject.attrA(),
                this.setUpObject.funcDepABtoC(),
                this.setUpObject.dfJoint24(),
                "Antecedent"));
        this.rareAttributesVector.add( new RareElement(
                this.setUpObject.attrB(),
                this.setUpObject.funcDepABtoC(),
                this.setUpObject.dfJoint24(),
                "Antecedent"));
        
        assertEquals(this.rareAttributesVector,
                this.setUpObject.dfJoint24().findRareAttributes());
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#findRareAttributes()}.
     * Checks that there is no rare attributes in 
     * {A -> BC, BC -> E, CD -> A}.
     */
    @Test
    public void testFindRareAttributesDFJointTwo() {
        assertEquals(this.rareAttributesVector,
                this.setUpObject.dfJoint02().findRareAttributes());
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#findRareAttributes()}.
     * Checks that there is no rare attributes in 
     * {AB -> C, C -> AB, E -> D, D -> E, E -> F, F -> E, ABD -> G, CF -> H}.
     */
    @Test
    public void testFindRareAttributesDFJointThree() {
        assertEquals(this.rareAttributesVector,
                this.setUpObject.dfJoint03().findRareAttributes());
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#findRareAttributes()}.
     * Checks that in DFJoint {A -> BC, B -> C, A -> B, AB -> C}
     * finds rare attributes:
     *  B in {A} -> {B, C}, consequent,
     *  C in {A} -> {B, C}, consequent,
     *  A in {A, B} -> {C}, antecedent,
     *  B in {A, B} -> {C}, antecedent.
     */
    @Test
    public void testFindRareAttributesDFJointFour() {
        this.rareAttributesVector.add(new RareElement(
                this.setUpObject.attrB(),
                this.setUpObject.funcDepAtoBC(),
                this.setUpObject.dfJoint04(),
                "Consequent")
        );
        this.rareAttributesVector.add(new RareElement(
                this.setUpObject.attrC(),
                this.setUpObject.funcDepAtoBC(),
                this.setUpObject.dfJoint04(),
                "Consequent")
        );
        this.rareAttributesVector.add(new RareElement(
                this.setUpObject.attrA(),
                this.setUpObject.funcDepABtoC(),
                this.setUpObject.dfJoint04(),
                "Antecedent")
        );
        this.rareAttributesVector.add(new RareElement(
                this.setUpObject.attrB(),
                this.setUpObject.funcDepABtoC(),
                this.setUpObject.dfJoint04(),
                "Antecedent")
        );
        
        assertEquals(this.rareAttributesVector,
                this.setUpObject.dfJoint04().findRareAttributes());
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#findRareAttributes()}.
     * Checks that there is no rare attributes in 
     * {AB -> D, B -> C, C -> B, B -> E}.
     */
    @Test
    public void testFindRareAttributesDFJointSix() {
        assertEquals(this.rareAttributesVector,
                this.setUpObject.dfJoint06().findRareAttributes());
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#findRareAttributes()}.
     * Checks that there is no rare attributes in 
     * {B -> C, AB -> D, C -> B}.
     */
    @Test
    public void testFindRareAttributesDFJointEight() {
        assertEquals(this.rareAttributesVector,
                this.setUpObject.dfJoint08().findRareAttributes());
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#findRareAttributes()}.
     * Checks that there is no rare attributes in 
     * {A -> BC, BC -> A, BCD -> E, E -> C}.
     */
    @Test
    public void testFindRareAttributesDFJointNine() {
        assertEquals(this.rareAttributesVector,
                this.setUpObject.dfJoint09().findRareAttributes());
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#findRareAttributes()}.
     * Checks that there is no rare attributes in 
     * {AB -> C}.
     */
    @Test
    public void testFindRareAttributesDFJointTen() {
        assertEquals(this.rareAttributesVector,
                this.setUpObject.dfJoint10().findRareAttributes());
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#findRareAttributes()}.
     * Checks that there is no rare attributes in 
     * {A -> B, CD -> A, BD -> C, DE -> C}.
     */
    @Test
    public void testFindRareAttributesDFJointTwelve() {
        assertEquals(this.rareAttributesVector,
                this.setUpObject.dfJoint12().findRareAttributes());
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#findRareAttributes()}.
     * Checks that there is no rare attributes in 
     * {CD -> A, AD -> C, DE -> C}
     */
    @Test
    public void testFindRareAttributesDFJointFourteen() {
        assertEquals(this.rareAttributesVector,
                this.setUpObject.dfJoint14().findRareAttributes());
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#findRareAttributes()}.
     * Checks that there is no rare attributes in 
     * {CD -> A, AD -> C}
     */
    @Test
    public void testFindRareAttributesDFJointFifteen() {
        assertEquals(this.rareAttributesVector,
                this.setUpObject.dfJoint15().findRareAttributes());
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#findRareAttributes()}.
     * Checks that there is no rare attributes in 
     * {DE -> C}.
     */
    @Test
    public void testFindRareAttributesDFJointSixteen() {
        assertEquals(this.rareAttributesVector,
                this.setUpObject.dfJoint16().findRareAttributes());
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#findRareAttributes()}.
     * Checks that there is no rare attributes in 
     * {BCD -> E, E -> C}.
     */
    @Test
    public void testFindRareAttributesDFJointSeventeen() {
        assertEquals(this.rareAttributesVector,
                this.setUpObject.dfJoint17().findRareAttributes());
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#findRareAttributes()}.
     * Checks that there is no rare attributes in 
     * {AB -> C, C -> B}.
     */
    @Test
    public void testFindRareAttributesDFJointNineteen() {
        assertEquals(this.rareAttributesVector,
                this.setUpObject.dfJoint19().findRareAttributes());
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#findRareAttributes()}.
     * Checks that there is no rare attributes in 
     * {AB -> C, C -> AB, E ->DF, D -> E, F -> E, ABD -> G, CF -> H}.
     */
    @Test
    public void testFindRareAttributesDFJointTwentyThree() {
        assertEquals(this.rareAttributesVector,
                this.setUpObject.dfJoint23().findRareAttributes());
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#findRareAttributes()}.
     * Checks that there is no rare attributes in 
     * {A -> BC, D -> E}.
     */
    @Test
    public void testFindRareAttributesDFJointTwentySix() {
        assertEquals(this.rareAttributesVector,
                this.setUpObject.dfJoint26().findRareAttributes());
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#findRareAttributes()}.
     * Checks that there is no rare attributes in 
     * {AB -> D, B -> CE, C -> B}.
     */
    @Test
    public void testFindRareAttributesDFJointTwentySeven() {
        assertEquals(this.rareAttributesVector,
                this.setUpObject.dfJoint27().findRareAttributes());
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#findRareAttributes()}.
     * Checks that there is no rare attributes in 
     * {BC -> A, BCD -> E, E -> C}.
     */
    @Test
    public void testFindRareAttributesDFJointOneMinusAtoBC() {
        assertEquals(this.rareAttributesVector,
                this.setUpObject.dfJoint1MinusAtoBC().findRareAttributes());
    }
    
    /**
     * Test method for {@link datastructures.DFJoint#findRareAttributes()}.
     * Checks that there is no rare attributes in 
     * {A -> BCD}.
     */
    @Test
    public void testFindRareAttributesDFJointTwentyEight() {
        assertEquals(this.rareAttributesVector,
                this.setUpObject.dfJoint28().findRareAttributes());
    }

}

