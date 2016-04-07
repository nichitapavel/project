/**
 * 
 */
package normalization;

import org.junit.Before;
import org.junit.Test;

import datastructures.SetUpClass;

import normalization.TestUtils;

/**
 * @author Pavel Nichita
 * 
 * Tests for {@link normalization.Normalization#simpleUllman(datastructures.AttributeJoint, datastructures.DFJoint)}.
 * For this tests we use a directly DFJoints (not a Relations) to calculate the closure
 * of an AttributeJoint.
 */
public class SimpleUllmanTest {
    private SetUpClass testObject;
    
    /**
     * Set Up.
     */
    @Before
    public void setUp() {
        testObject = new SetUpClass();
    }

    /**
     * Closure of {BC} in {A -> BC, BC -> A, BCD -> E, E -> C}
     * should produce {ABC}.
     */
    @Test
    public void testSimpleUllmanBCDFJoint1() {
        String[] attr = {"B", "C"};
        String[] result = {"A", "B", "C"};
        TestUtils.simpleUllmanTest(attr, result, testObject.dfJoint01());
    }
    
    /**
     * Closure of {A} in {A -> BC, BC -> A, BCD -> E, E -> C}
     * should produce {ABC}. 
     */
    @Test
    public void testSimpleUllmanADFJoint1() {
        String[] attr = {"A"};
        String[] result = {"A", "B", "C"};
        TestUtils.simpleUllmanTest(attr, result, testObject.dfJoint01());
    }
    
    /**
     * Closure of {E} in {A -> BC, BC -> A, BCD -> E, E -> C}
     * should produce {CE}. 
     */
    @Test
    public void testSimpleUllmanEDFJoint1() {
        String[] attr = {"E"};
        String[] result = {"C", "E"};
        TestUtils.simpleUllmanTest(attr, result, testObject.dfJoint01());
    }
    
    /**
     * Closure of {AB} in {A -> BC, BC -> A, BCD -> E, E -> C}
     * should produce {ABC}. 
     */
    @Test
    public void testSimpleUllmanABDFJoint1() {
        String[] attr = {"A", "B"};
        String[] result = {"A", "B", "C"};
        TestUtils.simpleUllmanTest(attr, result, testObject.dfJoint01());
    }
    
    /**
     * Closure of {AC} in {A -> BC, BC -> A, BCD -> E, E -> C}
     * should produce {ABC}. 
     */
    @Test
    public void testSimpleUllmanACDFJoint1() {
        String[] attr = {"A", "C"};
        String[] result = {"A", "B", "C"};
        TestUtils.simpleUllmanTest(attr, result, testObject.dfJoint01());
    }
    
    /**
     * Closure of {AD} in {A -> BC, BC -> A, BCD -> E, E -> C}
     * should produce {ABCDE}.
     */
    @Test
    public void testSimpleUllmanADDFJoint1() {
        String[] attr = {"A", "D"};
        String[] result = {"A", "B", "C", "D", "E"};
        TestUtils.simpleUllmanTest(attr, result, testObject.dfJoint01());
    }
    
    /**
     * Closure of {AE} in {A -> BC, BC -> A, BCD -> E, E -> C}
     * should produce {ABCE}.
     */
    @Test
    public void testSimpleUllmanAEDFJoint1() {
        String[] attr = {"A", "E"};
        String[] result = {"A", "B", "C", "E"};
        TestUtils.simpleUllmanTest(attr, result, testObject.dfJoint01());
    }
    
    /**
     * Closure of {AEF} in {A -> BC, BC -> A, BCD -> E, E -> C}
     * should produce {ABCDEF}.
     */
    @Test
    public void testSimpleUllmanAEFDFJoint1() {
        String[] attr = {"A", "E", "F"};
        String[] result = {"A", "B", "C", "E", "F"};
        TestUtils.simpleUllmanTest(attr, result, testObject.dfJoint01());
    }
    
    /**
     * Closure of {ABC} in {A -> BC, BC -> A, BCD -> E, E -> C}
     * should produce {ABC}.
     */
    @Test
    public void testSimpleUllmanABCDFJoint1() {
        String[] attr = {"A", "B", "C"};
        String[] result = {"A", "B", "C"};
        TestUtils.simpleUllmanTest(attr, result, testObject.dfJoint01());
    }
    
