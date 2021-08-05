package prasad.leetcode.p387;

import org.junit.Assert;
import org.junit.Test;

public class FirstUniqueCharacterInStringTest {

    @Test
    public void test01() {
        Assert.assertEquals(0, new FirstUniqueCharacterInString().firstUniqChar("leetcode"));
    }

    @Test
    public void test02() {
        Assert.assertEquals(2, new FirstUniqueCharacterInString().firstUniqChar("loveleetcode"));
    }

    @Test
    public void test03() {
        Assert.assertEquals(-1, new FirstUniqueCharacterInString().firstUniqChar("aabb"));
    }

    @Test
    public void test04() {
        Assert.assertEquals(0, new FirstUniqueCharacterInString().firstUniqChar("p"));
    }
}
