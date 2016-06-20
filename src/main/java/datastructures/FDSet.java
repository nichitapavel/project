/**
 * 
 */
package datastructures;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import dependency.ADependency;
import dependency.FunctionalDependency;
import dependency.PluralDependency;
import utils.Const;

/**
 * @author Pavel Nichita
 *
 */
public class FDSet implements Iterable<ADependency> {
    /**
     * A list of functional dependencies defining this FDSet
     */
    private List<ADependency> df;
    /**
     * A name to reference this FDSet.
     */
    private String name;
    private static final Logger LOG = Logger.getLogger(FDSet.class.getName());
    
    /**
     * Constructs a Null FDSet.
     */
    public FDSet() {
        df = new ArrayList<>();
    }

    /**
     * Constructs a FDSet with a list of functional dependencies and no name. 
     * 
     * @param dfJoint The list of dependencies.
     */
    public FDSet(List<ADependency> dfJoint) {
        this.df = new ArrayList<>(dfJoint);
    }
    
    /**
     * Constructs a FDSet from another FDSet.
     * 
     * @param dfJoint A FDSet with a list of dependencies and name.
     */
    public FDSet(FDSet dfJoint) {
        this.df = new ArrayList<>(dfJoint.getDFJoint());
        this.name = dfJoint.getName();
    }
    
    /**
     * Returns the list of dependencies.
     * 
     * @return a list of dependencies.
     */
    public List<ADependency> getDFJoint() {
        return df;
    }

    /**
     * Sets the list of dependencies.
     * 
     * @param df The list of dependencies.
     */
    public void setDFJoint(List<ADependency> df) {
        this.df = df;
    }
    
    /**
     * Sets the name of this FDSet.
     * 
     * @param newName the name of this FDSet.
     */
    public void setName(String newName) {
        this.name = newName;
    }
    
    /**
     * Return the name of this FDSet. 
     * 
     * @return the name of this FDSet.
     */
    public String getName() {
        if (this.name == null)
            return "No name";
        return this.name;
    }
    
    /**
     * Adds a new dependency to this objects list.
     * 
     * The dependency is added only if it is not already in the list.
     * 
     * @param df A dependency to be added to this objects list.
     */
    public void addDependency(ADependency df) {
        if (!contains(df))
            this.df.add(df);
    }
    
    /**
     * Returns if a dependency exist already in this objects list. 
     * 
     * Implied dependencies does not count.
     *  
     * @param funcDep The dependency to check if exists.
     * @return true if {@code funcDep} exists in this list, false otherwise.
     */
    public boolean contains(ADependency funcDep) {
        for (ADependency item : this.df)
            if (item.equals(funcDep))
                return true;
        return false;
    }
    
    /**
     * Returns a hash code for this FDSet.
     * 
     * The hash code for a FDSet object is
     * computed using the default implementations of Eclipse.
     * 
     * @return a hash code value for this object.
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((df == null) ? 0 : df.hashCode());
        return result;
    }

    /**
     * Compares this FDSet to the specified object.
     * 
     *  The result is true if and only if the argument
     *  is not null and is a FDSet object that represents
     *  the same FDSet as this object.
     *  Only checks the list of dependencies, the name of this
     *  FDSet doesn't counts.
     * 
     * @param obj The object to compare this FDSet against.
     * @return true if the given object represents a FDSet
     * equivalent to this FDSet, false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        FDSet other = (FDSet) obj;
        if (df == null) {
            if (other.df != null)
                return false;
        } else if (!df.equals(other.df))
            return false;
        return true;
    }
    
    /**
     * Returns an Iterator other the dependencies objects list.
     * 
     * @return an Iterator other the dependencies objects list.
     */
    @Override
    public Iterator<ADependency> iterator() {
        return this.df.iterator();
    }
    
    /**
     * Returns a string representing of this FDSet.
     * 
     * The format followed is {({obj, obj} to {obj, obj}), ({obj, obj} to {obj, obj}), ...}.
     * If this is null then returns "null" string.
     * 
     * @return a string representing of this FDSet.
     */
    @Override
    public String toString() {
        String msg = "null";
        try {
            msg = "{ (" + this.df.get(0) + ")";
            for (int i = 1; i < this.df.size(); i++){
                msg = msg + ", (" + this.df.get(i) + ")";
            }
            msg += " }";
        }
        catch (IndexOutOfBoundsException ex) {
            LOG.log(Level.INFO, ex.getMessage(), ex);   
        }
        catch (NullPointerException ex) {
            LOG.log(Level.INFO, ex.getMessage(), ex);
        }
        return msg;
    }
    