    /**
     * Closure of {ABD} in {A -> BC, BC -> A, BCD -> E, E -> C}
     * should produce {ABCDE}.
     */
    @Test
    public void testSimpleUllmanABDDFJoint1() {
        String[] attr = {"A", "B", "D"};
        String[] result = {"A", "B", "C", "D", "E"};
        TestUtils.simpleUllmanTest(attr, result, testObject.dfJoint01());
    }
    
    /**
     * Closure of {ABE} in {A -> BC, BC -> A, BCD -> E, E -> C}
     * should produce {ABCE}.
     */
    @Test
    public void testSimpleUllmanABE() {
        String[] attr = {"A", "B", "E"};
        String[] result = {"A", "B", "C", "E"};
        TestUtils.simpleUllmanTest(attr, result, testObject.dfJoint01());
    }
    
    /**
     * Closure of {ACD} in {A -> BC, BC -> A, BCD -> E, E -> C}
     * should produce {ABCDE}.
     */
    @Test
    public void testSimpleUllmanACD() {
        String[] attr = {"A", "C", "D"};
        String[] result = {"A", "B", "C", "D", "E"};
        TestUtils.simpleUllmanTest(attr, result, testObject.dfJoint01());
    }
    
    /**
     * Closure of {ACE} in {A -> BC, BC -> A, BCD -> E, E -> C}
     * should produce {ABCDE}.
     */
    @Test
    public void testSimpleUllmanACEDFJoint1() {
        String[] attr = {"A", "C", "E"};
        String[] result = {"A", "B", "C", "E"};
        TestUtils.simpleUllmanTest(attr, result, testObject.dfJoint01());
    }
    
    /**
     * Closure of {ADE} in {A -> BC, BC -> A, BCD -> E, E -> C}
     * should produce {ABCDE}.
     */
    @Test
    public void testSimpleUllmanADEDFJoint1() {
        String[] attr = {"A", "D", "E"};
        String[] result = {"A", "B", "C", "D", "E"};
        TestUtils.simpleUllmanTest(attr, result, testObject.dfJoint01());
    }
    
    /**
     * Closure of {A} in {A -> BC, BC -> E, CD -> A}
     * should produce {ABCE}.
     */
    @Test
    public void testSimpleUllmanADFJoint2() {
        String[] attr = {"A"};
        String[] result = {"A", "B", "C", "E"};
        TestUtils.simpleUllmanTest(attr, result, testObject.dfJoint02());
    }
    
    /**
     * Closure of {B} in {A -> BC, BC -> E, CD -> A}
     * should produce {B}.
     */
    @Test
    public void testSimpleUllmanBDFJoint2() {
        String[] attr = {"B"};      
        String[] result = {"B"};
        TestUtils.simpleUllmanTest(attr, result, testObject.dfJoint02());
    }
    
    /**
     * Closure of {C} in {A -> BC, BC -> E, CD -> A}
     * should produce {C}.
     */
    @Test
    public void testSimpleUllmanCDFJoint2() {
        String[] attr = {"C"};
        String[] result = {"C"};
        TestUtils.simpleUllmanTest(attr, result, testObject.dfJoint02());
    }
    
    /**
     * Closure of {D} in {A -> BC, BC -> E, CD -> A}
     * should produce {D}.
     */
    @Test
    public void testSimpleUllmanDDFJoint2() {
        String[] attr = {"D"};
        String[] result = {"D"};
        TestUtils.simpleUllmanTest(attr, result, testObject.dfJoint02());
    }
    
    /**
     * Closure of {E} in {A -> BC, BC -> E, CD -> A}
     * should produce {E}.
     */
    @Test
    public void testSimpleUllmanEDFJoint2() {
        String[] attr = {"E"};
        String[] result = {"E"};
        TestUtils.simpleUllmanTest(attr, result, testObject.dfJoint02());
    }
    
    /**
     * Closure of {AB} in {A -> BC, BC -> E, CD -> A}
     * should produce {ABCE}.
     */
    @Test
    public void testSimpleUllmanABDFJoint2() {
        String[] attr = {"A", "B"};
        String[] result = {"A", "B", "C", "E"};
        TestUtils.simpleUllmanTest(attr, result, testObject.dfJoint02());
    }
    
