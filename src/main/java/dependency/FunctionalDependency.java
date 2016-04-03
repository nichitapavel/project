/**
 * 
 */
package dependency;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import datastructures.Attribute;
import datastructures.AttributeJoint;
import datastructures.DFJoint;
import datastructures.KeyJoint;
import datastructures.Relation;
import normalization.Normalization;
import utils.Const;

/**
 * @author Pavel Nichita
 *
 */
public class FunctionalDependency extends PluralDependency {
    private static final Logger LOG = Logger.getLogger(FunctionalDependency.class.getName());
    /**
     * Empty constructor.
     */
    public FunctionalDependency() {
        // Manually generated default constructor.
    }
    
    /**
     * Constructs a FunctionalDependency with antecedent and consequent by calling inherit method.
     * 
     * @param antecedent AttributeJoint representing the left side of a dependency.
     * @param consequent AttributeJoint representing the right side of a dependency.
     */
    public FunctionalDependency(AttributeJoint antecedent, AttributeJoint consequent) {
        super(antecedent, consequent);
    }

    /**
     * Returns the value of this FunctionalDependency object in string format.
     * 
     * The format being used is <i>{obj, obj} -&gt; {obj, obj}</i>.
     * 
     * @return a string representing this object, if the dependency is empty or
     * null returns "null -&gt; null" string.
     */
    @Override
    public String toString() {
        try {
            return super.antecedent.toString() + " -> " + super.consequent.toString();          
        }
        catch (NullPointerException ex) {
            LOG.log(Level.INFO, Const.FD_NOT_INIT, ex);
        }
        return "null -> null";
    }
    
    /**
     * Returns a hash code for this functional dependency.
     * 
     * The hash code for a FunctionalDependency object is
     * computed using the default implementations of Eclipse.
     * 
     * @return a hash code value for this object.
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((super.antecedent == null) ? 0 : super.antecedent.hashCode());
        result = prime * result
                + ((super.consequent == null) ? 0 : super.consequent.hashCode());
        return result;
    }
 
    /**
     * Compares this functional dependency to the specified object.
     * 
     *  The result is true if and only if the argument
     *  is not null and is a FunctionalDependency object that represents
     *  the same attribute joint list as this object.
     * 
     * @param obj The object to compare this FunctionalDependency against.
     * @return true if the given object represents a FunctionalDependency
     * equivalent to this functional dependency, false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ADependency other = (ADependency) obj;
        if (super.antecedent == null) {
            if (other.antecedent != null)
                return false;
        } else if (!super.antecedent.equals(other.antecedent))
            return false;
        if (super.consequent == null) {
            if (other.consequent != null)
                return false;
        } else if (!super.consequent.equals(other.consequent))
            return false;
        return true;
    }
    
    /**
     * Clear the right side of this dependency of Attribute objects that
     * appear also in the left side.
     * 
     * If an Attribute object appears in the left side of a dependency it
     * should not appear in the right side because is automatically implied.
     * Reflexivity law of Armstrong.
     */
    @Override
    public void clearTrivialElements() {
        try {
            AttributeJoint newConsequent = new AttributeJoint();
            for (Attribute attr : super.consequent)
                if (!attr.isContained(super.antecedent))
                    newConsequent.addAttributes(attr);
            super.consequent = newConsequent;
        }
        catch (NullPointerException ex) {
            LOG.log(Level.INFO, Const.FD_NOT_INIT, ex);
        }
    }
    
    /**
     * Returns a list with this dependency.
     * 
     * This function was designed for {@link dependency.PluralDependency} class.
     * A plural dependency can imply a list of functional dependency in a DFJoint.
     * 
     * @param dfJoint the DFJoint where this dependency exists.
     * @return a list of size one with this dependency in it.
     */
    @Override
    public List<ADependency> toFunctionalDependency(DFJoint dfJoint) {
        List<ADependency> result = new ArrayList<>();
        result.add(this);
        return result;
    }
    
    /**
     * Returns if this dependency can be implied in a relation with DFJoint.
     * 
     * The method used is Ullman, it calculates all attributes implied by antecedent, 
     * if all consequent attributes are present, then this dependency belongs to Relation DFJoint.
     * 
     * @return true if it can be implied in Relation with DFJoint, false otherwise. 
     */
    @Override
    public boolean belongsTo(DFJoint dfJoint, Relation relation) {
        DFJoint hiddenDF = dfJoint.getHiddenDF();
        AttributeJoint equivalentAttrJoint = Normalization.simpleUllman(super.antecedent, hiddenDF);
        return super.consequent.isContained(equivalentAttrJoint);
    }
    
    /**
     * Returns if this dependency is trivial.
     *
     * In order to be trivial, this dependency must have all the 
     * right attributes included in the left attributes side. Also
     * if either left side or right side have no attributes is trivial.
     * 
     * @return true if all attribute from right side are included in the
     * left side, false otherwise.
     */
    @Override
    public boolean isTrivial() {
        if (super.antecedent.isNull() || super.consequent.isNull())
            return true;
        for (Attribute attr : super.consequent)
            if (attr.isContained(super.antecedent))
                return true;
        return false;
    }
    
    /**
     * Returns if this dependency meets 2nd normal form specification.
     * 
     * In order for a dependency to meet this specification it must comply with one
     * of this criteria:
     * <ul><li>Antecedent is a key of Relation</li><li>Consequent is 
     * part of a key of Relation</li><li>The antecedent is not part of a key</li></ul>.
     *  
     * @return true if meets 2nd normal form specification, false otherwise.
     */
    @Override
    public boolean is2NF(Relation relation, KeyJoint keyJoint) {
        if (keyJoint == null)
            keyJoint = relation.calculateKeyJoint();

        AttributeJoint ullman = Normalization.simpleUllman(super.antecedent, relation.getDFJoint());
        if (!relation.getAttrJoint().equals(ullman) &&
                !super.consequent.isPartOf(keyJoint) &&
                super.antecedent.isPartOf(keyJoint))
                    return false;
        return true;
    }

}
