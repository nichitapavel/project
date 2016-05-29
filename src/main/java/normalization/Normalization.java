/**
 * 
 */
package normalization;

import java.util.ArrayList;
import java.util.List;

import datastructures.AttributeJoint;
import datastructures.DFJoint;
import datastructures.KeyJoint;
import datastructures.Relation;
import dependency.ADependency;
import dependency.FunctionalDependency;

/**
 * @author Pavel Nichita
 *
 */
public final class Normalization {
    
    private Normalization() {
        // Private constructor to hide the implicit public one.
    }
    
    /**
     * Calculates all attributes that are being implied by {@code attrJoint} in
     * {@code dfJoint}.
     * 
     * The algorithm used is Ullman.
     * 
     * @param attrJoint Attribute joint to who'm calculate ullman.
     * @param dfJoint Where to calculate.
     * @return an attribute joint with all the attributes implied.
     */
    public static AttributeJoint simpleUllman(AttributeJoint attrJoint, DFJoint dfJoint){
        AttributeJoint result = new AttributeJoint(attrJoint);
        boolean isChanged;
        
        do {
            isChanged = false;
            for (ADependency df:dfJoint) {
                if (df.getClass() == new FunctionalDependency().getClass() &&
                    df.getAntecedent().isContained(result) &&
                    !(df.getConsequent().isContained(result))) {
                        result.addAttributes(df.getConsequent());
                        isChanged = true;
                    }
                }
        } while (isChanged);
        
        return result;
    }

    /**
     * Returns a list of relations that comply with Boyce-Codd normal form.
     * 
     * It takes the input {@code relation} and decompose it into smaller 
     * relations that comply with Boyce-Codd criteria. If {@code auto} is 
     * {@code true} that it decompose based on first non Boyce-Codd dependency,
     * if {@code false} it gives a choice to the user.
     * 
     * @param relation The relation that must be decomposed to smaller Boyce-Codd relations.
     * @param auto Decompose based on first non Boyce-Codd dependency if true, gives user to
     * choose between posibilities.
     * @return a list of relations that comply Boyce-Codd criteria. 
     */
    public static List<Relation> normalizeBCNF(Relation relation, boolean auto) {
        List<Relation> normalizedRelation = new ArrayList<>();
        normalizedRelation.add(relation);
        int option = 0;
        for (int i = 0; i < normalizedRelation.size(); i++) {
            Relation newRelation = normalizedRelation.get(i);
            List<ADependency> nonNFDFs;
            if (!newRelation.isBCNF()) {
                nonNFDFs = newRelation.getNonBCNFDFs();
                if (!auto) {
                    /*
                     * option = get.stdin()
                     */
                }
                normalizedRelation.remove(newRelation);
                normalizedRelation.addAll(i, newRelation.split(nonNFDFs.get(option)));
                i--;
            }
        }

        if (normalizedRelation.size() > 1) {
            for (int i = 0; i < normalizedRelation.size(); i++) {
                normalizedRelation.get(i).setName(relation.getName() + "/" + (i+1));
            }
        }

        return normalizedRelation;
    }
    
    public static List<Relation> normalize3NF(Relation relation, boolean auto) {
        List<Relation> normalizedRelation = new ArrayList<>();
        normalizedRelation.add(relation);
        KeyJoint keyJoint = relation.calculateKeyJoint();
        int option = 0;
        for (int i = 0; i < normalizedRelation.size(); i++) {
            Relation newRelation = normalizedRelation.get(i);
            List<ADependency> nonNFDFs;
            if (!newRelation.is3NF()) {
                nonNFDFs = newRelation.getNon3NFDFs();
                if (!auto) {
                    /*
                     * option = get.stdin()
                     */
                }
                normalizedRelation.remove(newRelation);
                normalizedRelation.addAll(i, newRelation.split(nonNFDFs.get(option)));
                i--;
            }
        }
        boolean projectionOnKey = false;
        for (Relation r : normalizedRelation) {
            if (r.getAttrJoint().containsJoinsFrom(keyJoint))
                projectionOnKey = true;
        }
        if (!projectionOnKey) {
            AttributeJoint key = keyJoint.getKey(0);
            normalizedRelation.add(relation.splitByKey(key));
        }

        if (normalizedRelation.size() > 1) {
            for (int i = 0; i < normalizedRelation.size(); i++) {
                normalizedRelation.get(i).setName(relation.getName() + "/" + (i+1));
            }
        }

        return normalizedRelation;
    }
}
