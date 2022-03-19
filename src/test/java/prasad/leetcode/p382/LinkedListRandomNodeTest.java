package prasad.leetcode.p382;

import org.junit.Assert;
import org.junit.Test;
import prasad.leetcode.test.util.Util;

import java.util.Arrays;

public class LinkedListRandomNodeTest {

    @Test
    public void test01() {
        LinkedListRandomNode list = new LinkedListRandomNode(Util.buildList(new int[] {1, 2, 3}));
        int sum = 0;
        for (int n = 1; n <= 10000; n++) {
            int randomValue = list.getRandom();
            Assert.assertTrue(Arrays.asList(1, 2, 3).contains(randomValue));
            sum += randomValue;
        }
        double average = ((double) sum) / 10000;
        System.out.println("Average = " + average);
    }

    @Test
    public void test02() {
        LinkedListRandomNode list = new LinkedListRandomNode(Util.buildList(new int[] {5}));
        int randomValue = list.getRandom();
        Assert.assertEquals(5, randomValue);
    }
}
