/**
 * 
 */
package datastructures;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import dependency.ADependency;

/**
 * @author Pavel Nichita
 *
 */
public class RelationTest {
    private Relation nullRelation;
    //AB -> D, B -> C, C -> B, B -> E
    private Relation firstFormRelation;
    //A -> B, B -> C, C -> D
    private Relation secondFormRelation;
    //B -> C, AB -> D, C -> B
    private Relation thirdFormRelation;
    //AB -> C
    private Relation boyceCoddFormRelation;
    //A -> BC, BC -> A, BCD -> E, E -> C
    private Relation one;
    
    //DFJoints
    private DFJoint secondFormRelationDFJoint;
    private DFJoint thirdFormRelationDFJoint;
    private DFJoint boyceCoddFormRelationDFJoint;
    
    //AttributesJoints of relations attributes
    private AttributeJoint secondAndThirdFormRelationAttributes;
    private AttributeJoint boyceCoddFormRelationAttributes;
    
    //KeyJoint
    //private KeyJoint secondFormRelationKeyJoint;
    //private KeyJoint thirdFormRelationKeyJoint;
    //private KeyJoint boyceCoddFormRelationKeyJoint;

    private SetUpClass setUpObject;

    /**
     * Set up.
     */
    @Before
    public void setUp() {
        this.setUpObject = new SetUpClass();
        this.nullRelation = new Relation();
        //DFJoints
        this.secondFormRelationDFJoint = setUpObject.dfJoint07();
        this.thirdFormRelationDFJoint = setUpObject.dfJoint08();
        this.boyceCoddFormRelationDFJoint = setUpObject.dfJoint09();
        //AttributeJoints attributes of a relation
        this.secondAndThirdFormRelationAttributes = setUpObject.attrJntABCD();
        this.boyceCoddFormRelationAttributes = setUpObject.attrJntABC();

        //Relations
        this.firstFormRelation = new Relation(setUpObject.attrJntABCDE(), setUpObject.dfJoint06());
        this.secondFormRelation = new Relation(secondAndThirdFormRelationAttributes, secondFormRelationDFJoint);
        this.thirdFormRelation = new Relation(secondAndThirdFormRelationAttributes, thirdFormRelationDFJoint);
        this.boyceCoddFormRelation = new Relation(boyceCoddFormRelationAttributes, boyceCoddFormRelationDFJoint);
        this.one = this.setUpObject.relation01();

        //KeyJoint
        List<AttributeJoint> keysVector = new ArrayList<>();
        keysVector.add(setUpObject.attrJntAB());
        //this.boyceCoddFormRelationKeyJoint = new KeyJoint(keysVector);
        keysVector.add(setUpObject.attrJntAC());
        //this.thirdFormRelationKeyJoint = new KeyJoint(keysVector);
        keysVector.clear();
        keysVector.add(setUpObject.attrJntA());
        //this.secondFormRelationKeyJoint = new KeyJoint(keysVector);
    }

    /**
     * Test method for {@link datastructures.Relation#Relation()}.
     */
    @Test
    public void testRelation() {
        assertNotNull(this.nullRelation);
    }

    /**
     * Test method for {@link datastructures.Relation#Relation(datastructures.AttributeJoint, datastructures.DFJoint)}.
     */
    @Test
    public void testRelationAttributeJointDFJoint() {
        assertEquals(secondAndThirdFormRelationAttributes, secondFormRelation.getAttrJoint());
        assertEquals(secondFormRelationDFJoint, secondFormRelation.getDFJoint());
    }

    /**
     * Test method for {@link datastructures.Relation#getAttrJoint()}.
     */
    @Test
    public void testGetAttrJoint() {
        assertEquals(secondAndThirdFormRelationAttributes, secondFormRelation.getAttrJoint());
        assertEquals(secondAndThirdFormRelationAttributes, thirdFormRelation.getAttrJoint());
        assertEquals(boyceCoddFormRelationAttributes, boyceCoddFormRelation.getAttrJoint());
        assertNull(nullRelation.getAttrJoint());
    }

    /**
     * Test method for {@link datastructures.Relation#getDFJoint()}.
     */
    @Test
    public void testGetDFJoint() {
        assertEquals(secondFormRelationDFJoint, secondFormRelation.getDFJoint());
        assertEquals(thirdFormRelationDFJoint, thirdFormRelation.getDFJoint());
        assertEquals(boyceCoddFormRelationDFJoint, boyceCoddFormRelation.getDFJoint());
        assertNull(nullRelation.getDFJoint());
    }

