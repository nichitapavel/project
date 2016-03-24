/**
 * 
 */
package datastructures;

import datastructures.Attribute;
import datastructures.AttributeJoint;

/**
 * @author Pavel
 *
 */
public class SetUpClass {
  //New SetUp Objects for Testing

    /******************/
    //ATTRIBUTES
    /******************/
    
    //Attribute A
    public Attribute attr_A() {
        return new Attribute("A");
    }
    
    //Attribute B
    public Attribute attr_B() {
        return new Attribute("B");
    }
    
    //Attribute C
    public Attribute attr_C() {
        return new Attribute("C");
    }
        
    //Attribute D
    public Attribute attr_D() {
        return new Attribute("D");
    }
    
    //Attribute E
    public Attribute attr_E() {
        return new Attribute("E");
    }
    
    //Attribute F
    public Attribute attr_F() {
        return new Attribute("F");
    }
            
    //Attribute G
    public Attribute attr_G() {
        return new Attribute("G");
    }
        
    //Attribute H
    public Attribute attr_H() {
        return new Attribute("H");
    }
    
    /******************/
    //ATTRIBUTEJOINTS
    /******************/
    
    //AttributeJoint A
    public AttributeJoint attrJnt_A() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attr_A());
        return attrJoint;
    }
    
    //AttributeJoint B
    public AttributeJoint attrJnt_B() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attr_B());
        return attrJoint;
    }

    //AttributeJoint C
    public AttributeJoint attrJnt_C() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attr_C());
        return attrJoint;
    }
    
    //AttributeJoint D
    public AttributeJoint attrJnt_D() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attr_D());
        return attrJoint;
    }

    //AttributeJoint E
    public AttributeJoint attrJnt_E() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attr_E());
        return attrJoint;
    }
    
    //AttributeJoint F
    public AttributeJoint attrJnt_F() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attr_F());
        return attrJoint;
    }
    
    //AttributeJoint G
    public AttributeJoint attrJnt_G() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attr_G());
        return attrJoint;
    }

    //AttributeJoint H
    public AttributeJoint attrJnt_H() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attr_H());
        return attrJoint;
    }
    
    //AttributeJoint AB
    public AttributeJoint attrJnt_AB() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attr_A());
        attrJoint.addAttributes(attr_B());
        return attrJoint;
    }
    
    //AttributeJoint AC
    public AttributeJoint attrJnt_AC() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attr_A());
        attrJoint.addAttributes(attr_C());
        return attrJoint;
    }
    
    //AttributeJoint AD
    public AttributeJoint attrJnt_AD() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attr_A());
        attrJoint.addAttributes(attr_D());
        return attrJoint;
    }
    
    //AttributeJoint AE
    public AttributeJoint attrJnt_AE() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attr_A());
        attrJoint.addAttributes(attr_E());
        return attrJoint;
    }
    
    //AttributeJoint BC
    public AttributeJoint attrJnt_BC() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attr_B());
        attrJoint.addAttributes(attr_C());
        return attrJoint;
    }
    
    //AttributeJoint BD
    public AttributeJoint attrJnt_BD() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attr_B());
        attrJoint.addAttributes(attr_D());
        return attrJoint;
    }
    
    //AttributeJoint BE
    public AttributeJoint attrJnt_BE() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attr_B());
        attrJoint.addAttributes(attr_E());
        return attrJoint;
    }
    
    //AttributeJoint CD
    public AttributeJoint attrJnt_CD() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attr_C());
        attrJoint.addAttributes(attr_D());
        return attrJoint;
    }

    //AttributeJoint CE
    public AttributeJoint attrJnt_CE() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attr_C());
        attrJoint.addAttributes(attr_E());
        return attrJoint;
    }
    
    //AttributeJoint CF
    public AttributeJoint attrJnt_CF() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attr_C());
        attrJoint.addAttributes(attr_F());
        return attrJoint;
    }
    
    //AttributeJoint DE
    public AttributeJoint attrJnt_DE() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attr_D());
        attrJoint.addAttributes(attr_E());
        return attrJoint;
    }
    
    //AttributeJoint DF
    public AttributeJoint attrJnt_DF() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attr_D());
        attrJoint.addAttributes(attr_F());
        return attrJoint;
    }
    
    //AttributeJoint EF
    public AttributeJoint attrJnt_EF() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attr_E());
        attrJoint.addAttributes(attr_F());
        return attrJoint;
    }

    //AttributeJoint ABC
    public AttributeJoint attrJnt_ABC() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attr_A());
        attrJoint.addAttributes(attr_B());
        attrJoint.addAttributes(attr_C());
        return attrJoint;
    }
    
    //AttributeJoint ABD
    public AttributeJoint attrJnt_ABD() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attr_A());
        attrJoint.addAttributes(attr_B());
        attrJoint.addAttributes(attr_D());
        return attrJoint;
    }
    
    //AttributeJoint ABE
    public AttributeJoint attrJnt_ABE() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attr_A());
        attrJoint.addAttributes(attr_B());
        attrJoint.addAttributes(attr_E());
        return attrJoint;
    }
    
    //AttributeJoint ABF
    public AttributeJoint attrJnt_ABF() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attr_A());
        attrJoint.addAttributes(attr_B());
        attrJoint.addAttributes(attr_F());
        return attrJoint;
    }
    
    //AttributeJoint ACD
    public AttributeJoint attrJnt_ACD() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attr_A());
        attrJoint.addAttributes(attr_C());
        attrJoint.addAttributes(attr_D());
        return attrJoint;
    }
    
    //AttributeJoint ADE
    public AttributeJoint attrJnt_ADE() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attr_A());
        attrJoint.addAttributes(attr_D());
        attrJoint.addAttributes(attr_E());
        return attrJoint;
    }
    
    //AttributeJoint AEF
    public AttributeJoint attrJnt_AEF() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attr_A());
        attrJoint.addAttributes(attr_E());
        attrJoint.addAttributes(attr_F());
        return attrJoint;
    }
    
    //AttributeJoint BCD
    public AttributeJoint attrJnt_BCD() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attr_B());
        attrJoint.addAttributes(attr_C());
        attrJoint.addAttributes(attr_D());
        return attrJoint;
    }
    
    //AttributeJoint BDE
    public AttributeJoint attrJnt_BDE() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attr_B());
        attrJoint.addAttributes(attr_D());
        attrJoint.addAttributes(attr_E());
        return attrJoint;
    }
    
    //AttributeJoint BEF
    public AttributeJoint attrJnt_BEF() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attr_B());
        attrJoint.addAttributes(attr_E());
        attrJoint.addAttributes(attr_F());
        return attrJoint;
    }
    
    //AttributeJoint CDE
    public AttributeJoint attrJnt_CDE() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attr_C());
        attrJoint.addAttributes(attr_D());
        attrJoint.addAttributes(attr_E());
        return attrJoint;
    }
    
    //AttributeJoint CDF
    public AttributeJoint attrJnt_CDF() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attr_C());
        attrJoint.addAttributes(attr_D());
        attrJoint.addAttributes(attr_F());
        return attrJoint;
    }
    
    //AttributeJoint ABCD
    public AttributeJoint attrJnt_ABCD() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attr_A());
        attrJoint.addAttributes(attr_B());
        attrJoint.addAttributes(attr_C());
        attrJoint.addAttributes(attr_D());
        return attrJoint;
    }
    
    //AttributeJoint ABDE
    public AttributeJoint attrJnt_ABDE() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attr_A());
        attrJoint.addAttributes(attr_B());
        attrJoint.addAttributes(attr_D());
        attrJoint.addAttributes(attr_E());
        return attrJoint;
    }
    
    //AttributeJoint ABEF
    public AttributeJoint attrJnt_ABEF() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attr_A());
        attrJoint.addAttributes(attr_B());
        attrJoint.addAttributes(attr_E());
        attrJoint.addAttributes(attr_F());
        return attrJoint;
    }
    
    //AttributeJoint ACDE
    public AttributeJoint attrJnt_ACDE() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attr_A());
        attrJoint.addAttributes(attr_C());
        attrJoint.addAttributes(attr_D());
        attrJoint.addAttributes(attr_E());
        return attrJoint;
    }
    
    //AttributeJoint BCDE
    public AttributeJoint attrJnt_BCDE() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attr_B());
        attrJoint.addAttributes(attr_C());
        attrJoint.addAttributes(attr_D());
        attrJoint.addAttributes(attr_E());
        return attrJoint;
    }
    
    //AttributeJoint ABCDE
    public AttributeJoint attrJnt_ABCDE() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attr_A());
        attrJoint.addAttributes(attr_B());
        attrJoint.addAttributes(attr_C());
        attrJoint.addAttributes(attr_D());
        attrJoint.addAttributes(attr_E());
        return attrJoint;
    }
    
    //AttributeJoint BCDEF
    public AttributeJoint attrJnt_BCDEF() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attr_B());
        attrJoint.addAttributes(attr_C());
        attrJoint.addAttributes(attr_D());
        attrJoint.addAttributes(attr_E());
        attrJoint.addAttributes(attr_F());
        return attrJoint;
    }
    
    //AttributeJoint ABCDEF
    public AttributeJoint attrJnt_ABCDEF() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attr_A());
        attrJoint.addAttributes(attr_B());
        attrJoint.addAttributes(attr_C());
        attrJoint.addAttributes(attr_D());
        attrJoint.addAttributes(attr_E());
        attrJoint.addAttributes(attr_F());
        return attrJoint;
    }   
    
    //AttributeJoint ABEGH
    public AttributeJoint attrJnt_ABEGH() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attr_A());
        attrJoint.addAttributes(attr_B());
        attrJoint.addAttributes(attr_E());
        attrJoint.addAttributes(attr_G());
        attrJoint.addAttributes(attr_H());
        return attrJoint;
    }
    
    //AttributeJoint ABCDEFGH
    public AttributeJoint attrJnt_ABCDEFGH() {
        AttributeJoint attrJoint = new AttributeJoint();
        attrJoint.addAttributes(attr_A());
        attrJoint.addAttributes(attr_B());
        attrJoint.addAttributes(attr_C());
        attrJoint.addAttributes(attr_D());
        attrJoint.addAttributes(attr_E());
        attrJoint.addAttributes(attr_F());
        attrJoint.addAttributes(attr_G());
        attrJoint.addAttributes(attr_H());
        return attrJoint;
    }   
}
