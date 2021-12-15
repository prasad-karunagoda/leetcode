package prasad.leetcode.p496;

import org.junit.Assert;
import org.junit.Test;

public class NextGreaterElement1Test {

    @Test
    public void test01() {
        Assert.assertArrayEquals(new int[] {-1,3,-1},
                new NextGreaterElement1().nextGreaterElement(new int[] {4,1,2}, new int[] {1,3,4,2}));
    }

    @Test
    public void test02() {
        Assert.assertArrayEquals(new int[] {3,-1},
                new NextGreaterElement1().nextGreaterElement(new int[] {2,4}, new int[] {1,2,3,4}));
    }
}
