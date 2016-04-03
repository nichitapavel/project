/**
 * 
 */
package datastructures;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import dependency.ADependency;
import dependency.FunctionalDependency;
import dependency.PluralDependency;
import utils.Const;

/**
 * @author Pavel Nichita
 *
 */
public class DFJoint implements Iterable<ADependency> {
    /**
     * A list of functional dependencies defining this DFJoint
     */
    private List<ADependency> df;
    /**
     * A name to reference this DFJoint.
     */
    private String name;
    private static final Logger LOG = Logger.getLogger(DFJoint.class.getName());
    
    /**
     * Constructs a Null DFJoint.
     */
    public DFJoint() {
        df = new ArrayList<>();
    }

    /**
     * Constructs a DFJoint with a list of functional dependencies and no name. 
     * 
     * @param dfJoint The list of dependencies.
     */
    public DFJoint(List<ADependency> dfJoint) {
        this.df = new ArrayList<>(dfJoint);
    }
    
    /**
     * Constructs a DFJoint from another DFJoint.
     * 
     * @param dfJoint A DFJoint with a list of dependencies and name.
     */
    public DFJoint(DFJoint dfJoint) {
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
     * Sets the name of this DFJoint.
     * 
     * @param newName the name of this DFJoint.
     */
    public void setName(String newName) {
        this.name = newName;
    }
    
    /**
     * Return the name of this DFJoint. 
     * 
     * @return the name of this DFJoint.
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
     * Returns a hash code for this DFJoint.
     * 
     * The hash code for a DFJoint object is
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
     * Compares this DFJoint to the specified object.
     * 
     *  The result is true if and only if the argument
     *  is not null and is a DFJoint object that represents
     *  the same DFJoint as this object.
     *  Only checks the list of dependencies, the name of this
     *  DFJoint doesn't counts.
     * 
     * @param obj The object to compare this DFJoint against.
     * @return true if the given object represents a DFJoint
     * equivalent to this DFJoint, false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        DFJoint other = (DFJoint) obj;
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
     * Returns a string representing of this DFJoint.
     * 
     * The format followed is {({obj, obj} to {obj, obj}), ({obj, obj} to {obj, obj}), ...}.
     * If this is null then returns "null" string.
     * 
     * @return a string representing of this DFJoint.
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
     * Returns the number of dependencies in this DFJoint.
     * 
     * If this is null, returns zero.
     * 
     * @return the number of dependencies in this DFJoint.
     */
    public int getSize() {
        if (this.df == null)
            return 0;
        return this.df.size();
    }
    
    /**
     * Removes a dependency from this DFJoint, if the dependency exist.
     * 
     * If DFJoint is null nothing happens.
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
    public AttributeJoint getAttributesDFJoint() {
        AttributeJoint attrJoint = new AttributeJoint();
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
     * Returns if this DFJoint is a subset of the {@code dfJoint} DFJoint.
     * 
     * Checks that every dependency from this DFJoint belongs to {@code dfJoint}. 
     * 
     * @param dfJoint The DFJoint that is an overset of this DFJoint.
     * @return true if this DFJoint is a subset of {@code dfJoint}.
     */
    public boolean isImplied(DFJoint dfJoint) {
        for (ADependency fd : this.df) {
            if (!fd.belongsTo(dfJoint, null))
                return false;
        }
        return true;
    }
    
    /**
     * Return a DFJoint that contains all functional dependency that can be implied
     * from a plural dependency and all the functional dependency that already exists
     * in this DFJoint.
     * 
     * @return a list of all functional dependencies that can be implied.
     */
    public DFJoint getHiddenDF() {
        DFJoint hiddenDF = new DFJoint(this);
        for (ADependency pl : this) {
            if (pl.getClass() == new PluralDependency().getClass())
                hiddenDF.getDFJoint().addAll(pl.toFunctionalDependency(hiddenDF));
        }
        return hiddenDF;
    }
    
    /**
     * Returns a new DFJoint equivalent with this one, but with all dependencies in
     * a "minimal" form.
     * 
     * If a DFJoint has dependencies like {A, B} to {C}, {A, B} to {E}, this will be transformed
     * to {A, B} to {C, E}.
     * 
     * @return a new DFJoint with all dependencies with same left side in just on dependency.
     */
    public DFJoint regroupDFJoint() {
        ArrayList<ADependency> copyDFJoint = new ArrayList<>(this.df); 
        DFJoint regroupedDFJoint = new DFJoint();
        for (int i = 0; i < copyDFJoint.size(); i++) {
            ADependency dfI = copyDFJoint.get(i);
            AttributeJoint antecedentI = dfI.getAntecedent();
            AttributeJoint regroupedConsequent = new AttributeJoint(dfI.getConsequent());
            for (int j = i + 1; j < copyDFJoint.size(); j++) {
                ADependency dfJ = copyDFJoint.get(j);
                if (dfI.getClass() == dfJ.getClass()){
                    AttributeJoint antecedentJ = dfJ.getAntecedent();
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
     * Checks for existence of rare attributes in this DFJoint.
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
                AttributeJoint antecedent = fd.getAntecedent();
                AttributeJoint consecuent = fd.getConsequent();
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
     * Removes all rare attributes from this DFJoint.
     * 
     * Depending on {@code auto} removes the first rare attribute that finds
     * or the specified by user.
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
     * Removes the specified rare attribute from this DFJoint.
     * 
     * Doesn't check if it actually an rare attribute, this should be
     * handle by developer.
     * 
     * @param rareAttr an attribute with all needed information to remove it from
     * this DFJoint.
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
     * Returns if this DFJoint is in it's minimal form.
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
     * Returns a new DFJoint only with dependencies that can be implied by using
     * attributes from {@code attrJoint}.
     * 
     * @param attrJoint attribute on who to project.
     * @return a new DFJoint with implied dependencies.
     */
    public DFJoint projectionOnAttributeJoint(AttributeJoint attrJoint) {
        DFJoint hiddenDF = this.getHiddenDF();
        DFJoint result = new DFJoint();
        AttributeJoint oldAntecedent;
        AttributeJoint oldConsequent;
        
        for (ADependency item : hiddenDF) {
            if (item.getClass() == new FunctionalDependency().getClass()){
                oldAntecedent = item.getAntecedent();
                oldConsequent = item.getConsequent();
                if (oldAntecedent.isContained(attrJoint) && 
                        oldConsequent.isContained(attrJoint)) {
                    result.addDependency(item); // añadir df
                }
                if (!oldAntecedent.isContained(attrJoint) && 
                        oldConsequent.isContained(attrJoint)) {
                    boolean added = false;
                    ArrayList<AttributeJoint> newAntecedentElements = new ArrayList<>();
                    AttributeJoint newAntecedent = oldAntecedent.intersect(attrJoint);
                    AttributeJoint substract = oldAntecedent.substract(attrJoint);
                    for (ADependency dfConsequent : this.df) {
                        if (substract.isContained(dfConsequent.getConsequent())) {
                            newAntecedentElements.add(dfConsequent.getAntecedent());
                        }
                    }
                    for (int i = 0; i < newAntecedentElements.size(); i++) {
                        AttributeJoint attrJnt = newAntecedentElements.get(i);
                        if (!attrJnt.isContained(oldConsequent)) {
                            newAntecedent.addAttributes(attrJnt);
                            newAntecedentElements.remove(attrJnt);
                            added = true;
                        }
                    }
                    if (!added) {
                        for (AttributeJoint attrJnt : newAntecedentElements) {
                            if (attrJnt.isContained(oldConsequent)) {
                                newAntecedent.addAttributes(attrJnt);
                                added = true;
                            }
                        }                   
                    }
                    ADependency addDF = new FunctionalDependency(newAntecedent, oldConsequent);
                    addDF.clearTrivialElements();
                    if (added && !addDF.getAntecedent().isNull()
                            && !addDF.getConsequent().isNull()
                            && addDF.getAntecedent().isContained(attrJoint))
                        result.addDependency(addDF); // añadir df
                }
                if (oldAntecedent.isContained(attrJoint) && 
                        !oldConsequent.isContained(attrJoint)) {
                    AttributeJoint newConsequent = oldConsequent.intersect(attrJoint);
                    
                    if (newConsequent.isNull()) {
                        AttributeJoint substract = oldConsequent.substract(attrJoint);
                        for (ADependency dfAntecedent : this.df)
                            if (substract.isContained(dfAntecedent.getAntecedent()))
                                newConsequent.addAttributes(dfAntecedent.getAntecedent());
                    }
                    
                    ADependency addDF = new FunctionalDependency(oldAntecedent, newConsequent);
                    addDF.clearTrivialElements();
                    
                    if (!addDF.getConsequent().isNull() && newConsequent.isContained(attrJoint))
                        result.addDependency(addDF); // añadir df
                }
            }
        }
        return result;
    }
}
