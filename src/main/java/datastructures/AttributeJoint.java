/**
 * 
 */
package datastructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Pavel Nichita
 *
 */
public class AttributeJoint implements Iterable<Attribute> {
    private ArrayList<Attribute> joint;
    private static final Logger LOG = Logger.getLogger(AttributeJoint.class.getName()); 

    /**
     * Constructs a Null list of Attribute.
     */
    public AttributeJoint() {
        // Manually generated default constructor.
    }

    /**
     * Constructs an ordered list of Attributes from strings.
     * 
     * With every string in stringArray creates an Attribute object,
     * after that adds it in a list. In the end sorts the list.
     * 
     * @param stringArray An array of String object.
     */
    public AttributeJoint(String [] stringArray) {
        joint = new ArrayList<>();
        for (String attr : stringArray)
            joint.add(new Attribute(attr));
        sort();
    }

    /**
     * Constructs an ordered list of Attributes from joint object
     * with Attribute objects.
     * 
     * Adds every Attribute object to a list. In the end sorts the list.
     * 
     * @param joint An ArrayList of Attribute objects.
     */
    public AttributeJoint(List<Attribute> joint) {
        this.joint = new ArrayList<>(joint) ;
        sort();
    }

    /**
     * Constructs an ordered list of Attributes from another
     * AttributeJoint object.
     *
     * Assigns the list from obj to this AttributeJoint object.
     *
     * @param obj An AttributeJoint object.
     */
    public AttributeJoint(AttributeJoint obj) {
        this.joint = new ArrayList<>(obj.getAttributeJoint());
    }

    /**
     * Returns a list of Attribute objects.
     * 
     * @return a list of Attribute objects.
     */
    public List<Attribute> getAttributeJoint() {
        return this.joint;
    }

    /**
     * Sets the list joint.
     * 
     * @param joint A list with Attribute objects.
     */
    public void setAttributeJoint(List<Attribute> joint) {
        this.joint = new ArrayList<>(joint);
    }

    /**
     * Removes Attribute objects that appear more than one time
     * in the list.
     */
    public void removeDuplicatedAttribute() {
        int j;
        for (int i = 0; i < joint.size(); i++){
            j = i + 1;
            while (j < joint.size()) {
                if (joint.get(i).equals(joint.get(j))) {
                    joint.remove(j);
                    j--;
                }
                j++;
            }
        }
    }

    /**
     * Returns the value of this AttributeJoint object in string format.
     * 
     * The format being used is <i>{obj, obj, ...}</i>.
     * 
     * @return a string representing this object, if the list is empty or
     * null returns "null" string. 
     */
    @Override
    public String toString() {
        if (this.joint == null || this.joint.isEmpty())
            return "null";
        
        String stringJoint = "{" + joint.get(0).toString();
        for (int i = 1; i < joint.size(); i++)
            stringJoint = stringJoint + ", " + joint.get(i).toString();
        return stringJoint + "}";
    }

    /**
     * Returns a hash code for this attribute joint.
     * 
     * The hash code for a AttributeJoint object is
     * computed using the default implementations of Eclipse.
     * 
     * @return a hash code value for this object.
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((joint == null) ? 0 : joint.hashCode());
        return result;
    }

    /**
     * Compares this attribute joint to the specified object.
     * 
     *  The result is true if and only if the argument
     *  is not null and is a AttributeJoint object that represents
     *  the same attribute joint list as this object.
     * 
     * @param obj The object to compare this AttributeJoint against.
     * @return true if the given object represents a AttributeJoint
     * equivalent to this attribute joint list, false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        AttributeJoint other = (AttributeJoint) obj;
        if (joint == null) {
            if (other.joint != null)
                return false;
        } else if (!joint.equals(other.joint))
            return false;
        return true;
    }

    /**
     * Checks if all Attribute objects from this are part of {@code attrJoint}.
     * 
     * If this object or {@code attrJoint} is null returns false, if at least
     * one Attribute object is not part of {@code attrJoint} returns false, 
     * otherwise returns true. 
     * 
     * @param attrJoint the object where to check if is part of.
     * @return true if all Attribute objects are part of {@code attrJoint},
     * false otherwise.
     */
    public boolean isContained(AttributeJoint attrJoint) {
        if (attrJoint.getAttributeJoint() == null || joint == null)
            return false;
        
        for (Attribute attribute : joint){
            if (attrJoint.getAttributePosition(attribute) == -1)
                return false;
        }
        return true;
    }

    /**
     * Adds an Attribute object to this list.
     * 
     * If this list is not initialized, initializes it, checks if {@code attr}
     * is already in the list, if it's not adds it, and sort this list.
     * 
     * @param attr Attribute object to add to the list.
     */
    public void addAttributes(Attribute attr) {
        if (joint == null)
            joint = new ArrayList<>();
        
        if (joint.indexOf(attr) == -1)
            joint.add(attr);
        
        sort();
    }

    /**
     * Adds another AttributeJoint Attribute objects to this.
     * 
     * If this list is not initialized, initializes it, checks if {@code attrJoint}
     * has Attribute objects, if it not, calls {@link datastructures.AttributeJoint#addAttributes(Attribute)} 
     * for every Attribute object of {@code attrJoint}.
     * 
     * @param attrJoint The AttributeJoint to add to this.
     */
    public void addAttributes(AttributeJoint attrJoint) {
        if (joint == null)
            joint = new ArrayList<>();
        
        if (attrJoint.getAttributeJoint() != null)      
            for (Attribute attr : attrJoint)
                addAttributes(attr);
    }