    /**
     * Closure of {AC} in {A -> BC, BC -> E, CD -> A}
     * should produce {ABCE}.
     */
    @Test
    public void testSimpleUllmanACDFJoint2() {
        String[] attr = {"A", "C"};
        String[] result = {"A", "B", "C", "E"};
        TestUtils.simpleUllmanTest(attr, result, testObject.dfJoint02());
    }
    
    /**
     * Closure of {AD} in {A -> BC, BC -> E, CD -> A}
     * should produce {ABCDE}.
     */
    @Test
    public void testSimpleUllmanADDFJoint2() {
        String[] attr = {"A", "D"};
        String[] result = {"A", "B", "C", "D","E"};
        TestUtils.simpleUllmanTest(attr, result, testObject.dfJoint02());
    }
    
    /**
     * Closure of {AE} in {A -> BC, BC -> E, CD -> A}
     * should produce {ABCE}.
     */
    @Test
    public void testSimpleUllmanAEDFJoint2() {
        String[] attr = {"A", "E"};
        String[] result = {"A", "B", "C", "E"};
        TestUtils.simpleUllmanTest(attr, result, testObject.dfJoint02());
    }
    
    /**
     * Closure of {BC} in {A -> BC, BC -> E, CD -> A}
     * should produce {BCE}.
     */
    @Test
    public void testSimpleUllmanBCDFJoint2() {
        String[] attr = {"B", "C"};
        String[] result = {"B", "C", "E"};
        TestUtils.simpleUllmanTest(attr, result, testObject.dfJoint02());
    }
    
    /**
     * Closure of {BD} in {A -> BC, BC -> E, CD -> A}
     * should produce {BD}.
     */
    @Test
    public void testSimpleUllmanBDDFJoint2() {
        String[] attr = {"B", "D"};
        String[] result = {"B", "D"};
        TestUtils.simpleUllmanTest(attr, result, testObject.dfJoint02());
    }
    
    /**
     * Closure of {BE} in {A -> BC, BC -> E, CD -> A}
     * should produce {BE}.
     */
    @Test
    public void testSimpleUllmanBEDFJoint2() {
        String[] attr = {"B", "E"};
        String[] result = {"B", "E"};
        TestUtils.simpleUllmanTest(attr, result, testObject.dfJoint02());
    }
    
    /**
     * Closure of {CD} in {A -> BC, BC -> E, CD -> A}
     * should produce {ABCDE}.
     */
    @Test
    public void testSimpleUllmanCDDFJoint2() {
        String[] attr = {"C", "D"};
        String[] result = {"A", "B", "C", "D", "E"};
        TestUtils.simpleUllmanTest(attr, result, testObject.dfJoint02());
    }
    
    /**
     * Closure of {CE} in {A -> BC, BC -> E, CD -> A}
     * should produce {CE}.
     */
    @Test
    public void testSimpleUllmanCEDFJoint2() {
        String[] attr = {"C", "E"};
        String[] result = {"C", "E"};
        TestUtils.simpleUllmanTest(attr, result, testObject.dfJoint02());
    }
    
    /**
     * Closure of {DE} in {A -> BC, BC -> E, CD -> A}
     * should produce {DE}.
     */
    @Test
    public void testSimpleUllmanDEDFJoint2() {
        String[] attr = {"D", "E"};
        String[] result = {"D", "E"};
        TestUtils.simpleUllmanTest(attr, result, testObject.dfJoint02());
    }
    
    /**
     * Closure of {ABC} in {A -> BC, BC -> E, CD -> A}
     * should produce {ABCE}.
     */
    @Test
    public void testSimpleUllmanABCDFJoint2() {
        String[] attr = {"A", "B", "C"};
        String[] result = {"A", "B", "C", "E"};
        TestUtils.simpleUllmanTest(attr, result, testObject.dfJoint02());
    }
    
    /**
     * Closure of {ABD} in {A -> BC, BC -> E, CD -> A}
     * should produce {ABCDE}.
     */
    @Test
    public void testSimpleUllmanABDDFJoint2() {
        String[] attr = {"A", "B", "D"};
        String[] result = {"A", "B", "C", "D", "E"};
        TestUtils.simpleUllmanTest(attr, result, testObject.dfJoint02());
    }
    
