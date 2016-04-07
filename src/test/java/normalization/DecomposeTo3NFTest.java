/**
 * 
 */
package normalization;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import datastructures.SetUpClass;
import datastructures.Relation;

/**
 * @author Pavel Nichita
 *
 */
public class DecomposeTo3NFTest {
    private SetUpClass setUpObject;
    
    @Before
    public void setUp() {
        this.setUpObject = new SetUpClass(); 
    }
    
    /**
     * Test method for {@link normalization.Normalization#normalizeBCNF(Relation, boolean)}
     * Checks that normalized till Boyce-Codd form relation {ABCDE} {A -> BC, BC -> E, CD -> A}
     * produces: {ABC} {A -> BC}
     *           {AE} {A -> E}
     *           {AD} {}
     */
    @Test
    public void testNormalizeRelation1() {
        List<Relation> result = Normalization.normalize3NF(this.setUpObject.relation02(), true);
        assertEquals(this.setUpObject.listRelations1(), result);
    }
    
    /**
     * Test method for {@link normalization.Normalization#normalizeBCNF(Relation, boolean)}
     * Checks that normalized till Boyce-Codd form relation {ABCDEFGH} {AB -> C, C -> AB, E -> D, D -> E, E -> F, F -> E, ABD -> G, CF -> H}
     * produces: {ABCDEFGH} {AB -> C, C -> AB, E -> D, D -> E, E -> F, F -> E, ABD -> G, CF -> H}
     */
    @Test
    public void testNormalizeRelation2() {
        List<Relation> expected = new ArrayList<>();
        expected.add(this.setUpObject.relation03());
        assertEquals(expected, Normalization.normalize3NF(this.setUpObject.relation03(), true));
    }
    
    /**
     * Test method for {@link normalization.Normalization#normalizeBCNF(Relation, boolean)}
     * Checks that normalized till Boyce-Codd form relation {ABC} {A -> BC, B -> C, A -> B, AB -> C}
     * produces: {BC} {B -> C}
     *           {AB} {A -> B}
     */
    @Test
    public void testNormalizeRelation3() {
        List<Relation> result = Normalization.normalize3NF(this.setUpObject.relation04(), true);
        assertEquals(this.setUpObject.listRelations2(), result);
    }
    
    /**
     * Test method for {@link normalization.Normalization#normalizeBCNF(Relation, boolean)}
     * Checks that normalized till Boyce-Codd form relation {ABC} {A -> B, B -> C}
     * produces: {BC} {B -> C}
     *           {AB} {A -> B}
     */
    @Test
    public void testNormalizeRelation4() {
        List<Relation> result = Normalization.normalize3NF(this.setUpObject.relation05(), true);
        assertEquals(this.setUpObject.listRelations2(), result);
    }
    
    /**
     * Test method for {@link normalization.Normalization#normalizeBCNF(Relation, boolean)}
     * Checks that normalized till Boyce-Codd form relation {ABCDE} {AB -> D, B -> C, C -> B, B -> E}
     * produces: {BE} {B -> E}
     *           {ABCD} {AB -> D, B -> C, C -> B}
     */
    @Test
    public void testNormalizeRelation5() {
        List<Relation> result = Normalization.normalize3NF(this.setUpObject.relation06(), true);
        assertEquals(this.setUpObject.listRelations3(), result);
    }
    
    /**
     * Test method for {@link normalization.Normalization#normalizeBCNF(Relation, boolean)}
     * Checks that normalized till Boyce-Codd form relation {ABCD} {A -> B, B -> C, C -> D}
     * produces: {BC} {B -> C}
     *           {BD} {B -> D}
     *           {AB} {A -> B}
     */
    @Test
    public void testNormalizeRelation6() {
        List<Relation> result = Normalization.normalize3NF(this.setUpObject.relation07(), true);
        assertEquals(this.setUpObject.listRelations4(), result);
    }
    
    /**
     * Test method for {@link normalization.Normalization#normalizeBCNF(Relation, boolean)}
     * Checks that normalized till Boyce-Codd form relation {ABCD} {B -> C, AB -> D, C -> B}
     * produces: {ABCD} {B -> C, AB -> D, C -> B}
     */
    @Test
    public void testNormalizeRelation7() {
        List<Relation> expected = new ArrayList<>();
        expected.add(this.setUpObject.relation08());
        assertEquals(expected, Normalization.normalize3NF(this.setUpObject.relation08(), true));
    }
    
    /**
     * Test method for {@link normalization.Normalization#normalizeBCNF(Relation, boolean)}
     * Checks that normalized till Boyce-Codd form relation {ABC} {AB -> C}
     * produces: {ABC} {AB -> C}
     */
    @Test
    public void testNormalizeRelation8() {
        List<Relation> expected = new ArrayList<>();
        expected.add(this.setUpObject.relation09());
        assertEquals(expected, Normalization.normalize3NF(this.setUpObject.relation09(), true));
    }
}