    /**
     * Test method for {@link datastructures.Relation#settAttrJoint(datastructures.AttributeJoint)}.
     */
    @Test
    public void testSettAttrJoint() {
        this.nullRelation.settAttrJoint(boyceCoddFormRelationAttributes);
        assertEquals(boyceCoddFormRelationAttributes, this.nullRelation.getAttrJoint());
    }

    /**
     * Test method for {@link datastructures.Relation#setDFJoint(datastructures.DFJoint)}.
     */
    @Test
    public void testSetDFJoint() {
        this.nullRelation.setDFJoint(boyceCoddFormRelationDFJoint);
        assertEquals(boyceCoddFormRelationDFJoint, this.nullRelation.getDFJoint());
    }

    /**
     * Test method for {@link datastructures.Relation#toString()}.
     */
    @Test
    public void testToString() {
        String msg2FN = "Atributos: {A, B, C, D} Dependencias Funcionales: { ({A} -> {B}), ({B} -> {C}), ({C} -> {D}) }";
        String msg3FN = "Atributos: {A, B, C, D} Dependencias Funcionales: { ({B} -> {C}), ({A, B} -> {D}), ({C} -> {B}) }";
        String msgBCFN = "Atributos: {A, B, C} Dependencias Funcionales: { ({A, B} -> {C}) }";
        assertEquals(msg2FN, this.secondFormRelation.toString());
        assertEquals(msg3FN, this.thirdFormRelation.toString());
        assertEquals(msgBCFN, this.boyceCoddFormRelation.toString());
    }
    
    /**
     * Test method for {@link datastructures.Relation#toString()}.
     */
    @Test
    public void testToStringTestNullAttrJoint() {
        String msg = "Sin Atributos Dependencias Funcionales: { ({A, B} -> {C}) }";
        this.nullRelation.setDFJoint(boyceCoddFormRelationDFJoint);
        assertEquals(msg, this.nullRelation.toString());
    }
    
    /**
     * Test method for {@link datastructures.Relation#toString()}.
     */
    @Test
    public void testToStringTestNullDFJoint() {
        String msg = "Atributos: {A, B, C} Sin Dependencias Funcionales";
        this.nullRelation.settAttrJoint(boyceCoddFormRelationAttributes);
        assertEquals(msg, this.nullRelation.toString());
    }
    
    /**
     * Test method for {@link datastructures.Relation#toString()}.
     */
    @Test
    public void testToStringTestVoidValuesRelation() {
        String msg = "Sin Atributos Sin Dependencias Funcionales";
        assertEquals(msg, this.nullRelation.toString());
    }

    /**
     * Test method for {@link datastructures.Relation#is3NF()}.
     * Relation {ABC} {AB -> C} is 3NF, result: true.
     * Tip: is BCNF.
     */
    @Test
    public void testIs3NFBC() {
        assertTrue(this.boyceCoddFormRelation.is3NF());
    }
    
    /**
     * Test method for {@link datastructures.Relation#is3NF()}.
     * Relation {ABCD} {B -> C, AB -> D, C -> B} is 3NF, result: true.
     * Tip: is 3NF.
     */
    @Test
    public void testIs3NF3FN() {
        assertTrue(this.thirdFormRelation.is3NF());
    }
    
    /**
     * Test method for {@link datastructures.Relation#is3NF()}.
     * Relation {ABCD} {A -> B, B -> C, C -> D} is 3NF, result: false.
     * Tip: is 2NF.
     */
    @Test
    public void testIs3NF2FN() {
        assertFalse(this.secondFormRelation.is3NF());
    }
    
    /**
     * Test method for {@link datastructures.Relation#is3NF()}.
     * Relation {ABCDE} {AB -> D, B -> C, C -> B, B -> E} is 3NF, result: false.
     * Tip: is 1NF.
     */
    @Test
    public void testIs3NF1FN() {
        assertFalse(this.firstFormRelation.is3NF());
    }
    
    /**
    * Test method for {@link datastructures.Relation#is2NF()}.
    * Relation {ABC} {AB -> C} is 2NF, result: true.
    * Tip: is BCNF.
    */
    @Test
    public void testIs2NFBC(){
        assertTrue(this.boyceCoddFormRelation.is2NF());
    }
    