    /**
     * Closure of {ABE} in {A -> BC, BC -> E, CD -> A}
     * should produce {ABCE}.
     */
    @Test
    public void testSimpleUllmanABEDFJoint2() {
        String[] attr = {"A", "B", "E"};
        String[] result = {"A", "B", "C", "E"};
        TestUtils.simpleUllmanTest(attr, result, testObject.dfJoint02());
    }
    
    /**
     * Closure of {ACD} in {A -> BC, BC -> E, CD -> A}
     * should produce {ABCDE}.
     */
    @Test
    public void testSimpleUllmanACDDFJoint2() {
        String[] attr = {"A", "C", "D"};
        String[] result = {"A", "B", "C", "D", "E"};
        TestUtils.simpleUllmanTest(attr, result, testObject.dfJoint02());
    }
    
    /**
     * Closure of {ACE} in {A -> BC, BC -> E, CD -> A}
     * should produce {ABCE}.
     */
    @Test
    public void testSimpleUllmanACEDFJoint2() {
        String[] attr = {"A", "C", "E"};
        String[] result = {"A", "B", "C", "E"};
        TestUtils.simpleUllmanTest(attr, result, testObject.dfJoint02());
    }
    
    /**
     * Closure of {ADE} in {A -> BC, BC -> E, CD -> A}
     * should produce {ABCDE}.
     */
    @Test
    public void testSimpleUllmanADEDFJoint2() {
        String[] attr = {"A", "D", "E"};
        String[] result = {"A", "B", "C", "D", "E"};
        TestUtils.simpleUllmanTest(attr, result, testObject.dfJoint02());
    }
    
    /**
     * Closure of {BCD} in {A -> BC, BC -> E, CD -> A}
     * should produce {ABCDE}.
     */
    @Test
    public void testSimpleUllmanBCD() {
        String[] attr = {"B", "C", "D"};
        String[] result = {"A", "B", "C", "D", "E"};
        TestUtils.simpleUllmanTest(attr, result, testObject.dfJoint02());
    }
    
    /**
     * Closure of {BCE} in {A -> BC, BC -> E, CD -> A}
     * should produce {BCE}.
     */
    @Test
    public void testSimpleUllmanBCE() {
        String[] attr = {"B", "C", "E"};
        String[] result = {"B", "C", "E"};
        TestUtils.simpleUllmanTest(attr, result, testObject.dfJoint02());
    }
    
    /**
     * Closure of {BDE} in {A -> BC, BC -> E, CD -> A}
     * should produce {BDE}.
     */
    @Test
    public void testSimpleUllmanBDEDFJoint2() {
        String[] attr = {"B", "D", "E"};
        String[] result = {"B", "D", "E"};
        TestUtils.simpleUllmanTest(attr, result, testObject.dfJoint02());
    }
    
    /**
     * Closure of {CDE} in {A -> BC, BC -> E, CD -> A}
     * should produce {ABCDE}.
     */
    @Test
    public void testSimpleUllmanCDEDFJoint2() {
        String[] attr = {"C", "D", "E"};
        String[] result = {"A", "B", "C", "D", "E"};
        TestUtils.simpleUllmanTest(attr, result, testObject.dfJoint02());
    }
    
    /**
     * Closure of {AIJ} in
     * {AB -> C, C -> AB, E -> D, D -> E, E -> F, F -> E, ABD -> G, CF -> H}
     * should produce {AIJ}.
     */
    @Test
    public void testSimpleUllmanAIJDFJoint3() {
        String[] attr = {"A", "I", "J"};
        String[] result = {"A", "I", "J"};
        TestUtils.simpleUllmanTest(attr, result, testObject.dfJoint03());
    }
    
    /**
     * Closure of {BIJ} in
     * {AB -> C, C -> AB, E -> D, D -> E, E -> F, F -> E, ABD -> G, CF -> H}
     * should produce {BIJ}.
     */
    @Test
    public void testSimpleUllmanBIJDFJoint3() {
        String[] attr = {"B", "I", "J"};
        String[] result = {"B", "I", "J"};
        TestUtils.simpleUllmanTest(attr, result, testObject.dfJoint03());
    }
    
