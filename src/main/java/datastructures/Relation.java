/**
 * 
 */
package datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

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
    
    /**
     * Returns a list of all dependencies that do not comply with Boyce-Codd criteria
     * in this relation.
     * 
     * One dependency complies with Boyce-Codd if the left side is a key (defines
     * the Relation).
     * 
     * @return a list of all dependencies that don't comply with Boyce-Codd criteria in
     * this relation.
     */
    public List<ADependency> getNonBCNFDFs() {
        return this.dfJoint.getNonBCNFDFs(this);
    }
    
    /**
     * Returns a list of all dependencies that do not comply with 3rd Normal
     * Form criteria in this relation.
     * 
     * One dependencies complies with 3rd Normal Form if <ul><li>Antecedent
     * is a key of Relation</li><li>Consequent is part of a key of Relation</li></ul>.
     * 
     * @return a list of all dependencies that don't comply with 3rd Normal Form criteria
     * in this relation.
     */
    public List<ADependency> getNon3NFDFs() {
        return this.dfJoint.getNon3NFDFs(this);
    }
    
    /**
     * Returns a string saying in what normal form is this relation.
     * 
     * @return a string saying in what normal form is this relation.
     */
    public String getNormalForm() {
        if(this.isBCNF())
            return "Boyce Codd Normal Form";
        if(this.is3NF())
            return "3rd Normal Form";
        if(this.is2NF())
            return "2nd Normal Form";
        else
            return "1st Normal Form";
    }
    
    /**
     * Splits this relation in two relations using a dependency as a cutter.
     * 
     * The first relation has the attributes of the dependency as AttributeJoint
     * and as DFJoint is the result of projecting this relation DFJoint on
     * the AttributeJoint of first relation.
     * The second relation has all attributes from this relation expect the consequent
     * attributes from the dependency as AttributeJoint and as DFJoint is the result 
     * of projecting this relation DFJoint on the AttributeJoint of second relation.
     * 
     * @param fd The dependency that act's as a cutter.
     * @return return a list with two relations that resulted from the process.
     */
    public List<Relation> split(ADependency fd) {
        List<Relation> relationVector = new ArrayList<>();
        
        Relation first = new Relation();
        first.settAttrJoint(fd.getAttributeJoint());
        relationVector.add(first);
        
        first.setDFJoint(this.dfJoint.projectionOnAttributeJoint(fd.getAttributeJoint()));
        
        Relation second = new Relation();
        AttributeJoint newAttrJoint = new AttributeJoint(this.attrJoint);
        newAttrJoint.removeAttributes(fd.getConsequent());
        second.settAttrJoint(newAttrJoint);
        relationVector.add(second);
        
        second.setDFJoint(this.dfJoint.projectionOnAttributeJoint(newAttrJoint));
        
        return relationVector;
    }
    
    /**
     * Returns a Relation that is a subset of this relation.
     * 
     *  Sets AttributeJoint of returned relation the AttributeJoint
     *  received as Key, as DFJoint makes a projection of this relations 
     *  DFJoint using AttributeJoint received as Key.
     *  
     * @param attrJoint The AttributeJoint received as Key.
     * @return a Relation that is a subset of this relation.
     */
    public Relation splitByKey(AttributeJoint attrJoint) {
        Relation r = new Relation();
        r.settAttrJoint(attrJoint);
        r.setDFJoint(this.dfJoint.projectionOnAttributeJoint(attrJoint));
        return r;
    }

    public Element toXML() {
        Element relation = null;
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            
            Document doc = docBuilder.newDocument();
            relation = doc.createElement("Relation");
            Element relationName = doc.createElement("Name");
            relation.appendChild(relationName);
            relationName.appendChild(doc.createTextNode(name));
            Element fdJoint = doc.createElement("FDJoint");
            relation.appendChild(fdJoint);
            fdJoint.appendChild(doc.createTextNode(dfJoint.getName()));
            Element attributes = doc.createElement("Attributes");
            relation.appendChild(attributes);
            
            for (Attribute item : attrJoint) {
                Element attr = doc.createElement("Attribute");
                attributes.appendChild(attr);
                attr.appendChild(doc.createTextNode(item.toString()));
            }
             
        } catch (ParserConfigurationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return relation;
    }
}