    /**
     * Returns the number of dependencies in this FDSet.
     * 
     * If this is null, returns zero.
     * 
     * @return the number of dependencies in this FDSet.
     */
    public int getSize() {
        if (this.df == null)
            return 0;
        return this.df.size();
    }
    
    /**
     * Removes a dependency from this FDSet, if the dependency exist.
     * 
     * If FDSet is null nothing happens.
     * 
     * @param fd the dependency to be removed.
     */
    public void removeDF(ADependency fd) {
        try {
            this.df.remove(fd);
        } catch (NullPointerException ex) {
            LOG.log(Level.INFO, ex.getMessage(), ex);
        }
    }
    
    /**
     * Make a list with all unique attributes in this object and returns it.
     * 
     * @return a list with all unique attributes in this object.
     */
    public AttributeSet getAttributesDFJoint() {
        AttributeSet attrJoint = new AttributeSet();
        for (ADependency obj : this.df) {
                attrJoint.addAttributes(obj.getAntecedent());
                attrJoint.addAttributes(obj.getConsequent());
        }
        return attrJoint;
    }
    
    /**
     * Returns the dependency that is found at position {@code index}.
     * 
     * @param index The position where to look.
     * @return the dependency found at position {@code index}.
     */
    public ADependency getDF(int index) {
        return this.df.get(index);
    }
    
    /**
     * Returns if this FDSet is a subset of the {@code dfJoint} FDSet.
     * 
     * Checks that every dependency from this FDSet belongs to {@code dfJoint}. 
     * 
     * @param dfJoint The FDSet that is an overset of this FDSet.
     * @return true if this FDSet is a subset of {@code dfJoint}.
     */
    public boolean isImplied(FDSet dfJoint) {
        for (ADependency fd : this.df) {
            if (!fd.belongsTo(dfJoint, null))
                return false;
        }
        return true;
    }
    
    /**
     * Return a FDSet that contains all functional dependency that can be implied
     * from a plural dependency and all the functional dependency that already exists
     * in this FDSet.
     * 
     * @return a list of all functional dependencies that can be implied.
     */
    public FDSet getHiddenDF() {
        FDSet hiddenDF = new FDSet(this);
        for (ADependency pl : this) {
            if (pl.getClass() == new PluralDependency().getClass())
                hiddenDF.getDFJoint().addAll(pl.toFunctionalDependency(hiddenDF));
        }
        return hiddenDF;
    }
    
    /**
     * Returns a new FDSet equivalent with this one, but with all dependencies in
     * a "minimal" form.
     * 
     * If a FDSet has dependencies like {A, B} to {C}, {A, B} to {E}, this will be transformed
     * to {A, B} to {C, E}.
     * 
     * @return a new FDSet with all dependencies with same left side in just on dependency.
     */
    public FDSet regroupDFJoint() {
        ArrayList<ADependency> copyDFJoint = new ArrayList<>(this.df); 
        FDSet regroupedDFJoint = new FDSet();
        for (int i = 0; i < copyDFJoint.size(); i++) {
            ADependency dfI = copyDFJoint.get(i);
            AttributeSet antecedentI = dfI.getAntecedent();
            AttributeSet regroupedConsequent = new AttributeSet(dfI.getConsequent());
            for (int j = i + 1; j < copyDFJoint.size(); j++) {
                ADependency dfJ = copyDFJoint.get(j);
                if (dfI.getClass() == dfJ.getClass()){
                    AttributeSet antecedentJ = dfJ.getAntecedent();
                    if (antecedentI.equals(antecedentJ)) {
                        regroupedConsequent.addAttributes(dfJ.getConsequent());
                        copyDFJoint.remove(j);
                        j--;
                    }
                }
            }
            if (dfI.getClass() == new FunctionalDependency().getClass())
                regroupedDFJoint.addDependency(new FunctionalDependency(antecedentI, regroupedConsequent));
            else
                regroupedDFJoint.addDependency(new PluralDependency(antecedentI, regroupedConsequent));
            copyDFJoint.remove(i);
            i--;
        }
        return regroupedDFJoint;
    }
    
