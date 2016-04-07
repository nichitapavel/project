/**
 * 
 */
package datastructures;

import java.util.ArrayList;
import java.util.List;

import datastructures.Attribute;
import datastructures.AttributeJoint;
import dependency.ADependency;
import dependency.FunctionalDependency;
import dependency.PluralDependency;
import utils.Const;

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
        attrJoint.addAttributes(attrG());
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
    
    /******************/
    //KeyJoint
    /******************/
    
    //KeyJoint A
    public KeyJoint keyJointA() {
        KeyJoint keyJoint = new KeyJoint();
        keyJoint.addKey(attrJntA());
        return keyJoint;
    }
    
    //KeyJoint AB
    public KeyJoint keyJointAb() {
        KeyJoint keyJoint = new KeyJoint();
        keyJoint.addKey(attrJntAB());
        return keyJoint;
    }
    
    //KeyJoint AB_AC
    public KeyJoint keyJointAbAc() {
        KeyJoint keyJoint = new KeyJoint();
        keyJoint.addKey(attrJntAB());
        keyJoint.addKey(attrJntAC());
        return keyJoint;
    }
        
    //KeyJoint AD_CD
    public KeyJoint keyJointAdCd() {
        KeyJoint keyJoint = new KeyJoint();
        keyJoint.addKey(attrJntAD());
        keyJoint.addKey(attrJntCD());
        return keyJoint;
    }
    
    //KeyJoint AD_BCD_BDE
    public KeyJoint keyJointAdBcdBde() {
        KeyJoint keyJoint = new KeyJoint();
        keyJoint.addKey(attrJntAD());
        keyJoint.addKey(attrJntBCD());
        keyJoint.addKey(attrJntBDE());
        return keyJoint;
    }
    
    //KeyJoint CD_CE_CF_ABD_ABE_ABF
    public KeyJoint keyJointCdCeCfAbdAbeAbf() {
        KeyJoint keyJoint = new KeyJoint();
        keyJoint.addKey(attrJntCD());
        keyJoint.addKey(attrJntCE());
        keyJoint.addKey(attrJntCF());
        keyJoint.addKey(attrJntABD());
        keyJoint.addKey(attrJntABE());
        keyJoint.addKey(attrJntABF());
        return keyJoint;
    }
    
    //KeyJoint DE
    public KeyJoint keyJointDe() {
        KeyJoint keyJoint = new KeyJoint();
        keyJoint.addKey(attrJntDE());
        return keyJoint;
    }
    
    //KeyJoint AE_DE
    public KeyJoint keyJointAeDe() {
        KeyJoint keyJoint = new KeyJoint();
        keyJoint.addKey(attrJntAE());
        keyJoint.addKey(attrJntDE());
        return keyJoint;
    }
    
    //KeyJoint AC
    public KeyJoint keyJointAc() {
        KeyJoint keyJoint = new KeyJoint();
        keyJoint.addKey(attrJntAC());
        return keyJoint;
    }
    
    //KeyJoint ABC
    public KeyJoint keyJointAbc() {
        KeyJoint keyJoint = new KeyJoint();
        keyJoint.addKey(attrJntABC());
        return keyJoint;
    }
    
    //KeyJoint CDF
    public KeyJoint keyJointCdf() {
        KeyJoint keyJoint = new KeyJoint();
        keyJoint.addKey(attrJntCDF());
        return keyJoint;
    }
    
    //KeyJoint BEF
    public KeyJoint keyJointBef() {
        KeyJoint keyJoint = new KeyJoint();
        keyJoint.addKey(attrJntBEF());
        return keyJoint;
    }
    
    //KeyJoint ABDE
    public KeyJoint keyJointAbde() {
        KeyJoint keyJoint = new KeyJoint();
        keyJoint.addKey(attrJntABDE());
        return keyJoint;
    }
    
    /******************/
    //DFJoint
    /******************/
    
    //DFJoint One = {A -> BC, BC -> A, BCD -> E, E -> C}
    public DFJoint dfJoint01() {
        DFJoint dfJoint = new DFJoint();
        dfJoint.setName("DFJoint One");
        dfJoint.addDependency(funcDepAtoBC());
        dfJoint.addDependency(funcDepBCtoA());
        dfJoint.addDependency(funcDepBCDtoE());
        dfJoint.addDependency(funcDepEtoC());
        return dfJoint;
    }
    
    //DFJoint Two = {A -> BC, BC -> E, CD -> A}
    public DFJoint dfJoint02() {
        DFJoint dfJoint = new DFJoint();
        dfJoint.setName("DFJoint Two");
        dfJoint.addDependency(funcDepAtoBC());
        dfJoint.addDependency(funcDepBCtoE());
        dfJoint.addDependency(funcDepCDtoA());
        return dfJoint;
    }
    
    //DFJoint Three = {AB -> C, C -> AB, E -> D, D -> E, E -> F, F -> E, ABD -> G, CF -> H}
    public DFJoint dfJoint03() {
        DFJoint dfJoint = new DFJoint();
        dfJoint.setName("DFJoint Three");
        dfJoint.addDependency(funcDepABtoC());
        dfJoint.addDependency(funcDepCtoAB());
        dfJoint.addDependency(funcDepEtoD());
        dfJoint.addDependency(funcDepDtoE());
        dfJoint.addDependency(funcDepEtoF());
        dfJoint.addDependency(funcDepFtoE());
        dfJoint.addDependency(funcDepABDtoG());
        dfJoint.addDependency(funcDepCFtoH());
        return dfJoint;
    }
    
    //DFJoint Four = {A -> BC, B -> C, A -> B, AB -> C}
    public DFJoint dfJoint04() {
        DFJoint dfJoint = new DFJoint();
        dfJoint.setName("DFJoint Four");
        dfJoint.addDependency(funcDepAtoBC());
        dfJoint.addDependency(funcDepBtoC());
        dfJoint.addDependency(funcDepAtoB());
        dfJoint.addDependency(funcDepABtoC());
        return dfJoint;
    }
    
    //DFJoint Five = {A -> B, B -> C}
    public DFJoint dfJoint05() {
        DFJoint dfJoint = new DFJoint();
        dfJoint.setName("DFJoint Five");
        dfJoint.addDependency(funcDepAtoB());
        dfJoint.addDependency(funcDepBtoC());
        return dfJoint;
    }
    
    //DFJoint Six = {AB -> D, B -> C, C -> B, B -> E}
    public DFJoint dfJoint06() {
        DFJoint dfJoint = new DFJoint();
        dfJoint.setName("DFJoint Six");
        dfJoint.addDependency(funcDepABtoD());
        dfJoint.addDependency(funcDepBtoC());
        dfJoint.addDependency(funcDepCtoB());
        dfJoint.addDependency(funcDepBtoE());
        return dfJoint;
    }
    
    //DFJoint Seven = {A -> B, B -> C, C -> D}
    public DFJoint dfJoint07() {
        DFJoint dfJoint = new DFJoint();
        dfJoint.setName("DFJoint Seven");
        dfJoint.addDependency(funcDepAtoB());
        dfJoint.addDependency(funcDepBtoC());
        dfJoint.addDependency(funcDepCtoD());
        return dfJoint;
    }
    
    //DFJoint Eight = {B -> C, AB -> D, C -> B}
    public DFJoint dfJoint08() {
        DFJoint dfJoint = new DFJoint();
        dfJoint.setName("DFJoint Eight");
        dfJoint.addDependency(funcDepBtoC());
        dfJoint.addDependency(funcDepABtoD());
        dfJoint.addDependency(funcDepCtoB());
        return dfJoint;
    }
    
    //DFJoint Nine = {AB -> C}
    public DFJoint dfJoint09() {
        DFJoint dfJoint = new DFJoint();
        dfJoint.setName("DFJoint Nine");
        dfJoint.addDependency(funcDepABtoC());
        return dfJoint;
    }
    
    //DFJoint Ten = {AB -> C, C -> A}
    public DFJoint dfJoint10() {
        DFJoint dfJoint = new DFJoint();
        dfJoint.setName("DFJoint Ten");
        dfJoint.addDependency(funcDepABtoC());
        dfJoint.addDependency(funcDepCtoA());
        return dfJoint;
    }
    
    //DFJoint Eleven = {C -> A}
    public DFJoint dfJoint11() {
        DFJoint dfJoint = new DFJoint();
        dfJoint.setName("DFJoint Eleven");
        dfJoint.addDependency(funcDepCtoA());
        return dfJoint;
    }
    
    //DFJoint Twelve = {A -> B, CD -> A, BD -> C, DE -> C}
    public DFJoint dfJoint12() {
        DFJoint dfJoint = new DFJoint();
        dfJoint.setName("DFJoint Twelve");
        dfJoint.addDependency(funcDepAtoB());
        dfJoint.addDependency(funcDepCDtoA());
        dfJoint.addDependency(funcDepBDtoC());
        dfJoint.addDependency(funcDepDEtoC());
        return dfJoint;
    }
    
    //DFJoint Thirteen = {A -> B}
    public DFJoint dfJoint13() {
        DFJoint dfJoint = new DFJoint();
        dfJoint.setName("DFJoint Thirteen");
        dfJoint.addDependency(funcDepAtoB());
        return dfJoint;
    }
    
    //DFJoint Fourteen = {CD -> A, AD -> C, DE -> C}
    public DFJoint dfJoint14() {
        DFJoint dfJoint = new DFJoint();
        dfJoint.setName("DFJoint Fourteen");
        dfJoint.addDependency(funcDepCDtoA());
        dfJoint.addDependency(funcDepADtoC());
        dfJoint.addDependency(funcDepDEtoC());
        return dfJoint;
    }
    
    //DFJoint Fifteen = {CD -> A, AD -> C}
    public DFJoint dfJoint15() {
        DFJoint dfJoint = new DFJoint();
        dfJoint.setName("DFJoint Fifteen");
        dfJoint.addDependency(funcDepCDtoA());
        dfJoint.addDependency(funcDepADtoC());
        return dfJoint;
    }
    
    //DFJoint Sixteen = {DE -> C}
    public DFJoint dfJoint16() {
        DFJoint dfJoint = new DFJoint();
        dfJoint.setName("DFJoint Sixteen");
        dfJoint.addDependency(funcDepDEtoC());
        return dfJoint;
    }
    
    //DFJoint Seventeen = {BCD -> E, E -> C}
    public DFJoint dfJoint17() {
        DFJoint dfJoint = new DFJoint();
        dfJoint.setName("DFJoint Seventeen");
        dfJoint.addDependency(funcDepBCDtoE());
        dfJoint.addDependency(funcDepEtoC());
        return dfJoint;
    }
    
    //DFJoint Eighteen = {E -> C}
    public DFJoint dfJoint18() {
        DFJoint dfJoint = new DFJoint();
        dfJoint.setName("DFJoint Eighteen");
        dfJoint.addDependency(funcDepEtoC());
        return dfJoint;
    }
    
    //DFJoint Nineteen = {AB -> C, C -> B}
    public DFJoint dfJoint19() {
        DFJoint dfJoint = new DFJoint();
        dfJoint.setName("DFJoint Nineteen");
        dfJoint.addDependency(funcDepABtoC());
        dfJoint.addDependency(funcDepCtoB());
        return dfJoint;
    }
    
    //DFJoint Twenty = {C -> B}
    public DFJoint dfJoint20() {
        DFJoint dfJoint = new DFJoint();
        dfJoint.setName("DFJoint Twenty");
        dfJoint.addDependency(funcDepCtoB());
        return dfJoint;
    }
    
    //DFJoint Twentyone = {A -> C}
    public DFJoint dfJoint21() {
        DFJoint dfJoint = new DFJoint();
        dfJoint.setName("DFJoint Twentyone");
        dfJoint.addDependency(funcDepAtoC());
        return dfJoint;
    }
    
    //DFJoint Twentytwo = {B -> C}
    public DFJoint dfJoint22() {
        DFJoint dfJoint = new DFJoint();
        dfJoint.setName("DFJoint Twentytwo");
        dfJoint.addDependency(funcDepBtoC());
        return dfJoint;
    }
    
    //DFJoint Twentythree = {AB -> C, C -> AB, E ->DF, D -> E, F -> E, ABD -> G, CF -> H}
    public DFJoint dfJoint23() {
        DFJoint dfJoint = new DFJoint();
        dfJoint.setName("DFJoint Twentythree");
        dfJoint.addDependency(funcDepABtoC());
        dfJoint.addDependency(funcDepCtoAB());
        dfJoint.addDependency(funcDepEtoDF());
        dfJoint.addDependency(funcDepDtoE());
        dfJoint.addDependency(funcDepFtoE());
        dfJoint.addDependency(funcDepABDtoG());
        dfJoint.addDependency(funcDepCFtoH());
        return dfJoint;
    }
    
    //DFJoint Twentyfour = {A -> BC, B -> C, AB -> C}
    public DFJoint dfJoint24() {
        DFJoint dfJoint = new DFJoint();
        dfJoint.setName("DFJoint Twentyfour");
        dfJoint.addDependency(funcDepAtoBC());
        dfJoint.addDependency(funcDepBtoC());
        dfJoint.addDependency(funcDepABtoC());
        return dfJoint;
    }
    
    //DFJoint Twentyfive = {A -> B, A -> C, A -> D, D -> E}
    public DFJoint dfJoint25() {
        DFJoint dfJoint = new DFJoint();
        dfJoint.setName("DFJoint Twentyfive");
        dfJoint.addDependency(funcDepAtoB());
        dfJoint.addDependency(funcDepAtoC());
        dfJoint.addDependency(funcDepAtoD());
        dfJoint.addDependency(funcDepDtoE());
        return dfJoint;
    }
    
    //DFJoint Twentysix = {A -> BC, D -> E}
    public DFJoint dfJoint26() {
        DFJoint dfJoint = new DFJoint();
        dfJoint.setName("DFJoint Twentysix");
        dfJoint.addDependency(funcDepAtoBCD());
        dfJoint.addDependency(funcDepDtoE());
        return dfJoint;
    }
    
    //DFJoint Twentyseven = {AB -> D, B -> CE, C -> B}
    public DFJoint dfJoint27() {
        DFJoint dfJoint = new DFJoint();
        dfJoint.setName("DFJoint Twentyseven");
        dfJoint.addDependency(funcDepABtoD());
        dfJoint.addDependency(funcDepBtoCE());
        dfJoint.addDependency(funcDepCtoB());
        return dfJoint;
    }
    
    //DFJoint OneMinusAtoBC = {BC -> A, BCD -> E, E -> C}
    public DFJoint dfJoint1MinusAtoBC() {
        DFJoint dfJoint = new DFJoint();
        dfJoint.setName("DFJoint One minus A -> BC");
        dfJoint.addDependency(funcDepBCtoA());
        dfJoint.addDependency(funcDepBCDtoE());
        dfJoint.addDependency(funcDepEtoC());
        return dfJoint;
    }
    
    //DFJoint FiveMinusBtoC = {A -> B}
    public DFJoint dfJoint5MinusBtoC() {
        DFJoint dfJoint = new DFJoint();
        dfJoint.setName("DFJoint Five minus B -> C");
        dfJoint.addDependency(funcDepAtoB());
        return dfJoint;
    }
    
    //DFJoint Twentyeight = {A -> BCD}
    public DFJoint dfJoint28() {
        DFJoint dfJoint = new DFJoint();
        dfJoint.setName("DFJoint Twentyeight");
        dfJoint.addDependency(funcDepAtoBCD());
        return dfJoint;
    }
    
    //DFJoint FourRegroupedWithoutCinAtoBC
    public DFJoint dfJoint4ReGroupedWithoutCinAtoBC() {
        DFJoint dfJoint = new DFJoint();
        dfJoint.setName("DFJoint Four Regrouped Without C in A->BC");
        dfJoint.addDependency(funcDepAtoB());
        dfJoint.addDependency(funcDepBtoC());
        dfJoint.addDependency(funcDepABtoC());
        return dfJoint;
    }
    
    //DFJoint FourRegroupedWithoutAinABtoC
    public DFJoint dfJoint4RegroupedWithoutAinABtoC() {
        DFJoint dfJoint = new DFJoint();
        dfJoint.setName("DFJoint Four Regrouped Without A in AB->C");
        dfJoint.addDependency(funcDepAtoBC());
        dfJoint.addDependency(funcDepBtoC());
        return dfJoint;
    }
    
    //DFJoint AtoBC = {A -> BC}
    public DFJoint dfJointAtoBC() {
        DFJoint dfJoint = new DFJoint();
        dfJoint.setName("DFJoint AtoBC");
        dfJoint.addDependency(funcDepAtoBC());
        return dfJoint;
    }
    
    //DFJoint AtoE = {A -> E}
    public DFJoint dfJointAtoE() {
        DFJoint dfJoint = new DFJoint();
        dfJoint.setName("DFJoint AtoE");
        dfJoint.addDependency(funcDepAtoE());
        return dfJoint;
    }
    
    //DFJoint CtoA = {C -> A}
    public DFJoint dfJointCtoA() {
        DFJoint dfJoint = new DFJoint();
        dfJoint.setName("DFJoint CtoA");
        dfJoint.addDependency(funcDepCtoA());
        return dfJoint;
    }
    
    //DFJoint dfJoint_BtoD = {B -> D}
    public DFJoint dfJointBtoD() {
        DFJoint dfJoint = new DFJoint();
        dfJoint.setName("DFJoint BtoD");
        dfJoint.addDependency(funcDepBtoD());
        return dfJoint;
    }
    
    //DFJoint dfJoint_BtoE = {B -> E}
    public DFJoint dfJointBtoE() {
        DFJoint dfJoint = new DFJoint();
        dfJoint.setName("DFJoint BtoE");
        dfJoint.addDependency(funcDepBtoE());
        return dfJoint;
    }
    
    //DFJoint dfJoint_ABtoD_BtoC_CtoB = {AB -> D, B -> C, C -> B}
    public DFJoint dfJointABtodBtocCtob() {
        DFJoint dfJoint = new DFJoint();
        dfJoint.setName("DFJoint ABtoD_BtoC_CtoB");
        dfJoint.addDependency(funcDepABtoD());
        dfJoint.addDependency(funcDepBtoC());
        dfJoint.addDependency(funcDepCtoB());
        return dfJoint;
    }
    
    //DFJoint dfJoint_ABtoC_CtoAB = {AB -> C, C -> AB}
    public DFJoint dfJointABtocCtoab() {
        DFJoint dfJoint = new DFJoint();
        dfJoint.setName("DFJoint ABtoC_CtoAB");
        dfJoint.addDependency(funcDepABtoC());
        dfJoint.addDependency(funcDepCtoAB());
        return dfJoint;
    }
    
    //DFJoint EtoD_DtoE = {E -> D, D -> E}
    public DFJoint dfJointEtodDtoe() {
        DFJoint dfJoint = new DFJoint();
        dfJoint.setName("DFJoint EtoD_DtoE");
        dfJoint.addDependency(funcDepEtoD());
        dfJoint.addDependency(funcDepDtoE());
        return dfJoint;
    }

    //DFJoint EtoF_FtoE = {E -> F, F -> E}
    public DFJoint dfJointEtofFtoe() {
        DFJoint dfJoint = new DFJoint();
        dfJoint.setName("DFJoint EtoF_FtoE");
        dfJoint.addDependency(funcDepEtoF());
        dfJoint.addDependency(funcDepFtoE());
        return dfJoint;
    }
    
    //DFJoint BtoC_CtoB = {B -> C, C -> B}
    public DFJoint dfJointBtocCtob() {
        DFJoint dfJoint = new DFJoint();
        dfJoint.setName("DFJoint BtoC_CtoB");
        dfJoint.addDependency(funcDepBtoC());
        dfJoint.addDependency(funcDepCtoB());
        return dfJoint;
    }
    
    //DFJoint ABtoD = {AB -> D}
    public DFJoint dfJointABtod() {
        DFJoint dfJoint = new DFJoint();
        dfJoint.setName("DFJoint ABtoD");
        dfJoint.addDependency(funcDepABtoD());
        return dfJoint;
    }
    
    //DFJoint AtoBC_BCtoA = {A -> BC, BC -> A}
    public DFJoint dfJointAtobcBCtoa() {
        DFJoint dfJoint = new DFJoint();
        dfJoint.setName("DFJoint AtoBC_BCtoA");
        dfJoint.addDependency(funcDepAtoBC());
        dfJoint.addDependency(funcDepBCtoA());
        return dfJoint;
    }

    //DFJoint ADtoE = {AD -> E}
    public DFJoint dfJointADtoe() {
        DFJoint dfJoint = new DFJoint();
        dfJoint.setName("DFJoint ADtoE");
        dfJoint.addDependency(funcDepADtoE());
        return dfJoint;
    }
    
    //DFJoint ABEtoGH = {ABE -> GH}
    public DFJoint dfJointABEtogh() {
        DFJoint dfJoint = new DFJoint();
        dfJoint.setName("DFJoint ABEtoGH");
        dfJoint.addDependency(funcDepABEtoG());
        dfJoint.addDependency(funcDepABEtoH());
        return dfJoint;
    }
    
    //DFJoint BCDtoE_EtoC = {BCD -> E, E -> C}
    public DFJoint dfJointBCDtoeEtoc() {
        DFJoint dfJoint = new DFJoint();
        dfJoint.setName("DFJoint BCDtoE_EtoC");
        dfJoint.addDependency(funcDepBCDtoE());
        dfJoint.addDependency(funcDepEtoC());
        return dfJoint;
    }
    
    //DFJoint AtoB_BEtoA_ABDtoE = {A -> B, BE -> A, ABD -> E}
    public DFJoint dfJointAtobBEtoaABDtoe() {
        DFJoint dfJoint = new DFJoint();
        dfJoint.setName("DFJoint AtoB_BEtoA_ABDtoE");
        dfJoint.addDependency(funcDepAtoB());
        dfJoint.addDependency(funcDepBEtoA());
        dfJoint.addDependency(funcDepABDtoE());
        return dfJoint;
    }
    
    //DFJoint CDtoE = {CD -> E}
    public DFJoint dfJointCDtoe() {
        DFJoint dfJoint = new DFJoint();
        dfJoint.setName("DFJoint CDtoE");
        dfJoint.addDependency(funcDepCDtoE());
        return dfJoint;
    }
    
    //DFJoint CtoD = {C -> D}
    public DFJoint dfJointCtod() {
        DFJoint dfJoint = new DFJoint();
        dfJoint.setName("DFJoint CtoD");
        dfJoint.addDependency(funcDepCtoD());
        return dfJoint;
    }
    
    //DPJoint BtoAC = {B -> AC}
    public DFJoint dfJointBtoac() {
        DFJoint dfJoint = new DFJoint();
        dfJoint.setName("DFJoint BtoAC");
        dfJoint.addDependency(funcDepBtoAC());
        return dfJoint;
    }
    
    //DFJoint AtoC = {A -> C}
    public DFJoint dfJointAtoc() {
        DFJoint dfJoint = new DFJoint();
        dfJoint.setName("DFJoint AtoC");
        dfJoint.addDependency(funcDepAtoC());
        return dfJoint;
    }
    
    //DFJoint AtoB = {A -> B}
    public DFJoint dfJointAtob() {
        DFJoint dfJoint = new DFJoint();
        dfJoint.setName("DFJoint AtoB");
        dfJoint.addDependency(funcDepAtoB());
        return dfJoint;
    }
    //DFJoint BtoAC_CtoD = {B -> AC, C -> D}
    public DFJoint dfJointBtoacCtod() {
        DFJoint dfJoint = new DFJoint();
        dfJoint.setName("DFJoint {B -> AC, C -> D}");
        dfJoint.addDependency(funcDepBtoAC());
        dfJoint.addDependency(funcDepCtoD());
        return dfJoint;
    }
    
    /******************/
    //Plural Dependency
    /******************/

    //Plural Dependency A ->> B
    public ADependency pluDepAtoB() {
        return new PluralDependency(attrJntA(), attrJntB());
    }
    
    //A ->> E
    public ADependency pluDepAtoE() {
        return new PluralDependency(attrJntA(), attrJntE());
    }

    //Plural Dependency A ->> BC    
    public ADependency pluDepAtoBC() {
        return new PluralDependency(attrJntA(), attrJntBC());
    }
    
    //Plural Dependency A ->> CD    
    public ADependency pluDepAtoCD() {
        return new PluralDependency(attrJntA(), attrJntCD());
    }
    
    //Plural Dependency A ->> DE    
    public ADependency pluDepAtoDE() {
        return new PluralDependency(attrJntA(), attrJntDE());
    }
    
    //Plural Dependency A ->> EF
    public ADependency pluDepAtoEF() {
        return new PluralDependency(attrJntA(), attrJntEF());
    }

    //Plural Dependency A ->> BCD
    public ADependency pluDepAtoBCD() {
        return new PluralDependency(attrJntA(), attrJntBCD());
    }
    
    //Plural Dependency A ->> BEF
    public ADependency pluDepAtoBEF() {
        return new PluralDependency(attrJntA(), attrJntBEF());
    }
    
    //Plural Dependency A ->> BCDEF
    public ADependency pluDepAtoBCDEF() {
        return new PluralDependency(attrJntA(), attrJntBCDEF());
    }
    
    //Plural Dependency B ->> A
    public ADependency pluDepBtoA() {
        return new PluralDependency(attrJntB(), attrJntA());
    }   
    
    //Plural Dependency B ->> C
    public ADependency pluDepBtoC() {
        return new PluralDependency(attrJntB(), attrJntC());
    }
    
    //Plural Dependency D ->> F
    public ADependency pluDepDtoF() {
        return new PluralDependency(attrJntD(), attrJntF());
    }

    //Plural Dependency BC ->> AD
    public ADependency pluDepBCtoAD() {
        return new PluralDependency(attrJntBC(), attrJntAD());
    }

    
    //Plural Dependency BE ->> B
    public ADependency pluDepBEtoB() {
        return new PluralDependency(attrJntBE(), attrJntB());
    }
    
    /******************/
    //DPJoints
    /******************/
    
    //DPJoint 30 = {A -> B, CD -> A, BD -> C, AE -> F, DE -> C, A ->> CD}
    public DFJoint dpJoint30() {
        DFJoint dpJoint = new DFJoint();
        dpJoint.setName("DPJoint {A -> B, CD -> A, BD -> C, AE -> F, DE -> C, A ->> CD}");
        dpJoint.addDependency(funcDepAtoB());
        dpJoint.addDependency(funcDepCDtoA());
        dpJoint.addDependency(funcDepBDtoC());
        dpJoint.addDependency(funcDepAEtoF());
        dpJoint.addDependency(funcDepDEtoC());
        dpJoint.addDependency(pluDepAtoCD());
        return dpJoint;
    }
    
    //DPJoint 30_A = {AD -> C, CD -> A}
    public DFJoint dpJoint30A() {
        DFJoint dpJoint = new DFJoint();
        dpJoint.setName("DPJoint {AD -> C, CD -> A}");
        dpJoint.addDependency(funcDepCDtoA());
        dpJoint.addDependency(funcDepADtoC());
        return dpJoint;
    }
    
    //DPJoint 30_B = {A -> B, AE -> F}
    public DFJoint dpJoint30B() {
        DFJoint dpJoint = new DFJoint();
        dpJoint.setName("DPJoint {A -> B, AE -> F}");
        dpJoint.addDependency(funcDepAtoB());
        dpJoint.addDependency(funcDepAEtoF());
        return dpJoint;
    }
    
    //DPJoint 30_C = {AE -> F}
    public DFJoint dpJoint30C() {
        DFJoint dpJoint = new DFJoint();
        dpJoint.setName("DPJoint {AE -> F}");
        dpJoint.addDependency(funcDepAEtoF());
        return dpJoint;
    }
    
    //DPJoint 31 = {A -> B, CD -> A, BD -> C, AE -> F, DE -> C, AE -> D, A ->> CD}
    public DFJoint dpJoint31() {
        DFJoint dpJoint = new DFJoint();
        dpJoint.setName("DPJoint {A -> B, CD -> A, BD -> C, AE -> F, DE -> C, AE -> D, A ->> CD}");
        dpJoint.addDependency(funcDepAtoB());
        dpJoint.addDependency(funcDepCDtoA());
        dpJoint.addDependency(funcDepBDtoC());
        dpJoint.addDependency(funcDepAEtoF());
        dpJoint.addDependency(funcDepDEtoC());
        dpJoint.addDependency(funcDepAEtoD());
        dpJoint.addDependency(pluDepAtoCD());
        return dpJoint;
    }
    
    //DPJoint 31_A = {A -> B, CD -> A, BD -> C, AE -> F, DE -> C, A -> D, A -> C}
    public DFJoint dpJoint31Equi() {
        DFJoint dpJoint = new DFJoint();
        dpJoint.setName("DPJoint {A -> B, CD -> A, BD -> C, AE -> F, DE -> C, A -> D, A -> C}");
        dpJoint.addDependency(funcDepAtoB());
        dpJoint.addDependency(funcDepCDtoA());
        dpJoint.addDependency(funcDepBDtoC());
        dpJoint.addDependency(funcDepAEtoF());
        dpJoint.addDependency(funcDepDEtoC());
        dpJoint.addDependency(funcDepAtoD());
        dpJoint.addDependency(funcDepAtoC());
        return dpJoint;
    }
    
    //DPJoint 32 = {A -> B, B ->> C}
    public DFJoint dpJoint32() {
        DFJoint dpJoint = new DFJoint();
        dpJoint.setName("DPJoint {A -> B, B ->> C}");
        dpJoint.addDependency(funcDepAtoB());
        dpJoint.addDependency(pluDepBtoC());
        return dpJoint;
    }
    
    //DPJoint 33 = {A -> B, A -> C, B ->> C}
    public DFJoint dpJoint33() {
        DFJoint dpJoint = new DFJoint();
        dpJoint.setName("DPJoint {A -> B, A -> C, B ->> C}");
        dpJoint.addDependency(funcDepAtoB());
        dpJoint.addDependency(funcDepAtoC());
        dpJoint.addDependency(pluDepBtoC());
        return dpJoint;
    }
    
    //DPJoint 34 = {B ->> C}
    public DFJoint dpJoint34() {
        DFJoint dpJoint = new DFJoint();
        dpJoint.setName("DPJoint {B ->> C}");
        dpJoint.addDependency(pluDepBtoC());
        return dpJoint;
    }
    
    //DPJoint 35 = {D ->> F, C -> A, CD -> E, A -> B}
    public DFJoint dpJoint35() {
        DFJoint dpJoint = new DFJoint();
        dpJoint.setName("DPJoint {D ->> F, C -> A, CD -> E, A -> B}");
        dpJoint.addDependency(pluDepDtoF());
        dpJoint.addDependency(funcDepCtoA());
        dpJoint.addDependency(funcDepCDtoE());
        dpJoint.addDependency(funcDepAtoB());
        return dpJoint;
    }
    
    //DPJoint 35_A = {C -> A, CD -> E, A -> B}
    public DFJoint dpJoint35A() {
        DFJoint dpJoint = new DFJoint();
        dpJoint.setName("DPJoint {C -> A, CD -> E, A -> B}");
        dpJoint.addDependency(funcDepCtoA());
        dpJoint.addDependency(funcDepCDtoE());
        dpJoint.addDependency(funcDepAtoB());
        return dpJoint;
    }   
    
    
    //DPJoint 36 = {A ->> BCD, B -> AC, C -> D}
    public DFJoint dpJoint36() {
        DFJoint dpJoint = new DFJoint();
        dpJoint.setName("DPJoint {A ->> BCD, B -> AC, C -> D}");
        dpJoint.addDependency(pluDepAtoBCD());
        dpJoint.addDependency(funcDepBtoAC());
        dpJoint.addDependency(funcDepCtoD());
        return dpJoint;
    }
    
    //DPJoint 37 = {A ->> BC, D -> C}
    public DFJoint dpJoint37() {
        DFJoint dpJoint = new DFJoint();
        dpJoint.setName("DPJoint {A ->> BC, D -> C}");
        dpJoint.addDependency(pluDepAtoBC());
        dpJoint.addDependency(funcDepDtoC());
        return dpJoint;
    }
    
    //DFJoint 38 = {B -> AC, C -> D, BC ->> AD}
    public DFJoint dpJoint38() {
        DFJoint dpJoint = new DFJoint();
        dpJoint.setName("DPJoint {B -> AC, C -> D, BC ->> AD}");
        dpJoint.addDependency(funcDepBtoAC());
        dpJoint.addDependency(funcDepCtoD());
        dpJoint.addDependency(pluDepBCtoAD());
        return dpJoint;
    }
    
    /******************/
    //RareElement
    /******************/
    
    //C Consequent A->BC DFJoint TwentyFour
    public RareElement rareElementCinAtoBCDFJoint24Consequent() {
        return new RareElement(
                attrC(),
                funcDepAtoBC(),
                dfJoint24(),
                Const.CONSEQUEDENT);
    }
    
    //A Antecedent AB->C DFJoint TwentyFour
    public RareElement rareElementAinABtoCDFJoint24Antecedent() {
        return new RareElement(
                attrA(),
                funcDepABtoC(),
                dfJoint24(),
                Const.ANTECEDENT);
    }
    
    //B Antecedent AB->C DFJoint TwentyFour
    public RareElement rareElementBinABtoCDFJoint24Antecedent() {
        return new RareElement(
                attrB(),
                funcDepABtoC(),
                dfJoint24(),
                Const.ANTECEDENT);
    }
    
    //C Consequent A->BC DFJoint Four
    public RareElement rareElementCinAtoBCDFJoint4Consequent() {
        return new RareElement(
                attrC(),
                funcDepAtoBC(),
                dfJoint04(),
                Const.CONSEQUEDENT);
    }
    //A Antecedent AB->C DFJoint Four
    public RareElement rareElementAinABtoCDFJoint4Antecedent() {
        return new RareElement(
                attrA(),
                funcDepABtoC(),
                dfJoint04(),
                Const.ANTECEDENT);
    }

    //B Antecedent AB->C DFJoint Four
    public RareElement rareElementBinABtoCDFJoint4Antecedent() {
        return new RareElement(
                attrB(),
                funcDepABtoC(),
                dfJoint04(),
                Const.ANTECEDENT);
    }
    
    /******************/
    //Relation
    /******************/
    
    //Relation One = DFJoint One, AttributeJoint ABCDE
    public Relation relation01() {
        return new Relation(attrJntABCDE(), dfJoint01());
    }
    
    //Relation Two = DFJoint Two, AttributeJoint ABCDE
    public Relation relation02() {
        return new Relation(attrJntABCDE(), dfJoint02());
    }
    
    //Relation Three = DFJoint Three, AttributeJoint ABCDEFGH
    public Relation relation03() {
        return new Relation(attrJntABCDEFGH(), dfJoint03());
    }
    
    //Relation Four = DFJoint Four, AttributeJoint ABC
    public Relation relation04() {
        return new Relation(attrJntABC(), dfJoint04());
    }
        
    //Relation Five = DFJoint Five, AttributeJoint ABC
    public Relation relation05() {
        return new Relation(attrJntABC(), dfJoint05());
    }
    
    //Relation Six = DFJoint Six, AttributeJoint ABCDE -> Key:
        public Relation relation06() {
            return new Relation(attrJntABCDE(), dfJoint06());
        }

    //Relation Seven = DFJoint Seven, AttributeJoint ABCD -> Key:
    public Relation relation07() {
        return new Relation(attrJntABCD(), dfJoint07());
    }
    
    //Relation Eight = DFJoint Eight, AttributeJoint ABCD -> Key:
    public Relation relation08() {
        return new Relation(attrJntABCD(), dfJoint08());
    }
    
    //Relation Nine = DFJoint Nine, AttributeJoint ABC -> Key: AB
    public Relation relation09() {
        return new Relation(attrJntABC(), dfJoint09());
    }
    
    //Relation OneABC
    public Relation relation1ABC() {
        Relation relation = new Relation();
        relation.settAttrJoint(attrJntABC());
        relation.setDFJoint(dfJointAtobcBCtoa());
        return relation;
    }
    
    //Relation OneADE
    public Relation relation1ADE() {
        Relation relation = new Relation();
        relation.settAttrJoint(attrJntADE());
        relation.setDFJoint(dfJointADtoe());
        return relation;
    }
    
    //Relation OneBCDE
    public Relation relation1BCDE() {
        Relation relation = new Relation();
        relation.settAttrJoint(attrJntBCDE());
        relation.setDFJoint(dfJointBCDtoeEtoc());
        return relation;
    }
    
    //Relation OneABCD
    public Relation relation1ABCD() {
        Relation relation = new Relation();
        relation.settAttrJoint(attrJntABCD());
        relation.setDFJoint(dfJointAtobcBCtoa());
        return relation;
    }
    
    //Relation OneCE
    public Relation relation1CE() {
        Relation relation = new Relation();
        relation.settAttrJoint(attrJntCE());
        relation.setDFJoint(dfJoint18());
        return relation;
    }
    
    //Relation OneABDE
    public Relation relation1ABDE() {
        Relation relation = new Relation();
        relation.settAttrJoint(attrJntABDE());
        relation.setDFJoint(dfJointAtobBEtoaABDtoe());
        return relation;
    }
    
    //Relation AE
    public Relation relationAE() {
        Relation relation = new Relation();
        relation.settAttrJoint(attrJntAE());
        return relation;
    }
    
    //Relation AD
    public Relation relationAD() {
        Relation relation = new Relation();
        relation.settAttrJoint(attrJntAD());
        relation.setDFJoint(new DFJoint());
        return relation;
    }
    
    //Relation BC
    public Relation relationBC() {
        Relation relation = new Relation();
        relation.settAttrJoint(attrJntBC());
        relation.setDFJoint(new DFJoint());
        return relation;
    }
    
    //Relation BD
    public Relation relationBD() {
        Relation relation = new Relation();
        relation.settAttrJoint(attrJntBD());
        return relation;
    }
    
    //Relation AB
    public Relation relationAB() {
        Relation relation = new Relation();
        relation.settAttrJoint(attrJntAB());
        relation.setDFJoint(new DFJoint());
        return relation;
    }
    
    //Relation BE
    public Relation relationBE() {
        Relation relation = new Relation();
        relation.settAttrJoint(attrJntBE());
        return relation;
    }
    
    //Relation DE
    public Relation relationDE() {
        Relation relation = new Relation();
        relation.settAttrJoint(attrJntDE());
        return relation;
    }
    
    //Relation DF
    public Relation relationDF() {
        Relation relation = new Relation();
        relation.settAttrJoint(attrJntDF());
        relation.setDFJoint(new DFJoint());
        return relation;
    }
    
    //Relation EF
    public Relation relationEF() {
        Relation relation = new Relation();
        relation.settAttrJoint(attrJntEF());
        return relation;
    }
    
    //Relation ABD
    public Relation relationABD() {
        Relation relation = new Relation();
        relation.settAttrJoint(attrJntABD());
        return relation;
    }
    
    //Relation BCD
    public Relation relationBCD() {
        Relation relation = new Relation();
        relation.settAttrJoint(attrJntBCD());
        relation.setDFJoint(new DFJoint());
        return relation;
    }
    
    //Relation BDE
    public Relation relationBDE() {
        Relation relation = new Relation();
        relation.settAttrJoint(attrJntBDE());
        relation.setDFJoint(new DFJoint());
        return relation;
    }
    
    //Relation AEGH
    public Relation relationABEGH() {
        Relation relation = new Relation();
        relation.settAttrJoint(attrJntABEGH());
        relation.setDFJoint(dfJointABEtogh());
        return relation;
    }
    
    //Relation ABC_AtoBC
    public Relation relationABCinAtobc() {
        Relation relation = relation1ABC();
        relation.setDFJoint(dfJointAtoBC());
        return relation;
    }
    
    //Relation CDE_CDtoE
    public Relation relationCDEinCDtoe() {
        Relation relation = new Relation();
        relation.settAttrJoint(attrJntCDE());
        relation.setDFJoint(dfJointCDtoe());
        return relation;
    }
    
    //Relation AE_AtoE
    public Relation relationAEinAtoe() {
        Relation relation = relationAE();
        relation.setDFJoint(dfJointAtoE());
        return relation;
    }
    
    //Relation AC_CtoA
    public Relation relationACinCtoa() {
        Relation relation = new Relation();
        relation.settAttrJoint(attrJntAC());
        relation.setDFJoint(dfJointCtoA());
        return relation;
    }
    
    //Relation BC_BtoC
    public Relation relationBCinBtoc() {
        Relation relation = relationBC();
        relation.setDFJoint(dfJoint22());
        return relation;
    }
    
    //Relation BC_CtoB
    public Relation relationBCinCtob() {
        Relation relation = relationBC();
    relation.setDFJoint(dfJoint20());
        return relation;
    }
    
    //Relation BD_BtoD
    public Relation relationBDinBtod() {
        Relation relation = relationBD();
        relation.setDFJoint(dfJointBtoD());
        return relation;
    }
    
    //Relation AB_AtoB
    public Relation relationABinAtob() {
        Relation relation = relationAB();
        relation.setDFJoint(dfJoint5MinusBtoC());
        return relation;
    }
    
    //Relation BE_BtoE
    public Relation relationBEinBtoe() {
        Relation relation = relationBE();
        relation.setDFJoint(dfJointBtoE());
        return relation;
    }
    
    //Relation CD_CtoD
    public Relation relationCDinCtod() {
        Relation relation = new Relation();
        relation.settAttrJoint(attrJntCD());
        relation.setDFJoint(dfJointCtod());
        return relation;
    }
    
    //Relation ABCD_ABtoD_BtoC_CtoB
    public Relation relationABCDinABtodBtocCtob() {
        Relation relation = relation07();
        relation.setDFJoint(dfJointABtodBtocCtob());
        return relation;
    }
    
    //Relation ABC_ABtoC_CtoAB
    public Relation relationABCinABtocCtoab() {
        Relation relation = relation1ABC();
        relation.setDFJoint(dfJointABtocCtoab());
        return relation;
    }
    
    //Relation DE_EtoD_DtoE
    public Relation relationDEinEtodDtoe() {
        Relation relation = relationDE();
        relation.setDFJoint(dfJointEtodDtoe());
        return relation;
    }
    //Relation EF_EtoF_FtoE
    public Relation relationEFinEtofFtoe() {
        Relation relation = relationEF();
        relation.setDFJoint(dfJointEtofFtoe());
        return relation;
    }

    //Relation BC_BtoC_CtoB
    public Relation relationBCinBtocCtob() {
        Relation relation = relationBC();
        relation.setDFJoint(dfJointBtocCtob());
        return relation;
    }

    //Relation ABD_ABtoD
    public Relation relationABDinABtod() {
        Relation relation = relationABD();
        relation.setDFJoint(dfJointABtod());
        return relation;
    }
    
    //Relation ABC_AtoBC_BCtoA
    public Relation relationABCinAtobcBCtoa() {
        Relation relation = relation1ABC();
        relation.setDFJoint(dfJointAtobcBCtoa());
        return relation;
    }
    
    //Relation ABC_BtoAC
    public Relation relationABCinBtoac() {
        Relation relation = relation1ABC();
        relation.setDFJoint(dfJointBtoac());
        return relation;
    }
    
    //Relation AEF
    public Relation relationAEF() {
        Relation relation = relation30C();
        relation.setDFJoint(new DFJoint());
        return relation;
    }
    
    //Relation AC_AtoC
    public Relation relationACinAtoc() {
        Relation relation = relationACinCtoa();
        relation.setDFJoint(dfJointAtoc());
        return relation;
    }
    
    //Relation ABCD_BtoAC_CtoD
    public Relation relationABCDinBtoacCtod() {
        Relation relation = relation1ABCD();
        relation.setDFJoint(dfJointBtoacCtod());
        return relation;
    }
    
    //Relation ABC_AtoC
    public Relation relationABCinAtoc() {
        Relation relation = relation1ABC();
        relation.setDFJoint(dfJointAtoc());
        return relation;
    }
    
    /******************/
    //Relation 4NF 
    /******************/
    
    //Relation 30
    public Relation relation30() {
        Relation relation = new Relation();
        relation.setDFJoint(dpJoint30());
        relation.settAttrJoint(attrJntABCDEF());
        return relation;
    }

    //Relation 30_A
    public Relation relation30A() {
        Relation relation = new Relation();
        relation.setDFJoint(dpJoint30A());
        relation.settAttrJoint(attrJntACD());
        return relation;
    }

    //Relation 30_B
    public Relation relation30B() {
        Relation relation = new Relation();
        relation.setDFJoint(dpJoint30B());
        relation.settAttrJoint(attrJntABEF());
        return relation;
    }
    
    //Relation 30_C
    public Relation relation30C() {
        Relation relation = new Relation();
        relation.setDFJoint(dpJoint30C());
        relation.settAttrJoint(attrJntAEF());
        return relation;
    }
    
    //Relation 31
    public Relation relation31() {
        Relation relation = new Relation();
        relation.setDFJoint(dpJoint31());
        relation.settAttrJoint(attrJntABCDEF());
        return relation;
    }


    //Relation 32
    public Relation relation32() {
        Relation relation = new Relation();
        relation.setDFJoint(dpJoint32());
        relation.settAttrJoint(attrJntABC());
        return relation;
    }
    
    //Relation 33
    public Relation relation33() {
        Relation relation = new Relation();
        relation.setDFJoint(dpJoint33());
        relation.settAttrJoint(attrJntABC());
        return relation;
    }

    //Relation 34
    public Relation relation34() {
        Relation relation = new Relation();
        relation.setDFJoint(dpJoint34());
        relation.settAttrJoint(attrJntABC());
        return relation;
    }
    
    //Relation 35
    public Relation relation35() {
        Relation relation = new Relation();
        relation.setDFJoint(dpJoint35());
        relation.settAttrJoint(attrJntABCDEF());
        return relation;
    }
    
    //Relation 36
    public Relation relation36() {
        Relation relation = new Relation();
        relation.setDFJoint(dpJoint36());
        relation.settAttrJoint(attrJntABCDEF());
        return relation;
    }
    
    //Relation 37
    public Relation relation37() {
        Relation relation = new Relation();
        relation.setDFJoint(dpJoint37());
        relation.settAttrJoint(attrJntABCDE());
        return relation;
    }
    
    //Relation 38 {B -> AC, C -> D, BC ->> AD}
    public Relation relation38() {
        Relation relation = new Relation();
        relation.setDFJoint(dpJoint38());
        relation.settAttrJoint(attrJntABCD());
        return relation;
    }
 
    /******************/
    //Vector<FunctionalDependency>
    /******************/
    // {A -> BC, BC -> A, E -> C} 
    public List<ADependency> listNonBCNFDFJoint1() {
        List<ADependency> arrayList = new ArrayList<>();
        arrayList.add(funcDepAtoBC());
        arrayList.add(funcDepBCtoA());
        arrayList.add(funcDepEtoC());
        return arrayList;
    }

    // {A -> BC, BC -> E}
    public List<ADependency> listNonBCNFDFJoint2() {
        List<ADependency> arrayList = new ArrayList<>();
        arrayList.add(funcDepAtoBC());
        arrayList.add(funcDepBCtoE());
        return arrayList;
    }

    // {ABD -> G, CF -> H}
    public List<ADependency> listNonBCNFDFJoint3() {
        List<ADependency> arrayList = dfJoint03().getDFJoint();
        arrayList.remove(funcDepABDtoG());
        arrayList.remove(funcDepCFtoH());
        return arrayList;
    }
    
    // {B -> C}
    public List<ADependency> listNonBCNFDFJoint4and5() {
        List<ADependency> arrayList = new ArrayList<>();
        arrayList.add(funcDepBtoC());
        return arrayList;
    }
    
    // {B -> C, C -> B, B -> E}
    public List<ADependency> listNonBCNFDFJoint6() {
        List<ADependency> arrayList = new ArrayList<>();
        arrayList.add(funcDepBtoC());
        arrayList.add(funcDepCtoB());
        arrayList.add(funcDepBtoE());
        return arrayList;
    }
    
    // {B -> C, C -> D}
    public List<ADependency> listNonBCNFDFJoint7() {
        List<ADependency> arrayList = new ArrayList<>();
        arrayList.add(funcDepBtoC());
        arrayList.add(funcDepCtoD());
        return arrayList;
    }

    // {B -> C, C -> B}
    public List<ADependency> listNonBCNFDFJoint8() {
        List<ADependency> arrayList = new ArrayList<>();
        arrayList.add(funcDepBtoC());
        arrayList.add(funcDepCtoB());
        return arrayList;
    }
    
    /******************/
    //VectorNormalize
    /******************/
    
    // {ABC} {A -> BC} - {AE} {A -> E} - {AD} {}
    public List<Relation> listRelations1() {
        List<Relation> arrayList = new ArrayList<>();
        arrayList.add(relationABCinAtobc());
        arrayList.add(relationAEinAtoe());
        arrayList.add(relationAD());
        return arrayList;
    }
    
    // {BC} {B -> C} - {AB} {A -> B}
    public List<Relation> listRelations2() {
        List<Relation> arrayList = new ArrayList<>();
        arrayList.add(relationBCinBtoc());
        arrayList.add(relationABinAtob());
        return arrayList;
    }
    
    // {BE} {B -> E} - {ABCD} {AB -> D, B -> C, C -> B}
    public List<Relation> listRelations3() {
        List<Relation> arrayList = new ArrayList<>();
        arrayList.add(relationBEinBtoe());
        arrayList.add(relationABCDinABtodBtocCtob());
        return arrayList;
    }
    
    // {BC} {B -> C} - {BD} {B -> D} - {AB} {A -> B}
    public List<Relation> listRelations4() {
        List<Relation> arrayList = new ArrayList<>();
        arrayList.add(relationBCinBtoc());
        arrayList.add(relationBDinBtod());
        arrayList.add(relationABinAtob());
        return arrayList;
    }

    // {ABC} {AB -> C, C -> AB} - {DE} {E -> D, D -> E} - {EF} {E -> F, F -> E} - {ABEGH} {ABE -> GH}
    public List<Relation> listRelations5() {
        List<Relation> arrayList = new ArrayList<>();
        arrayList.add(relationABCinABtocCtoab());
        arrayList.add(relationDEinEtodDtoe());
        arrayList.add(relationEFinEtofFtoe());
        arrayList.add(relationABEGH());
        return arrayList;
    }

    // {BC} {B -> C, C -> B} - {BE} {B -> E} - {ABD} {AB -> D}
    public List<Relation> listRelations6() {
        List<Relation> arrayList = new ArrayList<>();
        arrayList.add(relationBCinBtocCtob());
        arrayList.add(relationBEinBtoe());
        arrayList.add(relationABDinABtod());
        return arrayList;
    }

    // {BC} {B -> C, C -> B} - {ABD} {AB -> D}
    public List<Relation> listRelations7() {
        List<Relation> arrayList = new ArrayList<>();
        arrayList.add(relationBCinBtocCtob());
        arrayList.add(relationABDinABtod());
        return arrayList;
    }

    // {ABC} {A -> BC} - {ADE} {AD -> E}
    public List<Relation> listRelations8() {
        List<Relation> arrayList = new ArrayList<>();
        arrayList.add(relationABCinAtobcBCtoa());
        Relation relation = relationABCDinBtoacCtod();
        relation.setDFJoint(dfJointADtoe());
        arrayList.add(relation);
        return arrayList;
    }
    
    // {ABC} {A -> BC} - {ADE} {AD -> E}
    public List<Relation> listRelations9() {
        List<Relation> arrayList = new ArrayList<>();
        arrayList.add(relation1ABC());
        arrayList.add(relation1ADE());
        return arrayList;
    }
}
