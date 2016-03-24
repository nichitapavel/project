/**
 * 
 */
package datastructures;

import datastructures.Attribute;
import datastructures.AttributeJoint;

/**
 * @author Pavel Nichita
 *
 */
public class SetUpClass {
  //New SetUp Objects for Testing

    /******************/
    //ATTRIBUTES
    /******************/

    //Attribute A
    public Attribute attrA() {
        return new Attribute("A");
    }

    //Attribute B
    public Attribute attrB() {
        return new Attribute("B");
    }

    //Attribute C
    public Attribute attrC() {
        return new Attribute("C");
    }

    //Attribute D
    public Attribute attrD() {
        return new Attribute("D");
    }

    //Attribute E
    public Attribute attrE() {
        return new Attribute("E");
    }

    //Attribute F
    public Attribute attrF() {
        return new Attribute("F");
    }

    //Attribute G
    public Attribute attrG() {
        return new Attribute("G");
    }

    //Attribute H
    public Attribute attrH() {
        return new Attribute("H");
    }

    /******************/
    //ATTRIBUTEJOINTS
    /******************/

    //AttributeJoint A
    public AttributeJoint attrJntA() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attrA());
        return attrJoint;
    }

    //AttributeJoint B
    public AttributeJoint attrJntB() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attrB());
        return attrJoint;
    }

    //AttributeJoint C
    public AttributeJoint attrJntC() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attrC());
        return attrJoint;
    }

    //AttributeJoint D
    public AttributeJoint attrJntD() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attrD());
        return attrJoint;
    }

    //AttributeJoint E
    public AttributeJoint attrJntE() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attrE());
        return attrJoint;
    }

    //AttributeJoint F
    public AttributeJoint attrJntF() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attrF());
        return attrJoint;
    }

    //AttributeJoint G
    public AttributeJoint attrJntG() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attrF());
        return attrJoint;
    }

    //AttributeJoint H
    public AttributeJoint attrJntH() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attrH());
        return attrJoint;
    }

    //AttributeJoint AB
    public AttributeJoint attrJntAB() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attrA());
        attrJoint.addAttributes(attrB());
        return attrJoint;
    }

    //AttributeJoint AC
    public AttributeJoint attrJntAC() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attrA());
        attrJoint.addAttributes(attrC());
        return attrJoint;
    }

    //AttributeJoint AD
    public AttributeJoint attrJntAD() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attrA());
        attrJoint.addAttributes(attrD());
        return attrJoint;
    }

    //AttributeJoint AE
    public AttributeJoint attrJntAE() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attrA());
        attrJoint.addAttributes(attrE());
        return attrJoint;
    }

    //AttributeJoint BC
    public AttributeJoint attrJntBC() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attrB());
        attrJoint.addAttributes(attrC());
        return attrJoint;
    }

    //AttributeJoint BD
    public AttributeJoint attrJntBD() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attrB());
        attrJoint.addAttributes(attrD());
        return attrJoint;
    }

    //AttributeJoint BE
    public AttributeJoint attrJntBE() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attrB());
        attrJoint.addAttributes(attrE());
        return attrJoint;
    }

    //AttributeJoint CD
    public AttributeJoint attrJntCD() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attrC());
        attrJoint.addAttributes(attrD());
        return attrJoint;
    }

    //AttributeJoint CE
    public AttributeJoint attrJntCE() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attrC());
        attrJoint.addAttributes(attrE());
        return attrJoint;
    }

    //AttributeJoint CF
    public AttributeJoint attrJntCF() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attrC());
        attrJoint.addAttributes(attrF());
        return attrJoint;
    }

    //AttributeJoint DE
    public AttributeJoint attrJntDE() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attrD());
        attrJoint.addAttributes(attrE());
        return attrJoint;
    }

    //AttributeJoint DF
    public AttributeJoint attrJntDF() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attrD());
        attrJoint.addAttributes(attrF());
        return attrJoint;
    }

    //AttributeJoint EF
    public AttributeJoint attrJntEF() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attrE());
        attrJoint.addAttributes(attrF());
        return attrJoint;
    }

    //AttributeJoint ABC
    public AttributeJoint attrJntABC() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attrA());
        attrJoint.addAttributes(attrB());
        attrJoint.addAttributes(attrC());
        return attrJoint;
    }

    //AttributeJoint ABD
    public AttributeJoint attrJntABD() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attrA());
        attrJoint.addAttributes(attrB());
        attrJoint.addAttributes(attrD());
        return attrJoint;
    }

    //AttributeJoint ABE
    public AttributeJoint attrJntABE() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attrA());
        attrJoint.addAttributes(attrB());
        attrJoint.addAttributes(attrE());
        return attrJoint;
    }

    //AttributeJoint ABF
    public AttributeJoint attrJntABF() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attrA());
        attrJoint.addAttributes(attrB());
        attrJoint.addAttributes(attrF());
        return attrJoint;
    }

    //AttributeJoint ACD
    public AttributeJoint attrJntACD() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attrA());
        attrJoint.addAttributes(attrC());
        attrJoint.addAttributes(attrD());
        return attrJoint;
    }

    //AttributeJoint ADE
    public AttributeJoint attrJntADE() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attrA());
        attrJoint.addAttributes(attrD());
        attrJoint.addAttributes(attrE());
        return attrJoint;
    }

    //AttributeJoint AEF
    public AttributeJoint attrJntAEF() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attrA());
        attrJoint.addAttributes(attrE());
        attrJoint.addAttributes(attrF());
        return attrJoint;
    }

    //AttributeJoint BCD
    public AttributeJoint attrJntBCD() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attrB());
        attrJoint.addAttributes(attrC());
        attrJoint.addAttributes(attrD());
        return attrJoint;
    }

    //AttributeJoint BDE
    public AttributeJoint attrJntBDE() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attrB());
        attrJoint.addAttributes(attrD());
        attrJoint.addAttributes(attrE());
        return attrJoint;
    }

    //AttributeJoint BEF
    public AttributeJoint attrJntBEF() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attrB());
        attrJoint.addAttributes(attrE());
        attrJoint.addAttributes(attrF());
        return attrJoint;
    }

    //AttributeJoint CDE
    public AttributeJoint attrJntCDE() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attrC());
        attrJoint.addAttributes(attrD());
        attrJoint.addAttributes(attrE());
        return attrJoint;
    }

    //AttributeJoint CDF
    public AttributeJoint attrJntCDF() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attrC());
        attrJoint.addAttributes(attrD());
        attrJoint.addAttributes(attrF());
        return attrJoint;
    }

    //AttributeJoint ABCD
    public AttributeJoint attrJntABCD() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attrA());
        attrJoint.addAttributes(attrB());
        attrJoint.addAttributes(attrC());
        attrJoint.addAttributes(attrD());
        return attrJoint;
    }

    //AttributeJoint ABDE
    public AttributeJoint attrJntABDE() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attrA());
        attrJoint.addAttributes(attrB());
        attrJoint.addAttributes(attrD());
        attrJoint.addAttributes(attrE());
        return attrJoint;
    }

    //AttributeJoint ABEF
    public AttributeJoint attrJntABEF() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attrA());
        attrJoint.addAttributes(attrB());
        attrJoint.addAttributes(attrE());
        attrJoint.addAttributes(attrF());
        return attrJoint;
    }

    //AttributeJoint ACDE
    public AttributeJoint attrJntACDE() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attrA());
        attrJoint.addAttributes(attrC());
        attrJoint.addAttributes(attrD());
        attrJoint.addAttributes(attrE());
        return attrJoint;
    }

    //AttributeJoint BCDE
    public AttributeJoint attrJntBCDE() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attrB());
        attrJoint.addAttributes(attrC());
        attrJoint.addAttributes(attrD());
        attrJoint.addAttributes(attrE());
        return attrJoint;
    }

    //AttributeJoint ABCDE
    public AttributeJoint attrJntABCDE() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attrA());
        attrJoint.addAttributes(attrB());
        attrJoint.addAttributes(attrC());
        attrJoint.addAttributes(attrD());
        attrJoint.addAttributes(attrE());
        return attrJoint;
    }

    //AttributeJoint BCDEF
    public AttributeJoint attrJntBCDEF() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attrB());
        attrJoint.addAttributes(attrC());
        attrJoint.addAttributes(attrD());
        attrJoint.addAttributes(attrE());
        attrJoint.addAttributes(attrF());
        return attrJoint;
    }

    //AttributeJoint ABCDEF
    public AttributeJoint attrJntABCDEF() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attrA());
        attrJoint.addAttributes(attrB());
        attrJoint.addAttributes(attrC());
        attrJoint.addAttributes(attrD());
        attrJoint.addAttributes(attrE());
        attrJoint.addAttributes(attrF());
        return attrJoint;
    }   

    //AttributeJoint ABEGH
    public AttributeJoint attrJntABEGH() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attrA());
        attrJoint.addAttributes(attrB());
        attrJoint.addAttributes(attrE());
        attrJoint.addAttributes(attrG());
        attrJoint.addAttributes(attrH());
        return attrJoint;
    }

    //AttributeJoint ABCDEFGH
    public AttributeJoint attrJntABCDEFGH() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attrA());
        attrJoint.addAttributes(attrB());
        attrJoint.addAttributes(attrC());
        attrJoint.addAttributes(attrD());
        attrJoint.addAttributes(attrE());
        attrJoint.addAttributes(attrF());
        attrJoint.addAttributes(attrG());
        attrJoint.addAttributes(attrH());
        return attrJoint;
    }   
}
