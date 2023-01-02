package prasad.leetcode.p565;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayNestingTest {

    @Test
    public void test01() {
        Assert.assertEquals(4, new ArrayNesting().arrayNesting(new int[] {5,4,0,3,1,6,2}));
    }

    @Test
    public void test02() {
        Assert.assertEquals(1, new ArrayNesting().arrayNesting(new int[] {0,1,2}));
    }

    @Test
    public void test03() {
        Assert.assertEquals(6, new ArrayNesting().arrayNesting(new int[] {4,2,10,3,8,5,11,6,1,7,0,9}));
    }

    @Test
    public void testTime() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100_000; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        int[] nums = list.stream().mapToInt(Integer::intValue).toArray();

        long start = System.currentTimeMillis();
        new ArrayNesting().arrayNesting(nums);
        System.out.println("Time = " + (System.currentTimeMillis() - start) + " ms");
    }
}