    /**
     * Checks for existence of rare attributes in this FDSet.
     * 
     * Returns a list with all rare attributes wrapped arround {@link datastructures.RareElement}
     * class.
     * 
     * @return a list with all rare attributes.
     */
    public List<RareElement> findRareAttributes() {
        List<RareElement> rareElVector = new ArrayList<>();
        if (this.df.size() > 1) {
            for(ADependency fd : this.df) {
                AttributeSet antecedent = fd.getAntecedent();
                AttributeSet consecuent = fd.getConsequent();
                if (antecedent.getSize() != 1) {
                    for (Attribute attr : antecedent) {
                        if (attr.isRareInAntecedent(fd, this))
                            rareElVector.add(new RareElement(attr, fd, this, Const.ANTECEDENT));
                    }
                }
                if (consecuent.getSize() != 1) {    
                    for (Attribute attr : consecuent) {
                        if (attr.isRareInConsequent(fd, this))
                            rareElVector.add(new RareElement(attr, fd, this, Const.CONSEQUEDENT));
                    }
                }
            }
        }
        return rareElVector;
    }
    
    /**
     * Removes all rare attributes from this FDSet.
     * 
     * Depending on {@code auto} removes the first rare attribute that finds
     * or the specified by user.
     * The end result is a Minimal FDSet with only the most necessary Functional Dependencies.
     * 
     * @param auto if true removes the first rare attribute that it finds, if false
     * the specified by the user. 
     */
    public void removeRareAttributes(boolean auto) { 
        int option = 0;
        this.df = regroupDFJoint().getDFJoint();
        List<RareElement> rareAttrVector = findRareAttributes();
        while (!rareAttrVector.isEmpty()) {
            if (!auto) {
                // option = get.stdin(), user specifies what to remove.
            }
            removeAttribute(rareAttrVector.get(option));
            rareAttrVector = findRareAttributes();
        }
    }
    
    /**
     * Removes the specified rare attribute from this FDSet.
     * 
     * Doesn't check if it actually an rare attribute, this should be
     * handle by developer.
     * 
     * @param rareAttr an attribute with all needed information to remove it from
     * this FDSet.
     */
    public void removeAttribute(RareElement rareAttr) {
        int pos = this.df.indexOf(rareAttr.getFD());
        if (rareAttr.getPosition() == "Antecedent")
            this.df.get(pos).removeAttributeFromAntecedent(rareAttr.getAttribute());
        else
            this.df.get(pos).removeAttributeFromConsequent(rareAttr.getAttribute());
        this.df = regroupDFJoint().getDFJoint();
    }
    
    /**
     * Returns if this FDSet is in it's minimal form.
     *
     * In order to be minimum, there must be no rare attributes and all
     * dependencies with same left part should be grouped: {A} to {B} and
     * {A} to {C} should appear as {A} to {B, C}. 
     * 
     * @return true if minimal, false otherwise.
     */
    public boolean isMinimal() {
        List<RareElement> rareAttributes = findRareAttributes();
        if (!rareAttributes.isEmpty())
            return false;
        return true;
    }

    /**
     * Returns a new FDSet only with dependencies that can be implied by using
     * attributes from {@code attrJoint}.
     * 
     * @param attrJoint attribute on who to project.
     * @return a new FDSet with implied dependencies.
     */
    public FDSet projectionOnAttributeJoint(AttributeSet attrJoint) {
        FDSet hiddenDF = this.toElementalForm();
        FDSet result = new FDSet();
        AttributeSet oldAntecedent;
        AttributeSet oldConsequent;
        FDSet newFDSet = new FDSet();
        boolean hasChange = true;
        
        while (hasChange) {
            hasChange = false;
            for (ADependency item : hiddenDF) {
                if (item.getClass() == new FunctionalDependency().getClass()){
                    oldAntecedent = item.getAntecedent();
                    oldConsequent = item.getConsequent();
                    if (oldAntecedent.isContained(attrJoint) && 
                            oldConsequent.isContained(attrJoint)) {
                        result.addDependency(item); // añadir df
                    } else {
                        AttributeSet newAntecedent = new AttributeSet();
                        AttributeSet newConsequent = new AttributeSet();
                        for (ADependency fd : hiddenDF) {
                            if (fd.getClass() == new FunctionalDependency().getClass()){
                                if (fd.getConsequent().isContained(oldAntecedent)) {
                                   newConsequent.addAttributes(oldConsequent);
                                   newAntecedent.addAttributes(oldAntecedent.union(fd.getAntecedent()));
                                   newAntecedent.removeAttributes(fd.getConsequent());
                                }
                            }
                        }
                        if (!newAntecedent.isNull()) {
                            ADependency newFD = new FunctionalDependency(newAntecedent, newConsequent);
                            if (!newFD.isTrivial() && !newFDSet.contains(newFD)){
                                newFDSet.addDependency(newFD);
                                hasChange = true;
                            }
                        }
                    }
                }
            }
            newFDSet = newFDSet.toElementalForm();
            for (ADependency item : newFDSet) {
                hiddenDF.addDependency(item);
            }
            hiddenDF = hiddenDF.toElementalForm();
        }
        

        return result.regroupDFJoint();
    }
    
