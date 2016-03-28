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
        catch (NullPointerException ex) { };
        return "null -> null";
    }
    
}
