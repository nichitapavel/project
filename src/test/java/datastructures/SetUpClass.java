/**
 * 
 */
package datastructures;

import datastructures.Attribute;
import datastructures.AttributeJoint;
import dependency.ADependency;
import dependency.FunctionalDependency;
import dependency.PluralDependency;

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
        ADependency pluDep = new PluralDependency(attrJntA(), attrJntB());
        return pluDep;
    }
    
    //A ->> E
    public ADependency pluDepAtoE() {
        ADependency pluDep = new PluralDependency(attrJntA(), attrJntE());
        return pluDep;
    }

    //Plural Dependency A ->> BC    
    public ADependency pluDepAtoBC() {
        ADependency pluDep = new PluralDependency(attrJntA(), attrJntBC());
        return pluDep;
    }
    
    //Plural Dependency A ->> CD    
    public ADependency pluDepAtoCD() {
        ADependency pluDep = new PluralDependency(attrJntA(), attrJntCD());
        return pluDep;
    }
    
    //Plural Dependency A ->> DE    
    public ADependency pluDepAtoDE() {
        ADependency pluDep = new PluralDependency(attrJntA(), attrJntDE());
        return pluDep;
    }
    
    //Plural Dependency A ->> EF
    public ADependency pluDepAtoEF() {
        ADependency pluDep = new PluralDependency(attrJntA(), attrJntEF());
        return pluDep;
    }

    //Plural Dependency A ->> BCD
    public ADependency pluDepAtoBCD() {
        ADependency pluDep = new PluralDependency(attrJntA(), attrJntBCD());
        return pluDep;
    }
    
    //Plural Dependency A ->> BEF
    public ADependency pluDepAtoBEF() {
        ADependency pluDep = new PluralDependency(attrJntA(), attrJntBEF());
        return pluDep;
    }
    
    //Plural Dependency A ->> BCDEF
    public ADependency pluDepAtoBCDEF() {
        ADependency pluDep = new PluralDependency(attrJntA(), attrJntBCDEF());
        return pluDep;
    }
    
    //Plural Dependency B ->> A
    public ADependency pluDepBtoA() {
        ADependency pluDep = new PluralDependency(attrJntB(), attrJntA());
        return pluDep;
    }   
    
    //Plural Dependency B ->> C
    public ADependency pluDepBtoC() {
        ADependency pluDep = new PluralDependency(attrJntB(), attrJntC());
        return pluDep;
    }
    
    //Plural Dependency D ->> F
    public ADependency pluDepDtoF() {
        ADependency pluDep = new PluralDependency(attrJntD(), attrJntF());
        return pluDep;
    }

    //Plural Dependency BC ->> AD
    public ADependency pluDepBCtoAD() {
        ADependency pluDep = new PluralDependency(attrJntBC(), attrJntAD());
        return pluDep;
    }

    
    //Plural Dependency BE ->> B
    public ADependency pluDepBEtoB() {
        ADependency pluDep = new PluralDependency(attrJntBE(), attrJntB());
        return pluDep;
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
}
