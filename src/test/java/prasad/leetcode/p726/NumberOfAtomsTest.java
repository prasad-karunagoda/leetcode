package prasad.leetcode.p726;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class NumberOfAtomsTest {

    @Test
    public void test01() {
        Assert.assertEquals("H2O", new NumberOfAtoms().countOfAtoms("H2O"));
    }

    @Test
    public void test02() {
        Assert.assertEquals("H2MgO2", new NumberOfAtoms().countOfAtoms("Mg(OH)2"));
    }

    @Test
    public void test03() {
        Assert.assertEquals("K4N2O14S4", new NumberOfAtoms().countOfAtoms("K4(ON(SO3)2)2"));
    }

    @Test
    public void test04() {
        Assert.assertEquals("H6K4N2Na6O28S4", new NumberOfAtoms().countOfAtoms("K4(O2N(SO3)2(NaO2H)3)2"));
    }

    @Test
    public void test05() {
        Assert.assertEquals("Ca2", new NumberOfAtoms().countOfAtoms("(Ca2)"));
    }

    @Test
    public void test06() {
        Assert.assertEquals("Na6", new NumberOfAtoms().countOfAtoms("(Na2)3"));
    }

    @Test
    public void test07() {
        Assert.assertEquals("Abc10", new NumberOfAtoms().countOfAtoms("(Abc2)5"));
    }

    @Test
    public void testTokenize01() {
        List<NumberOfAtoms.Token> tokens = new NumberOfAtoms().tokenize("K4(ON(SO3)2)2");
        //                  K4  (  O  N  (  S  O3  )  2  )  2
        // Token indices -> 0   1  2  3  4  5  6   7  8  9  10

        Assert.assertEquals(11, tokens.size());

        Assert.assertTrue(tokens.get(0) instanceof NumberOfAtoms.ElementToken);
        assertElementTokenEquals("K", 4, (NumberOfAtoms.ElementToken) tokens.get(0));

        Assert.assertTrue(tokens.get(1) instanceof NumberOfAtoms.OpeningBracketToken);

        Assert.assertTrue(tokens.get(2) instanceof NumberOfAtoms.ElementToken);
        assertElementTokenEquals("O", 1, (NumberOfAtoms.ElementToken) tokens.get(2));

        Assert.assertTrue(tokens.get(3) instanceof NumberOfAtoms.ElementToken);
        assertElementTokenEquals("N", 1, (NumberOfAtoms.ElementToken) tokens.get(3));

        Assert.assertTrue(tokens.get(4) instanceof NumberOfAtoms.OpeningBracketToken);

        Assert.assertTrue(tokens.get(5) instanceof NumberOfAtoms.ElementToken);
        assertElementTokenEquals("S", 1, (NumberOfAtoms.ElementToken) tokens.get(5));

        Assert.assertTrue(tokens.get(6) instanceof NumberOfAtoms.ElementToken);
        assertElementTokenEquals("O", 3, (NumberOfAtoms.ElementToken) tokens.get(6));

        Assert.assertTrue(tokens.get(7) instanceof NumberOfAtoms.ClosingBracketToken);

        Assert.assertTrue(tokens.get(8) instanceof NumberOfAtoms.NumberToken);
        Assert.assertEquals(2, ((NumberOfAtoms.NumberToken) tokens.get(8)).number);

        Assert.assertTrue(tokens.get(9) instanceof NumberOfAtoms.ClosingBracketToken);

        Assert.assertTrue(tokens.get(10) instanceof NumberOfAtoms.NumberToken);
        Assert.assertEquals(2, ((NumberOfAtoms.NumberToken) tokens.get(10)).number);
    }

    private static void assertElementTokenEquals(String expectedElement, int expectedCount, NumberOfAtoms.ElementToken elementToken) {
        Assert.assertEquals(expectedElement, elementToken.element);
        Assert.assertEquals(expectedCount, elementToken.count);
    }
}
