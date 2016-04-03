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
public class FunctionalDependencyIs2NFTest {
    private SetUpClass setUpObject;
    
    /**
     * Set up.
     */
    @Before
    public void setUp() {
        this.setUpObject = new SetUpClass();
    }

    /**
     * Test method for {@link dependency.FunctionalDependency#is2NF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {BCD -> E} is 2NF in {ABCDE} {A -> BC, BC -> A, BCD -> E, E -> C} with keys {AD, BCD, BDE}.
     * Result: true, Tip: is BCNF.
     */
    @Test
    public void testIs2NF() {
        ADependency funcDep = this.setUpObject.funcDepBCDtoE();
        Relation relationOne = this.setUpObject.relation01(); 
        assertTrue(funcDep.is2NF(relationOne, this.setUpObject.keyJointAdBcdBde()));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#is2NF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {CD -> A} is 2NF in {ABCDE} {A -> BC, BC -> E, CD -> A} with keys {AD, CD}.
     * Result: true, Tip: is BCNF.
     */
    @Test
    public void testIs2NFTrueCDtoAInRelationTwo() {
        ADependency funcDep = this.setUpObject.funcDepCDtoA();
        Relation relation = this.setUpObject.relation02(); 
        assertTrue(funcDep.is2NF(relation, this.setUpObject.keyJointAdCd()));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#is2NF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {ABD -> G} is 2NF in {ABCDEFGH} {AB -> C, C -> AB, E -> D, D -> E, E -> F, F -> E, ABD -> G, CF -> H} with keys {CD, CE, CF, ABD, ABE, ABF}.
     * Result: true, Tip: is BCNF.
     */
    @Test
    public void testIs2NFTrueABDtoGInRelationThree() {
        ADependency funcDep = this.setUpObject.funcDepABDtoG();
        Relation relation = this.setUpObject.relation03(); 
        assertTrue(funcDep.is2NF(relation, this.setUpObject.keyJointCdCeCfAbdAbeAbf()));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#is2NF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {CF -> H} is 2NF in {ABCDEFGH} {AB -> C, C -> AB, E -> D, D -> E, E -> F, F -> E, ABD -> G, CF -> H} with keys {CD, CE, CF, ABD, ABE, ABF}.
     * Result: true, Tip: is BCNF.
     */
    @Test
    public void testIs2NFTrueCFtoHInRelationThree() {
        ADependency funcDep = this.setUpObject.funcDepCFtoH();
        Relation relation = this.setUpObject.relation03(); 
        assertTrue(funcDep.is2NF(relation, this.setUpObject.keyJointCdCeCfAbdAbeAbf()));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#is2NF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {A -> BC} is 2NF in {ABC} {A -> BC, B -> C, A -> B, AB -> C} with keys {A}.
     * Result: true, Tip: is BCNF.
     */
    @Test
    public void testIs2NFTrueAtoBCInRelationFour() {
        ADependency funcDep = this.setUpObject.funcDepAtoBC();
        Relation relation = this.setUpObject.relation04(); 
        assertTrue(funcDep.is2NF(relation, this.setUpObject.keyJointA()));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#is2NF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {A -> B} is 2NF in {ABC} {A -> BC, B -> C, A -> B, AB -> C} with keys {A}.
     * Result: true, Tip: is BCNF.
     */
    @Test
    public void testIs2NFTrueAtoBInRelationFour() {
        ADependency funcDep = this.setUpObject.funcDepAtoB();
        Relation relation = this.setUpObject.relation04(); 
        assertTrue(funcDep.is2NF(relation, this.setUpObject.keyJointA()));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#is2NF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {AB -> C} is 2NF in {ABC} {A -> BC, B -> C, A -> B, AB -> C} with keys {A}.
     * Result: true, Tip: is BCNF.
     */
    @Test
    public void testIs2NFTrueABtoCInRelationFour() {
        ADependency funcDep = this.setUpObject.funcDepABtoC();
        Relation relation = this.setUpObject.relation04(); 
        assertTrue(funcDep.is2NF(relation, this.setUpObject.keyJointA()));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#is2NF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {A -> B} is 2NF in {ABC} {A -> B, B -> C} with keys {A}.
     * Result: true, Tip: is BCNF.
     */
    @Test
    public void testIs2NFTrueAtoBInRelationFive() {
        ADependency funcDep = this.setUpObject.funcDepAtoB();
        Relation relation = this.setUpObject.relation05(); 
        assertTrue(funcDep.is2NF(relation, this.setUpObject.keyJointA()));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#is2NF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {AB -> D} is 2NF in {ABCDE} {AB -> D, B -> C, C -> B, B -> E} with keys {AB, AC}.
     * Result: true, Tip: is BCNF.
     */
    @Test
    public void testIs2NFTrueABtoDInRelationSix() {
        ADependency funcDep = this.setUpObject.funcDepABtoD();
        Relation relation = this.setUpObject.relation06(); 
        assertTrue(funcDep.is2NF(relation, this.setUpObject.keyJointAbAc()));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#is2NF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {A -> B} is 2NF in {ABCD} {A -> B, B -> C, C -> D} with keys {A}.
     * Result: true, Tip: is BCNF.
     */
    @Test
    public void testIs2NFTrueAtoBInRelationSeven() {
        ADependency funcDep = this.setUpObject.funcDepAtoB();
        Relation relation = this.setUpObject.relation07();
        assertTrue(funcDep.is2NF(relation, this.setUpObject.keyJointA()));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#is2NF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {AB -> D} is 2NF in {ABCD} {B -> C, AB -> D, C -> B} with keys {AB, AC}.
     * Result: true, Tip: is BCNF.
     */
    @Test
    public void testIs2NFTrueABtoDInRelationEight() {
        ADependency funcDep = this.setUpObject.funcDepABtoD();
        Relation relation = this.setUpObject.relation08();
        assertTrue(funcDep.is2NF(relation, this.setUpObject.keyJointAbAc()));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#is2NF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {AB -> C} is 2NF in {ABC} {AB -> C} with keys {AB}.
     * Result: true, Tip: is BCNF.
     */
    @Test
    public void testIs2NFTrueABtoCInRelationNine() {
        ADependency funcDep = this.setUpObject.funcDepABtoC();
        Relation relation = this.setUpObject.relation09();
        assertTrue(funcDep.is2NF(relation, this.setUpObject.keyJointAb()));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#is2NF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {A -> BC} is 2NF in {ABCDE} {A -> BC, BC -> A, BCD -> E, E -> C} with keys {AD, BCD, BDE}.
     * Result: true, Tip: is 3NF.
     */
    @Test
    public void testIs2NFTrueAtoBCInRelationOne() {
        ADependency funcDep = this.setUpObject.funcDepAtoBC();
        Relation relation = this.setUpObject.relation01();
        assertTrue(funcDep.is2NF(relation, this.setUpObject.keyJointAdBcdBde()));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#is2NF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {BC -> A} is 2NF in {ABCDE} {A -> BC, BC -> A, BCD -> E, E -> C} with keys {AD, BCD, BDE}.
     * Result: true, Tip: is 3NF.
     */
    @Test
    public void testIs2NFTrueBCtoAInRelationOne() {
        ADependency funcDep = this.setUpObject.funcDepBCtoA();
        Relation relation = this.setUpObject.relation01();
        assertTrue(funcDep.is2NF(relation, this.setUpObject.keyJointAdBcdBde()));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#is2NF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {E -> C} is 2NF in {ABCDE} {A -> BC, BC -> A, BCD -> E, E -> C} with keys {AD, BCD, BDE}.
     * Result: true, Tip: is 3NF.
     */
    @Test
    public void testIs2NFTrueEtoCInRelationOne() {
        ADependency funcDep = this.setUpObject.funcDepEtoC();
        Relation relation = this.setUpObject.relation01();
        assertTrue(funcDep.is2NF(relation, this.setUpObject.keyJointAdBcdBde()));
    }

    /**
     * Test method for {@link dependency.FunctionalDependency#is2NF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {AB -> C} is 2NF in {ABCDEFGH} {AB -> C, C -> AB, E -> D, D -> E, E -> F, F -> E, ABD -> G, CF -> H} with keys {CD, CE, CF, ABD, ABE, ABF}.
     * Result: true, Tip: is 3NF.
     */
    @Test
    public void testIs2NFTrueABtoCInRelationThree() {
        ADependency funcDep = this.setUpObject.funcDepABtoC();
        Relation relation = this.setUpObject.relation03();
        assertTrue(funcDep.is2NF(relation, this.setUpObject.keyJointCdCeCfAbdAbeAbf()));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#is2NF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {C -> AB} is 2NF in {ABCDEFGH} {AB -> C, C -> AB, E -> D, D -> E, E -> F, F -> E, ABD -> G, CF -> H} with keys {CD, CE, CF, ABD, ABE, ABF}.
     * Result: true, Tip: is 3NF.
     */
    @Test
    public void testIs2NFTrueCtoABInRelationThree() {
        ADependency funcDep = this.setUpObject.funcDepCtoAB();
        Relation relation = this.setUpObject.relation03();
        assertTrue(funcDep.is2NF(relation, this.setUpObject.keyJointCdCeCfAbdAbeAbf()));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#is2NF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {E -> D} is 2NF in {ABCDEFGH} {AB -> C, C -> AB, E -> D, D -> E, E -> F, F -> E, ABD -> G, CF -> H} with keys {CD, CE, CF, ABD, ABE, ABF}.
     * Result: true, Tip: is 3NF.
     */
    @Test
    public void testIs2NFTrueEtoDInRelationThree() {
        ADependency funcDep = this.setUpObject.funcDepEtoD();
        Relation relation = this.setUpObject.relation03();
        assertTrue(funcDep.is2NF(relation, this.setUpObject.keyJointCdCeCfAbdAbeAbf()));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#is2NF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {D -> E} is 2NF in {ABCDEFGH} {AB -> C, C -> AB, E -> D, D -> E, E -> F, F -> E, ABD -> G, CF -> H} with keys {CD, CE, CF, ABD, ABE, ABF}.
     * Result: true, Tip: is 3NF.
     */
    @Test
    public void testIs2NFTrueDtoEInRelationThree() {
        ADependency funcDep = this.setUpObject.funcDepDtoE();
        Relation relation = this.setUpObject.relation03();
        assertTrue(funcDep.is2NF(relation, this.setUpObject.keyJointCdCeCfAbdAbeAbf()));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#is2NF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {E -> F} is 2NF in {ABCDEFGH} {AB -> C, C -> AB, E -> D, D -> E, E -> F, F -> E, ABD -> G, CF -> H} with keys {CD, CE, CF, ABD, ABE, ABF}.
     * Result: true, Tip: is 3NF.
     */
    @Test
    public void testIs2NFTrueEtoFInRelationThree() {
        ADependency funcDep = this.setUpObject.funcDepEtoF();
        Relation relation = this.setUpObject.relation03();
        assertTrue(funcDep.is2NF(relation, this.setUpObject.keyJointCdCeCfAbdAbeAbf()));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#is2NF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {F -> E} is 2NF in {ABCDEFGH} {AB -> C, C -> AB, E -> D, D -> E, E -> F, F -> E, ABD -> G, CF -> H} with keys {CD, CE, CF, ABD, ABE, ABF}.
     * Result: true, Tip: is 3NF.
     */
    @Test
    public void testIs2NFTrueFtoEInRelationThree() {
        ADependency funcDep = this.setUpObject.funcDepFtoE();
        Relation relation = this.setUpObject.relation03();
        assertTrue(funcDep.is2NF(relation, this.setUpObject.keyJointCdCeCfAbdAbeAbf()));
    }

    /**
     * Test method for {@link dependency.FunctionalDependency#is2NF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {B -> C} is 2NF in {ABCDE} {AB -> D, B -> C, C -> B, B -> E} with keys {AB, AC}.
     * Result: true, Tip: is 3NF.
     */
    @Test
    public void testIs2NFTrueBtoCInRelationSix() {
        ADependency funcDep = this.setUpObject.funcDepBtoC();
        Relation relation = this.setUpObject.relation06();
        assertTrue(funcDep.is2NF(relation, this.setUpObject.keyJointAbAc()));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#is2NF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {C -> B} is 2NF in {ABCDE} {AB -> D, B -> C, C -> B, B -> E} with keys {AB, AC}.
     * Result: true, Tip: is 3NF.
     */
    @Test
    public void testIs2NFTrueCtoBInRelationSix() {
        ADependency funcDep = this.setUpObject.funcDepCtoB();
        Relation relation = this.setUpObject.relation06();
        assertTrue(funcDep.is2NF(relation, this.setUpObject.keyJointAbAc()));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#is2NF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {B -> C} is 2NF in {ABCD} {B -> C, AB -> D, C -> B} with keys {AB, AC}.
     * Result: true, Tip: is 3NF.
     */
    @Test
    public void testIs2NFTrueBtoCInRelationEight() {
        ADependency funcDep = this.setUpObject.funcDepBtoC();
        Relation relation = this.setUpObject.relation08();
        assertTrue(funcDep.is2NF(relation, this.setUpObject.keyJointAbAc()));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#is2NF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {C -> B} is 2NF in {ABCD} {B -> C, AB -> D, C -> B} with keys {AB, AC}.
     * Result: true, Tip: is 3NF.
     */
    @Test
    public void testIs2NFTrueCtoBInRelationEight() {
        ADependency funcDep = this.setUpObject.funcDepCtoB();
        Relation relation = this.setUpObject.relation08();
        assertTrue(funcDep.is2NF(relation, this.setUpObject.keyJointAbAc()));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#is2NF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {BC -> E} is 2NF in {ABCDE} {A -> BC, BC -> E, CD -> A} with keys {AD, CD}.
     * Result: true, Tip: is 2NF.
     */
    @Test
    public void testIs2NFTrueBCtoEInRelationTwo() {
        ADependency funcDep = this.setUpObject.funcDepBCtoE();
        Relation relation = this.setUpObject.relation02();
        assertTrue(funcDep.is2NF(relation, this.setUpObject.keyJointAdCd()));
    }

    /**
     * Test method for {@link dependency.FunctionalDependency#is2NF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {B -> C} is 2NF in {ABC} {A -> BC, B -> C, A -> B, AB -> C} with keys {A}.
     * Result: true, Tip: is 2NF.
     */
    @Test
    public void testIs2NFTrueBtoCInRelationFour() {
        ADependency funcDep = this.setUpObject.funcDepBtoC();
        Relation relation = this.setUpObject.relation04();
        assertTrue(funcDep.is2NF(relation, this.setUpObject.keyJointA()));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#is2NF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {B -> C} is 2NF in {ABC} {A -> B, B -> C} with keys {A}.
     * Result: true, Tip: is 2NF.
     */
    @Test
    public void testIs2NFTrueBtoCInRelationFive() {
        ADependency funcDep = this.setUpObject.funcDepBtoC();
        Relation relation = this.setUpObject.relation05();
        assertTrue(funcDep.is2NF(relation, this.setUpObject.keyJointA()));
    }   

    /**
     * Test method for {@link dependency.FunctionalDependency#is2NF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {B -> C} is 2NF in {ABCD} {A -> B, B -> C, C -> D} with keys {A}.
     * Result: true, Tip: is 2NF.
     */
    @Test
    public void testIs2NFTrueBtoCInRelationSeven() {
        ADependency funcDep = this.setUpObject.funcDepBtoC();
        Relation relation = this.setUpObject.relation07();
        assertTrue(funcDep.is2NF(relation, this.setUpObject.keyJointA()));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#is2NF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {C -> D} is 2NF in {ABCD} {A -> B, B -> C, C -> D} with keys {A}.
     * Result: true, Tip: is 2NF.
     */
    @Test
    public void testIs2NFTrueCtoDInRelationSeven() {
        ADependency funcDep = this.setUpObject.funcDepCtoD();
        Relation relation = this.setUpObject.relation07();
        assertTrue(funcDep.is2NF(relation, this.setUpObject.keyJointA()));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#is2NF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {A -> BC} is 2NF in {ABCDE} {A -> BC, BC -> E, CD -> A} with keys {AD, CD}.
     * Result: false, Tip: is 1NF.
     */
    @Test
    public void testIs2NFFalseAtoBCInRelationTwo() {
        ADependency funcDep = this.setUpObject.funcDepAtoBC();
        Relation relation = this.setUpObject.relation02();
        assertFalse(funcDep.is2NF(relation, this.setUpObject.keyJointAdCd()));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#is2NF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {B -> E} is 2NF in {ABCDE} {AB -> D, B -> C, C -> B, B -> E} with keys {AB, AC}.
     * Result: false, Tip: is 1NF.
     */
    @Test
    public void testIs2NFFalseBtoEInRelationSix() {
        ADependency funcDep = this.setUpObject.funcDepBtoE();
        Relation relation = this.setUpObject.relation06();
        assertFalse(funcDep.is2NF(relation, this.setUpObject.keyJointAbAc()));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#is2NF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {BCD -> E} is 2NF in {ABCDE} {A -> BC, BC -> A, BCD -> E, E -> C} with no keys.
     * Result: true, Tip: is BCNF.
     */
    @Test
    public void testNullKeyJointIs2NFTrueBCDtoEInRelationOne() {
        ADependency funcDep = this.setUpObject.funcDepBCDtoE();
        Relation relationOne = this.setUpObject.relation01(); 
        assertTrue(funcDep.is2NF(relationOne, null));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#is2NF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {A -> BC} is 2NF in {ABCDE} {A -> BC, BC -> A, BCD -> E, E -> C} with no keys.
     * Result: true, Tip: is 3NF.
     */
    @Test
    public void testNullKeyJointIs2NFTrueAtoBCInRelationOne() {
        ADependency funcDep = this.setUpObject.funcDepAtoBC();
        Relation relation = this.setUpObject.relation01();
        assertTrue(funcDep.is2NF(relation, null));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#is2NF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {BC -> E} is 2NF in {ABCDE} {A -> BC, BC -> E, CD -> A} with no keys.
     * Result: true, Tip: is 2NF.
     */
    @Test
    public void testNullKeyJointIs2NFTrueBCtoEInRelationTwo() {
        ADependency funcDep = this.setUpObject.funcDepBCtoE();
        Relation relation = this.setUpObject.relation02();
        assertTrue(funcDep.is2NF(relation, null));
    }
    
    /**
     * Test method for {@link dependency.FunctionalDependency#is2NF(datastructures.Relation, datastructures.KeyJoint)}.
     * Check if {A -> BC} is 2NF in {ABCDE} {A -> BC, BC -> E, CD -> A} with no keys.
     * Result: false, Tip: is 1NF.
     */
    @Test
    public void testNullKeyJointIs2NFFalseAtoBCInRelationTwo() {
        ADependency funcDep = this.setUpObject.funcDepAtoBC();
        Relation relation = this.setUpObject.relation02();
        assertFalse(funcDep.is2NF(relation, null));
    }

}
