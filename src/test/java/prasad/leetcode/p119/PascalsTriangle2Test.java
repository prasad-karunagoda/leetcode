package prasad.leetcode.p119;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PascalsTriangle2Test {

    @Test
    public void test0() {
        List<Integer> row =  new PascalsTriangle2().getRow(0);
        Assert.assertEquals(Collections.singletonList(1), row);
    }

    @Test
    public void test1() {
        List<Integer> row =  new PascalsTriangle2().getRow(1);
        Assert.assertEquals(Arrays.asList(1, 1), row);
    }

    @Test
    public void test2() {
        List<Integer> row =  new PascalsTriangle2().getRow(2);
        Assert.assertEquals(Arrays.asList(1, 2, 1), row);
    }

    @Test
    public void test4() {
        List<Integer> row =  new PascalsTriangle2().getRow(4);
        Assert.assertEquals(Arrays.asList(1, 4, 6, 4, 1), row);
    }
}
