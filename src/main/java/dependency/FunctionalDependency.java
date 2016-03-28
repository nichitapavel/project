/**
 * 
 */
package dependency;

import java.util.logging.Level;
import java.util.logging.Logger;

import datastructures.AttributeJoint;
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
    
}
