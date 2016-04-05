/**
 * 
 */
package datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import dependency.ADependency;
import normalization.Normalization;

/**
 * @author Pavel Nichita
 *
 */
public class Relation {
    private String name;
    private AttributeJoint attrJoint;
    private DFJoint dfJoint;
    private static final Logger LOG = Logger.getLogger(Relation.class.getName());
    
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

    /**
     * Returns a KeyJoint object with the keys that define this
     * relation.
     * 
     * First step checks with Ullman algorithm iv every attribute is a 
     * key individually, if it is it removes it from subsequent calculation.
     * Second step is creating ordered combinations of attributes to check if 
     * they are key until no more possible options exist. 
     * 
     * @return a KeyJoint object with the keys of this relation.
     */
    public KeyJoint calculateKeyJoint() {
        KeyJoint result = new KeyJoint();
        AttributeJoint attrJointToCheck;
        AttributeJoint ullman;
        AttributeJoint nonKeyAttributes = new AttributeJoint();
        List<AttributeJoint> list = new ArrayList<>();
        
        for(Attribute attr : this.attrJoint) {
            attrJointToCheck = new AttributeJoint();
            attrJointToCheck.addAttributes(attr);
            ullman = Normalization.simpleUllman(attrJointToCheck, this.dfJoint);
            if(!ullman.equals(this.attrJoint)) {
                nonKeyAttributes.addAttributes(attr);
                list.add(attrJointToCheck);
            }
            else {
                result.addKey(attrJointToCheck);
            }
        }
        
        int i = 0;
        do {
            AttributeJoint attrJointAux = list.get(i);
            Attribute lastAttribute = attrJointAux.getLastAttribute();
            for (int j = nonKeyAttributes.getAttributePosition(lastAttribute) + 1;
                    j < nonKeyAttributes.getSize();
                    j++) {
                attrJointToCheck = new AttributeJoint(attrJointAux);
                attrJointToCheck.addAttributes(nonKeyAttributes.getAttributeAt(j));
                if (!attrJointToCheck.containsJoinsFrom(result)) {
                    ullman = Normalization.simpleUllman(attrJointToCheck, this.dfJoint);
                    if (ullman.equals(this.attrJoint))
                        result.addKey(attrJointToCheck);
                    else
                        list.add(attrJointToCheck);
                }
            }
            i++;
        } while (i < list.size());
        return result;
    }
    
    /**
     * Returns if this relation is in 3rd normal form.
     * 
     * A Relation is in 3rd normal form if for every non trivial dependency
     * comply with at least one of the next criteria:
     * <ul><li>Antecedent is a key of Relation</li><li>Consequent is 
     * part of a key of Relation</li></ul>.
     * 
     * @return true if is in 3rd normal form, false otherwise.
     */
    public boolean is3NF() {
        if(this.isBCNF())
            return true;
        KeyJoint keyJoint = this.calculateKeyJoint();
        for (ADependency funcDep : this.dfJoint) {
            if (!funcDep.is3NF(this, keyJoint))
                    return false;
        }
        return true;
    }

    /**
     * Returns if this relation is in 2nd normal form.
     * 
     * A Relation is in 2nd normal form if for every non trivial dependency
     * comply with at least one of the next criteria:
     * <ul><li>Antecedent is a key of Relation</li><li>Consequent is 
     * part of a key of Relation</li><li>The antecedent is not part of a key</li></ul>.
     * 
     * @return true if is in 2nd normal form, false otherwise.
     */
    public boolean is2NF() {
        if(this.isBCNF() || this.is3NF())
            return true;
        KeyJoint keyJoint = this.calculateKeyJoint();
        for (ADependency funcDep : this.dfJoint) {
            if (!funcDep.is2NF(this, keyJoint))
                return false;
        }
        return true;
    }
    
    /**
     * Returns if this relation is in Boyce-Codd normal form.
     * 
     * A Relation is in Boyce-Codd normal form if for every non trivial dependency
     * the antecedent is a key of Relation.
     * 
     * @return true if is in Boyce-Codd normal form, false otherwise.
     */
    public boolean isBCNF() {
        try {
            for (ADependency funcDep : this.dfJoint) {
                if (!funcDep.isBCNF(this))
                    return false;
            }
        }
        catch (NullPointerException ex) {
            LOG.log(Level.INFO, ex.getMessage(), ex);
            return false;
        }
        return true;
    }
}
