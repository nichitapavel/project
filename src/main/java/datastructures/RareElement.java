/**
 * 
 */
package datastructures;

import dependency.ADependency;

/**
 * @author Pavel Nichita
 *
 */
public class RareElement {
    private Attribute attr;
    private ADependency fd;
    private FDSet dfJoint;
    /**
     * Position in dependency, only has two possible values: antecedent and consequent.
     */
    private String position;
    
    /**
     * Constructs a Null RareElement object.
     */
    public RareElement() {
        // Manually generated default constructor.
    }

    /**
     * Constructs a RareElement object with all the necessary information.
     * 
     * @param attr The rare attribute.
     * @param fd The dependency where is rare.
     * @param dfJoint The FDSet where is rare.
     * @param position If is in "antecedent" or "consequent".
     */
    public RareElement(Attribute attr, ADependency fd, FDSet dfJoint, String position) {
        this.attr = new Attribute(attr);
        this.fd = fd;
        this.dfJoint = new FDSet(dfJoint);
        this.position = position;
    }
    
    /**
     * Returns an attribute object that is rare.
     * 
     * @return an attribute object.
     */
    public Attribute getAttribute() {
        return this.attr;
    }

    /**
     * Returns the dependency where {@code attr} is rare.
     * 
     * @return the dependency where {@code attr} is rare.
     */
    public ADependency getFD() {
        return this.fd;
    }

    /**
     * Returns the FDSet where {@code attr} is rare.
     * 
     * @return the FDSet where {@code attr} is rare.
     */
    public FDSet getDFJoint() {
        return this.dfJoint;
    }
    
    /**
     * Returns where {@code attr} is rare: antecedent or consequent.
     * 
     * @return "consequent" or "antecedent".
     */
    public String getPosition() {
        return this.position;
    }
    
    /**
     * Returns the value of this RareElement object in string format.
     * 
     * The format being used is <i>//** obj, position, dependency, dfjoint-name}</i>.
     * If attribute is null, it returns a "Null" string.
     * 
     * @return a string representing this object, if the list is empty or
     * null returns "Null" string. 
     */
    @Override
    public String toString() {
        if (this.attr != null)
            return "//** " + this.attr.toString() + ", " + this.position + ", "
                + this.fd.toString() + ", " + this.dfJoint.getName();
        return "Null";
    }
    
    /**
     * Returns a hash code for this RareElement.
     * 
     * The hash code for a RareElement object is
     * computed using the default implementations of Eclipse.
     * 
     * @return a hash code value for this object.
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((attr == null) ? 0 : attr.hashCode());
        result = prime * result + ((dfJoint == null) ? 0 : dfJoint.hashCode());
        result = prime * result + ((fd == null) ? 0 : fd.hashCode());
        result = prime * result + ((position == null) ? 0 : position.hashCode());
        return result;
    }

    /**
     * Compares this RareElement to the specified object.
     * 
     * @param obj The object to compare this RareElement against.
     * @return true if the given object represents a RareElement
     * equivalent to this RareElement, false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        RareElement other = (RareElement) obj;
        if (attr == null) {
            if (other.attr != null)
                return false;
        } else if (!attr.equals(other.attr))
            return false;
        if (dfJoint == null) {
            if (other.dfJoint != null)
                return false;
        } else if (!dfJoint.equals(other.dfJoint))
            return false;
        if (fd == null) {
            if (other.fd != null)
                return false;
        } else if (!fd.equals(other.fd))
            return false;
        return true;
    }

}
