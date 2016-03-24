/**
 * 
 */
package datastructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

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
    };

    /**
     * Constructs an ordered list of Attributes from strings.
     * 
     * With every string in stringArray creates an Attribute object,
     * after that adds it in a list. In the end sorts the list.
     * 
     * @param stringArray An array of String object.
     */
    public AttributeJoint(String [] stringArray) {
        joint = new ArrayList<Attribute>();
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
    public AttributeJoint(ArrayList<Attribute> joint) {
        this.joint = new ArrayList<Attribute>(joint) ;
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
        this.joint = new ArrayList<Attribute>(obj.getAttributeJoint());
    }

    /**
     * Returns a list of Attribute objects.
     * 
     * @return a list of Attribute objects.
     */
    public ArrayList<Attribute> getAttributeJoint() {
        return this.joint;
    }

    /**
     * Sets the list joint.
     * 
     * @param joint A list with Attribute objects.
     */
    public void setAttributeJoint(ArrayList<Attribute> joint) {
        this.joint = new ArrayList<Attribute>(joint);
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
        if (this.joint == null || this.joint.size() == 0)
            return "null";
        
        String stringJoint = "{" + joint.get(0).toString();
        for (int i = 1; i < joint.size(); i++)
            stringJoint = stringJoint + ", " + joint.get(i).toString();
        return stringJoint + "}";
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
