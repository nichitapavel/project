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
    public ADependency funcDepAtoB() {
        return new FunctionalDependency(attrJntA(), attrJntB());
    }
    
    //Functional Dependency A -> C
    public ADependency funcDepAtoC() {
        return new FunctionalDependency(attrJntA(), attrJntC());
    }
    
    //Functional Dependency A -> D
    public ADependency funcDepAtoD() {
        return new FunctionalDependency(attrJntA(), attrJntD());
    }
    
    //Functional Dependency A -> E
    public ADependency funcDepAtoE() {
        return new FunctionalDependency(attrJntA(), attrJntE());
    }
    
    //Functional Dependency A -> BCD
    public ADependency funcDepAtoBCD() {
        return new FunctionalDependency(attrJntA(), attrJntBCD());
    }
    
    //Functional Dependency B -> C
    public ADependency funcDepBtoC() {
        return new FunctionalDependency(attrJntB(), attrJntC());
    }
    
    //Functional Dependency B -> D
    public ADependency funcDepBtoD() {
        return new FunctionalDependency(attrJntB(), attrJntD());
    }
    
    //Functional Dependency B -> E
    public ADependency funcDepBtoE() {
        return new FunctionalDependency(attrJntB(), attrJntE());
    }
    
    //Functional Dependency B -> AC
    public ADependency funcDepBtoAC() {
        return new FunctionalDependency(attrJntB(), attrJntAC());
    }
    
    //Functional Dependency B -> CE
    public ADependency funcDepBtoCE() {
        return new FunctionalDependency(attrJntB(), attrJntCE());
    }
    
    //Functional Dependency C -> A
    public ADependency funcDepCtoA() {
        return new FunctionalDependency(attrJntC(), attrJntA());
    }
    
    //Functional Dependency C -> B
    public ADependency funcDepCtoB() {
        return new FunctionalDependency(attrJntC(), attrJntB());
    }
    
    //Functional Dependency C -> B
    public ADependency funcDepCtoD() {
        return new FunctionalDependency(attrJntC(), attrJntD());
    }

    //Functional Dependency D -> C
    public ADependency funcDepDtoC() {
        return new FunctionalDependency(attrJntD(), attrJntC());
    }
    
    //Functional Dependency D -> E
    public ADependency funcDepDtoE() {
        return new FunctionalDependency(attrJntD(), attrJntE());
    }
    
    //Functional Dependency E -> C
    public ADependency funcDepEtoC() {
        return new FunctionalDependency(attrJntE(), attrJntC());
    }
    
    //Functional Dependency E -> D
    public ADependency funcDepEtoD() {
        return new FunctionalDependency(attrJntE(), attrJntD());
    }
    
    //Functional Dependency E -> DF
    public ADependency funcDepEtoDF() {
        return new FunctionalDependency(attrJntE(), attrJntDF());
    }
        
    //Functional Dependency E -> F
    public ADependency funcDepEtoF() {
        return new FunctionalDependency(attrJntE(), attrJntF());
    }

    //Functional Dependency F -> E
    public ADependency funcDepFtoE() {
        return new FunctionalDependency(attrJntF(), attrJntE());
    }
    
    //Functional Dependency A -> BC
    public ADependency funcDepAtoBC() {
        return new FunctionalDependency(attrJntA(), attrJntBC());
    }
    
    //Functional Dependency A -> CD
    public ADependency funcDepAtoCD() {
        return new FunctionalDependency(attrJntA(), attrJntCD());
    }
    
    //Functional Dependency C -> AB
    public ADependency funcDepCtoAB() {
        return new FunctionalDependency(attrJntC(), attrJntAB());
    }
    
    //Functional Dependency AB -> B
    public ADependency funcDepABtoB() {
        return new FunctionalDependency(attrJntAB(), attrJntB());
    }
    
    //Functional Dependency AB -> C
    public ADependency funcDepABtoC() {
        return new FunctionalDependency(attrJntAB(), attrJntC());
    }
    
    //Functional Dependency AB -> D
    public ADependency funcDepABtoD() {
        return new FunctionalDependency(attrJntAB(), attrJntD());
    }
    
    //Functional Dependency AB -> CD
    public ADependency funcDepABtoCD() {
        return new FunctionalDependency(attrJntAB(), attrJntCD());
    }
    
    //Functional Dependency AB -> BCD
    public ADependency funcDepABtoBCD() {
        return new FunctionalDependency(attrJntAB(), attrJntBCD());
    }
    
    //Functional Dependency AD -> C
    public ADependency funcDepADtoC() {
        return new FunctionalDependency(attrJntAD(), attrJntC());
    }
    
    //Functional Dependency AD -> E
    public ADependency funcDepADtoE() {
        return new FunctionalDependency(attrJntAD(), attrJntE());
    }
    
    //Functional Dependency AE -> D
    public ADependency funcDepAEtoD() {
        return new FunctionalDependency(attrJntAE(), attrJntD());
    }
    
    //Functional Dependency AE -> F
    public ADependency funcDepAEtoF() {
        return new FunctionalDependency(attrJntAE(), attrJntF());
    }
    
    //Functional Dependency BC -> A
    public ADependency funcDepBCtoA() {
        return new FunctionalDependency(attrJntBC(), attrJntA());
    }
    
    //Functional Dependency BC -> E
    public ADependency funcDepBCtoE() {
        return new FunctionalDependency(attrJntBC(), attrJntE());
    }

    //Functional Dependency BD -> C
    public ADependency funcDepBDtoC() {
        return new FunctionalDependency(attrJntBD(), attrJntC());
    }
    
    //Functional Dependency BE -> A
    public ADependency funcDepBEtoA() {
        return new FunctionalDependency(attrJntBE(), attrJntA());
    }
    
    //Functional Dependency CD -> A
    public ADependency funcDepCDtoA() {
        return new FunctionalDependency(attrJntCD(), attrJntA());
    }
    
    //Functional Dependency CD -> E
    public ADependency funcDepCDtoE() {
        return new FunctionalDependency(attrJntCD(), attrJntE());
    }
    
    //Functional Dependency CF -> H
    public ADependency funcDepCFtoH() {
        return new FunctionalDependency(attrJntCF(), attrJntH());
    }
    
    //Functional Dependency DE -> C
    public ADependency funcDepDEtoC() {
        return new FunctionalDependency(attrJntDE(), attrJntC());
    }

    //Functional Dependency ABD -> E
    public ADependency funcDepABDtoE() {
        return new FunctionalDependency(attrJntABD(), attrJntE());
    }
    
    //Functional Dependency ABD -> G
    public ADependency funcDepABDtoG() {
        return new FunctionalDependency(attrJntABD(), attrJntG());
    }
    
    //Functional Dependency ABE -> G
    public ADependency funcDepABEtoG() {
        return new FunctionalDependency(attrJntABE(), attrJntG());
    }
    
    //Functional Dependency ABE -> H
    public ADependency funcDepABEtoH() {
        return new FunctionalDependency(attrJntABE(), attrJntH());
    }

    //Functional Dependency BCD -> E
    public ADependency funcDepBCDtoE() {
        return new FunctionalDependency(attrJntBCD(), attrJntE());
    }
}
