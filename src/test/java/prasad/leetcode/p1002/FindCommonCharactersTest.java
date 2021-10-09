package prasad.leetcode.p1002;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindCommonCharactersTest {

    @Test
    public void test01() {
        List<String> commonCharacters = new FindCommonCharacters().commonChars(new String[] {"bella","label","roller"});
        Collections.sort(commonCharacters);
        Assert.assertEquals(Arrays.asList("e","l","l"), commonCharacters);
    }

    @Test
    public void test02() {
        List<String> commonCharacters = new FindCommonCharacters().commonChars(new String[] {"cool","lock","cook"});
        Collections.sort(commonCharacters);
        Assert.assertEquals(Arrays.asList("c","o"), commonCharacters);
    }

    @Test
    public void testOnlyOneWord() {
        List<String> commonCharacters = new FindCommonCharacters().commonChars(new String[] {"elephant"});
        Collections.sort(commonCharacters);
        Assert.assertEquals(Arrays.asList("a","e","e","h","l","n","p","t"), commonCharacters);
    }

    @Test
    public void testNoCommonCharacters() {
        List<String> commonCharacters = new FindCommonCharacters().commonChars(new String[] {"watch","loop","green"});
        Assert.assertTrue(commonCharacters.isEmpty());
    }
}
