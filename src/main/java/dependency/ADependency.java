/**
 * 
 */
package dependency;

import java.util.List;

import datastructures.Attribute;
import datastructures.AttributeJoint;
import datastructures.DFJoint;
import datastructures.Relation;

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
        // Manually generated default constructor.
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

    /**
     * Removes an Attribute from the left side.
     * 
     * It's a wrapper that calls a private function that calls
     * AttributeJoint {@link datastructures.AttributeJoint#removeAttributes(Attribute)}}
     * with {@code attr} as parameter.
     * 
     * @param attr The Attribute to be removed.
     */
    public void removeAttributeFromAntecedent(Attribute attr){
        removeAttributes(attr, this.antecedent);
    }
    
    /**
     * Removes an AttributeJoint from the left side.
     * 
     * It's a wrapper that calls a private function that calls
     * AttributeJoint {@link datastructures.AttributeJoint#removeAttributes(AttributeJoint)}}
     * with {@code attr} as parameter.
     * 
     * @param attr The AttributeJoint to be removed.
     */
    public void removeAttributeFromAntecedent(AttributeJoint attr) {
        removeAttributes(attr, antecedent);
    }
    
    /**
     * Removes an Attribute from the right side.
     * 
     * It's a wrapper that calls a private function that calls
     * AttributeJoint {@link datastructures.AttributeJoint#removeAttributes(Attribute)}}
     * with {@code attr} as parameter.
     * 
     * @param attr The Attribute to be removed.
     */
    public void removeAttributeFromConsequent(Attribute attr){
        removeAttributes(attr, this.consequent);
    }
    
    /**
     * Removes an AttributeJoint from the right side.
     * 
     * It's a wrapper that calls a private function that calls
     * AttributeJoint {@link datastructures.AttributeJoint#removeAttributes(AttributeJoint)}}
     * with {@code attr} as parameter.
     * 
     * @param attr The AttributeJoint to be removed.
     */
    public void removeAttributeFromConsequent(AttributeJoint attr) {
        removeAttributes(attr, this.consequent);
    }
   
    /**
     * Removes an Attribute from the left or right side.
     * 
     * It's a wrapper that calls AttributeJoint {@link datastructures.AttributeJoint#removeAttributes(Attribute)}}
     * with {@code attr} as parameter.
     * 
     * @param attr The Attribute to be removed.
     */
    private void removeAttributes(Attribute attr, AttributeJoint attrJoint){
        attrJoint.removeAttributes(attr);       
    }
    
    /**
     * Removes an AttributeJoint from the left or right side.
     * 
     * It's a wrapper that calls AttributeJoint {@link datastructures.AttributeJoint#removeAttributes(Attribute)}}
     * with {@code attr} as parameter.
     * 
     * @param attr The AttributeJoint to be removed.
     */
    private void removeAttributes(AttributeJoint attr, AttributeJoint attrJoint){
        attrJoint.removeAttributes(attr);       
    }
    
    /**
     * Returns true if this object can be removed without any side effect.
     * 
     * When a dependency has no attributes in antecedent o consequent, it means it can
     * be destroyed because it is not representing anything.
     * 
     * @return true if there is no antecedent or consequent, false otherwise.
     */
    public boolean isDestroyable() {
        if (antecedent.getSize() == 0 || consequent.getSize() == 0)
            return true;
        return false;
    }
    
    /**
     * Removes all of the elements from this dependency.
     * 
     * The dependency will be empty after this call returns.
     */
    public void clear() {
        this.antecedent.clear();
        this.consequent.clear();
    }
    
    /**
     * Return an AttributeJoint with all Attributes from this dependency.
     * 
     * @return an AttributeJoint with all Attributes from this dependency.
     */
    public AttributeJoint getAttributeJoint() {
        AttributeJoint attrJoint = new AttributeJoint(this.antecedent);
        attrJoint.addAttributes(consequent);
        return attrJoint;
    }
    
    public abstract void clearTrivialElements();
    
    @Override
    public abstract String toString();
    
    @Override
    public abstract int hashCode();

    @Override
    public abstract boolean equals(Object obj);

    public abstract List<ADependency> toFunctionalDependency(DFJoint dfJoint);

    public abstract boolean belongsTo(DFJoint dfJoint, Relation relation);
}
