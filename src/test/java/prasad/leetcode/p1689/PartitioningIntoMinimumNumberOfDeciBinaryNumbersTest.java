package prasad.leetcode.p1689;

import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;

public class PartitioningIntoMinimumNumberOfDeciBinaryNumbersTest {

    @Test
    public void test01() {
        Assert.assertEquals(3,
                new PartitioningIntoMinimumNumberOfDeciBinaryNumbers().minPartitions("32"));
    }

    @Test
    public void test02() {
        Assert.assertEquals(8,
                new PartitioningIntoMinimumNumberOfDeciBinaryNumbers().minPartitions("82734"));
    }

    @Test
    public void test03() {
        Assert.assertEquals(9,
                new PartitioningIntoMinimumNumberOfDeciBinaryNumbers().minPartitions("27346209830709182346"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test04() {
        new PartitioningIntoMinimumNumberOfDeciBinaryNumbers().minPartitions("0");
    }

    @Test
    public void testTime() {
        String n = String.join("", Collections.nCopies(100000, "1"));
        long start = System.currentTimeMillis();
        new PartitioningIntoMinimumNumberOfDeciBinaryNumbers().minPartitions(n);
        System.out.println("Time = " + (System.currentTimeMillis() - start) + " ms");
    }
}