    /**
     * Test method for {@link datastructures.Relation#is2NF()}.
     * Relation {ABCD} {B -> C, AB -> D, C -> B} is 2NF, result: true.
     * Tip: is 3NF.
     */
    @Test
    public void testIs2NF3FN(){
        assertTrue(this.thirdFormRelation.is2NF());
    }
    
    /**
     * Test method for {@link datastructures.Relation#is2NF()}.
     * Relation {ABCD} {A -> B, B -> C, C -> D} is 2NF, result: true.
     * Tip: is 2NF.
     */
    @Test
    public void testIs2NF2FN(){
        assertTrue(this.secondFormRelation.is2NF());
    }
    
    /**
     * Test method for {@link datastructures.Relation#is2NF()}.
     * Relation {ABCDE} {AB -> D, B -> C, C -> B, B -> E} is 2NF, result: false.
     * Tip: is 1NF.
     */
    @Test
    public void testIs2NF1FN(){
        assertFalse(this.firstFormRelation.is2NF());
    }
    
    /**
     * Test method for {@link datastructures.Relation#isBCNF()}.
     * Relation {ABC} {AB -> C} is BCNF, result: true.
     * Tip: is BCNF.
     */
    @Test
    public void testIsBCNFBC() {
        assertTrue(this.boyceCoddFormRelation.isBCNF());
    }
    
    /**
     * Test method for {@link datastructures.Relation#isBCNF()}.
     * Relation {ABCD} {B -> C, AB -> D, C -> B} is BCNF, result: false.
     * Tip: is 3NF.
     */
    @Test
    public void testIsBCN3NF() {
        assertFalse(this.thirdFormRelation.isBCNF());
    }
    
    /**
     * Test method for {@link datastructures.Relation#isBCNF()}.
     * Relation {ABCD} {A -> B, B -> C, C -> D} is BCNF, result: false.
     * Tip: is 2NF.
     */
    @Test
    public void testIsBCN2NF() {
        assertFalse(this.secondFormRelation.isBCNF());
    }
    
    /**
     * Test method for {@link datastructures.Relation#isBCNF()}.
     * Relation {ABCDE} {AB -> D, B -> C, C -> B, B -> E} is BCNF, result: false.
     * Tip: is 1NF.
     */
    @Test
    public void testIsBCN1NF() {
        assertFalse(this.firstFormRelation.isBCNF());
    }
    
    /**
     * Test method for {@link datastructures.Relation#isBCNF()}.
     * Relation null {} {} is BCNF, result: false.
     * Tip: is null, it can't have a normal form what else do you want?.
     */
    @Test
    public void testIsBCNNullRelation() {
        assertFalse(this.nullRelation.isBCNF());
    }
    
    /**
     * Test method for {@link datastructures.Relation#getNonBCNFDFs()}.
     * Checks that relation {ABCDE} {A -> BC, BC -> A, BCD -> E, E -> C}
     * returns {A -> BC, BC -> A, E -> C} non BCNF dependencies.
     */
    @Test
    public void testGetNonBCNFDFsRelation1() {
        List<ADependency> expected = this.setUpObject.listNonBCNFDFJoint1();
        Relation relation = this.setUpObject.relation01();
        assertEquals(expected, relation.getNonBCNFDFs());  
    }
    
    /**
     * Test method for {@link datastructures.Relation#getNonBCNFDFs()}.
     * Checks that relation {ABCDE} {A -> BC, BC -> E, CD -> A}
     * returns {A -> BC, BC -> E} non BCNF dependencies.
     */
    @Test
    public void testGetNonBCNFDFsRelation2() {
        List<ADependency> expected = this.setUpObject.listNonBCNFDFJoint2();      
        Relation relation  = this.setUpObject.relation02();
        assertEquals(expected, relation.getNonBCNFDFs());  
    }
    
    /**
     * Test method for {@link datastructures.Relation#getNonBCNFDFs()}.
     * Checks that relation {ABCDEFGH} {AB -> C, C -> AB, E -> D, D -> E, E -> F, F -> E, ABD -> G, CF -> H}
     * returns {ABD -> G, CF -> H} non BCNF dependencies.
     */
    @Test
    public void testGetNonBCNFDFsRelation3() {
        List<ADependency> expected = this.setUpObject.listNonBCNFDFJoint3();      
        Relation relation  = this.setUpObject.relation03();
        assertEquals(expected, relation.getNonBCNFDFs());  
    }
    
