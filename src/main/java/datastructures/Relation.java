/**
 * 
 */
package datastructures;

/**
 * @author Pavel Nichita
 *
 */
public class Relation {
    private String name;
    private AttributeJoint attrJoint;
    private DFJoint dfJoint;
    
    /**
     * Constructs a Null Relation.
     */
    public Relation() {
        // Manually generated default constructor.
    }

    /**
     * Constructs a Relation with a list of attributes and a DFJoint,
     * but without a name.
     * 
     * @param attrJoint The list of attributes.
     * @param dfJoint The DFJoint of this Relation. 
     */
    public Relation(AttributeJoint attrJoint, DFJoint dfJoint) {
        this.attrJoint = new AttributeJoint(attrJoint);
        this.dfJoint = new DFJoint(dfJoint);
    }
    
    /**
     * Returns the list of attributes of this Relation.
     * 
     * @return the list of attributes of this Relation.
     */
    public AttributeJoint getAttrJoint() {
        return this.attrJoint;
    }

    /**
     * Returns the name of this Relation.
     * 
     * @return the name of this Relation.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the DFJoint of this Relation.
     * 
     * @return the DFJoint of this Relation. 
     */
    public DFJoint getDFJoint() {
        return this.dfJoint;
    }
    
    /**
     * Sets the attribute list of this Relation.
     * 
     * @param attrJoint The attribute list of this Relation.
     */
    public void settAttrJoint(AttributeJoint attrJoint) {
        this.attrJoint = new AttributeJoint(attrJoint);
    }

    /**
     * Sets the DFJoint of this Relation.
     * 
     * @param dfJoint The DFJoint of this Relation.
     */
    public void setDFJoint(DFJoint dfJoint) {
        this.dfJoint = new DFJoint(dfJoint);
    }
    
    /**
     * Sets the name of this Relation.
     * 
     * @param name The name of this Relation.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Returns a string representation of this Relation.
     * 
     * If this Relation has no attribute list or DFJoint returns an 
     * "Sin Attributos Sin Dependencias Funcionales" message.
     * 
     * @return a string representation of this Relation.
     */
    @Override
    public String toString() {
        String noAttr = "Sin Atributos";
        String noFuncDep = "Sin Dependencias Funcionales";
        String msg = "";
        
        if (this.attrJoint != null)
            msg += "Atributos: " + this.attrJoint.toString() + "";
        else
            msg += noAttr;
        
        if (this.dfJoint != null)
            msg += " Dependencias Funcionales: " + this.dfJoint.toString();
        else
            msg += " " + noFuncDep;
        
        if (this.attrJoint == null && this.dfJoint == null)
            return noAttr + " " + noFuncDep;
        
        return msg;
    }

    /**
     * Returns a hash code for this Relation.
     * 
     * The hash code for a Relation object is computed using
     *  the default implementations of Eclipse. The name of this Relation
     *  doesn't influence the final result.
     * 
     * @return a hash code value for this object.
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((attrJoint == null) ? 0 : attrJoint.hashCode());
        result = prime * result + ((dfJoint == null) ? 0 : dfJoint.hashCode());
        return result;
    }

    /**
     * Compares this DFJoint to the specified object.
     * 
     *  The result is true if and only if the argument
     *  is not null and is a Relation object that represents
     *  the same Relation as this object.
     *  Only checks the list of dependencies, the name of this
     *  Relation doesn't counts.
     * 
     * @param obj The object to compare this Relation against.
     * @return true if the given object represents a Relation
     * equivalent to this Relation, false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Relation other = (Relation) obj;
        if (attrJoint == null) {
            if (other.attrJoint != null)
                return false;
        } else if (!attrJoint.equals(other.attrJoint))
            return false;
        if (dfJoint == null) {
            if (other.dfJoint != null)
                return false;
        } else if (!dfJoint.equals(other.dfJoint))
            return false;
        return true;
    }

}
