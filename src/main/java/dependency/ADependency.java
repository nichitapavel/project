/**
 * 
 */
package dependency;

import java.util.List;

import datastructures.Attribute;
import datastructures.AttributeSet;
import datastructures.DFJoint;
import datastructures.KeyJoint;
import datastructures.Relation;

/**
 * @author Pavel Nichita
 *
 */
public abstract class ADependency {
    protected AttributeSet antecedent;
    protected AttributeSet consequent;
    
    /**
     * Empty constructor.
     */
    public ADependency() {
        // Manually generated default constructor.
    }
    
    /**
     * Constructs a Abstract Dependency with antecedent and consequent.
     * 
     * @param antecedent AttributeSet representing the left side of a dependency.
     * @param consequent AttributeSet representing the right side of a dependency.
     */
    public ADependency(AttributeSet antecedent, AttributeSet consequent) {
        this.antecedent = new AttributeSet(antecedent);
        this.consequent = new AttributeSet(consequent);
        this.antecedent.removeDuplicatedAttribute();
        this.consequent.removeDuplicatedAttribute();
    }
    
    /**
     * Returns the left side of a dependency.
     * 
     * @return an AttributeSet representing the left side of a dependency.
     */
    public AttributeSet getAntecedent() {
        return this.antecedent;
    }
    
    /**
     * Returns the right side of a dependency.
     * 
     * @return an AttributeSet representing the right side of a dependency.
     */
    public AttributeSet getConsequent() {
        return this.consequent;
    }
    
    /**
     * Sets the left side of a dependency.
     * 
     * @param antecedent the AttributeSet representing the left side of a dependency.
     */
    public void setAntecedent(AttributeSet antecedent) {
        this.antecedent = antecedent;
    }
    
    /**
     * Sets the right side of a dependency.
     * 
     * @param consequent the AttributeSet representing the right side of a dependency.
     */    
    public void setConsequent(AttributeSet consequent) {
        this.consequent = consequent;
    }

    /**
     * Removes an Attribute from the left side.
     * 
     * It's a wrapper that calls a private function that calls
     * AttributeSet {@link datastructures.AttributeSet#removeAttributes(Attribute)}}
     * with {@code attr} as parameter.
     * 
     * @param attr The Attribute to be removed.
     */
    public void removeAttributeFromAntecedent(Attribute attr){
        removeAttributes(attr, this.antecedent);
    }
    
    /**
     * Removes an AttributeSet from the left side.
     * 
     * It's a wrapper that calls a private function that calls
     * AttributeSet {@link datastructures.AttributeSet#removeAttributes(AttributeSet)}}
     * with {@code attr} as parameter.
     * 
     * @param attr The AttributeSet to be removed.
     */
    public void removeAttributeFromAntecedent(AttributeSet attr) {
        removeAttributes(attr, antecedent);
    }
    
    /**
     * Removes an Attribute from the right side.
     * 
     * It's a wrapper that calls a private function that calls
     * AttributeSet {@link datastructures.AttributeSet#removeAttributes(Attribute)}}
     * with {@code attr} as parameter.
     * 
     * @param attr The Attribute to be removed.
     */
    public void removeAttributeFromConsequent(Attribute attr){
        removeAttributes(attr, this.consequent);
    }
    
    /**
     * Removes an AttributeSet from the right side.
     * 
     * It's a wrapper that calls a private function that calls
     * AttributeSet {@link datastructures.AttributeSet#removeAttributes(AttributeSet)}}
     * with {@code attr} as parameter.
     * 
     * @param attr The AttributeSet to be removed.
     */
    public void removeAttributeFromConsequent(AttributeSet attr) {
        removeAttributes(attr, this.consequent);
    }
   
    /**
     * Removes an Attribute from the left or right side.
     * 
     * It's a wrapper that calls AttributeSet {@link datastructures.AttributeSet#removeAttributes(Attribute)}}
     * with {@code attr} as parameter.
     * 
     * @param attr The Attribute to be removed.
     */
    private void removeAttributes(Attribute attr, AttributeSet attrJoint){
        attrJoint.removeAttributes(attr);       
    }
    
    /**
     * Removes an AttributeSet from the left or right side.
     * 
     * It's a wrapper that calls AttributeSet {@link datastructures.AttributeSet#removeAttributes(Attribute)}}
     * with {@code attr} as parameter.
     * 
     * @param attr The AttributeSet to be removed.
     */
    private void removeAttributes(AttributeSet attr, AttributeSet attrJoint){
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
     * Return an AttributeSet with all Attributes from this dependency.
     * 
     * @return an AttributeSet with all Attributes from this dependency.
     */
    public AttributeSet getAttributeJoint() {
        AttributeSet attrJoint = new AttributeSet(this.antecedent);
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

    public abstract boolean isTrivial();

    public abstract boolean is2NF(Relation relation, KeyJoint keyJoint);

    public abstract boolean is3NF(Relation relation, KeyJoint keyJoint);

    public abstract boolean isBCNF(Relation relation);
}
