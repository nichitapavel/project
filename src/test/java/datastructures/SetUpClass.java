/**
 * 
 */
package datastructures;

import datastructures.Attribute;
import datastructures.AttributeJoint;
import dependency.ADependency;
import dependency.FunctionalDependency;

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
    
    /******************/
    //FUNCTIONAL DEPENDENCY
    /******************/
    
    //Functional Dependency A -> B
    public ADependency funcDep_A_to_B() {
        ADependency funcDep = new FunctionalDependency(attrJntA(), attrJntB());
        return funcDep;
    }
    
    //Functional Dependency A -> C
    public ADependency funcDep_A_to_C() {
        ADependency funcDep = new FunctionalDependency(attrJntA(), attrJntC());
        return funcDep;
    }
    
    //Functional Dependency A -> D
    public ADependency funcDep_A_to_D() {
        ADependency funcDep = new FunctionalDependency(attrJntA(), attrJntD());
        return funcDep;
    }
    
    //Functional Dependency A -> E
    public ADependency funcDep_A_to_E() {
        ADependency funcDep = new FunctionalDependency(attrJntA(), attrJntE());
        return funcDep;
    }
    
    //Functional Dependency A -> BCD
    public ADependency funcDep_A_to_BCD() {
        ADependency funcDep = new FunctionalDependency(attrJntA(), attrJntBCD());
        return funcDep;
    }
    
    //Functional Dependency B -> C
    public ADependency funcDep_B_to_C() {
        ADependency funcDep = new FunctionalDependency(attrJntB(), attrJntC());
        return funcDep;
    }
    
    //Functional Dependency B -> D
    public ADependency funcDep_B_to_D() {
        ADependency funcDep = new FunctionalDependency(attrJntB(), attrJntD());
        return funcDep;
    }
    
    //Functional Dependency B -> E
    public ADependency funcDep_B_to_E() {
        ADependency funcDep = new FunctionalDependency(attrJntB(), attrJntE());
        return funcDep;
    }
    
    //Functional Dependency B -> AC
    public ADependency funcDep_B_to_AC() {
        ADependency funcDep = new FunctionalDependency(attrJntB(), attrJntAC());
        return funcDep;
    }
    
    //Functional Dependency B -> CE
    public ADependency funcDep_B_to_CE() {
        ADependency funcDep = new FunctionalDependency(attrJntB(), attrJntCE());
        return funcDep;
    }
    
    //Functional Dependency C -> A
    public ADependency funcDep_C_to_A() {
        ADependency funcDep = new FunctionalDependency(attrJntC(), attrJntA());
        return funcDep;
    }
    
    //Functional Dependency C -> B
    public ADependency funcDep_C_to_B() {
        ADependency funcDep = new FunctionalDependency(attrJntC(), attrJntB());
        return funcDep;
    }
    
    //Functional Dependency C -> B
    public ADependency funcDep_C_to_D() {
        ADependency funcDep = new FunctionalDependency(attrJntC(), attrJntD());
        return funcDep;
    }

    //Functional Dependency D -> C
    public ADependency funcDep_D_to_C() {
        ADependency funcDep = new FunctionalDependency(attrJntD(), attrJntC());
        return funcDep;
    }
    
    //Functional Dependency D -> E
    public ADependency funcDep_D_to_E() {
        ADependency funcDep = new FunctionalDependency(attrJntD(), attrJntE());
        return funcDep;
    }
    
    //Functional Dependency E -> C
    public ADependency funcDep_E_to_C() {
        ADependency funcDep = new FunctionalDependency(attrJntE(), attrJntC());
        return funcDep;
    }
    
    //Functional Dependency E -> D
    public ADependency funcDep_E_to_D() {
        ADependency funcDep = new FunctionalDependency(attrJntE(), attrJntD());
        return funcDep;
    }
    
    //Functional Dependency E -> DF
    public ADependency funcDep_E_to_DF() {
        ADependency funcDep = new FunctionalDependency(attrJntE(), attrJntDF());
        return funcDep;
    }
        
    //Functional Dependency E -> F
    public ADependency funcDep_E_to_F() {
        ADependency funcDep = new FunctionalDependency(attrJntE(), attrJntF());
        return funcDep;
    }

    //Functional Dependency F -> E
    public ADependency funcDep_F_to_E() {
        ADependency funcDep = new FunctionalDependency(attrJntF(), attrJntE());
        return funcDep;
    }
    
    //Functional Dependency A -> BC
    public ADependency funcDep_A_to_BC() {
        ADependency funcDep = new FunctionalDependency(attrJntA(), attrJntBC());
        return funcDep;
    }
    
    //Functional Dependency A -> CD
    public ADependency funcDep_A_to_CD() {
        ADependency funcDep = new FunctionalDependency(attrJntA(), attrJntCD());
        return funcDep;
    }
    
    //Functional Dependency C -> AB
    public ADependency funcDep_C_to_AB() {
        ADependency funcDep = new FunctionalDependency(attrJntC(), attrJntAB());
        return funcDep;
    }
    
    //Functional Dependency AB -> B
    public ADependency funcDep_AB_to_B() {
        ADependency funcDep = new FunctionalDependency(attrJntAB(), attrJntB());
        return funcDep;
    }
    
    //Functional Dependency AB -> C
    public ADependency funcDep_AB_to_C() {
        ADependency funcDep = new FunctionalDependency(attrJntAB(), attrJntC());
        return funcDep;
    }
    
    //Functional Dependency AB -> D
    public ADependency funcDep_AB_to_D() {
        ADependency funcDep = new FunctionalDependency(attrJntAB(), attrJntD());
        return funcDep;
    }
    
    //Functional Dependency AB -> CD
    public ADependency funcDep_AB_to_CD() {
        ADependency funcDep = new FunctionalDependency(attrJntAB(), attrJntCD());
        return funcDep;
    }
    
    //Functional Dependency AB -> BCD
    public ADependency funcDep_AB_to_BCD() {
        ADependency funcDep = new FunctionalDependency(attrJntAB(), attrJntBCD());
        return funcDep;
    }
    
    //Functional Dependency AD -> C
    public ADependency funcDep_AD_to_C() {
        ADependency funcDep = new FunctionalDependency(attrJntAD(), attrJntC());
        return funcDep;
    }
    
    //Functional Dependency AD -> E
    public ADependency funcDep_AD_to_E() {
        ADependency funcDep = new FunctionalDependency(attrJntAD(), attrJntE());
        return funcDep;
    }
    
    //Functional Dependency AE -> D
    public ADependency funcDep_AE_to_D() {
        ADependency funcDep = new FunctionalDependency(attrJntAE(), attrJntD());
        return funcDep;
    }
    
    //Functional Dependency AE -> F
    public ADependency funcDep_AE_to_F() {
        ADependency funcDep = new FunctionalDependency(attrJntAE(), attrJntF());
        return funcDep;
    }
    
    //Functional Dependency BC -> A
    public ADependency funcDep_BC_to_A() {
        ADependency funcDep = new FunctionalDependency(attrJntBC(), attrJntA());
        return funcDep;
    }
    
    //Functional Dependency BC -> E
    public ADependency funcDep_BC_to_E() {
        ADependency funcDep = new FunctionalDependency(attrJntBC(), attrJntE());
        return funcDep;
    }
    
    //Functional Dependency BD -> C
    public ADependency funcDep_BD_to_C() {
        ADependency funcDep = new FunctionalDependency(attrJntBD(), attrJntC());
        return funcDep;
    }
    
    //Functional Dependency BE -> A
    public ADependency funcDep_BE_to_A() {
        ADependency funcDep = new FunctionalDependency(attrJntBE(), attrJntA());
        return funcDep;
    }
    
    //Functional Dependency CD -> A
    public ADependency funcDep_CD_to_A() {
        ADependency funcDep = new FunctionalDependency(attrJntCD(), attrJntA());
        return funcDep;
    }
    
    //Functional Dependency CD -> E
    public ADependency funcDep_CD_to_E() {
        ADependency funcDep = new FunctionalDependency(attrJntCD(), attrJntE());
        return funcDep;
    }
    
    //Functional Dependency CF -> H
    public ADependency funcDep_CF_to_H() {
        ADependency funcDep = new FunctionalDependency(attrJntCF(), attrJntH());
        return funcDep;
    }
    
    //Functional Dependency DE -> C
    public ADependency funcDep_DE_to_C() {
        ADependency funcDep = new FunctionalDependency(attrJntDE(), attrJntC());
        return funcDep;
    }

    //Functional Dependency ABD -> E
    public ADependency funcDep_ABD_to_E() {
        ADependency funcDep = new FunctionalDependency(attrJntABD(), attrJntE());
        return funcDep;
    }
    
    //Functional Dependency ABD -> G
    public ADependency funcDep_ABD_to_G() {
        ADependency funcDep = new FunctionalDependency(attrJntABD(), attrJntG());
        return funcDep;
    }
    
    //Functional Dependency ABE -> G
    public ADependency funcDep_ABE_to_G() {
        ADependency funcDep = new FunctionalDependency(attrJntABE(), attrJntG());
        return funcDep;
    }
    
    //Functional Dependency ABE -> H
    public ADependency funcDep_ABE_to_H() {
        ADependency funcDep = new FunctionalDependency(attrJntABE(), attrJntH());
        return funcDep;
    }

    //Functional Dependency BCD -> E
    public ADependency funcDep_BCD_to_E() {
        ADependency funcDep = new FunctionalDependency(attrJntBCD(), attrJntE());
        return funcDep;
    }
}