    /**
     * Returns if this FDSet and other FDSet are equivalent.
     * 
     * Two FDSet are equivalent if every dependency from one another can be implied
     * in the other, other way to see it is that both of the DFJoints implies
     * one another. 
     * 
     * @param dfJoint The FDSet to equivalent this FDSet against.
     * @return returns true if they are equivalent, false otherwise.
     */
    public boolean isEquivalent(FDSet dfJoint) {
        FDSet hiddenDF = this.getHiddenDF();
        if (hiddenDF.isImplied(dfJoint) && dfJoint.isImplied(hiddenDF))
            return true;
        return false;
    }
    
    /**
     * Returns a list of all dependencies that do not comply with Boyce-Codd criteria.
     * 
     * One dependencies complies with Boyce-Codd if the left side is a key (defines
     * the Relation).
     * 
     * @param relation The Relation where if this FDSet dependencies comply with Boyce-Codd.
     * @return a list of all dependencies that don't comply with Boyce-Codd criteria.
     */
    public List<ADependency> getNonBCNFDFs(Relation relation) {
        List<ADependency> result = new ArrayList<>();
        for (ADependency fd : this.df) {
            if (!fd.isBCNF(relation))
                result.add(fd);
        }
        return result;
    }
    
    /**
     * Returns a list of all dependencies that do not comply with 3rd Normal
     * Form criteria.
     * 
     * One dependencies complies with 3rd Normal Form if <ul><li>Antecedent
     * is a key of Relation</li><li>Consequent is 
     * part of a key of Relation</li></ul>.
     * 
     * @param relation The Relation where if this FDSet dependencies comply with 3rd Normal Form.
     * @return a list of all dependencies that don't comply with 3rd Normal Form criteria.
     */
    public List<ADependency> getNon3NFDFs(Relation relation) {
        List<ADependency> result = new ArrayList<>();
        KeyJoint keyJoint = relation.calculateKeyJoint();
        for (ADependency fd : this.df) {
            if (!fd.is3NF(relation, keyJoint))
                result.add(fd);
        }
        return result;
    }
    
    public Element toXML() {
        Element fdJoint = null;
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            
            Document doc = docBuilder.newDocument();
            fdJoint = doc.createElement("FDJoint");
            
            Element fdJointName = doc.createElement("Name");
            fdJoint.appendChild(fdJointName);
            fdJointName.appendChild(doc.createTextNode(name));
            
            Element fds = doc.createElement("FDs");
            fdJoint.appendChild(fds);
                        
            for (ADependency item : df) {
                Element fd = doc.createElement("FD");
                fds.appendChild(fd);
                fd.appendChild(doc.createTextNode(item.toString()));
            }
             
        } catch (ParserConfigurationException e) {
            LOG.setLevel(Level.SEVERE);
            LOG.log(Level.SEVERE, "XML not generated for FDSet", e);
        }
        return fdJoint;
    }
    
    /**
     * Returns a FDSet equivalent to this one, but with all Functional
     * Dependencies into elemental form, where the consequent is always
     * just one Attribute.
     * 
     * @return a FDSet in elemental form.
     */
    public FDSet toElementalForm() {
        FDSet newFDSet = new FDSet();
        
        for (ADependency item : df) {
            for (Attribute attr : item.getConsequent()) {
                AttributeSet newConsequent = new AttributeSet();
                newConsequent.addAttributes(attr);
                newFDSet.addDependency(new FunctionalDependency(item.getAntecedent(), newConsequent));
            }
        }
        
        return newFDSet;
    }
}
