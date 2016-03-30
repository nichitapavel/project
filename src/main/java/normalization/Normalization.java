/**
 * 
 */
package normalization;

import datastructures.AttributeJoint;
import datastructures.DFJoint;
import dependency.ADependency;
import dependency.FunctionalDependency;

/**
 * @author Pavel Nichita
 *
 */
public final class Normalization {
    
    /**
     * Calculates all attributes that are being implied by {@code attrJoint} in
     * {@code dfJoint}.
     * 
     * The algorithm used is Ullman.
     * 
     * @param attrJoint Attribute joint to who'm calculate ullman.
     * @param dfJoint Where to calculate.
     * @return an attribute joint with all the attributes implied.
     */
    public static AttributeJoint simpleUllman(AttributeJoint attrJoint, DFJoint dfJoint){
        AttributeJoint result = new AttributeJoint(attrJoint);
        boolean isChanged;
        
        do {
            isChanged = false;
            for (ADependency df:dfJoint) {
                if (df.getClass() == new FunctionalDependency().getClass())
                    if (df.getAntecedent().isContained(result) && !(df.getConsequent().isContained(result))) {
                        result.addAttributes(df.getConsequent());
                        isChanged = true;
                    }
            }
        } while (isChanged);
        
        return result;
    }


}
