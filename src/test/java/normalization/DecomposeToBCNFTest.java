/**
 * 
 */
package normalization;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import datastructures.Relation;
import datastructures.SetUpClass;

/**
 * @author Pavel Nichita
 *
 */
public class DecomposeToBCNFTest {
    private SetUpClass setUpObject;
    
    /**
     * Set up.
     */
    @Before
    public void setUp() {
        this.setUpObject = new SetUpClass();
    }
    
    /**
     * Test method for {@link normalization.Normalization#normalizeBCNF(Relation, boolean)}
     * Checks that normalized till Boyce-Codd form relation {ABCDE} {A -> BC, BC -> A, BCD -> E, E -> C}
     * produces: {ABC} {A -> BC}
     *           {ADE} {AD -> E}
     */
    @Test
    public void testNormalizeBCNFRelation1() {
        List<Relation> result = Normalization.normalizeBCNF(this.setUpObject.relation01(), true);
        assertEquals(this.setUpObject.listRelations9(), result);
    }
    
    /**
     * Test method for {@link normalization.Normalization#normalizeBCNF(Relation, boolean)}
     * Checks that normalized till Boyce-Codd form relation {ABCDE} {A -> BC, BC -> E, CD -> A}
     * produces: {ABC} {A -> BC}
     *           {AE} {A -> E}
     *           {AD} {}
     */
    @Test
    public void testNormalizeBCNFRelation2() {
        List<Relation> result = Normalization.normalizeBCNF(this.setUpObject.relation02(), true);
        assertEquals(this.setUpObject.listRelations1(), result);
    }
    
    /**
     * Test method for {@link normalization.Normalization#normalizeBCNF(Relation, boolean)}
     * Checks that normalized till Boyce-Codd form relation {ABCDEFGH} {AB -> C, C -> AB, E -> D, D -> E, E -> F, F -> E, ABD -> G, CF -> H}
     * produces: {ABC} {AB -> C, C -> AB}
     *           {DE} {E -> D, D -> E}
     *           {EF} {E -> F, F -> E} 
     *           {ABEGH} {ABE -> GH}
     */
    @Test
    public void testNormalizeBCNFRelation3() {
        List<Relation> result = Normalization.normalizeBCNF(this.setUpObject.relation03(), true);
        assertEquals(this.setUpObject.listRelations5(), result);
    }
    
    /**
     * Test method for {@link normalization.Normalization#normalizeBCNF(Relation, boolean)}
     * Checks that normalized till Boyce-Codd form relation {ABC} {A -> BC, B -> C, A -> B, AB -> C}
     * produces: {BC} {B -> C}
     *           {AB} {A -> B}
     */
    @Test
    public void testNormalizeBCNFRelation4() {
        List<Relation> result = Normalization.normalizeBCNF(this.setUpObject.relation04(), true);
        assertEquals(this.setUpObject.listRelations2(), result);
    }
    
    /**
     * Test method for {@link normalization.Normalization#normalizeBCNF(Relation, boolean)}
     * Checks that normalized till Boyce-Codd form relation {ABC} {A -> B, B -> C}
     * produces: {BC} {B -> C}
     *           {AB} {A -> B}
     */
    @Test
    public void testNormalizeBCNFRelation5() {
        List<Relation> result = Normalization.normalizeBCNF(this.setUpObject.relation05(), true);
        assertEquals(this.setUpObject.listRelations2(), result);
    }
    
    /**
     * Test method for {@link normalization.Normalization#normalizeBCNF(Relation, boolean)}
     * Checks that normalized till Boyce-Codd form relation {ABCDE} {AB -> D, B -> C, C -> B, B -> E}
     * produces: {BC} {B -> C, C -> B}
     *           {BE} {B -> E}
     *           {ABD} {AB -> D}
     */
    @Test
    public void testNormalizeBCNFRelation6() {
        List<Relation> result = Normalization.normalizeBCNF(this.setUpObject.relation06(), true);
        assertEquals(this.setUpObject.listRelations6(), result);
    }
    
    /**
     * Test method for {@link normalization.Normalization#normalizeBCNF(Relation, boolean)}
     * Checks that normalized till Boyce-Codd form relation {ABCD} {A -> B, B -> C, C -> D}
     * produces: {BC} {B -> C}
     *           {BD} {B -> D}
     *           {AB} {A -> B}
     */
    @Test
    public void testNormalizeBCNFRelation7() {
        List<Relation> result = Normalization.normalizeBCNF(this.setUpObject.relation07(), true);
        assertEquals(this.setUpObject.listRelations4(), result);
    }
    
    /**
     * Test method for {@link normalization.Normalization#normalizeBCNF(Relation, boolean)}
     * Checks that normalized till Boyce-Codd form relation {ABCD} {B -> C, AB -> D, C -> B}
     * produces: {BC} {B -> C, C -> B}
     *           {ABD} {AB -> D}
     */
    @Test
    public void testNormalizeBCNFRelation8() {
        List<Relation> result = Normalization.normalizeBCNF(this.setUpObject.relation08(), true);
        assertEquals(this.setUpObject.listRelations7(), result);
    }
    
    /**
     * Test method for {@link normalization.Normalization#normalizeBCNF(Relation, boolean)}
     * Checks that normalized till Boyce-Codd form relation {ABC} {AB -> C}
     * produces: {ABC} {AB -> C}
     */
    @Test
    public void testNormalizeBCNFRelation9() {
        List<Relation> expected = new ArrayList<>();
        expected.add(this.setUpObject.relation09());
        assertEquals(expected, Normalization.normalizeBCNF(this.setUpObject.relation09(), true));
    }
}