    /**
     * Test method for {@link datastructures.Relation#getNonBCNFDFs()}.
     * Checks that relation {ABC} {A -> BC, B -> C, A -> B, AB -> C}
     * returns {B -> C} non BCNF dependencies.
     */
    @Test
    public void testGetNonBCNFDFsRelation4() {
        List<ADependency> expected = this.setUpObject.listNonBCNFDFJoint4and5();        
        Relation relation  = this.setUpObject.relation04();
        assertEquals(expected, relation.getNonBCNFDFs());
    }
    
    /**
     * Test method for {@link datastructures.Relation#getNonBCNFDFs()}.
     * Checks that relation {ABC} {A -> B, B -> C}
     * returns {B -> C} non BCNF dependencies.
     */
    @Test
    public void testGetNonBCNFDFsRelation5() {
        List<ADependency> expected = this.setUpObject.listNonBCNFDFJoint4and5();        
        Relation relation  = this.setUpObject.relation05();
        assertEquals(expected, relation.getNonBCNFDFs());  
    }
    
    /**
     * Test method for {@link datastructures.Relation#getNonBCNFDFs()}.
     * Checks that relation {ABCDE} {AB -> D, B -> C, C -> B, B -> E}
     * returns {B -> C, C -> B, B -> E} non BCNF dependencies.
     */
    @Test
    public void testGetNonBCNFDFsRelation6() {
        List<ADependency> expected = this.setUpObject.listNonBCNFDFJoint6();      
        Relation relation  = this.setUpObject.relation06();
        assertEquals(expected, relation.getNonBCNFDFs());  
    }
    
    /**
     * Test method for {@link datastructures.Relation#getNonBCNFDFs()}.
     * Checks that relation {ABCD} {A -> B, B -> C, C -> D}
     * returns {B -> C, C -> D} non BCNF dependencies.
     */
    @Test
    public void testGetNonBCNFDFsRelation7() {
        List<ADependency> expected = this.setUpObject.listNonBCNFDFJoint7();      
        Relation relation  = this.setUpObject.relation07();
        assertEquals(expected, relation.getNonBCNFDFs());
    }
    
    /**
     * Test method for {@link datastructures.Relation#getNonBCNFDFs()}.
     * Checks that relation {ABCD} {B -> C, AB -> D, C -> B}
     * returns {B -> C, C -> B} non BCNF dependencies.
     */
    @Test
    public void testGetNonBCNFDFsRelation8() {
        List<ADependency> expected = this.setUpObject.listNonBCNFDFJoint8();      
        Relation relation  = this.setUpObject.relation08();
        assertEquals(expected, relation.getNonBCNFDFs());  
    }
    
    /**
     * Test method for {@link datastructures.Relation#getNonBCNFDFs()}.
     * Checks that relation {ABC} {AB -> C}
     * returns {} non BCNF dependencies.
     */
    @Test
    public void testGetNonBCNFDFsRelation9() {
        List<ADependency> expected = new ArrayList<>();
        Relation relation  = this.setUpObject.relation09();
        assertEquals(expected, relation.getNonBCNFDFs());
    }
    
    /***********************************/
    /**
     * Test method for {@link datastructures.Relation#getNon3NFDFs()}.
     * Checks that relation {ABCDE} {A -> BC, BC -> A, BCD -> E, E -> C}
     * returns {A -> BC, BC -> A, E -> C} non BCNF dependencies.
     */
    @Test
    public void testGetNon3NFDFsRelation1() {
        List<ADependency> expected = new ArrayList<>();
        Relation relation = this.setUpObject.relation01();
        assertEquals(expected, relation.getNon3NFDFs());  
    }
    
    /**
     * Test method for {@link datastructures.Relation#getNon3NFDFs()}.
     * Checks that relation {ABCDE} {A -> BC, BC -> E, CD -> A}
     * returns {A -> BC, BC -> E} non BCNF dependencies.
     */
    @Test
    public void testGetNon3NFDFsRelation2() {
        List<ADependency> expected = this.setUpObject.listNonBCNFDFJoint2();      
        Relation relation  = this.setUpObject.relation02();
        assertEquals(expected, relation.getNon3NFDFs());  
    }
    
    /**
     * Test method for {@link datastructures.Relation#getNon3NFDFs()}.
     * Checks that relation {ABCDEFGH} {AB -> C, C -> AB, E -> D, D -> E, E -> F, F -> E, ABD -> G, CF -> H}
     * returns {ABD -> G, CF -> H} non BCNF dependencies.
     */
    @Test
    public void testGetNon3NFDFsRelation3() {
        List<ADependency> expected = new ArrayList<>();      
        Relation relation  = this.setUpObject.relation03();
        assertEquals(expected, relation.getNon3NFDFs());  
    }
    