    /**
     * Returns the size of the list with Attribute objects.
     * 
     * If the list is not initialized returns 0.
     * 
     * @return an integer with the size of list.
     */
    public int getSize() {
        try {
            return this.joint.size();           
        }
        catch (NullPointerException ex) {
            LOG.setLevel(Level.INFO);
            LOG.log(Level.INFO, "AttributeJoint is null", ex);
        }
        return 0;
    }
    
    /**
     * Sorts the list of Attribute objects according to lexicographically
     * order.
     */
    public void sort() {
        Collections.sort(joint);
    }

    /**
     * Removes all of the elements from this list.
     * 
     * The list will be empty after this call returns.
     */
    public void clear() {
        this.joint.clear();
    }

    /**
     * Removes from this list an Attribute object.
     * 
     * If {@code attr} is not in the list, the list is unchanged.
     * 
     * @param attr Attribute object to be removed from this list.
     */
    public void removeAttributes(Attribute attr) {
        if (joint != null)
            joint.remove(attr);
    }

    /**
     * Removes from this a list of Attribute object.
     * 
     * Calls for {@link datastructures.AttributeJoint#removeAttributes(Attribute)}
     * for every Attribute of {@code removedJoint}.
     * 
     * @param removedJoint A list of Attribute objects to be removed from this list.
     */
    public void removeAttributes(AttributeJoint removedJoint) {
        for (Attribute attr : removedJoint.getAttributeJoint())
            removeAttributes(attr);
    }
    
    /**
     * Returns an Iterator other the Attribute objects list.
     * 
     * @return an iterator other the Attribute objects list.
     */
    @Override
    public Iterator<Attribute> iterator() {
        return this.joint.iterator();
    }

    /**
     * Returns the Attribute object from position {@code position}. 
     * 
     * The {@code position} is out of range case is not contemplated.  
     * 
     * @param position The position of Attribute object to return.
     * @return the Attribute object from {@code position}. 
     */
    public Attribute getAttributeAt(int position) {
        return this.joint.get(position);
    }
    
    /**
     * Changes the Attribute from {@code position} with {@code attr}.
     * 
     * The {@code position} is out of range case is not contemplated.
     * 
     * @param position The position of Attribute object to change.
     * @param attr New value of Attribute object from {@code position}
     */
    public void changeAttributeAt(int position, Attribute attr) {
        this.joint.set(position, attr);
    }
    
    /**
     * Creates a new AttributeJoint with all Attributes from this
     * and {@code attrJoint} and returns it.
     * 
     * @param attrJoint The other AttributeJoint for the union.
     * @return a new AttributeJoint with all Attribute objects.
     */
    public AttributeJoint union(AttributeJoint attrJoint) {
        AttributeJoint result = new AttributeJoint();
        result.addAttributes(this);
        result.addAttributes(attrJoint);
        return result;
    }
    
    /**
     * Return the last Attribute object from this list.
     * 
     * If this object is not initialized returns null.
     * 
     * @return the last Attribute of this list or null if not initialized.
     */
    public Attribute getLastAttribute() {
        try {
            return this.joint.get(this.joint.size() - 1);
        }
        catch (NullPointerException ex) {
            LOG.setLevel(Level.INFO);
            LOG.log(Level.INFO, "AttributeJoint not initialized", ex);
        }
        return null;
    }
    
    /**
     * Returns the position of {@code attribute} if is part of this object.
     * 
     * @param attribute Attribute to return it position.
     * @return returns -1 if is not in this object, otherwise returns the
     * position of {@code attribute}.
     */
    public int getAttributePosition(Attribute attribute) {
        if (this.joint == null)
            return -1;
        
        for (int i = 0; i < this.joint.size(); i++)
            if (attribute.equals(this.joint.get(i)))
                return i;
        return -1;
    }

    /**
     * Creates a new AttributeJoint with all common Attributes from this
     * and {@code consequent} and returns it.
     * 
     * If this is not initialized returns an empty AttributeObject.
     *  
     * @param consequent The other AttributeJoint for the intersect.
     * @return a new AttributeJoint with all common Attribute objects
     */
    public AttributeJoint intersect(AttributeJoint consequent) {
        try {
            AttributeJoint resultAttrJoint = new AttributeJoint();
            ArrayList<Attribute> auxJoint = new ArrayList<>(this.joint);
            auxJoint.retainAll(consequent.getAttributeJoint());
            resultAttrJoint.setAttributeJoint(auxJoint);
            return resultAttrJoint;         
        }
        catch (NullPointerException ex) {
            LOG.log(Level.INFO, "AttributeJoint not initialized", ex);
        }
        return new AttributeJoint();
    }
    
    /**
     * Creates a new AttributeJoint with all Attributes that only are in this
     * object but not in {@code attrJoint} and returns it.
     * 
     * If this is not initialized returns an empty AttributeObject.
     * 
     * @param attrJoint The other AttributeJoint for the substract.
     * @return a new AttributeJoint with all Attribute objects only from this object.
     */
    public AttributeJoint substract(AttributeJoint attrJoint) {
        try {
            AttributeJoint resultAttrJoint = new AttributeJoint();
            ArrayList<Attribute> auxJoint = new ArrayList<>(this.joint);
            auxJoint.removeAll(attrJoint.getAttributeJoint());
            resultAttrJoint.setAttributeJoint(auxJoint);
            return resultAttrJoint;         
        }
        catch (NullPointerException ex) {
            LOG.log(Level.INFO, "AttributeJoint not initialized", ex);
        }
        return new AttributeJoint();
    }

}
