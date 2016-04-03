/**
 * 
 */
package datastructures;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Pavel Nichita
 *
 */
public class RelationCalculateKeyTest {
    private SetUpClass setUpObject;
    
    /**
     * Set up.
     */
    @Before
    public void setUp() {
        this.setUpObject = new SetUpClass();
    }

    /**
     * Test method for {@link datastructures.Relation#calculateKeyJoint()}.
     * Relation: ABCDE, {A -> BC, BC -> A, BCD -> E, E -> C}
     * KeyJoint result: {AD, BCD, BDE}
     */
    @Test
    public void testCalculateKeyJoint() {
        assertEquals(this.setUpObject.keyJointAdBcdBde(), this.setUpObject.relation01().calculateKeyJoint());
    }
    
    /**
     * Test method for {@link datastructures.Relation#calculateKeyJoint()}.
     * Relation: ABCDE, {A -> BC, BC -> E, CD -> A}
     * KeyJoint result: {AD, CD}
     */
    @Test
    public void testCalculateKeyJointRelationTwo() {
        assertEquals(this.setUpObject.keyJointAdCd(), this.setUpObject.relation02().calculateKeyJoint());
    }
    
    /**
     * Test method for {@link datastructures.Relation#calculateKeyJoint()}.
     * Relation: ABCDEFGH, {AB -> C, C -> AB, E -> D, D -> E, E -> F, F -> E, ABD -> G, CF -> H}
     * KeyJoint result: {CD, CE, CF, ABD, ABE, ABF}
     */
    @Test
    public void testCalculateKeyJointRelationThree() {
        assertEquals(this.setUpObject.keyJointCdCeCfAbdAbeAbf(), this.setUpObject.relation03().calculateKeyJoint());
    }
    
    /**
     * Test method for {@link datastructures.Relation#calculateKeyJoint()}.
     * Relation: ABC, {A -> BC, B -> C, A -> B, AB -> C}
     * KeyJoint result: {A}
     */
    @Test
    public void testCalculateKeyJointRelationFour() {
        assertEquals(this.setUpObject.keyJointA(), this.setUpObject.relation04().calculateKeyJoint());
    }
    
    /**
     * Test method for {@link datastructures.Relation#calculateKeyJoint()}.
     * Relation: ABC, {A -> B, B -> C}
     * KeyJoint result: {A}
     */
    @Test
    public void testCalculateKeyJointRelationFive() {
        assertEquals(this.setUpObject.keyJointA(), this.setUpObject.relation05().calculateKeyJoint());
    }
    
    /**
     * Test method for {@link datastructures.Relation#calculateKeyJoint()}.
     * Relation: ABCDE, {AB -> D, B -> C, C -> B, B -> E}
     * KeyJoint result: {AB, AC}
     */
    @Test
    public void testCalculateKeyJointRelationSix() {
        assertEquals(this.setUpObject.keyJointAbAc(), this.setUpObject.relation06().calculateKeyJoint());
    }
    
    /**
     * Test method for {@link datastructures.Relation#calculateKeyJoint()}.
     * Relation: ABCD, {A -> B, B -> C, C -> D}
     * KeyJoint result: {A}
     */
    @Test
    public void testCalculateKeyJointRelationSeven() {
        assertEquals(this.setUpObject.keyJointA(), this.setUpObject.relation07().calculateKeyJoint());
    }
    
    /**
     * Test method for {@link datastructures.Relation#calculateKeyJoint()}.
     * Relation: ABCD, {B -> C, AB -> D, C -> B}
     * KeyJoint result: {AB, AC}
     */
    @Test
    public void testCalculateKeyJointRelationEight() {
        assertEquals(this.setUpObject.keyJointAbAc(), this.setUpObject.relation08().calculateKeyJoint());
    }
    
    /**
     * Test method for {@link datastructures.Relation#calculateKeyJoint()}.
     * Relation: ABC, {AB -> C}
     * KeyJoint result: {AB}
     */
    @Test
    public void testCalculateKeyJointRelationNine() {
        assertEquals(this.setUpObject.keyJointAb(), this.setUpObject.relation09().calculateKeyJoint());
    }
}