    /**
     * Closure of {CIJ} in
     * {AB -> C, C -> AB, E -> D, D -> E, E -> F, F -> E, ABD -> G, CF -> H}
     * should produce {ABCIJ}.
     */
    @Test
    public void testSimpleUllmanCIJDFJoint3() {
        String[] attr = {"C", "I", "J"};
        String[] result = {"A", "B", "C", "I", "J"};
        TestUtils.simpleUllmanTest(attr, result, testObject.dfJoint03());
    }
    
    /**
     * Closure of {DIJ} in
     * {AB -> C, C -> AB, E -> D, D -> E, E -> F, F -> E, ABD -> G, CF -> H}
     * should produce {DEFIJ}.
     */
    @Test
    public void testSimpleUllmanDIJDFJoint3() {
        String[] attr = {"D", "I", "J"};
        String[] result = {"D", "E", "F", "I", "J"};
        TestUtils.simpleUllmanTest(attr, result, testObject.dfJoint03());
    }
    
    /**
     * Closure of {EIJ} in
     * {AB -> C, C -> AB, E -> D, D -> E, E -> F, F -> E, ABD -> G, CF -> H}
     * should produce {DEFIJ}.
     */
    @Test
    public void testSimpleUllmanEIJDFJoint3() {
        String[] attr = {"E", "I", "J"};
        String[] result = {"D", "E", "F", "I", "J"};
        TestUtils.simpleUllmanTest(attr, result, testObject.dfJoint03());
    }
    
    /**
     * Closure of {FIJ} in
     * {AB -> C, C -> AB, E -> D, D -> E, E -> F, F -> E, ABD -> G, CF -> H}
     * should produce {DEFIJ}.
     */
    @Test
    public void testSimpleUllmanFIJ() {
        String[] attr = {"F", "I", "J"};
        String[] result = {"D", "E", "F", "I", "J"};
        TestUtils.simpleUllmanTest(attr, result, testObject.dfJoint03());
    }
    
    /**
     * Closure of {ABIJ} in
     * {AB -> C, C -> AB, E -> D, D -> E, E -> F, F -> E, ABD -> G, CF -> H}
     * should produce {ABCIJ}.
     */
    @Test
    public void testSimpleUllmanABIJ() {
        String[] attr = {"A", "B", "I", "J"};
        String[] result = {"A", "B", "C", "I", "J"};
        TestUtils.simpleUllmanTest(attr, result, testObject.dfJoint03());
    }
    
    /**
     * Closure of {ACIJ} in
     * {AB -> C, C -> AB, E -> D, D -> E, E -> F, F -> E, ABD -> G, CF -> H}
     * should produce {ABCIJ}.
     */
    @Test
    public void testSimpleUllmanACIJ() {
        String[] attr = {"A", "C", "I", "J"};       
        String[] result = {"A", "B", "C", "I", "J"};
        TestUtils.simpleUllmanTest(attr, result, testObject.dfJoint03());
        
    }
    
    /**
     * Closure of {BCIJ} in
     * {AB -> C, C -> AB, E -> D, D -> E, E -> F, F -> E, ABD -> G, CF -> H}
     * should produce {ABCIJ}.
     */
    @Test
    public void testSimpleUllmanBCIJ() {
        String[] attr = {"B", "C", "I", "J"};
        String[] result = {"A", "B", "C", "I", "J"};
        TestUtils.simpleUllmanTest(attr, result, testObject.dfJoint03());
    }
    
    /**
     * Closure of {BDIJ} in
     * {AB -> C, C -> AB, E -> D, D -> E, E -> F, F -> E, ABD -> G, CF -> H}
     * should produce {BDEFIJ}.
     */
    @Test
    public void testSimpleUllmanBDIJDFJoint3() {
        String[] attr = {"B", "D", "I", "J"};
        String[] result = {"B", "D", "E", "F", "I", "J"};
        TestUtils.simpleUllmanTest(attr, result, testObject.dfJoint03());
    }
    
    /**
     * Closure of {BEIJ} in
     * {AB -> C, C -> AB, E -> D, D -> E, E -> F, F -> E, ABD -> G, CF -> H}
     * should produce {BDEFIJ}.
     */
    @Test
    public void testSimpleUllmanBEIJDFJoint3() {
        String[] attr = {"B", "E", "I", "J"};
        String[] result = {"B", "D", "E", "F", "I", "J"};
        TestUtils.simpleUllmanTest(attr, result, testObject.dfJoint03());
    }
    