    /**
     * Test method for {@link datastructures.Relation#getNon3NFDFs()}.
     * Checks that relation {ABC} {A -> BC, B -> C, A -> B, AB -> C}
     * returns {B -> C} non BCNF dependencies.
     */
    @Test
    public void testGetNon3NFDFsRelation4() {
        List<ADependency> expected = this.setUpObject.listNonBCNFDFJoint4and5();        
        Relation relation  = this.setUpObject.relation04();
        assertEquals(expected, relation.getNon3NFDFs());
    }
    
    /**
     * Test method for {@link datastructures.Relation#getNon3NFDFs()}.
     * Checks that relation {ABC} {A -> B, B -> C}
     * returns {B -> C} non BCNF dependencies.
     */
    @Test
    public void testGetNon3NFDFsRelation5() {
        List<ADependency> expected = this.setUpObject.listNonBCNFDFJoint4and5();
        Relation relation  = this.setUpObject.relation05();
        assertEquals(expected, relation.getNon3NFDFs());  
    }
    
    /**
     * Test method for {@link datastructures.Relation#getNon3NFDFs()}.
     * Checks that relation {ABCDE} {AB -> D, B -> C, C -> B, B -> E}
     * returns {B -> C, C -> B, B -> E} non BCNF dependencies.
     */
    @Test
    public void testGetNon3NFDFsRelation6() {
        List<ADependency> expected = new ArrayList<>();
        expected.add(this.setUpObject.funcDepBtoE());
        Relation relation  = this.setUpObject.relation06();
        assertEquals(expected, relation.getNon3NFDFs());  
    }
    
    /**
     * Test method for {@link datastructures.Relation#getNon3NFDFs()}.
     * Checks that relation {ABCD} {A -> B, B -> C, C -> D}
     * returns {B -> C, C -> D} non BCNF dependencies.
     */
    @Test
    public void testGetNon3NFDFsRelation7() {
        List<ADependency> expected = this.setUpObject.listNonBCNFDFJoint7();      
        Relation relation  = this.setUpObject.relation07();
        assertEquals(expected, relation.getNon3NFDFs());
    }
    
    /**
     * Test method for {@link datastructures.Relation#getNon3NFDFs()}.
     * Checks that relation {ABCD} {B -> C, AB -> D, C -> B}
     * returns {B -> C, C -> B} non BCNF dependencies.
     */
    @Test
    public void testGetNon3NFDFsRelation8() {
        List<ADependency> expected = new ArrayList<>();      
        Relation relation  = this.setUpObject.relation08();
        assertEquals(expected, relation.getNon3NFDFs());  
    }
    
    /**
     * Test method for {@link datastructures.Relation#getNon3NFDFs()}.
     * Checks that relation {ABC} {AB -> C}
     * returns {} non BCNF dependencies.
     */
    @Test
    public void testGetNon3NFDFsRelation9() {
        List<ADependency> expected = new ArrayList<>();
        Relation relation  = this.setUpObject.relation09();
        assertEquals(expected, relation.getNon3NFDFs());
    }
    
    /**
     * Test method for {@link datastructures.Relation#getNormalForm()}
     * Relation {ABC} {AB -> C} what normal form is in? Result: Boyce Codd NF.
     */
    @Test
    public void testGetNormalForm() {
        assertEquals("Boyce Codd FN", this.boyceCoddFormRelation.getNormalForm());
    }
    
    /**
     * Test method for {@link datastructures.Relation#getNormalForm()}
     * Relation {ABCD} {B -> C, AB -> D, C -> B} what normal form is in? Result: 3NF.
     */
    @Test
    public void testGetNormalForm3NF() {
        assertEquals("3FN", this.thirdFormRelation.getNormalForm());
    }
    
    /**
     * Test method for {@link datastructures.Relation#getNormalForm()}
     * Relation {ABCD} {A -> B, B -> C, C -> D} what normal form is in? Result: 2NF.
     */
    @Test
    public void testGetNormalForm2NF() {
        assertEquals("2FN", this.secondFormRelation.getNormalForm());
    }
    
