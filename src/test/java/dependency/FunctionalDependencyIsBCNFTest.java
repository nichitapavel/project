/**
 * 
 */
package dependency;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import datastructures.Relation;
import datastructures.SetUpClass;

/**
 * @author Pavel Nichita
 *
 */
public class FunctionalDependencyIsBCNFTest {
    private SetUpClass setUpObject;
    
    /**
     * Set up.
     */
    @Before
    public void setUp() {
        this.setUpObject = new SetUpClass();
    }

    /**
     * Test method for {@link dependency.FunctionalDependency#isBCNF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {BCD -> E} is BCNF in {ABCDE} {A -> BC, BC -> A, BCD -> E, E -> C} with keys {AD, BCD, BDE}.
     * Result: true, Tip: is BCNF.
     */
    @Test
    public void testIsBCNF() {
        ADependency funcDep = this.setUpObject.funcDepBCDtoE();
        Relation relationOne = this.setUpObject.relation01(); 
        assertTrue(funcDep.isBCNF(relationOne));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#isBCNF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {CD -> A} is BCNF in {ABCDE} {A -> BC, BC -> E, CD -> A} with keys {AD, CD}.
     * Result: true, Tip: is BCNF.
     */
    @Test
    public void testIsBCNFTrueCDtoAInRelationTwo() {
        ADependency funcDep = this.setUpObject.funcDepCDtoA();
        Relation relation = this.setUpObject.relation02(); 
        assertTrue(funcDep.isBCNF(relation));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#isBCNF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {ABD -> G} is BCNF in {ABCDEFGH} {AB -> C, C -> AB, E -> D, D -> E, E -> F, F -> E, ABD -> G, CF -> H} with keys {CD, CE, CF, ABD, ABE, ABF}.
     * Result: true, Tip: is BCNF.
     */
    @Test
    public void testIsBCNFTrueABDtoGInRelationThree() {
        ADependency funcDep = this.setUpObject.funcDepABDtoG();
        Relation relation = this.setUpObject.relation03(); 
        assertTrue(funcDep.isBCNF(relation));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#isBCNF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {CF -> H} is BCNF in {ABCDEFGH} {AB -> C, C -> AB, E -> D, D -> E, E -> F, F -> E, ABD -> G, CF -> H} with keys {CD, CE, CF, ABD, ABE, ABF}.
     * Result: true, Tip: is BCNF.
     */
    @Test
    public void testIsBCNFTrueCFtoHInRelationThree() {
        ADependency funcDep = this.setUpObject.funcDepCFtoH();
        Relation relation = this.setUpObject.relation03(); 
        assertTrue(funcDep.isBCNF(relation));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#isBCNF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {A -> BC} is BCNF in {ABC} {A -> BC, B -> C, A -> B, AB -> C} with keys {A}.
     * Result: true, Tip: is BCNF.
     */
    @Test
    public void testIsBCNFTrueAtoBCInRelationFour() {
        ADependency funcDep = this.setUpObject.funcDepAtoBC();
        Relation relation = this.setUpObject.relation04(); 
        assertTrue(funcDep.isBCNF(relation));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#isBCNF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {A -> B} is BCNF in {ABC} {A -> BC, B -> C, A -> B, AB -> C} with keys {A}.
     * Result: true, Tip: is BCNF.
     */
    @Test
    public void testIsBCNFTrueAtoBInRelationFour() {
        ADependency funcDep = this.setUpObject.funcDepAtoB();
        Relation relation = this.setUpObject.relation04(); 
        assertTrue(funcDep.isBCNF(relation));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#isBCNF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {AB -> C} is BCNF in {ABC} {A -> BC, B -> C, A -> B, AB -> C} with keys {A}.
     * Result: true, Tip: is BCNF.
     */
    @Test
    public void testIsBCNFTrueABtoCInRelationFour() {
        ADependency funcDep = this.setUpObject.funcDepABtoC();
        Relation relation = this.setUpObject.relation04(); 
        assertTrue(funcDep.isBCNF(relation));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#isBCNF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {A -> B} is BCNF in {ABC} {A -> B, B -> C} with keys {A}.
     * Result: true, Tip: is BCNF.
     */
    @Test
    public void testIsBCNFTrueAtoBInRelationFive() {
        ADependency funcDep = this.setUpObject.funcDepAtoB();
        Relation relation = this.setUpObject.relation05(); 
        assertTrue(funcDep.isBCNF(relation));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#isBCNF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {AB -> D} is BCNF in {ABCDE} {AB -> D, B -> C, C -> B, B -> E} with keys {AB, AC}.
     * Result: true, Tip: is BCNF.
     */
    @Test
    public void testIsBCNFTrueABtoDInRelationSix() {
        ADependency funcDep = this.setUpObject.funcDepABtoD();
        Relation relation = this.setUpObject.relation06(); 
        assertTrue(funcDep.isBCNF(relation));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#isBCNF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {A -> B} is BCNF in {ABCD} {A -> B, B -> C, C -> D} with keys {A}.
     * Result: true, Tip: is BCNF.
     */
    @Test
    public void testIsBCNFTrueAtoBInRelationSeven() {
        ADependency funcDep = this.setUpObject.funcDepAtoB();
        Relation relation = this.setUpObject.relation07();
        assertTrue(funcDep.isBCNF(relation));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#isBCNF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {AB -> D} is BCNF in {ABCD} {B -> C, AB -> D, C -> B} with keys {AB, AC}.
     * Result: true, Tip: is BCNF.
     */
    @Test
    public void testIsBCNFTrueABtoDInRelationEight() {
        ADependency funcDep = this.setUpObject.funcDepABtoD();
        Relation relation = this.setUpObject.relation08();
        assertTrue(funcDep.isBCNF(relation));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#isBCNF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {AB -> C} is BCNF in {ABC} {AB -> C} with keys {AB}.
     * Result: true, Tip: is BCNF.
     */
    @Test
    public void testIsBCNFTrueABtoCInRelationNine() {
        ADependency funcDep = this.setUpObject.funcDepABtoC();
        Relation relation = this.setUpObject.relation09();
        assertTrue(funcDep.isBCNF(relation));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#isBCNF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {A -> BC} is BCNF in {ABCDE} {A -> BC, BC -> A, BCD -> E, E -> C} with keys {AD, BCD, BDE}.
     * Result: false, Tip: is 3NF.
     */
    @Test
    public void testIsBCNFTrueAtoBCInRelationOne() {
        ADependency funcDep = this.setUpObject.funcDepAtoBC();
        Relation relation = this.setUpObject.relation01();
        assertFalse(funcDep.isBCNF(relation));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#isBCNF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {BC -> A} is BCNF in {ABCDE} {A -> BC, BC -> A, BCD -> E, E -> C} with keys {AD, BCD, BDE}.
     * Result: false, Tip: is 3NF.
     */
    @Test
    public void testIsBCNFTrueBCtoAInRelationOne() {
        ADependency funcDep = this.setUpObject.funcDepBCtoA();
        Relation relation = this.setUpObject.relation01();
        assertFalse(funcDep.isBCNF(relation));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#isBCNF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {E -> C} is BCNF in {ABCDE} {A -> BC, BC -> A, BCD -> E, E -> C} with keys {AD, BCD, BDE}.
     * Result: false, Tip: is 3NF.
     */
    @Test
    public void testIsBCNFTrueEtoCInRelationOne() {
        ADependency funcDep = this.setUpObject.funcDepEtoC();
        Relation relation = this.setUpObject.relation01();
        assertFalse(funcDep.isBCNF(relation));
    }

    /**
     * Test method for {@link dependency.FunctionalDependency#isBCNF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {AB -> C} is BCNF in {ABCDEFGH} {AB -> C, C -> AB, E -> D, D -> E, E -> F, F -> E, ABD -> G, CF -> H} with keys {CD, CE, CF, ABD, ABE, ABF}.
     * Result: false, Tip: is 3NF.
     */
    @Test
    public void testIsBCNFTrueABtoCInRelationThree() {
        ADependency funcDep = this.setUpObject.funcDepABtoC();
        Relation relation = this.setUpObject.relation03();
        assertFalse(funcDep.isBCNF(relation));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#isBCNF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {C -> AB} is BCNF in {ABCDEFGH} {AB -> C, C -> AB, E -> D, D -> E, E -> F, F -> E, ABD -> G, CF -> H} with keys {CD, CE, CF, ABD, ABE, ABF}.
     * Result: false, Tip: is 3NF.
     */
    @Test
    public void testIsBCNFTrueCtoABInRelationThree() {
        ADependency funcDep = this.setUpObject.funcDepCtoAB();
        Relation relation = this.setUpObject.relation03();
        assertFalse(funcDep.isBCNF(relation));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#isBCNF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {E -> D} is BCNF in {ABCDEFGH} {AB -> C, C -> AB, E -> D, D -> E, E -> F, F -> E, ABD -> G, CF -> H} with keys {CD, CE, CF, ABD, ABE, ABF}.
     * Result: false, Tip: is 3NF.
     */
    @Test
    public void testIsBCNFTrueEtoDInRelationThree() {
        ADependency funcDep = this.setUpObject.funcDepEtoD();
        Relation relation = this.setUpObject.relation03();
        assertFalse(funcDep.isBCNF(relation));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#isBCNF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {D -> E} is BCNF in {ABCDEFGH} {AB -> C, C -> AB, E -> D, D -> E, E -> F, F -> E, ABD -> G, CF -> H} with keys {CD, CE, CF, ABD, ABE, ABF}.
     * Result: false, Tip: is 3NF.
     */
    @Test
    public void testIsBCNFTrueDtoEInRelationThree() {
        ADependency funcDep = this.setUpObject.funcDepDtoE();
        Relation relation = this.setUpObject.relation03();
        assertFalse(funcDep.isBCNF(relation));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#isBCNF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {E -> F} is BCNF in {ABCDEFGH} {AB -> C, C -> AB, E -> D, D -> E, E -> F, F -> E, ABD -> G, CF -> H} with keys {CD, CE, CF, ABD, ABE, ABF}.
     * Result: false, Tip: is 3NF.
     */
    @Test
    public void testIsBCNFTrueEtoFInRelationThree() {
        ADependency funcDep = this.setUpObject.funcDepEtoF();
        Relation relation = this.setUpObject.relation03();
        assertFalse(funcDep.isBCNF(relation));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#isBCNF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {F -> E} is BCNF in {ABCDEFGH} {AB -> C, C -> AB, E -> D, D -> E, E -> F, F -> E, ABD -> G, CF -> H} with keys {CD, CE, CF, ABD, ABE, ABF}.
     * Result: false, Tip: is 3NF.
     */
    @Test
    public void testIsBCNFTrueFtoEInRelationThree() {
        ADependency funcDep = this.setUpObject.funcDepFtoE();
        Relation relation = this.setUpObject.relation03();
        assertFalse(funcDep.isBCNF(relation));
    }

    /**
     * Test method for {@link dependency.FunctionalDependency#isBCNF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {B -> C} is BCNF in {ABCDE} {AB -> D, B -> C, C -> B, B -> E} with keys {AB, AC}.
     * Result: false, Tip: is 3NF.
     */
    @Test
    public void testIsBCNFTrueBtoCInRelationSix() {
        ADependency funcDep = this.setUpObject.funcDepBtoC();
        Relation relation = this.setUpObject.relation06();
        assertFalse(funcDep.isBCNF(relation));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#isBCNF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {C -> B} is BCNF in {ABCDE} {AB -> D, B -> C, C -> B, B -> E} with keys {AB, AC}.
     * Result: false, Tip: is 3NF.
     */
    @Test
    public void testIsBCNFTrueCtoBInRelationSix() {
        ADependency funcDep = this.setUpObject.funcDepCtoB();
        Relation relation = this.setUpObject.relation06();
        assertFalse(funcDep.isBCNF(relation));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#isBCNF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {B -> C} is BCNF in {ABCD} {B -> C, AB -> D, C -> B} with keys {AB, AC}.
     * Result: false, Tip: is 3NF.
     */
    @Test
    public void testIsBCNFTrueBtoCInRelationEight() {
        ADependency funcDep = this.setUpObject.funcDepBtoC();
        Relation relation = this.setUpObject.relation08();
        assertFalse(funcDep.isBCNF(relation));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#isBCNF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {C -> B} is BCNF in {ABCD} {B -> C, AB -> D, C -> B} with keys {AB, AC}.
     * Result: false, Tip: is 3NF.
     */
    @Test
    public void testIsBCNFTrueCtoBInRelationEight() {
        ADependency funcDep = this.setUpObject.funcDepCtoB();
        Relation relation = this.setUpObject.relation08();
        assertFalse(funcDep.isBCNF(relation));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#isBCNF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {BC -> E} is BCNF in {ABCDE} {A -> BC, BC -> E, CD -> A} with keys {AD, CD}.
     * Result: false, Tip: is 2NF.
     */
    @Test
    public void testIsBCNFTrueBCtoEInRelationTwo() {
        ADependency funcDep = this.setUpObject.funcDepBCtoE();
        Relation relation = this.setUpObject.relation03();
        assertFalse(funcDep.isBCNF(relation));
    }

    /**
     * Test method for {@link dependency.FunctionalDependency#isBCNF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {B -> C} is BCNF in {ABC} {A -> BC, B -> C, A -> B, AB -> C} with keys {A}.
     * Result: false, Tip: is 2NF.
     */
    @Test
    public void testIsBCNFTrueBtoCInRelationFour() {
        ADependency funcDep = this.setUpObject.funcDepBtoC();
        Relation relation = this.setUpObject.relation04();
        assertFalse(funcDep.isBCNF(relation));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#isBCNF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {B -> C} is BCNF in {ABC} {A -> B, B -> C} with keys {A}.
     * Result: false, Tip: is 2NF.
     */
    @Test
    public void testIsBCNFTrueBtoCInRelationFive() {
        ADependency funcDep = this.setUpObject.funcDepBtoC();
        Relation relation = this.setUpObject.relation05();
        assertFalse(funcDep.isBCNF(relation));
    }   

    /**
     * Test method for {@link dependency.FunctionalDependency#isBCNF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {B -> C} is BCNF in {ABCD} {A -> B, B -> C, C -> D} with keys {A}.
     * Result: false, Tip: is 2NF.
     */
    @Test
    public void testIsBCNFTrueBtoCInRelationSeven() {
        ADependency funcDep = this.setUpObject.funcDepBtoC();
        Relation relation = this.setUpObject.relation07();
        assertFalse(funcDep.isBCNF(relation));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#isBCNF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {C -> D} is BCNF in {ABCD} {A -> B, B -> C, C -> D} with keys {A}.
     * Result: false, Tip: is 2NF.
     */
    @Test
    public void testIsBCNFTrueCtoDInRelationSeven() {
        ADependency funcDep = this.setUpObject.funcDepCtoD();
        Relation relation = this.setUpObject.relation07();
        assertFalse(funcDep.isBCNF(relation));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#isBCNF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {A -> BC} is BCNF in {ABCDE} {A -> BC, BC -> E, CD -> A} with keys {AD, CD}.
     * Result: false, Tip: is 1NF.
     */
    @Test
    public void testIsBCNFFalseAtoBCInRelationTwo() {
        ADependency funcDep = this.setUpObject.funcDepAtoBC();
        Relation relation = this.setUpObject.relation03();
        assertFalse(funcDep.isBCNF(relation));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#isBCNF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {B -> E} is BCNF in {ABCDE} {AB -> D, B -> C, C -> B, B -> E} with keys {AB, AC}.
     * Result: false, Tip: is 1NF.
     */
    @Test
    public void testIsBCNFFalseBtoEInRelationSix() {
        ADependency funcDep = this.setUpObject.funcDepBtoE();
        Relation relation = this.setUpObject.relation06();
        assertFalse(funcDep.isBCNF(relation));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#isBCNF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {BCD -> E} is BCNF in {ABCDE} {A -> BC, BC -> A, BCD -> E, E -> C} with no keys.
     * Result: true, Tip: is BCNF.
     */
    @Test
    public void testNullKeyJointIsBCNFTrueBCDtoEInRelationOne() {
        ADependency funcDep = this.setUpObject.funcDepBCDtoE();
        Relation relationOne = this.setUpObject.relation01(); 
        assertTrue(funcDep.isBCNF(relationOne));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#isBCNF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {A -> BC} is BCNF in {ABCDE} {A -> BC, BC -> A, BCD -> E, E -> C} with no keys.
     * Result: false, Tip: is 3NF.
     */
    @Test
    public void testNullKeyJointIsBCNFTrueAtoBCInRelationOne() {
        ADependency funcDep = this.setUpObject.funcDepAtoBC();
        Relation relation = this.setUpObject.relation01();
        assertFalse(funcDep.isBCNF(relation));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#isBCNF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {BC -> E} is BCNF in {ABCDE} {A -> BC, BC -> E, CD -> A} with no keys.
     * Result: false, Tip: is 2NF.
     */
    @Test
    public void testNullKeyJointIsBCNFTrueBCtoEInRelationTwo() {
        ADependency funcDep = this.setUpObject.funcDepBCtoE();
        Relation relation = this.setUpObject.relation02();
        assertFalse(funcDep.isBCNF(relation));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#isBCNF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {A -> BC} is BCNF in {ABCDE} {A -> BC, BC -> E, CD -> A} with no keys.
     * Result: false, Tip: is 1NF.
     */
    @Test
    public void testNullKeyJointIsBCNFFalseAtoBCInRelationTwo() {
        ADependency funcDep = this.setUpObject.funcDepAtoBC();
        Relation relation = this.setUpObject.relation02();
        assertFalse(funcDep.isBCNF(relation));
    }
}