    /**
     * Closure of {BFIJ} in
     * {AB -> C, C -> AB, E -> D, D -> E, E -> F, F -> E, ABD -> G, CF -> H}
     * should produce {BDEFIJ}.
     */
    @Test
    public void testSimpleUllmanBFIJDFJoint3() {
        String[] attr = {"B", "F", "I", "J"};
        String[] result = {"B", "D", "E", "F", "I", "J"};
        TestUtils.simpleUllmanTest(attr, result, testObject.dfJoint03());
    }
    
    /**
     * Closure of {CDIJ} in
     * {AB -> C, C -> AB, E -> D, D -> E, E -> F, F -> E, ABD -> G, CF -> H}
     * should produce {ABCDEFGHIJ}.
     */
    @Test
    public void testSimpleUllmanCDIJDFJoint3() {
        String[] attr = {"C", "D", "I", "J"};
        String[] result = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        TestUtils.simpleUllmanTest(attr, result, testObject.dfJoint03());
    }
    
    /**
     * Closure of {CEIJ} in
     * {AB -> C, C -> AB, E -> D, D -> E, E -> F, F -> E, ABD -> G, CF -> H}
     * should produce {ABCDEFGHIJ}.
     */
    @Test
    public void testSimpleUllmanCEIJDFJoint3() {
        String[] attr = {"C", "E", "I", "J"};
        String[] result = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        TestUtils.simpleUllmanTest(attr, result, testObject.dfJoint03());
    }
    
    /**
     * Closure of {CFIJ} in
     * {AB -> C, C -> AB, E -> D, D -> E, E -> F, F -> E, ABD -> G, CF -> H}
     * should produce {ABCDEFGHIJ}.
     */
    @Test
    public void testSimpleUllmanCFIJDFJoint3() {
        String[] attr = {"C", "F", "I", "J"};
        String[] result = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        TestUtils.simpleUllmanTest(attr, result, testObject.dfJoint03());
    }
    
    /**
     * Closure of {DEIJ} in
     * {AB -> C, C -> AB, E -> D, D -> E, E -> F, F -> E, ABD -> G, CF -> H}
     * should produce {AIJ}.
     */
    @Test
    public void testSimpleUllmanDEIJDFJoint3() {
        String[] attr = {"D", "E", "I", "J"};
        String[] result = {"D", "E", "F", "I", "J"};
        TestUtils.simpleUllmanTest(attr, result, testObject.dfJoint03());
    }
    
    /**
     * Closure of {DFIJ} in
     * {AB -> C, C -> AB, E -> D, D -> E, E -> F, F -> E, ABD -> G, CF -> H}
     * should produce {DEFIJ}.
     */
    @Test
    public void testSimpleUllmanDFIJDFJoint3() {
        String[] attr = {"D", "F", "I", "J"};
        String[] result = {"D", "E", "F", "I", "J"};
        TestUtils.simpleUllmanTest(attr, result, testObject.dfJoint03());
    }
    
    /**
     * Closure of {EFIJ} in
     * {AB -> C, C -> AB, E -> D, D -> E, E -> F, F -> E, ABD -> G, CF -> H}
     * should produce {DEFIJ}.
     */
    @Test
    public void testSimpleUllmanEFIJDFJoint3() {
        String[] attr = {"E", "F", "I", "J"};
        String[] result = {"D", "E", "F", "I", "J"};
        TestUtils.simpleUllmanTest(attr, result, testObject.dfJoint03());
    }
    
    /**
     * Closure of {ABCIJ} in
     * {AB -> C, C -> AB, E -> D, D -> E, E -> F, F -> E, ABD -> G, CF -> H}
     * should produce {ABCAIJ}.
     */
    @Test
    public void testSimpleUllmanABCIJDFJoint3() {
        String[] attr = {"A", "B", "C", "I", "J"};
        String[] result = {"A", "B", "C", "I", "J"};
        TestUtils.simpleUllmanTest(attr, result, testObject.dfJoint03());
    }
    
    /**
     * Closure of {ABDIJ} in
     * {AB -> C, C -> AB, E -> D, D -> E, E -> F, F -> E, ABD -> G, CF -> H}
     * should produce {ABCDEFGHIJ}.
     */
    @Test
    public void testSimpleUllmanABDIJDFJoint3() {
        String[] attr = {"A", "B", "D", "I", "J"};
        String[] result = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        TestUtils.simpleUllmanTest(attr, result, testObject.dfJoint03());
    }
    