    /**
     * Test method for {@link datastructures.Relation#getNormalForm()}
     * Relation {ABCDE} {AB -> D, B -> C, C -> B, B -> E} what normal form is in? Result: 1NF.
     */
    @Test
    public void testGetNormalForm1NF() {
        assertEquals("1FN", this.firstFormRelation.getNormalForm());
    }
    
    /**
     * Test method for {@link datastructures.Relation#split(ADependency)}
     * Splits in two relation {ABCDE} {A -> BC, BC -> A, BCD -> E, E -> C}
     * using dependency (A -> BC).
     * Result: {ABC} {A -> BC, BC -> A}
     *         {ADE} {AD -> E}
     */
    @Test
    public void splitRelation1UsingAtoBC() {
        List<Relation> expected = new ArrayList<>();
        expected.add(this.setUpObject.relation1ABC());
        expected.add(this.setUpObject.relation1ADE());
        List<Relation> result = this.one.split(this.setUpObject.funcDepAtoBC());
        assertEquals(expected, result);
    }
    
    /**
     * Test method for {@link datastructures.Relation#split(ADependency)}
     * Splits in two relation {ABCDE} {A -> BC, BC -> A, BCD -> E, E -> C}
     * using dependency (BC -> A).
     * Result: {ABC} {A -> BC, BC -> A}
     *         {BCDE} {BCD -> E, E -> C}
     */
    @Test
    public void splitRelation1UsingBCtoA() {
        List<Relation> expected = new ArrayList<>();
        expected.add(this.setUpObject.relation1ABC());
        expected.add(this.setUpObject.relation1BCDE());
        List<Relation> result = this.one.split(this.setUpObject.funcDepBCtoA());
        assertEquals(expected, result);
    }
    
    /**
     * Test method for {@link datastructures.Relation#split(ADependency)}
     * Splits in two relation {ABCDE} {A -> BC, BC -> A, BCD -> E, E -> C}
     * using dependency (BCD -> E).
     * Result: {BCDE} {BCD -> E, E -> C}
     *         {ABCD} {A -> BC, BC -> A}
     */
    @Test
    public void splitRelation1UsingBCDtoE() {
        List<Relation> expected = new ArrayList<>();
        expected.add(this.setUpObject.relation1BCDE());
        expected.add(this.setUpObject.relation1ABCD());
        List<Relation> result = this.one.split(this.setUpObject.funcDepBCDtoE());
        assertEquals(expected, result);
    }
    
    /**
     * This test has some existential doubts
     * Splits in two relation {ABCDE} {A -> BC, BC -> A, BCD -> E, E -> C}
     * using dependency (E -> C).
     * Result: {CE} {E -> C}
     *         {ABDE} {A -> B, BE -> A, ABD -> E}
     */
    @Test
    public void splitRelation1UsingEtoC() {
        List<Relation> expected = new ArrayList<>();
        expected.add(this.setUpObject.relation1CE());
        expected.add(this.setUpObject.relation1ABDE());
        List<Relation> result = this.one.split(this.setUpObject.funcDepEtoC());
        assertEquals(expected, result);
    }
    
    /**
     * Gets a relation from {ABCDE} {A -> BC, BC -> A, BCD -> E, E -> C}
     * using dependency key {AD}.
     * Result: {AD} {}
     */
    @Test
    public void splitByKeyR1KeyAD() {
        Relation expected = this.setUpObject.relationAD();
        this.one = this.setUpObject.relationAD();
        AttributeJoint key = this.setUpObject.attrJntAD();
        assertEquals(expected, this.one.splitByKey(key));
    }
    
    /**
     * Gets a relation from {ABCDE} {A -> BC, BC -> A, BCD -> E, E -> C}
     * using dependency key {BCD}.
     * Result: {BCD} {}
     */
    @Test
    public void splitByKeyR1KeyBCD() {
        Relation expected = this.setUpObject.relationBCD();
        this.one = this.setUpObject.relation01();
        AttributeJoint key = this.setUpObject.attrJntBCD();
        assertEquals(expected, this.one.splitByKey(key));
    }
    
    /**
     * Gets a relation from {ABCDE} {A -> BC, BC -> A, BCD -> E, E -> C}
     * using dependency key {BDE}.
     * Result: {BDE} {}
     */
    @Test
    public void splitByKeyR1KeyBDE() {
        Relation expected = this.setUpObject.relationBDE();
        this.one = this.setUpObject.relation01();
        AttributeJoint key = this.setUpObject.attrJntBDE();
        assertEquals(expected, this.one.splitByKey(key));
    }
}
