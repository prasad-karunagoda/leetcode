package prasad.leetcode.p1299;

import org.junit.Assert;
import org.junit.Test;

public class ReplaceElementsWithGreatestTest {

    @Test
    public void test01() {
        Assert.assertArrayEquals(new int[] {18,6,6,6,1,-1},
                new ReplaceElementsWithGreatest().replaceElements(new int[] {17,18,5,4,6,1}));
    }

    @Test
    public void test02() {
        Assert.assertArrayEquals(new int[] {-1},
                new ReplaceElementsWithGreatest().replaceElements(new int[] {400}));
    }

    @Test
    public void test03() {
        Assert.assertArrayEquals(new int[] {3,-1},
                new ReplaceElementsWithGreatest().replaceElements(new int[] {5,3}));
    }
}
