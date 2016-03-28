/**
 * 
 */
package dependency;

import datastructures.AttributeJoint;

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
     * @param antecedent AttributeJoint representing the left side of a dependency.
     * @param consequent AttributeJoint representing the right side of a dependency.
     */
    public PluralDependency(AttributeJoint antecedent, AttributeJoint consequent) {
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

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return false;
    }

}
