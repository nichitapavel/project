/**
 * 
 */
package datastructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @author Pavel Nichita
 *
 */
public class AttributeJoint implements Iterable<Attribute> {
    private ArrayList<Attribute> joint;

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
     * Sorts the list of Attribute objects according to lexicographically
     * order.
     */
    public void sort() {
        Collections.sort(joint);
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

}
