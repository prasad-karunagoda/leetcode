package prasad.leetcode.p2149;

import org.junit.Assert;
import org.junit.Test;

public class RearrangeArrayElementsBySignTest {

    @Test
    public void test01() {
        int[] rearranged = new RearrangeArrayElementsBySign().rearrangeArray(new int[] {3,1,-2,-5,2,-4});
        Assert.assertArrayEquals(new int[] {3,-2,1,-5,2,-4}, rearranged);
    }

    @Test
    public void test02() {
        int[] rearranged = new RearrangeArrayElementsBySign().rearrangeArray(new int[] {-1,1});
        Assert.assertArrayEquals(new int[] {1,-1}, rearranged);
    }

    @Test
    public void test03() {
        int[] rearranged = new RearrangeArrayElementsBySign().rearrangeArray(new int[] {-6,4,-3,2,7,-5,3,-2,-1,8});
        Assert.assertArrayEquals(new int[] {4,-6,2,-3,7,-5,3,-2,8,-1}, rearranged);
    }
}
