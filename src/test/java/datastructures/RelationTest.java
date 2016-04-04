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
    private KeyJoint secondFormRelationKeyJoint;
    private KeyJoint thirdFormRelationKeyJoint;
    private KeyJoint boyceCoddFormRelationKeyJoint;

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
        this.boyceCoddFormRelationKeyJoint = new KeyJoint(keysVector);
        keysVector.add(setUpObject.attrJntAC());
        this.thirdFormRelationKeyJoint = new KeyJoint(keysVector);
        keysVector.clear();
        keysVector.add(setUpObject.attrJntA());
        this.secondFormRelationKeyJoint = new KeyJoint(keysVector);
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

}