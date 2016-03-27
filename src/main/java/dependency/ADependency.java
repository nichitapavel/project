/**
 * 
 */
package dependency;

import datastructures.AttributeJoint;

/**
 * @author Pavel Nichita
 *
 */
public abstract class ADependency {
    protected AttributeJoint antecedent;
    protected AttributeJoint consequent;
    
    /**
     * Empty constructor.
     */
    public ADependency() {
        // Private constructor to prevent instantiation.
    }
    
    /**
     * Constructs a Abstract Dependency with antecedent and consequent.
     * 
     * @param antecedent AttributeJoint representing the left side of a dependency.
     * @param consequent AttributeJoint representing the right side of a dependency.
     */
    public ADependency(AttributeJoint antecedent, AttributeJoint consequent) {
        this.antecedent = new AttributeJoint(antecedent);
        this.consequent = new AttributeJoint(consequent);
        this.antecedent.removeDuplicatedAttribute();
        this.consequent.removeDuplicatedAttribute();
    }
    
    /**
     * Returns the left side of a dependency.
     * 
     * @return an AttributeJoint representing the left side of a dependency.
     */
    public AttributeJoint getAntecedent() {
        return this.antecedent;
    }
    
    /**
     * Returns the right side of a dependency.
     * 
     * @return an AttributeJoint representing the right side of a dependency.
     */
    public AttributeJoint getConsequent() {
        return this.consequent;
    }
    
    /**
     * Sets the left side of a dependency.
     * 
     * @param antecedent the AttributeJoint representing the left side of a dependency.
     */
    public void setAntecedent(AttributeJoint antecedent) {
        this.antecedent = antecedent;
    }
    
    /**
     * Sets the right side of a dependency.
     * 
     * @param consequent the AttributeJoint representing the right side of a dependency.
     */    
    public void setConsequent(AttributeJoint consequent) {
        this.consequent = consequent;
    }

}
