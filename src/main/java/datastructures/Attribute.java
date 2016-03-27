/**
 * 
 */
package datastructures;

/**
 * @author Pavel Nichita
 *
 */
public class Attribute implements Comparable<Attribute>{
    private String attr;
    
    /**
     * Constructs a Null string. 
     */
    public Attribute() {
        // Manually generated default constructor.
    }
        
    /**
     * Initializes the attribute string with the value of attribute.
     * 
     * @param attribute A string representing the value of attribute.
     */
    public Attribute(String attribute) {
        this.attr = attribute;
    }
    
    /**
     * Initializes the attribute string with the value of obj.
     * 
     * @param obj An Attribute object.
     */
    public Attribute(Attribute obj) {
        attr = obj.getAttribute();
    }
    
    /**
     * Return the string with the value of Attribute.
     * 
     * @return the string with the value of Attribute.
     */
    public String getAttribute() {
        return attr;
    }

    /**
     * Sets the value of Attribute string.
     * 
     * @param attribute the value to be set of attribute.
     */
    public void setAttribute(String attribute) {
        this.attr = attribute;
    }
    
    /**
     * Returns true if attribute is null o if length is 0, false otherwise.
     * 
     * @return true if attribute is null o if length is 0, false otherwise.
     */
    public boolean isNull() {
        if ((attr == null) || (attr.length() == 0))
            return true;
        return false;
    }
    
    /**
     * Returns a hash code for this attribute.
     * 
     * The hash code for a Attribute object is
     * computed using the default implementations of Eclipse.
     * 
     * @return a hash code value for this object.
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((attr == null) ? 0 : attr.hashCode());
        return result;
    }

    /**
     * Compares this attribute to the specified object.
     * 
     *  The result is true if and only if the argument
     *  is not null and is a Attribute object that represents
     *  the same attribute string as this object.
     * 
     * @param obj The object to compare this Attribute against.
     * @return true if the given object represents a Attribute
     * equivalent to this attribute, false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Attribute other = (Attribute) obj;
        if (attr == null || attr == "") {
            if (other.attr != null && other.attr != "")
                return false;
        } else if (!attr.equals(other.attr))
            return false;
        return true;
    }
    
    /**
     * Returns the value of this attribute in string format.
     * 
     * @return the value of this attribute in string format.
     */
    @Override
    public String toString() {
        return attr;
    }
    
    /**
     * Compares two attributes lexicographically.
     *  
     * The comparison is based on the Unicode value of each character in the
     * attribute strings. The character sequence represented by this Attribute
     * object is compared lexicographically to the character sequence
     * represented by the argument obj. The result is a negative integer if
     * this Attribute object lexicographically precedes the argument attribute.
     * The result is a positive integer if this attribute object
     * lexicographically follows the argument attribute. The result is zero
     * if the attributes are equal; compareTo returns 0 exactly when the
     * equals(Object) method would return true. 
     * 
     * @param obj The string to be compared.
     * @return the value 0 if the argument attribute is equal to this attribute;
     * a value less than 0 if this attribute is lexicographically less than the
     * attribute argument; and a value greater than 0 if this attribute is
     * lexicographically greater than the attribute argument.
     */
    @Override
    public int compareTo(Attribute obj) {
        return attr.compareTo(obj.getAttribute());
    }

    /**
     * Checks if this object is part of {@code attrJoint}
     * 
     * If {@code attrJoint} is null returns false immediately, otherwise for every
     * Attribute object of {@code attrJoint} calls {@link datastructures.Attribute#equals(Object)}
     * method to see if they are equal, if positive returns true. If none is equals returns
     * false at the end. Only checks for the value of this object.
     * 
     * @param attrJoint AttributeJoint object where to check if it is part of.
     * @return true if this attribute is part of an AttributeJoint object, false otherwise.
     */
    public boolean isContained(AttributeJoint attrJoint) {
        if (attrJoint.getAttributeJoint() == null)
            return false;
        for (Attribute obj : attrJoint.getAttributeJoint())
            if (obj.equals(this))
                return true;
        return false;
    }
}
