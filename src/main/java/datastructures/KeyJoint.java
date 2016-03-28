/**
 * 
 */
package datastructures;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Pavel Nichita
 *
 */
public class KeyJoint implements Iterable<AttributeJoint> {
    private ArrayList<AttributeJoint> keyJoint;
    private static final Logger LOG = Logger.getLogger(KeyJoint.class.getName());

    /**
     * Constructs a Null list of AttributeJoints representing keys of a Relation.
     */
    public KeyJoint() {
        // Manually generated default constructor.
    }
    
    /**
     * Constructs an list of AttributesJoint representing Relation keys.
     * 
     * Every AttributeJoint from {@code keyJoint} must be a key.
     * 
     * @param keyJoint An array of String object.
     */
    public KeyJoint(ArrayList<AttributeJoint> keyJoint) {
        this.keyJoint = new ArrayList<>(keyJoint);
    }

    /**
     * Returns a list of AttributeJoint objects representing keys of a Relation.
     * 
     * @return a list of AttributeJoint objects representing keys of a Relation.
     */
    public ArrayList<AttributeJoint> getKeyJoint() {
        return this.keyJoint;
    }
    
    /**
     * Returns the value of this KeyJoint object in string format.
     * 
     * The format being used is <i>{{obj, obj}, {obj, obj}, {...}, ...}</i>.
     * 
     * @return a string representing this object, if the list is empty or
     * null returns "null" string.
     */
    @Override
    public String toString() {
        String msg = "null";
        try {
            msg = "{" + this.keyJoint.get(0);
            for (int i = 1; i < this.keyJoint.size(); i++)
                msg += ", " + this.keyJoint.get(i);
            msg += "}";
        }
        catch(NullPointerException ex){
            LOG.log(Level.INFO, ex.getMessage(), ex);
        }
        return msg;
    }
    
    /**
     * Adds a new key (AttributeJoint) the this list.
     * 
     * If the list is not instantiated, instantiates it.
     * 
     * @param key key to be added.
     */
    public void addKey(AttributeJoint key) {
        if (this.keyJoint == null)
            this.keyJoint = new ArrayList<>();
        this.keyJoint.add(key);
    }
    
    /**
     * Returns an Iterator other the AttributeJoint objects list.
     * 
     * @return an iterator other the AttributeJoint objects list.
     */
    @Override
    public Iterator<AttributeJoint> iterator() {
        return this.keyJoint.iterator();
    }
    
    /**
     * Returns how many keys are in the list.
     * 
     * @return how many keys are in the list.
     */
    public int getSize() {
        try {
            return this.keyJoint.size();            
        }
        catch (NullPointerException ex) {
            LOG.log(Level.INFO, ex.getMessage(), ex);
        }
        return 0;
    }

    /**
     * Returns the key from {@code index} position.
     * 
     * If {@code index} is out of bonds returns a null.
     * 
     * @param index the position of key to return.
     * @return the key from position {@code index}
     */
    public AttributeJoint getKey(int index) {
        try {
            return this.keyJoint.get(index);
        }
        catch (IndexOutOfBoundsException ex) {
            LOG.log(Level.INFO, ex.getMessage(), ex);
        }
        return null;
    }

    /**
     * Returns a hash code for this key joint.
     * 
     * The hash code for a KeyJoint object is
     * computed using the default implementations of Eclipse.
     * 
     * @return a hash code value for this object.
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((keyJoint == null) ? 0 : keyJoint.hashCode());
        return result;
    }

    /**
     * Compares this KeyJoint to the specified object.
     * 
     * The result is true if and only if the argument
     * is not null and is a KeyJoint object that represents
     * the same attribute joint list as this object. It uses 
     * eclipse default implementation.
     * 
     * @param keyJoint The object to compare this KeyJoint against.
     * @return true if the given object represents a KeyJoint
     * equivalent to this keys list, false otherwise.
     */
    @Override
    public boolean equals(Object keyJoint) {
        if (getClass() != keyJoint.getClass())
            return false;
        else {
            KeyJoint other = (KeyJoint) keyJoint;
            if (this.keyJoint == null && other.keyJoint != null)
                return false;
            if (other.keyJoint == null && this.keyJoint != null)
                return false;
            if (this.keyJoint == null && other.keyJoint == null) 
                return true;
            return this.keyJoint.equals(other.getKeyJoint());
        }
    }
    
    
    
}
