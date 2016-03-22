/**
 * 
 */
package datastructures;

/**
 * @author Pavel Nichita
 *
 */
public class Attribute implements Comparable<Attribute>{
    private String attribute;
    
    /**
     * Constructs a Null string. 
     */
    public Attribute() { };
    
    
    /**
     * Initializes the attribute string with the value of attribute.
     * @param attribute A string representing the value of attribute.
     */
    public Attribute(String attribute) {
        this.attribute = attribute;
    }
    
    /**
     * Initializes the attribute string with the value of obj.
     * @param obj An Attribute object.
     */
    public Attribute(Attribute obj) {
        attribute = obj.getAttribute();
    }
    
    /**
     * Return the string with the value of Attribute.
     * @return the string with the value of Attribute.
     */
    public String getAttribute() {
        return attribute;
    };

    /**
     * Sets the value of Attribute string.
     * @param attribute the value to be set of attribute.
     */
    public void setAttribute(String attribute) {
        this.attribute = attribute;
    };
    
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
        return attribute.compareTo(obj.getAttribute());
    }

}
