/**
 * 
 */
package datastructures;

import java.util.ArrayList;
import java.util.List;

import datastructures.Attribute;
import datastructures.AttributeSet;
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

    //AttributeSet A
    public AttributeSet attrJntA() {
        AttributeSet attrJoint = new AttributeSet();
        attrJoint.addAttributes(attrA());
        return attrJoint;
    }

    //AttributeSet B
    public AttributeSet attrJntB() {
        AttributeSet attrJoint = new AttributeSet();
        attrJoint.addAttributes(attrB());
        return attrJoint;
    }

    //AttributeSet C
    public AttributeSet attrJntC() {
        AttributeSet attrJoint = new AttributeSet();
        attrJoint.addAttributes(attrC());
        return attrJoint;
    }

    //AttributeSet D
    public AttributeSet attrJntD() {
        AttributeSet attrJoint = new AttributeSet();
        attrJoint.addAttributes(attrD());
        return attrJoint;
    }

    //AttributeSet E
    public AttributeSet attrJntE() {
        AttributeSet attrJoint = new AttributeSet();
        attrJoint.addAttributes(attrE());
        return attrJoint;
    }

    //AttributeSet F
    public AttributeSet attrJntF() {
        AttributeSet attrJoint = new AttributeSet();
        attrJoint.addAttributes(attrF());
        return attrJoint;
    }

    //AttributeSet G
    public AttributeSet attrJntG() {
        AttributeSet attrJoint = new AttributeSet();
        attrJoint.addAttributes(attrG());
        return attrJoint;
    }

    //AttributeSet H
    public AttributeSet attrJntH() {
        AttributeSet attrJoint = new AttributeSet();
        attrJoint.addAttributes(attrH());
        return attrJoint;
    }

    //AttributeSet AB
    public AttributeSet attrJntAB() {
        AttributeSet attrJoint = new AttributeSet();
        attrJoint.addAttributes(attrA());
        attrJoint.addAttributes(attrB());
        return attrJoint;
    }

    //AttributeSet AC
    public AttributeSet attrJntAC() {
        AttributeSet attrJoint = new AttributeSet();
        attrJoint.addAttributes(attrA());
        attrJoint.addAttributes(attrC());
        return attrJoint;
    }

    //AttributeSet AD
    public AttributeSet attrJntAD() {
        AttributeSet attrJoint = new AttributeSet();
        attrJoint.addAttributes(attrA());
        attrJoint.addAttributes(attrD());
        return attrJoint;
    }

    //AttributeSet AE
    public AttributeSet attrJntAE() {
        AttributeSet attrJoint = new AttributeSet();
        attrJoint.addAttributes(attrA());
        attrJoint.addAttributes(attrE());
        return attrJoint;
    }

    //AttributeSet BC
    public AttributeSet attrJntBC() {
        AttributeSet attrJoint = new AttributeSet();
        attrJoint.addAttributes(attrB());
        attrJoint.addAttributes(attrC());
        return attrJoint;
    }

    //AttributeSet BD
    public AttributeSet attrJntBD() {
        AttributeSet attrJoint = new AttributeSet();
        attrJoint.addAttributes(attrB());
        attrJoint.addAttributes(attrD());
        return attrJoint;
    }

    //AttributeSet BE
    public AttributeSet attrJntBE() {
        AttributeSet attrJoint = new AttributeSet();
        attrJoint.addAttributes(attrB());
        attrJoint.addAttributes(attrE());
        return attrJoint;
    }

    //AttributeSet CD
    public AttributeSet attrJntCD() {
        AttributeSet attrJoint = new AttributeSet();
        attrJoint.addAttributes(attrC());
        attrJoint.addAttributes(attrD());
        return attrJoint;
    }

    //AttributeSet CE
    public AttributeSet attrJntCE() {
        AttributeSet attrJoint = new AttributeSet();
        attrJoint.addAttributes(attrC());
        attrJoint.addAttributes(attrE());
        return attrJoint;
    }

    //AttributeSet CF
    public AttributeSet attrJntCF() {
        AttributeSet attrJoint = new AttributeSet();
        attrJoint.addAttributes(attrC());
        attrJoint.addAttributes(attrF());
        return attrJoint;
    }

    //AttributeSet DE
    public AttributeSet attrJntDE() {
        AttributeSet attrJoint = new AttributeSet();
        attrJoint.addAttributes(attrD());
        attrJoint.addAttributes(attrE());
        return attrJoint;
    }

    //AttributeSet DF
    public AttributeSet attrJntDF() {
        AttributeSet attrJoint = new AttributeSet();
        attrJoint.addAttributes(attrD());
        attrJoint.addAttributes(attrF());
        return attrJoint;
    }

    //AttributeSet EF
    public AttributeSet attrJntEF() {
        AttributeSet attrJoint = new AttributeSet();
        attrJoint.addAttributes(attrE());
        attrJoint.addAttributes(attrF());
        return attrJoint;
    }

    //AttributeSet ABC
    public AttributeSet attrJntABC() {
        AttributeSet attrJoint = new AttributeSet();
        attrJoint.addAttributes(attrA());
        attrJoint.addAttributes(attrB());
        attrJoint.addAttributes(attrC());
        return attrJoint;
    }

    //AttributeSet ABD
    public AttributeSet attrJntABD() {
        AttributeSet attrJoint = new AttributeSet();
        attrJoint.addAttributes(attrA());
        attrJoint.addAttributes(attrB());
        attrJoint.addAttributes(attrD());
        return attrJoint;
    }

    //AttributeSet ABE
    public AttributeSet attrJntABE() {
        AttributeSet attrJoint = new AttributeSet();
        attrJoint.addAttributes(attrA());
        attrJoint.addAttributes(attrB());
        attrJoint.addAttributes(attrE());
        return attrJoint;
    }

    //AttributeSet ABF
    public AttributeSet attrJntABF() {
        AttributeSet attrJoint = new AttributeSet();
        attrJoint.addAttributes(attrA());
        attrJoint.addAttributes(attrB());
        attrJoint.addAttributes(attrF());
        return attrJoint;
    }

    //AttributeSet ACD
    public AttributeSet attrJntACD() {
        AttributeSet attrJoint = new AttributeSet();
        attrJoint.addAttributes(attrA());
        attrJoint.addAttributes(attrC());
        attrJoint.addAttributes(attrD());
        return attrJoint;
    }

    //AttributeSet ADE
    public AttributeSet attrJntADE() {
        AttributeSet attrJoint = new AttributeSet();
        attrJoint.addAttributes(attrA());
        attrJoint.addAttributes(attrD());
        attrJoint.addAttributes(attrE());
        return attrJoint;
    }

    //AttributeSet AEF
    public AttributeSet attrJntAEF() {
        AttributeSet attrJoint = new AttributeSet();
        attrJoint.addAttributes(attrA());
        attrJoint.addAttributes(attrE());
        attrJoint.addAttributes(attrF());
        return attrJoint;
    }

    //AttributeSet BCD
    public AttributeSet attrJntBCD() {
        AttributeSet attrJoint = new AttributeSet();
        attrJoint.addAttributes(attrB());
        attrJoint.addAttributes(attrC());
        attrJoint.addAttributes(attrD());
        return attrJoint;
    }

    //AttributeSet BDE
    public AttributeSet attrJntBDE() {
        AttributeSet attrJoint = new AttributeSet();
        attrJoint.addAttributes(attrB());
        attrJoint.addAttributes(attrD());
        attrJoint.addAttributes(attrE());
        return attrJoint;
    }

    //AttributeSet BEF
    public AttributeSet attrJntBEF() {
        AttributeSet attrJoint = new AttributeSet();
        attrJoint.addAttributes(attrB());
        attrJoint.addAttributes(attrE());
        attrJoint.addAttributes(attrF());
        return attrJoint;
    }

    //AttributeSet CDE
    public AttributeSet attrJntCDE() {
        AttributeSet attrJoint = new AttributeSet();
        attrJoint.addAttributes(attrC());
        attrJoint.addAttributes(attrD());
        attrJoint.addAttributes(attrE());
        return attrJoint;
    }

    //AttributeSet CDF
    public AttributeSet attrJntCDF() {
        AttributeSet attrJoint = new AttributeSet();
        attrJoint.addAttributes(attrC());
        attrJoint.addAttributes(attrD());
        attrJoint.addAttributes(attrF());
        return attrJoint;
    }

    //AttributeSet ABCD
    public AttributeSet attrJntABCD() {
        AttributeSet attrJoint = new AttributeSet();
        attrJoint.addAttributes(attrA());
        attrJoint.addAttributes(attrB());
        attrJoint.addAttributes(attrC());
        attrJoint.addAttributes(attrD());
        return attrJoint;
    }

    //AttributeSet ABDE
    public AttributeSet attrJntABDE() {
        AttributeSet attrJoint = new AttributeSet();
        attrJoint.addAttributes(attrA());
        attrJoint.addAttributes(attrB());
        attrJoint.addAttributes(attrD());
        attrJoint.addAttributes(attrE());
        return attrJoint;
    }

    //AttributeSet ABEF
    public AttributeSet attrJntABEF() {
        AttributeSet attrJoint = new AttributeSet();
        attrJoint.addAttributes(attrA());
        attrJoint.addAttributes(attrB());
        attrJoint.addAttributes(attrE());
        attrJoint.addAttributes(attrF());
        return attrJoint;
    }

    //AttributeSet ACDE
    public AttributeSet attrJntACDE() {
        AttributeSet attrJoint = new AttributeSet();
        attrJoint.addAttributes(attrA());
        attrJoint.addAttributes(attrC());
        attrJoint.addAttributes(attrD());
        attrJoint.addAttributes(attrE());
        return attrJoint;
    }

    //AttributeSet BCDE
    public AttributeSet attrJntBCDE() {
        AttributeSet attrJoint = new AttributeSet();
        attrJoint.addAttributes(attrB());
        attrJoint.addAttributes(attrC());
        attrJoint.addAttributes(attrD());
        attrJoint.addAttributes(attrE());
        return attrJoint;
    }

    //AttributeSet ABCDE
    public AttributeSet attrJntABCDE() {
        AttributeSet attrJoint = new AttributeSet();
        attrJoint.addAttributes(attrA());
        attrJoint.addAttributes(attrB());
        attrJoint.addAttributes(attrC());
        attrJoint.addAttributes(attrD());
        attrJoint.addAttributes(attrE());
        return attrJoint;
    }

    //AttributeSet BCDEF
    public AttributeSet attrJntBCDEF() {
        AttributeSet attrJoint = new AttributeSet();
        attrJoint.addAttributes(attrB());
        attrJoint.addAttributes(attrC());
        attrJoint.addAttributes(attrD());
        attrJoint.addAttributes(attrE());
        attrJoint.addAttributes(attrF());
        return attrJoint;
    }

    //AttributeSet ABCDEF
    public AttributeSet attrJntABCDEF() {
        AttributeSet attrJoint = new AttributeSet();
        attrJoint.addAttributes(attrA());
        attrJoint.addAttributes(attrB());
        attrJoint.addAttributes(attrC());
        attrJoint.addAttributes(attrD());
        attrJoint.addAttributes(attrE());
        attrJoint.addAttributes(attrF());
        return attrJoint;
    }   

    //AttributeSet ABEGH
    public AttributeSet attrJntABEGH() {
        AttributeSet attrJoint = new AttributeSet();
        attrJoint.addAttributes(attrA());
        attrJoint.addAttributes(attrB());
        attrJoint.addAttributes(attrE());
        attrJoint.addAttributes(attrG());
        attrJoint.addAttributes(attrH());
        return attrJoint;
    }

    //AttributeSet ABCDEFGH
    public AttributeSet attrJntABCDEFGH() {
        AttributeSet attrJoint = new AttributeSet();
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
    
    //Functional Dependency A -> BE
    public ADependency funcDepAtoBE() {
        return new FunctionalDependency(attrJntA(), attrJntBE());
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
    
    //Functional Dependency CE -> D
    public ADependency funcDepCEtoD() {
        return new FunctionalDependency(attrJntCE(), attrJntD());
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
    //FDSet
    /******************/
    
    //FDSet One = {A -> BC, BC -> A, BCD -> E, E -> C}
    public FDSet dfJoint01() {
        FDSet dfJoint = new FDSet();
        dfJoint.setName("FDSet One");
        dfJoint.addDependency(funcDepAtoBC());
        dfJoint.addDependency(funcDepBCtoA());
        dfJoint.addDependency(funcDepBCDtoE());
        dfJoint.addDependency(funcDepEtoC());
        return dfJoint;
    }
    
    //FDSet Two = {A -> BC, BC -> E, CD -> A}
    public FDSet dfJoint02() {
        FDSet dfJoint = new FDSet();
        dfJoint.setName("FDSet Two");
        dfJoint.addDependency(funcDepAtoBC());
        dfJoint.addDependency(funcDepBCtoE());
        dfJoint.addDependency(funcDepCDtoA());
        return dfJoint;
    }
    
    //FDSet Three = {AB -> C, C -> AB, E -> D, D -> E, E -> F, F -> E, ABD -> G, CF -> H}
    public FDSet dfJoint03() {
        FDSet dfJoint = new FDSet();
        dfJoint.setName("FDSet Three");
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
    
    //FDSet Four = {A -> BC, B -> C, A -> B, AB -> C}
    public FDSet dfJoint04() {
        FDSet dfJoint = new FDSet();
        dfJoint.setName("FDSet Four");
        dfJoint.addDependency(funcDepAtoBC());
        dfJoint.addDependency(funcDepBtoC());
        dfJoint.addDependency(funcDepAtoB());
        dfJoint.addDependency(funcDepABtoC());
        return dfJoint;
    }
    
    //FDSet Five = {A -> B, B -> C}
    public FDSet dfJoint05() {
        FDSet dfJoint = new FDSet();
        dfJoint.setName("FDSet Five");
        dfJoint.addDependency(funcDepAtoB());
        dfJoint.addDependency(funcDepBtoC());
        return dfJoint;
    }
    
    //FDSet Six = {AB -> D, B -> C, C -> B, B -> E}
    public FDSet dfJoint06() {
        FDSet dfJoint = new FDSet();
        dfJoint.setName("FDSet Six");
        dfJoint.addDependency(funcDepABtoD());
        dfJoint.addDependency(funcDepBtoC());
        dfJoint.addDependency(funcDepCtoB());
        dfJoint.addDependency(funcDepBtoE());
        return dfJoint;
    }
    
    //FDSet Seven = {A -> B, B -> C, C -> D}
    public FDSet dfJoint07() {
        FDSet dfJoint = new FDSet();
        dfJoint.setName("FDSet Seven");
        dfJoint.addDependency(funcDepAtoB());
        dfJoint.addDependency(funcDepBtoC());
        dfJoint.addDependency(funcDepCtoD());
        return dfJoint;
    }
    
    //FDSet Eight = {B -> C, AB -> D, C -> B}
    public FDSet dfJoint08() {
        FDSet dfJoint = new FDSet();
        dfJoint.setName("FDSet Eight");
        dfJoint.addDependency(funcDepBtoC());
        dfJoint.addDependency(funcDepABtoD());
        dfJoint.addDependency(funcDepCtoB());
        return dfJoint;
    }
    
    //FDSet Nine = {AB -> C}
    public FDSet dfJoint09() {
        FDSet dfJoint = new FDSet();
        dfJoint.setName("FDSet Nine");
        dfJoint.addDependency(funcDepABtoC());
        return dfJoint;
    }
    
    //FDSet Ten = {AB -> C, C -> A}
    public FDSet dfJoint10() {
        FDSet dfJoint = new FDSet();
        dfJoint.setName("FDSet Ten");
        dfJoint.addDependency(funcDepABtoC());
        dfJoint.addDependency(funcDepCtoA());
        return dfJoint;
    }
    
    //FDSet Eleven = {C -> A}
    public FDSet dfJoint11() {
        FDSet dfJoint = new FDSet();
        dfJoint.setName("FDSet Eleven");
        dfJoint.addDependency(funcDepCtoA());
        return dfJoint;
    }
    
    //FDSet Twelve = {A -> B, CD -> A, BD -> C, DE -> C}
    public FDSet dfJoint12() {
        FDSet dfJoint = new FDSet();
        dfJoint.setName("FDSet Twelve");
        dfJoint.addDependency(funcDepAtoB());
        dfJoint.addDependency(funcDepCDtoA());
        dfJoint.addDependency(funcDepBDtoC());
        dfJoint.addDependency(funcDepDEtoC());
        return dfJoint;
    }
    
    //FDSet Thirteen = {A -> B}
    public FDSet dfJoint13() {
        FDSet dfJoint = new FDSet();
        dfJoint.setName("FDSet Thirteen");
        dfJoint.addDependency(funcDepAtoB());
        return dfJoint;
    }
    
    //FDSet Fourteen = {CD -> A, AD -> C, DE -> C}
    public FDSet dfJoint14() {
        FDSet dfJoint = new FDSet();
        dfJoint.setName("FDSet Fourteen");
        dfJoint.addDependency(funcDepCDtoA());
        dfJoint.addDependency(funcDepADtoC());
        dfJoint.addDependency(funcDepDEtoC());
        return dfJoint;
    }
    
    //FDSet Fifteen = {CD -> A, AD -> C}
    public FDSet dfJoint15() {
        FDSet dfJoint = new FDSet();
        dfJoint.setName("FDSet Fifteen");
        dfJoint.addDependency(funcDepCDtoA());
        dfJoint.addDependency(funcDepADtoC());
        return dfJoint;
    }
    
    //FDSet Sixteen = {DE -> C}
    public FDSet dfJoint16() {
        FDSet dfJoint = new FDSet();
        dfJoint.setName("FDSet Sixteen");
        dfJoint.addDependency(funcDepDEtoC());
        return dfJoint;
    }
    
    //FDSet Seventeen = {BCD -> E, E -> C}
    public FDSet dfJoint17() {
        FDSet dfJoint = new FDSet();
        dfJoint.setName("FDSet Seventeen");
        dfJoint.addDependency(funcDepBCDtoE());
        dfJoint.addDependency(funcDepEtoC());
        return dfJoint;
    }
    
    //FDSet Eighteen = {E -> C}
    public FDSet dfJoint18() {
        FDSet dfJoint = new FDSet();
        dfJoint.setName("FDSet Eighteen");
        dfJoint.addDependency(funcDepEtoC());
        return dfJoint;
    }
    
    //FDSet Nineteen = {AB -> C, C -> B}
    public FDSet dfJoint19() {
        FDSet dfJoint = new FDSet();
        dfJoint.setName("FDSet Nineteen");
        dfJoint.addDependency(funcDepABtoC());
        dfJoint.addDependency(funcDepCtoB());
        return dfJoint;
    }
    
    //FDSet Twenty = {C -> B}
    public FDSet dfJoint20() {
        FDSet dfJoint = new FDSet();
        dfJoint.setName("FDSet Twenty");
        dfJoint.addDependency(funcDepCtoB());
        return dfJoint;
    }
    
    //FDSet Twentyone = {A -> C}
    public FDSet dfJoint21() {
        FDSet dfJoint = new FDSet();
        dfJoint.setName("FDSet Twentyone");
        dfJoint.addDependency(funcDepAtoC());
        return dfJoint;
    }
    
    //FDSet Twentytwo = {B -> C}
    public FDSet dfJoint22() {
        FDSet dfJoint = new FDSet();
        dfJoint.setName("FDSet Twentytwo");
        dfJoint.addDependency(funcDepBtoC());
        return dfJoint;
    }
    
    //FDSet Twentythree = {AB -> C, C -> AB, E ->DF, D -> E, F -> E, ABD -> G, CF -> H}
    public FDSet dfJoint23() {
        FDSet dfJoint = new FDSet();
        dfJoint.setName("FDSet Twentythree");
        dfJoint.addDependency(funcDepABtoC());
        dfJoint.addDependency(funcDepCtoAB());
        dfJoint.addDependency(funcDepEtoDF());
        dfJoint.addDependency(funcDepDtoE());
        dfJoint.addDependency(funcDepFtoE());
        dfJoint.addDependency(funcDepABDtoG());
        dfJoint.addDependency(funcDepCFtoH());
        return dfJoint;
    }
    
    //FDSet Twentyfour = {A -> BC, B -> C, AB -> C}
    public FDSet dfJoint24() {
        FDSet dfJoint = new FDSet();
        dfJoint.setName("FDSet Twentyfour");
        dfJoint.addDependency(funcDepAtoBC());
        dfJoint.addDependency(funcDepBtoC());
        dfJoint.addDependency(funcDepABtoC());
        return dfJoint;
    }
    
    //FDSet Twentyfive = {A -> B, A -> C, A -> D, D -> E}
    public FDSet dfJoint25() {
        FDSet dfJoint = new FDSet();
        dfJoint.setName("FDSet Twentyfive");
        dfJoint.addDependency(funcDepAtoB());
        dfJoint.addDependency(funcDepAtoC());
        dfJoint.addDependency(funcDepAtoD());
        dfJoint.addDependency(funcDepDtoE());
        return dfJoint;
    }
    
    //FDSet Twentysix = {A -> BC, D -> E}
    public FDSet dfJoint26() {
        FDSet dfJoint = new FDSet();
        dfJoint.setName("FDSet Twentysix");
        dfJoint.addDependency(funcDepAtoBCD());
        dfJoint.addDependency(funcDepDtoE());
        return dfJoint;
    }
    
    //FDSet Twentyseven = {AB -> D, B -> CE, C -> B}
    public FDSet dfJoint27() {
        FDSet dfJoint = new FDSet();
        dfJoint.setName("FDSet Twentyseven");
        dfJoint.addDependency(funcDepABtoD());
        dfJoint.addDependency(funcDepBtoCE());
        dfJoint.addDependency(funcDepCtoB());
        return dfJoint;
    }
    
    //FDSet OneMinusAtoBC = {BC -> A, BCD -> E, E -> C}
    public FDSet dfJoint1MinusAtoBC() {
        FDSet dfJoint = new FDSet();
        dfJoint.setName("FDSet One minus A -> BC");
        dfJoint.addDependency(funcDepBCtoA());
        dfJoint.addDependency(funcDepBCDtoE());
        dfJoint.addDependency(funcDepEtoC());
        return dfJoint;
    }
    
    //FDSet FiveMinusBtoC = {A -> B}
    public FDSet dfJoint5MinusBtoC() {
        FDSet dfJoint = new FDSet();
        dfJoint.setName("FDSet Five minus B -> C");
        dfJoint.addDependency(funcDepAtoB());
        return dfJoint;
    }
    
    //FDSet Twentyeight = {A -> BCD}
    public FDSet dfJoint28() {
        FDSet dfJoint = new FDSet();
        dfJoint.setName("FDSet Twentyeight");
        dfJoint.addDependency(funcDepAtoBCD());
        return dfJoint;
    }
    
    //FDSet TwentyNine = {A -> D}
    public FDSet dfJoint29() {
        FDSet dfJoint = new FDSet();
        dfJoint.setName("FDSet TwentyNine");
        dfJoint.addDependency(funcDepAtoD());
        return dfJoint;
    }

  //FDSet TwentyNine = {A -> BE, B -> C, CE -> D}
    public FDSet dfJoint100() {
        FDSet dfJoint = new FDSet();
        dfJoint.setName("FDSet 100");
        dfJoint.addDependency(funcDepAtoBE());
        dfJoint.addDependency(funcDepBtoC());
        dfJoint.addDependency(funcDepCEtoD());
        return dfJoint;
    }
    
    //FDSet FourRegroupedWithoutCinAtoBC
    public FDSet dfJoint4ReGroupedWithoutCinAtoBC() {
        FDSet dfJoint = new FDSet();
        dfJoint.setName("FDSet Four Regrouped Without C in A->BC");
        dfJoint.addDependency(funcDepAtoB());
        dfJoint.addDependency(funcDepBtoC());
        dfJoint.addDependency(funcDepABtoC());
        return dfJoint;
    }
    
    //FDSet FourRegroupedWithoutAinABtoC
    public FDSet dfJoint4RegroupedWithoutAinABtoC() {
        FDSet dfJoint = new FDSet();
        dfJoint.setName("FDSet Four Regrouped Without A in AB->C");
        dfJoint.addDependency(funcDepAtoBC());
        dfJoint.addDependency(funcDepBtoC());
        return dfJoint;
    }
    
    //FDSet AtoBC = {A -> BC}
    public FDSet dfJointAtoBC() {
        FDSet dfJoint = new FDSet();
        dfJoint.setName("FDSet AtoBC");
        dfJoint.addDependency(funcDepAtoBC());
        return dfJoint;
    }
    
    //FDSet AtoE = {A -> E}
    public FDSet dfJointAtoE() {
        FDSet dfJoint = new FDSet();
        dfJoint.setName("FDSet AtoE");
        dfJoint.addDependency(funcDepAtoE());
        return dfJoint;
    }
    
    //FDSet CtoA = {C -> A}
    public FDSet dfJointCtoA() {
        FDSet dfJoint = new FDSet();
        dfJoint.setName("FDSet CtoA");
        dfJoint.addDependency(funcDepCtoA());
        return dfJoint;
    }
    
    //FDSet dfJoint_BtoD = {B -> D}
    public FDSet dfJointBtoD() {
        FDSet dfJoint = new FDSet();
        dfJoint.setName("FDSet BtoD");
        dfJoint.addDependency(funcDepBtoD());
        return dfJoint;
    }
    
    //FDSet dfJoint_BtoE = {B -> E}
    public FDSet dfJointBtoE() {
        FDSet dfJoint = new FDSet();
        dfJoint.setName("FDSet BtoE");
        dfJoint.addDependency(funcDepBtoE());
        return dfJoint;
    }
    
    //FDSet dfJoint_ABtoD_BtoC_CtoB = {AB -> D, B -> C, C -> B}
    public FDSet dfJointABtodBtocCtob() {
        FDSet dfJoint = new FDSet();
        dfJoint.setName("FDSet ABtoD_BtoC_CtoB");
        dfJoint.addDependency(funcDepABtoD());
        dfJoint.addDependency(funcDepBtoC());
        dfJoint.addDependency(funcDepCtoB());
        return dfJoint;
    }
    
    //FDSet dfJoint_ABtoC_CtoAB = {AB -> C, C -> AB}
    public FDSet dfJointABtocCtoab() {
        FDSet dfJoint = new FDSet();
        dfJoint.setName("FDSet ABtoC_CtoAB");
        dfJoint.addDependency(funcDepABtoC());
        dfJoint.addDependency(funcDepCtoAB());
        return dfJoint;
    }
    
    //FDSet EtoD_DtoE = {E -> D, D -> E}
    public FDSet dfJointEtodDtoe() {
        FDSet dfJoint = new FDSet();
        dfJoint.setName("FDSet EtoD_DtoE");
        dfJoint.addDependency(funcDepEtoD());
        dfJoint.addDependency(funcDepDtoE());
        return dfJoint;
    }

    //FDSet EtoF_FtoE = {E -> F, F -> E}
    public FDSet dfJointEtofFtoe() {
        FDSet dfJoint = new FDSet();
        dfJoint.setName("FDSet EtoF_FtoE");
        dfJoint.addDependency(funcDepEtoF());
        dfJoint.addDependency(funcDepFtoE());
        return dfJoint;
    }
    
    //FDSet BtoC_CtoB = {B -> C, C -> B}
    public FDSet dfJointBtocCtob() {
        FDSet dfJoint = new FDSet();
        dfJoint.setName("FDSet BtoC_CtoB");
        dfJoint.addDependency(funcDepBtoC());
        dfJoint.addDependency(funcDepCtoB());
        return dfJoint;
    }
    
    //FDSet ABtoD = {AB -> D}
    public FDSet dfJointABtod() {
        FDSet dfJoint = new FDSet();
        dfJoint.setName("FDSet ABtoD");
        dfJoint.addDependency(funcDepABtoD());
        return dfJoint;
    }
    
    //FDSet AtoBC_BCtoA = {A -> BC, BC -> A}
    public FDSet dfJointAtobcBCtoa() {
        FDSet dfJoint = new FDSet();
        dfJoint.setName("FDSet AtoBC_BCtoA");
        dfJoint.addDependency(funcDepAtoBC());
        dfJoint.addDependency(funcDepBCtoA());
        return dfJoint;
    }

    //FDSet ADtoE = {AD -> E}
    public FDSet dfJointADtoe() {
        FDSet dfJoint = new FDSet();
        dfJoint.setName("FDSet ADtoE");
        dfJoint.addDependency(funcDepADtoE());
        return dfJoint;
    }
    
    //FDSet ABEtoGH = {ABE -> GH}
    public FDSet dfJointABEtogh() {
        FDSet dfJoint = new FDSet();
        dfJoint.setName("FDSet ABEtoGH");
        dfJoint.addDependency(funcDepABEtoG());
        dfJoint.addDependency(funcDepABEtoH());
        return dfJoint;
    }
    
    //FDSet BCDtoE_EtoC = {BCD -> E, E -> C}
    public FDSet dfJointBCDtoeEtoc() {
        FDSet dfJoint = new FDSet();
        dfJoint.setName("FDSet BCDtoE_EtoC");
        dfJoint.addDependency(funcDepBCDtoE());
        dfJoint.addDependency(funcDepEtoC());
        return dfJoint;
    }
    
    //FDSet AtoB_BEtoA_ABDtoE = {A -> B, BE -> A, ABD -> E}
    public FDSet dfJointAtobBEtoaABDtoe() {
        FDSet dfJoint = new FDSet();
        dfJoint.setName("FDSet AtoB_BEtoA_ABDtoE");
        dfJoint.addDependency(funcDepAtoB());
        dfJoint.addDependency(funcDepBEtoA());
        dfJoint.addDependency(funcDepABDtoE());
        return dfJoint;
    }
    
    //FDSet CDtoE = {CD -> E}
    public FDSet dfJointCDtoe() {
        FDSet dfJoint = new FDSet();
        dfJoint.setName("FDSet CDtoE");
        dfJoint.addDependency(funcDepCDtoE());
        return dfJoint;
    }
    
    //FDSet CtoD = {C -> D}
    public FDSet dfJointCtod() {
        FDSet dfJoint = new FDSet();
        dfJoint.setName("FDSet CtoD");
        dfJoint.addDependency(funcDepCtoD());
        return dfJoint;
    }
    
    //DPJoint BtoAC = {B -> AC}
    public FDSet dfJointBtoac() {
        FDSet dfJoint = new FDSet();
        dfJoint.setName("FDSet BtoAC");
        dfJoint.addDependency(funcDepBtoAC());
        return dfJoint;
    }
    
    //FDSet AtoC = {A -> C}
    public FDSet dfJointAtoc() {
        FDSet dfJoint = new FDSet();
        dfJoint.setName("FDSet AtoC");
        dfJoint.addDependency(funcDepAtoC());
        return dfJoint;
    }
    
    //FDSet AtoB = {A -> B}
    public FDSet dfJointAtob() {
        FDSet dfJoint = new FDSet();
        dfJoint.setName("FDSet AtoB");
        dfJoint.addDependency(funcDepAtoB());
        return dfJoint;
    }
    //FDSet BtoAC_CtoD = {B -> AC, C -> D}
    public FDSet dfJointBtoacCtod() {
        FDSet dfJoint = new FDSet();
        dfJoint.setName("FDSet {B -> AC, C -> D}");
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
    public FDSet dpJoint30() {
        FDSet dpJoint = new FDSet();
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
    public FDSet dpJoint30A() {
        FDSet dpJoint = new FDSet();
        dpJoint.setName("DPJoint {AD -> C, CD -> A}");
        dpJoint.addDependency(funcDepCDtoA());
        dpJoint.addDependency(funcDepADtoC());
        return dpJoint;
    }
    
    //DPJoint 30_B = {A -> B, AE -> F}
    public FDSet dpJoint30B() {
        FDSet dpJoint = new FDSet();
        dpJoint.setName("DPJoint {A -> B, AE -> F}");
        dpJoint.addDependency(funcDepAtoB());
        dpJoint.addDependency(funcDepAEtoF());
        return dpJoint;
    }
    
    //DPJoint 30_C = {AE -> F}
    public FDSet dpJoint30C() {
        FDSet dpJoint = new FDSet();
        dpJoint.setName("DPJoint {AE -> F}");
        dpJoint.addDependency(funcDepAEtoF());
        return dpJoint;
    }
    
    //DPJoint 31 = {A -> B, CD -> A, BD -> C, AE -> F, DE -> C, AE -> D, A ->> CD}
    public FDSet dpJoint31() {
        FDSet dpJoint = new FDSet();
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
    public FDSet dpJoint31Equi() {
        FDSet dpJoint = new FDSet();
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
    public FDSet dpJoint32() {
        FDSet dpJoint = new FDSet();
        dpJoint.setName("DPJoint {A -> B, B ->> C}");
        dpJoint.addDependency(funcDepAtoB());
        dpJoint.addDependency(pluDepBtoC());
        return dpJoint;
    }
    
    //DPJoint 33 = {A -> B, A -> C, B ->> C}
    public FDSet dpJoint33() {
        FDSet dpJoint = new FDSet();
        dpJoint.setName("DPJoint {A -> B, A -> C, B ->> C}");
        dpJoint.addDependency(funcDepAtoB());
        dpJoint.addDependency(funcDepAtoC());
        dpJoint.addDependency(pluDepBtoC());
        return dpJoint;
    }
    
    //DPJoint 34 = {B ->> C}
    public FDSet dpJoint34() {
        FDSet dpJoint = new FDSet();
        dpJoint.setName("DPJoint {B ->> C}");
        dpJoint.addDependency(pluDepBtoC());
        return dpJoint;
    }
    
    //DPJoint 35 = {D ->> F, C -> A, CD -> E, A -> B}
    public FDSet dpJoint35() {
        FDSet dpJoint = new FDSet();
        dpJoint.setName("DPJoint {D ->> F, C -> A, CD -> E, A -> B}");
        dpJoint.addDependency(pluDepDtoF());
        dpJoint.addDependency(funcDepCtoA());
        dpJoint.addDependency(funcDepCDtoE());
        dpJoint.addDependency(funcDepAtoB());
        return dpJoint;
    }
    
    //DPJoint 35_A = {C -> A, CD -> E, A -> B}
    public FDSet dpJoint35A() {
        FDSet dpJoint = new FDSet();
        dpJoint.setName("DPJoint {C -> A, CD -> E, A -> B}");
        dpJoint.addDependency(funcDepCtoA());
        dpJoint.addDependency(funcDepCDtoE());
        dpJoint.addDependency(funcDepAtoB());
        return dpJoint;
    }   
    
    
    //DPJoint 36 = {A ->> BCD, B -> AC, C -> D}
    public FDSet dpJoint36() {
        FDSet dpJoint = new FDSet();
        dpJoint.setName("DPJoint {A ->> BCD, B -> AC, C -> D}");
        dpJoint.addDependency(pluDepAtoBCD());
        dpJoint.addDependency(funcDepBtoAC());
        dpJoint.addDependency(funcDepCtoD());
        return dpJoint;
    }
    
    //DPJoint 37 = {A ->> BC, D -> C}
    public FDSet dpJoint37() {
        FDSet dpJoint = new FDSet();
        dpJoint.setName("DPJoint {A ->> BC, D -> C}");
        dpJoint.addDependency(pluDepAtoBC());
        dpJoint.addDependency(funcDepDtoC());
        return dpJoint;
    }
    
    //FDSet 38 = {B -> AC, C -> D, BC ->> AD}
    public FDSet dpJoint38() {
        FDSet dpJoint = new FDSet();
        dpJoint.setName("DPJoint {B -> AC, C -> D, BC ->> AD}");
        dpJoint.addDependency(funcDepBtoAC());
        dpJoint.addDependency(funcDepCtoD());
        dpJoint.addDependency(pluDepBCtoAD());
        return dpJoint;
    }
    
    /******************/
    //RareElement
    /******************/
    
    //C Consequent A->BC FDSet TwentyFour
    public RareElement rareElementCinAtoBCDFJoint24Consequent() {
        return new RareElement(
                attrC(),
                funcDepAtoBC(),
                dfJoint24(),
                Const.CONSEQUEDENT);
    }
    
    //A Antecedent AB->C FDSet TwentyFour
    public RareElement rareElementAinABtoCDFJoint24Antecedent() {
        return new RareElement(
                attrA(),
                funcDepABtoC(),
                dfJoint24(),
                Const.ANTECEDENT);
    }
    
    //B Antecedent AB->C FDSet TwentyFour
    public RareElement rareElementBinABtoCDFJoint24Antecedent() {
        return new RareElement(
                attrB(),
                funcDepABtoC(),
                dfJoint24(),
                Const.ANTECEDENT);
    }
    
    //C Consequent A->BC FDSet Four
    public RareElement rareElementCinAtoBCDFJoint4Consequent() {
        return new RareElement(
                attrC(),
                funcDepAtoBC(),
                dfJoint04(),
                Const.CONSEQUEDENT);
    }
    //A Antecedent AB->C FDSet Four
    public RareElement rareElementAinABtoCDFJoint4Antecedent() {
        return new RareElement(
                attrA(),
                funcDepABtoC(),
                dfJoint04(),
                Const.ANTECEDENT);
    }

    //B Antecedent AB->C FDSet Four
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
    
    //Relation One = FDSet One, AttributeSet ABCDE
    public Relation relation01() {
        return new Relation(attrJntABCDE(), dfJoint01());
    }
    
    //Relation Two = FDSet Two, AttributeSet ABCDE
    public Relation relation02() {
        return new Relation(attrJntABCDE(), dfJoint02());
    }
    
    //Relation Three = FDSet Three, AttributeSet ABCDEFGH
    public Relation relation03() {
        return new Relation(attrJntABCDEFGH(), dfJoint03());
    }
    
    //Relation Four = FDSet Four, AttributeSet ABC
    public Relation relation04() {
        return new Relation(attrJntABC(), dfJoint04());
    }
        
    //Relation Five = FDSet Five, AttributeSet ABC
    public Relation relation05() {
        return new Relation(attrJntABC(), dfJoint05());
    }
    
    //Relation Six = FDSet Six, AttributeSet ABCDE -> Key:
        public Relation relation06() {
            return new Relation(attrJntABCDE(), dfJoint06());
        }

    //Relation Seven = FDSet Seven, AttributeSet ABCD -> Key:
    public Relation relation07() {
        return new Relation(attrJntABCD(), dfJoint07());
    }
    
    //Relation Eight = FDSet Eight, AttributeSet ABCD -> Key:
    public Relation relation08() {
        return new Relation(attrJntABCD(), dfJoint08());
    }
    
    //Relation Nine = FDSet Nine, AttributeSet ABC -> Key: AB
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
        relation.setDFJoint(new FDSet());
        return relation;
    }
    
    //Relation BC
    public Relation relationBC() {
        Relation relation = new Relation();
        relation.settAttrJoint(attrJntBC());
        relation.setDFJoint(new FDSet());
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
        relation.setDFJoint(new FDSet());
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
        relation.setDFJoint(new FDSet());
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
        relation.setDFJoint(new FDSet());
        return relation;
    }
    
    //Relation BDE
    public Relation relationBDE() {
        Relation relation = new Relation();
        relation.settAttrJoint(attrJntBDE());
        relation.setDFJoint(new FDSet());
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
        relation.setDFJoint(new FDSet());
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
