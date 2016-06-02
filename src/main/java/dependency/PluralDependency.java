/**
 * 
 */
package dependency;

import java.util.ArrayList;
import java.util.List;

import datastructures.AttributeSet;
import datastructures.DFJoint;
import datastructures.KeyJoint;
import datastructures.Relation;

/**
 * @author Pavel Nichita
 *
 */
public class PluralDependency extends ADependency {

    /**
     * Empty constructor.
     */
    public PluralDependency() {
        // Manually generated default constructor.
    }
  
    /**
     * Constructs a PluralDependency with antecedent and consequent by calling inherit method.
     * 
     * @param antecedent AttributeSet representing the left side of a dependency.
     * @param consequent AttributeSet representing the right side of a dependency.
     */
    public PluralDependency(AttributeSet antecedent, AttributeSet consequent) {
        super(antecedent, consequent);
    }

    @Override
    public void clearTrivialElements() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "";
    }

    /**
    * Returns a hash code for this plural dependency.
    * 
    * The hash code for a PluraDependency object is
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
     * Compares this plural dependency to the specified object.
     * 
     *  The result is true if and only if the argument
     *  is not null and is a PluralDependency object that represents
     *  the same attribute joint list as this object.
     * 
     * @param obj The object to compare this PluralDependency against.
     * @return true if the given object represents a PluralDependency
     * equivalent to this plural dependency, false otherwise.
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
     * Returns a list with functional dependencies that can be implied from {@code dfJoint}.
     * 
     * If a the antecedent of a functional dependency from {@code dfJoint} and consequent
     * from this object have none common attributes but the consequent of the functional dependency
     * is part of this consequent then there is a functional dependency with this antecedent that defines
     * functional dependency consequent.
     * 
     * @param dfJoint the DFJoint where this dependency exists.
     * @return a list of size one with this dependency in it.
     */
    @Override
    public List<ADependency> toFunctionalDependency(DFJoint dfJoint) {
        List<ADependency> result = new ArrayList<>();      
        AttributeSet intersect;
        for (ADependency fd : dfJoint) {
            if (fd.getClass() == new FunctionalDependency().getClass()) {
                intersect = fd.getAntecedent().intersect(super.consequent);
                if ( fd.getConsequent().isContained(super.consequent) && intersect.isNull())
                    result.add(new FunctionalDependency(super.antecedent, fd.getConsequent()));
            }
        }
        return result;
    }

    @Override
    public boolean belongsTo(DFJoint dfJoint, Relation relation) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isTrivial() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean is2NF(Relation relation, KeyJoint keyJoint) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean is3NF(Relation relation, KeyJoint keyJoint) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isBCNF(Relation relation) {
        // TODO Auto-generated method stub
        return false;
    }

}
