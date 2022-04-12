package prasad.leetcode.p744;

import org.junit.Assert;
import org.junit.Test;

public class FindSmallestLetterGreaterThanTargetTest {

    @Test
    public void test01() {
        char[] letters = new char[] {'c','f','j'};
        Assert.assertEquals('c',
                new FindSmallestLetterGreaterThanTarget().nextGreatestLetter(letters, 'a'));
    }

    @Test
    public void test02() {
        char[] letters = new char[] {'c','f','j'};
        Assert.assertEquals('f',
                new FindSmallestLetterGreaterThanTarget().nextGreatestLetter(letters, 'c'));
    }

    @Test
    public void test03() {
        char[] letters = new char[] {'c','f','j'};
        Assert.assertEquals('f',
                new FindSmallestLetterGreaterThanTarget().nextGreatestLetter(letters, 'd'));
    }

    @Test
    public void test04() {
        char[] letters = new char[] {'c','f','j'};
        Assert.assertEquals('c',
                new FindSmallestLetterGreaterThanTarget().nextGreatestLetter(letters, 'p'));
    }
}
