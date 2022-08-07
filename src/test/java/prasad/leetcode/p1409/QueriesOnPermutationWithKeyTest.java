package prasad.leetcode.p1409;

import org.junit.Assert;
import org.junit.Test;

public class QueriesOnPermutationWithKeyTest {

    @Test
    public void test01() {
        Assert.assertArrayEquals(new int[] {2,1,2,1},
                new QueriesOnPermutationWithKey().processQueries(new int[] {3,1,2,1}, 5));
    }

    @Test
    public void test02() {
        Assert.assertArrayEquals(new int[] {3,1,2,0},
                new QueriesOnPermutationWithKey().processQueries(new int[] {4,1,2,2}, 4));
    }

    @Test
    public void test03() {
        Assert.assertArrayEquals(new int[] {6,5,0,7,5},
                new QueriesOnPermutationWithKey().processQueries(new int[] {7,5,5,8,3}, 8));
    }

    @Test
    public void test04() {
        Assert.assertArrayEquals(new int[] {0},
                new QueriesOnPermutationWithKey().processQueries(new int[] {1}, 1));
    }
}
