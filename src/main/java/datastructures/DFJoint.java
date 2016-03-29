/**
 * 
 */
package datastructures;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import dependency.ADependency;

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
     *  the same attribute joint list as this object.
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
}