    /**
     * Closure of {ABEIJ} in
     * {AB -> C, C -> AB, E -> D, D -> E, E -> F, F -> E, ABD -> G, CF -> H}
     * should produce {ABCDEFGHIJ}.
     */
    @Test
    public void testSimpleUllmanABEIJDFJoint3() {
        String[] attr = {"A", "B", "E", "I", "J"};
        String[] result = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        TestUtils.simpleUllmanTest(attr, result, testObject.dfJoint03());
    }
    
    /**
     * Closure of {ABFIJ} in
     * {AB -> C, C -> AB, E -> D, D -> E, E -> F, F -> E, ABD -> G, CF -> H}
     * should produce {ABCDEFGHIJ}.
     */
    @Test
    public void testSimpleUllmanABFIJDFJoint3() {
        String[] attr = {"A", "B", "F", "I", "J"};
        String[] result = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        TestUtils.simpleUllmanTest(attr, result, testObject.dfJoint03());
    }
    
    /**
     * Closure of {ADEIJ} in
     * {AB -> C, C -> AB, E -> D, D -> E, E -> F, F -> E, ABD -> G, CF -> H}
     * should produce {ADEFIJ}.
     */
    @Test
    public void testSimpleUllmanADEIJDFJoint3() {
        String[] attr = {"A", "D", "E", "I", "J"};
        String[] result = {"A", "D", "E", "F", "I", "J"};
        TestUtils.simpleUllmanTest(attr, result, testObject.dfJoint03());
    }
    
    /**
     * Closure of {ADFIJ} in
     * {AB -> C, C -> AB, E -> D, D -> E, E -> F, F -> E, ABD -> G, CF -> H}
     * should produce {ADEFIJ}.
     */
    @Test
    public void testSimpleUllmanADFIJDFJoint3() {
        String[] attr = {"A", "D", "F", "I", "J"};
        String[] result = {"A", "D", "E", "F", "I", "J"};
        TestUtils.simpleUllmanTest(attr, result, testObject.dfJoint03());
    }
    
    /**
     * Closure of {AEFIJ} in
     * {AB -> C, C -> AB, E -> D, D -> E, E -> F, F -> E, ABD -> G, CF -> H}
     * should produce {ADEFIJ}.
     */
    @Test
    public void testSimpleUllmanAEFIJDFJoint3() {
        String[] attr = {"A", "E", "F", "I", "J"};
        String[] result = {"A", "D", "E", "F", "I", "J"};
        TestUtils.simpleUllmanTest(attr, result, testObject.dfJoint03());
    }
    
    /**
     * Closure of {BDEIJ} in
     * {AB -> C, C -> AB, E -> D, D -> E, E -> F, F -> E, ABD -> G, CF -> H}
     * should produce {BDEFIJ}.
     */
    @Test
    public void testSimpleUllmanBDEIJDFJoint3() {
        String[] attr = {"B", "D", "E", "I", "J"};
        String[] result = {"B", "D", "E", "F", "I", "J"};
        TestUtils.simpleUllmanTest(attr, result, testObject.dfJoint03());
    }
    
    /**
     * Closure of {BDFIJ} in
     * {AB -> C, C -> AB, E -> D, D -> E, E -> F, F -> E, ABD -> G, CF -> H}
     * should produce {BDEFIJ}.
     */
    @Test
    public void testSimpleUllmanBDFIJDFJoint3() {
        String[] attr = {"B", "D", "F", "I", "J"};
        String[] result = {"B", "D", "E", "F", "I", "J"};
        TestUtils.simpleUllmanTest(attr, result, testObject.dfJoint03());
    }
    
    /**
     * Closure of {BEFIJ} in
     * {AB -> C, C -> AB, E -> D, D -> E, E -> F, F -> E, ABD -> G, CF -> H}
     * should produce {BDEFIJ}.
     */
    @Test
    public void testSimpleUllmanBEFIJDFJoint3() {
        String[] attr = {"B", "E", "F", "I", "J"};
        String[] result = {"B", "D", "E", "F", "I", "J"};
        TestUtils.simpleUllmanTest(attr, result, testObject.dfJoint03());
    }
}
