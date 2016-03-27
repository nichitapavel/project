/**
 * 
 */
package dependency;

import datastructures.AttributeJoint;

/**
 * @author Pavel Nichita
 *
 */
public class FunctionalDependency extends PluralDependency {
  
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

}
